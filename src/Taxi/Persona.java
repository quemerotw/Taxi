package Taxi;

public abstract class Persona {
	private int numeroDocumento;
	private String nombre;
	private String apellido;
	private TipoDocumento tipoDocumento;
	
	
	public Persona(int numeroDocumento) {
		this(numeroDocumento,TipoDocumento.DNI);
	}
	public Persona(int numeroDocumento, TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDni() {
		return numeroDocumento;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
}
