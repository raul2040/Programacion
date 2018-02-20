package org.mvpigs.BlockChain;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

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
		
		public void processTransactions( PublicKey pKey_sender, PublicKey pKey_recipient, Map<String, Double> consumedCoins, String message , byte[] signedTransaction) {
			if(isSignatureValid(pKey_sender, message, signedTransaction) && isConsumedCoinValid(consumedCoins)) {
				createTransaction(pKey_sender, pKey_recipient, consumedCoins, message, signedTransaction);
				
			}
		}
		
		private void createTransaction(PublicKey pKey_sender, PublicKey pKey_recipient, Map<String, Double> consumedCoins,String message, byte[] signedTransaction) {
			double coins = 0;
			for (Entry<String, Double> iterador: consumedCoins.entrySet()) {
				coins = iterador.getValue();
			}
			Transaction trx = new Transaction();
			trx = new Transaction(trx.getHash(), trx.getPrev_hash(),pKey_sender, pKey_recipient,coins, message);
		}

		public boolean isConsumedCoinValid(Map<String, Double> consumedCoins) {
			for(Transaction trx: blockChain) {
				for (Entry<String, Double> iterador: consumedCoins.entrySet()) {
				String key = iterador.getKey();
				if(key == trx.getHash()) {
					return false;
					}
				}
			}
		return true;
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
			for(Transaction trx:blockChain) {
				if(trx.getpKey_sender().hashCode() == address.hashCode()) {
					loadInputTransactions(address);
				}
				if(trx.getPkey_recipient().hashCode() == address.hashCode()) {
					loadOutputTransactions(address);
				}
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
