import java.util.Vector;

public class Libro {
	private String titulo;
	private String autor;
	private String categoria;
	private boolean disponible;

	// Constructor, getters y setters

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}