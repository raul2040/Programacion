package org.mvpigs.BlockChain;

import java.util.ArrayList;

import org.mvpigs.Transaction.Transaction;

public class BlockChain {
// blockChain lo componen las transacciones de pigcoins que han realizado los propietarios de las wallets	
// ----- Atributos -----
	
	private ArrayList<Transaction> blockChain = new ArrayList<Transaction>();
	
// ----- Lógica -----
	
	public void addOrigin(Transaction transaction) {
		blockChain.add(transaction);
	}
	
	
	


}
