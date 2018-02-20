package org.mvpigs.Pigcoin.BlockChainTest;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mvpigs.BlockChain.BlockChain;
import org.mvpigs.Pigcoin.WalletTest.TestWallet;
import org.mvpigs.Transaction.Transaction;
import org.mvpigs.Wallet.Wallet;

public class TestBlockChain extends TestWallet {
	
	Wallet wallet_1 = new Wallet();
	Wallet wallet_2 = new Wallet();
	Wallet wallet_3 = new Wallet();
	Wallet origin = new Wallet();
	
	@Before
	public void setUp() {
		
		wallet_1.generateKeyPair();
		wallet_2.generateKeyPair();
		wallet_3.generateKeyPair();
		origin.generateKeyPair();
		
	    bChain= new BlockChain();
	    trx = new Transaction("hash_1", "0", origin.getAddress(), wallet_1.getAddress(), 20, "bacon eggs");
	    bChain.getBlockChain().add(trx);
	   
	    trx = new Transaction("hash_2", "1", origin.getAddress(), wallet_2.getAddress(), 10, "spam spam spam");
	    bChain.getBlockChain().add(trx);
	    
	    trx = new Transaction("hash_3", "hash_1", origin.getAddress(), wallet_1.getAddress(), 100, "a flying pig!");
	    bChain.getBlockChain().add(trx);
	    
	    trx = new Transaction("hash_15", "5", wallet_1.getAddress(), wallet_2.getAddress(), 30, "hola");
		bChain.getBlockChain().add(trx);
	}
	
	@Test
	public void testGetBlockChain() {
		 for(Transaction trx:bChain.getBlockChain()) {
	     System.out.println(trx.toString());
	}
}
	
	@Test
	public void testSummarize() {
		bChain.summarize();
	}
	
	@Test
	public void testSummarizeIndex() {
		int index = 0;
		System.out.println("\n");
		System.out.println("\nEste es el bloque " + index +" del blockChain");
		bChain.summarize(index);
		
	}
	
	@Test 
	public void testLoadWallet() {
		System.out.println("\n");
		System.out.println("Este es el estado de la wallet antes de cargar los coins");
		System.out.println(wallet_1.toString());
		trx = new Transaction("hash_3", "hash_1", origin.getAddress(), wallet_1.getAddress(), 100, "a flying pig!");
	    bChain.getBlockChain().add(trx);
	    
	    trx = new Transaction("hash_15", "5", wallet_1.getAddress(), wallet_2.getAddress(), 30, "hola");
		bChain.getBlockChain().add(trx);
		
		bChain.loadWallet(wallet_1.getAddress());
		System.out.println("Y este es su estado luego de cargar los coins");
		System.out.println(wallet_1.toString());
	}
}
