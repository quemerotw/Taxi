package Taxi;

import java.util.ArrayList;

public class NotificacionTransito {
	
	private ArrayList<Escuchador> suscriptores;
	
	
	public NotificacionTransito() {
		this.suscriptores = new ArrayList<Escuchador>();
	}
	
	public void addSuscriptor(Vehiculo vehiculo){
		this.suscriptores.add(vehiculo);
	}
	public void removeSuscriptor(Vehiculo vehiculo) {
		this.suscriptores.remove(vehiculo);
	}
	
	
	public void alertaTransito() {
		for(Escuchador escuchador: this.suscriptores) {
			escuchador.notificacionTransito();
		}
	}
}
