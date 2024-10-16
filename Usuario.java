import java.util.Vector;

public class Usuario {
	private String nombre;
	private String direccion;
	private Vector<Prestamo> prestamos;

	// Constructor, getters y setters

	public Vector<Prestamo> getPrestamos() {
		return prestamos;
	}
}