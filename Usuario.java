import java.util.Vector;

public class Usuario {
	private String nombre;
	private String direccion;
	private Vector<Prestamo> prestamos;

	// Constructor, getters y setters

	public Vector<Prestamo> getPrestamos() {
		return prestamos;
	}

	public Usuario(String nombre, String direccion, Vector<Prestamo> prestamos) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.prestamos = prestamos;
	}
}