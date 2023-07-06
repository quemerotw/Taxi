package Taxi;

import java.util.Random;

public class CoordenadasGPS {
	private int longitud;
	private int latitud;
	
	
	public CoordenadasGPS() {
		Random random = new Random();
		this.longitud = random.nextInt(0,9);
		this.latitud = random.nextInt(0,9);
	}

	public int calcularDistancia(CoordenadasGPS coordenadas2){
		Random random = new Random();
		return random.nextInt(1,coordenadas2.getX()+coordenadas2.getY());
	}

	public int getX() {
		return longitud;
	}

	public void setX(int x) {
		this.longitud = x;
	}

	public int getY() {
		return latitud;
	}

	public void setY(int y) {
		this.latitud = y;
	}
	
}
