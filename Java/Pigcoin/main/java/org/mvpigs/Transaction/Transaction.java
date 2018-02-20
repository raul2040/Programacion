package org.mvpigs.Transaction;

import java.security.PublicKey;

public class Transaction {

// ----- Atributos -----
	
	private String hash = null;
	private String prev_hash = null;
	private PublicKey pKey_sender = null; // Dirección Pública de la wallet desde la que se envían los Pigcoins. Clave pública de la wallet.
	private PublicKey pkey_recipient = null; // Es la dirección a la que se envían los Pigcoins. Clave pública de la wallet.
	private double pigcoins = 0; // Cantidad de pigcoins que se envían
	private String message = null; // Mensaje que acompaña la transacción y que escribe el usuario que envía los pigcoins.
	private byte[] signature = null; // Es el message firmado con la clave privada del usuario que genera (envía) la transacción.

// ----- Constructores -----
	
	public Transaction() {
	}

	public Transaction(String hash, String prev_hash, PublicKey pKey_sender, PublicKey pKey_recipient, double pigcoins, String message) {
		this.hash = hash;
		this.prev_hash = prev_hash;
		this.pKey_sender = pKey_sender;
		this.pkey_recipient = pKey_recipient;
		this.pigcoins = pigcoins;
		this.message = message;
	}
	
// ----- Setters y Getters ------

	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	public String getPrev_hash() {
		return prev_hash;
	}
	public void setPrev_hash(String prev_hash) {
		this.prev_hash = prev_hash;
	}
	public PublicKey getpKey_sender() {
		return pKey_sender;
	}
	public void setpKey_sender(PublicKey pKey_sender) {
		this.pKey_sender = pKey_sender;
	}
	public PublicKey getPkey_recipient() {
		return pkey_recipient;
	}
	public void setPkey_recipient(PublicKey pkey_recipient) {
		this.pkey_recipient = pkey_recipient;
	}
	public double getPigcoings() {
		return pigcoins;
	}
	public void setPigcoings(int pigcoings) {
		this.pigcoins = pigcoings;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public byte[] getSignature() {
		return signature;
	}
	public void setSignature(byte[] signature) {
		this.signature = signature;
	}

// ----- Métodos ------
	
	@Override
	public String toString() {
		return  "\n hash = "+ hash+
                "\n prev_hash = "+ prev_hash+
                "\n pKey_sender = "+ pKey_sender.hashCode()+
                "\n pKey_recipient = "+ pkey_recipient.hashCode()+
                "\n pigcoins = "+ pigcoins +
                "\n message = "+ message;
	}
}

