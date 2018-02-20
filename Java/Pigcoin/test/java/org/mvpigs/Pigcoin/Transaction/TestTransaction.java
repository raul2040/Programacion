package org.mvpigs.Pigcoin.Transaction;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mvpigs.Pigcoin.WalletTest.TestWallet;
import org.mvpigs.Transaction.Transaction;
import org.mvpigs.Wallet.Wallet;

public class TestTransaction extends TestWallet {

	
	@Before
	public void setUp3() {
		trx = new Transaction("hash_10","1", walletOrigin.getAddress(), wallet1.getAddress(), 20, "papapanamericano");
		bChain.getBlockChain().add(trx);
	}
	
	@Test
	public void testCrearTransaction() {
		trx = new Transaction("hash_12","4", walletOrigin.getAddress(), wallet1.getAddress(), 100, "papapanamericano");
		assertEquals("hash_12", trx.getHash());
		assertEquals(wallet1.getAddress(), trx.getPkey_recipient());
		assertEquals(walletOrigin.getAddress(), trx.getpKey_sender());
	}
	
	@Test
	public void TestToString() {
		trx = new Transaction("hash_12","4", walletOrigin.getAddress(), wallet1.getAddress(), 100, "papapanamericano");
		System.out.println(trx.toString());
	}
	

}
