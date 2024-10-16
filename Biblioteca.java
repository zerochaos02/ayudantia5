import java.util.Vector;
import java.util.Date;

public class Biblioteca {
	private String nombre;
	private String direccion;
	private Vector<Libro> libros = new Vector<Libro>();
	private Vector<Empleado> empleados = new Vector<Empleado>();
	private Vector<Usuario> usuarios = new Vector<Usuario>();
	private Vector<Multa> multas = new Vector<Multa>();
	private Vector<Categoria> categorias = new Vector<Categoria>();

	// Métodos para gestión de libros
	public void agregarLibro(Libro libro) {
		libros.add(libro);
	}

	public void modificarLibro(int index, Libro libro) {
		libros.set(index, libro);
	}

	public void eliminarLibro(int index) {
		libros.remove(index);
	}

	// Métodos para gestión de préstamos
	public void realizarPrestamo(Usuario usuario, Libro libro) {
		if (libro.isDisponible()) {
			Prestamo prestamo = new Prestamo(libro, usuario, new Date(), null);
			usuario.getPrestamos().add(prestamo);
			libro.setDisponible(false);
		}
	}

	// Métodos para gestión de multas
	public void generarMulta(Usuario usuario, double monto) {
		Multa multa = new Multa(usuario, monto, false);
		multas.add(multa);
	}

	public void pagarMulta(int index) {
		multas.get(index).setPagada(true);
	}

	public void eliminarMulta(int index) {
		multas.remove(index);
	}

	// Métodos para gestión de empleados
	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}

	public void modificarEmpleado(int index, Empleado empleado) {
		empleados.set(index, empleado);
	}

	public void eliminarEmpleado(int index) {
		empleados.remove(index);
	}

	// Métodos para gestión de categorías
	public void agregarCategoria(Categoria categoria) {
		categorias.add(categoria);
	}

	public void modificarCategoria(int index, Categoria categoria) {
		categorias.set(index, categoria);
	}

	public void eliminarCategoria(int index) {
		categorias.remove(index);
	}
}