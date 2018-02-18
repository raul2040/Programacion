package org.mvpigs.Wallet;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
	
	public void setTotalInput(double total_input) {
		this.total_input = total_input;
	}
	
	public void setTotalOutput(double total_output) {
		this.total_output = total_output;
	}
	
	public void setBalance() {
		balance = total_input - total_output;
	}
	
	public double getTotalInput() {
		return this.total_input;
	}
	
	public double getTotalOutput() {
		return this.total_output;
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
		total_input = 0;
		total_output = 0;
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
	
	public void sendCoins(PublicKey pkey_recipient, double pigcoins, String message, BlockChain blockChain) {
		Transaction transaction = new Transaction();
		transaction = new Transaction(transaction.getHash(), transaction.getPrev_hash(), address, pkey_recipient, pigcoins, message);
		blockChain.addOrigin(transaction);
	}
	
	public byte[] signTransaction(String message) {
		return GenSig.sign(getSkey(), message);
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
	
   public Map<String, Double> collectCoins(double pigcoins){
        Map<String, Double> consumedCoins = new HashMap<>();
        for (Transaction trx: outputTransactions) {
            consumedCoins.put(trx.getHash(), trx.getPigcoings());
        }
        for (Transaction trx: inputTransactions) {
            consumedCoins.put(trx.getHash(), trx.getPigcoings());
        }
        return consumedCoins;
}
}	
