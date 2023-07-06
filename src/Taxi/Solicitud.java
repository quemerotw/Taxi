package Taxi;

public class Solicitud {
	private Cliente cliente;
	private TipoVehiculo tipoVehiculo;
	private int cantidadPasajeros;
	private CoordenadasGPS coordenadasSalida;
	private CoordenadasGPS coordenadasDestino;
	
	
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}
	public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	public int getCantidadPasajeros() {
		return cantidadPasajeros;
	}
	public void setCantidadPasajeros(int cantidadPasajeros) {
		this.cantidadPasajeros = cantidadPasajeros;
	}
	public CoordenadasGPS getCoordenadasSalida() {
		return coordenadasSalida;
	}
	public void setCoordenadasSalida(CoordenadasGPS coordenadasSalida) {
		this.coordenadasSalida = coordenadasSalida;
	}
	public CoordenadasGPS getCoordenadasDestino() {
		return coordenadasDestino;
	}
	public void setCoordenadasDestino(CoordenadasGPS coordenadasDestino) {
		this.coordenadasDestino = coordenadasDestino;
	}
	
	
}
