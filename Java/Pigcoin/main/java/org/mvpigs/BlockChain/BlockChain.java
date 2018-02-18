package org.mvpigs.BlockChain;

import java.security.PublicKey;
import java.util.ArrayList;

import org.mvpigs.GenSig.GenSig;
import org.mvpigs.Transaction.Transaction;

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

