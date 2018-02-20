package org.mvpigs.Pigcoin.WalletTest;

import static org.junit.Assert.assertEquals;

import java.security.KeyPair;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mvpigs.BlockChain.BlockChain;
import org.mvpigs.GenSig.GenSig;
import org.mvpigs.Transaction.Transaction;
import org.mvpigs.Wallet.Wallet;

public class TestWallet {
	public Wallet wallet1 = new Wallet();
	public Wallet wallet2 = new Wallet();
	public Wallet wallet3 = new Wallet();
	public Wallet walletOrigin = new Wallet(); // Generador de monedas, (como el banco)
    public BlockChain bChain = new BlockChain();
    public ArrayList<Transaction> blockChain = new ArrayList<Transaction>();
    public Transaction trx;
    public ArrayList<Wallet> almacen = new ArrayList<>();
	
	@Before
	public void setUp() {
        wallet1.generateKeyPair();
        wallet2.generateKeyPair();
        wallet3.generateKeyPair();
        walletOrigin.generateKeyPair();
        almacen.add(wallet1);
        almacen.add(wallet2);
        almacen.add(wallet3);
	}
	
	@Test
	public void testKeyPair() {
		int x = 0;
		for(Wallet wallet:almacen) {
		x++;
		System.out.println("Esta es la clave pública/dirección de la wallet"+ x +" --> "+ wallet.getAddress().hashCode());
		System.out.println("Esta es la clave privada/la que firma la transaccion --> "+ wallet.getSkey().hashCode());
		System.out.println("-------------------------------------------------------------------------");
		}
	}
	
	public void testVisualizarWallets() {
		int x = 0;
		for(Wallet wallet:almacen) {
		x++;
			System.out.println("Esta es la wallet"+x);
			System.out.println(wallet.toString());
			System.out.println("--------------------------------------");
		}
	}
	
	@Test
	public void testloadCoins() {
		trx = new Transaction("hash_1", "0", walletOrigin.getAddress(), wallet2.getAddress(), 20, "bacon eggs");
        bChain.addOrigin(trx);
        wallet2.loadCoins(bChain);
        testVisualizarWallets();
	}
	
	@Before
	public void setUpLoadInputsOutputs() {
		trx = new Transaction("hash_2","3", walletOrigin.getAddress(), wallet1.getAddress(), 50, "papapa");
		bChain.getBlockChain().add(trx);
		trx = new Transaction("hash_5","5", walletOrigin.getAddress(), wallet3.getAddress(), 20, "papapanamericano");
		bChain.addOrigin(trx);
		trx = new Transaction("hash_7","2", wallet1.getAddress(), wallet1.getAddress(), 20, "papapanamericano");
		bChain.addOrigin(trx);
		trx = new Transaction("hash_8","1", wallet3.getAddress(), wallet1.getAddress(), 20, "papapanamericano");
		bChain.addOrigin(trx);
		for(Wallet wallet:almacen) {
			wallet.loadCoins(bChain);
		}
	}
	
	@Test
	public void testLoadInputsTransaction() {
		for(Wallet wallet: almacen) {
			wallet.loadInputTransactions(bChain);
		//	testVisualizarWallets();	
		}
	}
	
	@Test
	public void testLoadOutputsTransaction() {
		for(Wallet wallet: almacen) {
			wallet.loadOutputTransactions(bChain);
			testVisualizarWallets();
		}
	}
	
	@Test
	public void testSignTransaction() {
		for(Wallet wallet:almacen) {
			System.out.println("Esta sería la firma de la transación");
			System.out.println(wallet.signTransaction("mensaje de prueba en la firma").hashCode());
		}
	}
	
	@Before
	public void setUpSendCoins() {
		wallet2.getInputTransactions().clear();

	}
	
	@Test
	public void testSendCoins() {
		walletOrigin.sendCoins(wallet2.getAddress(), 5, "hola", bChain); 
		wallet2.loadInputTransactions(bChain);
		double delta = 0.001;
		assertEquals(5,wallet2.getTotalInput(),delta);
	}
	
	@Test
	public void prueba() {
		for(Transaction trx: blockChain) {
			System.out.println(trx.toString());
		}
	}
}
