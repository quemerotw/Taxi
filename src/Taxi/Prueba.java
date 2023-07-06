package Taxi;

public class Prueba {

	public static void main(String[] args) {
		Empresa empresa = Empresa.getEmpresa();
		
		NotificacionTransito notificador = new NotificacionTransito();
		
		Vehiculo vehiculo1 = new VehiculoPropio("ALD-GGF",8,TipoVehiculo.van);
		Vehiculo vehiculo2 = new VehiculoPropio("ASD-RZF",3,TipoVehiculo.chico);
		Vehiculo vehiculo3 = new VehiculoPropio("BSD-GLF",5,TipoVehiculo.mediano);
		Vehiculo vehiculo4 = new VehiculoPropio("AGD-GSF",5,TipoVehiculo.mediano);
		Vehiculo vehiculo5 = new VehiculoPropio("CSL-IGF",8,TipoVehiculo.van);
		Vehiculo vehiculo6 = new VehiculoPropio();
		VehiculoTercero vehiculoTerceros1 = new VehiculoTercero("ASD-GGF",8,TipoVehiculo.van);
		VehiculoTercero vehiculoTerceros2 = new VehiculoTercero("ASD-GGF",8,TipoVehiculo.van);
		vehiculoTerceros1.setDueño(new DueñoVehiculo(1000203, TipoDocumento.DNI));
		vehiculoTerceros2.setDueño(new DueñoVehiculo(10563463, TipoDocumento.DNI));
		
		
		empresa.addVehiculo(vehiculo1);
		empresa.addVehiculo(vehiculo2);
		empresa.addVehiculo(vehiculo3);
		empresa.addVehiculo(vehiculo4);
		empresa.addVehiculo(vehiculo5);
		empresa.addVehiculo(vehiculo6);
		empresa.addVehiculo(vehiculoTerceros1);
		empresa.addVehiculo(vehiculoTerceros2);
		
		notificador.addSuscriptor(vehiculo6);
		notificador.addSuscriptor(vehiculo5);
		notificador.addSuscriptor(vehiculo4);
		notificador.addSuscriptor(vehiculo3);
		notificador.addSuscriptor(vehiculo2);
		notificador.addSuscriptor(vehiculo1);
		notificador.addSuscriptor(vehiculo1);
		notificador.addSuscriptor(vehiculoTerceros1);
		notificador.addSuscriptor(vehiculoTerceros2);
		
		
		
		Cliente cliente1 = new Cliente(3020032, TipoDocumento.DNI);
		Cliente cliente2 = new Cliente(2030030, TipoDocumento.DNI);
		
		Solicitud solicitud1 = new Solicitud();
		Solicitud solicitud2 = new Solicitud();
		
		solicitud1.setCantidadPasajeros(4);
		solicitud1.setCliente(cliente2);
		solicitud1.setCoordenadasSalida(new CoordenadasGPS());
		solicitud1.setCoordenadasDestino(new CoordenadasGPS());
		solicitud1.setTipoVehiculo(TipoVehiculo.chico);
		empresa.procesarSolicitud(solicitud1);
		empresa.procesarSolicitud(solicitud1);

		
		solicitud2.setCantidadPasajeros(6);
		solicitud2.setCliente(cliente1);
		solicitud2.setCoordenadasSalida(new CoordenadasGPS());
		solicitud2.setCoordenadasDestino(new CoordenadasGPS());
		solicitud2.setTipoVehiculo(TipoVehiculo.van);
		empresa.procesarSolicitud(solicitud2);
		
		
		
		notificador.alertaTransito();
		
		
		
		empresa.listarContratos();
		
		try {
			Contrato contratoFallido = new Contrato(solicitud2,vehiculo2);
		} catch (ContratoInvalidoException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
