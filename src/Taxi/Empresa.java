package Taxi;

import java.util.ArrayList;
import java.util.Random;

public class Empresa {
	private static Empresa empresa;
	private ArrayList<Vehiculo> listadoVehiculos;
	private ArrayList<Contrato> listadoContratos;
	
	private Empresa() {
		this.listadoContratos = new ArrayList<Contrato>();
		this.listadoVehiculos = new ArrayList<Vehiculo>();
	}
	
	public static Empresa getEmpresa() {
		if(empresa == null) {
			empresa = new Empresa();
		}
		return empresa;
	}
	
	public void addVehiculo(Vehiculo vehiculo) {
		this.listadoVehiculos.add(vehiculo);
	}
	
	public void removeVehiculo(Vehiculo vehiculo) {
		this.listadoVehiculos.remove(vehiculo);
	}
	
	public void addContrato(Contrato contrato) {
		this.listadoContratos.add(contrato);
		
	}
	public void removeContrato(Contrato contrato) {
		this.listadoContratos.remove(contrato);
	}
	
	
	public void procesarSolicitud(Solicitud solicitud) {
		ArrayList<Vehiculo> listadoPosibles = buscarVehiculos(solicitud);
		if(!listadoPosibles.isEmpty()) {
			Random random = new Random();
			int nVehiculo = random.nextInt(0,listadoPosibles.size());
			Vehiculo vehiculoSeleccionado = listadoPosibles.get(nVehiculo);
			try {
				Contrato contrato = new Contrato(solicitud,vehiculoSeleccionado);
				getEmpresa().listadoContratos.add(contrato);
			} catch (ContratoInvalidoException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("no hay vehiculos elegibles");
		}
	}

	private ArrayList<Vehiculo> buscarVehiculos(Solicitud solicitud) {
		ArrayList<Vehiculo> vehiculosPosibles = new ArrayList<Vehiculo>();
		for(Vehiculo vehiculo: Empresa.getEmpresa().listadoVehiculos) {
			if (vehiculo.getTipoVehiculo() == solicitud.getTipoVehiculo()) {
				if(solicitud.getCantidadPasajeros() <= vehiculo.getCapacidadPersonas()) {
					vehiculosPosibles.add(vehiculo);
				}
			}
		}
		return vehiculosPosibles;
	}
	
	public void listarContratos() {
		if (!this.listadoContratos.isEmpty()) {
			for(Contrato contrato: this.listadoContratos) {
				System.out.println("-----------------------------");
				System.out.println(contrato.toString()+"\n");
			}
		}
	}
	
	
	
	
	
}
