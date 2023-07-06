package Taxi;

public class VehiculoPropio extends Vehiculo{
	private static double precioKm = 100;
	
	

	public VehiculoPropio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehiculoPropio(String dominio, int capacidadPersonas, TipoVehiculo tipoVehiculo) {
		super(dominio, capacidadPersonas, tipoVehiculo);
		// TODO Auto-generated constructor stub
	}

	public VehiculoPropio(String dominio, int capacidadPersonas) {
		super(dominio, capacidadPersonas);
		// TODO Auto-generated constructor stub
	}

	public VehiculoPropio(String dominio) {
		super(dominio);
		// TODO Auto-generated constructor stub
	}

	public static double getPrecioKm() {
		return precioKm;
	}

	public static void setPrecioKm(double precioKm) {
		VehiculoPropio.precioKm = precioKm;
	}

	@Override
	public void notificacionTransito() {
		
	}

	@Override
	public double costoReal(int distancia) {
		return precioKm;
	}
}
