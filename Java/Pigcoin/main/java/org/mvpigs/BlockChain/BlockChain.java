package org.mvpigs.BlockChain;

import java.security.PublicKey;
import java.util.ArrayList;

import org.mvpigs.GenSig.GenSig;
import org.mvpigs.Transaction.Transaction;
import org.mvpigs.Wallet.Wallet;

public class BlockChain {
// blockChain lo componen las transacciones de pigcoins que han realizado los propietarios de las wallets	
// ----- Atributos -----
	
	private ArrayList<Transaction> blockChain = new ArrayList<Transaction>();
	
// ----- Constructores -----
	
	public BlockChain() {
	}
	
// ----- Setters y Getters
	public ArrayList<Transaction> getBlockChain() {
		return blockChain;
	}
	
// ----- Lógica -----
	
	public void addOrigin(Transaction transaction) {
		blockChain.add(transaction);
	}
	
	public void processTransactions(PublicKey pKey_sender, PublicKey pKey_recipient, double consumedCoins, String message , byte[] signedTransaction) {
		GenSig.verify(pKey_sender, message, signedTransaction);
	}
	
	public boolean  isSignatureValid(PublicKey pKey_sender,String message, byte[] signedTransaction) {
		return GenSig.verify(pKey_sender, message, signedTransaction);
	}
	
	public void loadInputTransactions(PublicKey address) {
		Wallet wallet = new Wallet();
		for (Transaction trx:blockChain) {
			if (trx.getPkey_recipient().hashCode() == address.hashCode()) {
				wallet.getInputTransactions().add(trx);
			}
		}
	}
	
	public void loadOutputTransactions(PublicKey address) {
		Wallet wallet = new Wallet();
		for (Transaction trx: blockChain) {
			if (trx.getpKey_sender().hashCode() == address.hashCode()) {
				wallet.getOutputTransactions().add(trx);
			}
		}
	}
	
	public void loadWallet(PublicKey address) {
		Wallet wallet = new Wallet();
		double input = wallet.getTotalInput();
		double output = wallet.getTotalOutput();
		for (Transaction trx:blockChain) {
			if (trx.getPkey_recipient().hashCode() == address.hashCode()) {
				input += trx.getPigcoings();
			}
			if (trx.getpKey_sender().hashCode() == address.hashCode()) {
				output += trx.getPigcoings();	
			}
		wallet.setTotalInput(input);
		wallet.setTotalOutput(output);
		wallet.setBalance();
		}
	}

	public void summarize(int position) {
		Transaction trx = blockChain.get(position);
			System.out.println(trx.toString());
	}
	
	public void summarize() {
		for(Transaction trx:blockChain) {
			System.out.println(trx.toString());
		}
	}
}

