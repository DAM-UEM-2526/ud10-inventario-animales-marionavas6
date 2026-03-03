package EJ1;

public class Mascotas {
	// Primero pongo los atributos
	private String nombrel;
	private int edad;
	private String estado;
	private String fechaNacimiento;

	// y ahora hago el constructor
	public Mascotas(String nombre, int edad, String estado, String fechaNacimiento) {
		this.nombrel = nombre;
		this.edad = edad;
		this.estado = estado;
		this.fechaNacimiento = fechaNacimiento;
	}

	// Y hago el getter de nombre y estado
	public String getNombrel() {
		return nombrel;
	}

	public String getEstado() {
		return estado;
	}
}
