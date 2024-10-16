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

	public Libro(String titulo, String autor, String categoria, boolean disponible) {
		this.titulo = titulo;
		this.autor = autor;
		this.categoria = categoria;
		this.disponible = disponible;
	}
}