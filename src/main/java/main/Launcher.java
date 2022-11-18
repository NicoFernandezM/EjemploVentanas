package main;

import guis.VentanaTrabajador;
import modelo.Trabajador;

public class Launcher {

	public static void main(String[] args) {
		new VentanaTrabajador(new Trabajador());
	}
}