package model;

public class Reserva {
	protected int id_reserva;
	protected Cliente cliente;
	protected Mesa mesa;
	protected String hora;
	protected int n_pessoas;
	
	public Reserva(int id_reserva, Cliente cliente, Mesa mesa, String hora, int n_pessoas) {
		super();
		this.id_reserva = id_reserva;
		this.cliente = cliente;
		this.mesa = mesa;
		this.hora = hora;
		this.n_pessoas = n_pessoas;
	}

	public int getId_reserva() {
		return id_reserva;
	}

	public void setId_reserva(int id_reserva) {
		this.id_reserva = id_reserva;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getN_pessoas() {
		return n_pessoas;
	}

	public void setN_pessoas(int n_pessoas) {
		this.n_pessoas = n_pessoas;
	}

	
}
