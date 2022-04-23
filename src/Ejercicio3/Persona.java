package Ejercicio3;

public class DniInvalido extends IOException {
	public DniInvalido(String mensaje) {
		super(mensaje);
	}
}

public class Persona {
	private String nombre;
	private String apellido;
	private int dni;
	
	public Persona() {
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public void verificarDniInvalido(String dni) {
		// Verifico que sólo haya números
		if (!dni.matches("^[0-9]+$")) {
			throw new DniInvalido(
					"El DNI debe componerse de números solamente.");
		}
	}
}
