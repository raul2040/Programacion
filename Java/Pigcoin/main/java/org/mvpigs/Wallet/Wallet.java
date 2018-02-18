package org.mvpigs.Wallet;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;

import org.mvpigs.BlockChain.BlockChain;
import org.mvpigs.GenSig.GenSig;
import org.mvpigs.Transaction.Transaction;

public class Wallet {

// ----- Atributos -----

	private PublicKey address = null; // Clave pública que se usa para enviar y recibir pigcoins.
	private PrivateKey skey = null; // Clave privada se usa para firmar los mensajes de las transacciones.
	private double total_input = 0; // Total de pigcoins que han sido recibidos en esta wallet.
	private double total_output = 0; // Total de pigcoins que han sido enviados desde esta wallet.
	private double balance = 0; // Son los pigcoins que posee este usuario, balance = input - output, no puede ser negativo.
	private ArrayList<Transaction> inputTransactions = new ArrayList<Transaction>();
	private ArrayList<Transaction> outputTransactions = new ArrayList<Transaction>();
	
// ----- Setters y Getters -----
	
	public void setSK(PrivateKey skey) {
		this.skey = skey;
	}
	
	public void setAddress(PublicKey address) {
		this.address = address;
	}
	
	public void setBalance() {
		balance = total_input - total_output;
	}
	
	public PublicKey getAddress() {
		return this.address;
	}
	
	public PrivateKey getSkey() {
		return this.skey;
	}
	
	public ArrayList<Transaction> getInputTransactions() {
		return inputTransactions;
	}

	public void setInputTransactions(ArrayList<Transaction> inputTransactions) {
		this.inputTransactions = inputTransactions;
	}
	
	public ArrayList<Transaction> getOutputTransactions() {
		return outputTransactions;
	}
	
	public void setOutputTransactions(ArrayList<Transaction> outputTransactions) {
		this.outputTransactions = outputTransactions;
	}
	
// ----- Métodos -----

	public void  generateKeyPair() {
		KeyPair pair = GenSig.generateKeyPair();
		this.setSK(pair.getPrivate());
		this.setAddress(pair.getPublic());
	}
	
	public void loadCoins(BlockChain bChain) {
		for (Transaction trx:bChain.getBlockChain()) {
			if (trx.getPkey_recipient().hashCode() == address.hashCode()) {
				total_input += trx.getPigcoings();
			}
			if (trx.getpKey_sender().hashCode() == address.hashCode()) {
				total_output += trx.getPigcoings();	
			}
		setBalance();
		}
	}
	
	@Override
	public String toString() {
		return "\n"+
				"Wallet = " + getAddress().hashCode() +
				"\nTotal input = " + total_input +
				"\nTotal output = " + total_output +
				"\nBalance = " + balance +
				"\n";
	}

	public void loadInputTransactions(BlockChain blockChain) {
		for (Transaction trx:blockChain.getBlockChain()) {
			if (trx.getPkey_recipient().hashCode() == getAddress().hashCode()) {
				inputTransactions.add(trx);
			}
		}
	}
	
	public void loadOutputTransactions(BlockChain blockChain) {
		for (Transaction trx: blockChain.getBlockChain()) {
			if (trx.getpKey_sender().hashCode() == getAddress().hashCode()) {
				outputTransactions.add(trx);
			}
		}
	}
}	
