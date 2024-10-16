
public class Multa {
	private Usuario usuario;
	private double monto;
	private boolean pagada;

	public Multa(Usuario usuario, double monto, boolean pagada) {
		this.usuario = usuario;
		this.monto = monto;
		this.pagada = pagada;
	}

	// Constructor, getters y setters

	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}
}