package model;

public class Cliente {
	protected int id_cliente;
	protected String nome;
	protected String contacto;
	
	public Cliente(int id_cliente, String nome, String contacto) {
		super();
		this.id_cliente = id_cliente;
		this.nome = nome;
		this.contacto = contacto;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	
	
	
}
