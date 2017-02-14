package controller;
import java.util.ArrayList;

import controller.Mk;
import model.*;

public class ReservaMesas {
	ArrayList<Reserva> reservas = new ArrayList<Reserva>();
	
	Mk mk = new Mk();
	
	public ReservaMesas() {

	}
	
	public void addReserva(Cliente c, Mesa m, String h, int n) {
		Reserva res = new Reserva(0, c, m, h, n);
		reservas.add(res);
		System.out.println("Reserva efectuada para o nome " + reservas.get(0).getCliente().getNome() + " com sucesso");
	}
	
}
