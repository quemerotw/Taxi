package Taxi;

public class Cliente extends Persona{

	public Cliente(int numeroDocumento) {
		this(numeroDocumento,TipoDocumento.DNI);
	}

	public Cliente(int numeroDocumento, TipoDocumento tipoDocumento) {
		super(numeroDocumento,tipoDocumento);
	}
}
