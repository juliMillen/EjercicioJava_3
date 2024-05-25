package lab3_excepciones2;

public class Persona {

	private String nombre;
	private String apellido;
	private Integer nroDocumento;
	public Persona(String nombre, String apellido, Integer nroDocumento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroDocumento = nroDocumento;
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
	public Integer getNroDocumento() {
		return nroDocumento;
	}
	public void setNroDocumento(Integer nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	
	
}
