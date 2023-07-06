package Taxi;

public abstract class Vehiculo implements Escuchador, CostoReal{

	private String dominio;
	private int año;
	private String marca;
	private String modelo;
	private TipoVehiculo tipoVehiculo;
	private CoordenadasGPS coordenadas;
	private int capacidadPersonas;
	
	
	
	public Vehiculo() {
		this("AAA-AAA");
	}
	
	
	
	public Vehiculo(String dominio) {
		this(dominio,4);
	}



	public Vehiculo(String dominio, int capacidadPersonas) {
		this(dominio,capacidadPersonas,TipoVehiculo.chico);
	}



	public Vehiculo(String dominio,int capacidadPersonas,TipoVehiculo tipoVehiculo) {
		this.dominio = dominio;
		this.tipoVehiculo = tipoVehiculo;
		this.capacidadPersonas = capacidadPersonas;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public CoordenadasGPS getCoordenadas() {
		return coordenadas;
	}
	public void setCoordenadas(CoordenadasGPS coordenadas) {
		this.coordenadas = coordenadas;
	}
	public String getDominio() {
		return dominio;
	}
	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}
	public int getCapacidadPersonas() {
		return capacidadPersonas;
	}
	public void setCapacidadPersonas(int capacidadPersonas) {
		this.capacidadPersonas = capacidadPersonas;
	}
	
	
}
