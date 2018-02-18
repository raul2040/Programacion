package org.mvpigs.BlockChain;

import java.security.PublicKey;
import java.util.ArrayList;

import org.mvpigs.GenSig.GenSig;
import org.mvpigs.Transaction.Transaction;

public class BlockChain {
// blockChain lo componen las transacciones de pigcoins que han realizado los propietarios de las wallets	
// ----- Atributos -----
	
	private ArrayList<Transaction> blockChain = new ArrayList<Transaction>();
	private int pigcoin = 0;
	
// ----- Lógica -----
	
	public void addOrigin(Transaction transaction) {
		blockChain.add(transaction);
	}
	
	public void processTransactions(PublicKey pKey_sender, PublicKey pKey_recipient, double consumedCoins, String message , byte[] signedTransaction) {
		GenSig.verify(pKey_sender, message, signedTransaction);
	}

	public void summarize(int position) {
		Transaction trx = blockChain.get(position);
			System.out.println("\n"+ trx.toString()+"\n");
		}
	public void summarize() {
		for(Transaction trx:blockChain) {
			System.out.println("\n" + trx.toString() + "\n");
		}
	}
}
