package org.mvpigs.Cotxox;
import org.mvpigs.Cotxox.Tarifa;
import org.mvpigs.Cotxox.PoolConductores;

public class Carrera {
	// ATRIBUTOS
	private int tiempoEsperado = 0;
	private int tiempoCarrera = 0;
	private double costeTotal = 0;
	private String tarjetaCredito = null;
	private String origen = null;
	private double distancia = 0;
	private String destino = null;
	private double propina = 0;
	
	private Conductor conductor = null;
	
	public Carrera(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}
	
	//GETTERS Y SETTERS, MÉTODOS DE ACCESO A DATOS
	
	public Conductor getConductor() {
		return conductor;
	}
	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
}
	public double getPropina() {
		return this.propina;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public int getTiempoEsperado() {
		return tiempoEsperado;
	}
	public void setTiempoEsperado(int tiempoEsperado) {
		this.tiempoEsperado = tiempoEsperado;
	}
	public int getTiempoCarrera() {
		return tiempoCarrera;
	}
	public void setTiempoCarrera(int tiempoCarrera) {
		this.tiempoCarrera = tiempoCarrera;
	}
	public double getCosteTotal() {
		return costeTotal;
	}
	public void setCosteTotal(double costeTotal) {
		this.costeTotal = costeTotal;
	}
	public String getTarjetaCredito() {
		return tarjetaCredito;
	}
	public void setTarjetaCredito(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}
	public double getCosteEsperado() {
		return Tarifa.getCosteTotalEsperado(getDistancia(), getTiempoEsperado());
	}
	
	// LÓGICA
	
	public void asignarConductor(PoolConductores conductores) {
		setConductor(conductores.asignarConductor());
	}
	
	public void realizarPago(double pago) {
		this.costeTotal = pago;
	}
	
	public void recibirPropina(double propina) {
		this.propina = propina;
	}
	
	public void liberarConductor() {
		getConductor().setOcupado(true);
	}
}
