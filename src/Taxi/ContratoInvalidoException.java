package Taxi;

public class ContratoInvalidoException extends Exception {
	private String msg;
	
	public ContratoInvalidoException(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return this.msg;
	}
	
	
}
