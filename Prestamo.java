import java.util.Date;

public class Prestamo {
	private Libro libro;
	private Usuario usuario;
	private Date fechaPrestamo;
	private Date fechaDevolucion;

	public Prestamo(Libro libro, Usuario usuario, Date fechaPrestamo, Date fechaDevolucion) {
		this.libro = libro;
		this.usuario = usuario;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fechaDevolucion;
	}
}