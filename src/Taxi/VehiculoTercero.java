package Taxi;

public class VehiculoTercero extends Vehiculo{
	private DueñoVehiculo dueño;
	private static double valorHasta5km = 100;
	private static double valorHasta10km = 90;
	private static double valorMayor10km = 80;
	
	
	
	public VehiculoTercero() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public VehiculoTercero(String dominio, int capacidadPersonas, TipoVehiculo tipoVehiculo) {
		super(dominio, capacidadPersonas, tipoVehiculo);
		// TODO Auto-generated constructor stub
	}



	public VehiculoTercero(String dominio, int capacidadPersonas) {
		super(dominio, capacidadPersonas);
		// TODO Auto-generated constructor stub
	}



	public VehiculoTercero(String dominio) {
		super(dominio);
		// TODO Auto-generated constructor stub
	}



	public VehiculoTercero(DueñoVehiculo dueño) {
		this.dueño =dueño;
	}
	
	
	
	public DueñoVehiculo getDueño() {
		return dueño;
	}



	public void setDueño(DueñoVehiculo dueño) {
		this.dueño = dueño;
	}



	public static double getValorHasta5km() {
		return valorHasta5km;
	}



	public static double getValorHasta10km() {
		return valorHasta10km;
	}



	@Override
	public void notificacionTransito() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public double costoReal(int distancia) {
		if (distancia < 5) {
			if (distancia < 10) {
				return valorHasta10km;
			}
			return valorHasta5km;
		}
		else {
			return valorMayor10km;
		}
	}
	
	
}
