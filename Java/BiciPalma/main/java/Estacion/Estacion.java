package Estacion;

import Bicicleta.Bicicleta;
import TarjetaUsuario.TarjetaUsuario;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;


public class Estacion {

// ------------ Atributos ------------
	
	private int id = 0;
	private String direccion = null;
	private int numeroAnclajes = 0;
	private HashMap<Integer, Integer> anclajes = new HashMap<>();
	
// ---------- Constructor -------------
	
	public Estacion(int id, String direccion, int numeroAnclajes) {
		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes = numeroAnclajes;
		for(int x=0; x < numeroAnclajes; x++) {
			anclajes.put(x, null);
		}
			
	}
// ------- Setters y Getters ---------
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getNumeroAnclajes() {
		return numeroAnclajes;
	}
	public void setNumeroAnclajes(int numeroAnclajes) {
		this.numeroAnclajes = numeroAnclajes;
	}
	
// -------- Métodos ----------
	public void consultarEstacion() {
		System.out.println("El id es: " + getId());
		System.out.println("La dirección es: " + getDireccion());
		System.out.println("El número de anclajes es " + getNumeroAnclajes());
	}
	
	public int anclajesLibres() {
		int anclajesLibres = 0;
		for (Entry<Integer, Integer> iterador: anclajes.entrySet()) {
			Integer value = iterador.getValue();
			if(value == null) {
				anclajesLibres++;
			}
		}
		return anclajesLibres;
	}
	
	public void consultarAnclajes() {
		for(Entry<Integer, Integer> iterador : anclajes.entrySet()) {
			Integer value = iterador.getValue();
			Integer key = iterador.getKey();
			if(value == null) {
				System.out.println("Este anclaje " + key + " esta libre");
			}
			else {
				//System.out.println("Este anclaje " + key + " esta ocupado por el siguiente id " + value.getId());
			}
		}
	}
	
	public void anclarBicicleta(Bicicleta bicicleta) {
		for(Entry<Integer, Integer> iterador: anclajes.entrySet()) {
			Integer value = iterador.getValue();
			Integer key = iterador.getKey();
			if(value == null) {
				anclajes.put(key, bicicleta.getId());
				mostrarAnclaje(bicicleta, key);
				break;
			}
			
		}
	}
	
	public void mostrarAnclaje(Bicicleta bicicleta,int key) {
		System.out.println("El id de la bicicleta anclada es " + bicicleta.getId() + " y se ha anclado en el anclaje número " + key);
	}
	
	public boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario) {
		return tarjetaUsuario.isActivada();
		}
	
	public void retirarBicicleta(TarjetaUsuario tarjetaUsuario){
		if(tarjetaUsuario.isActivada()) {
			for(Entry<Integer, Integer> iterador: anclajes.entrySet()) {
				Integer value = iterador.getValue();
				anclajes.remove(value);
				}
			}
		}
	public void generarAnclaje() {
		Random r = new Random();
		int random = r.nextInt(numeroAnclajes);
		for (Entry<Integer, Integer> iterador: anclajes.entrySet()) {
			anclajes.remove(random);
		}
		}
	
	public void mostrarBicicleta(Bicicleta bicicleta, int numeroAnclajes) {
		System.out.println("El id de la bicicleta es " + bicicleta.getId() + " estaba anclada en" + anclajes.get(bicicleta));	
	}
	
		
	}
	