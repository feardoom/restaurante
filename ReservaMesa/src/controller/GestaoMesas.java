package controller;

import java.util.ArrayList;
import model.Mesa;

public class GestaoMesas {
	ArrayList<Mesa> _mesas;
	
	public GestaoMesas() {
		_mesas = new ArrayList<Mesa>();
	}
	
	public void addMesa(int lugares, boolean fumador) {
		Mesa m = new Mesa(lugares, _mesas.size(), fumador);
		_mesas.add(m);
		
		System.out.println("Numero de mesas no restaurante: " + _mesas.size());
	}
}
