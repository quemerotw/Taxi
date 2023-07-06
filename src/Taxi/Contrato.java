package Taxi;

import java.time.LocalDate;

public class Contrato{
	private Solicitud solicitud;
	private Vehiculo vehiculo;
	private LocalDate fecha;
	private LocalDate hora;
	private static int numeroContinuo = 0;
	private int numeroUnico;
	
	
	public Contrato() {
		this.numeroUnico = numeroContinuo;
		numeroContinuo++;
	}
	
	public Contrato(Solicitud solicitud, Vehiculo vehiculo) throws ContratoInvalidoException {
		if (solicitud.getCantidadPasajeros() > vehiculo.getCapacidadPersonas()) {
			throw new ContratoInvalidoException("cantidad de pasajeros exedidos");
		}
		this.solicitud = solicitud;
		this.vehiculo = vehiculo;
		this.numeroUnico = numeroContinuo;
		numeroContinuo++;
	}
	
	public double calcularCosto(){
		CoordenadasGPS salida = this.solicitud.getCoordenadasSalida();
		int distancia = this.solicitud.getCoordenadasDestino().calcularDistancia(salida);
		return distancia * this.vehiculo.costoReal(distancia);
	}

	public Solicitud getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(Solicitud solicitud) {
		this.solicitud = solicitud;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalDate getHora() {
		return hora;
	}

	public void setHora(LocalDate hora) {
		this.hora = hora;
	}

	public int getNumeroUnico() {
		return numeroUnico;
	}

	@Override
	public String toString() {
		return String.format("Contrato numero: %d\n dominio: %s\n costo %.2f", this.numeroUnico,this.vehiculo.getDominio(),this.calcularCosto());
	}
	
	
	
}
