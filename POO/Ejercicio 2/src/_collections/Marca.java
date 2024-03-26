package _collections;

import java.util.Random;

public enum Marca {
	SE("Seat"),
	MA("Mazda"),
	RE("Renault"),
	LE("Lexus"),
	TO("Toyota"),
	CH("Chevrolet"),
	WV("Volkswagen"),;
	
	private static Random rand = new Random();
	public static Marca marcaRandom() {
		Marca[] marcas = Marca.values();
		return marcas[rand.nextInt(marcas.length)];
	}
	private String nombreCompleto;
	
	private Marca(String nombreMarca) {
		this.nombreCompleto = nombreMarca;
	}

	public String getNombreMarca() {
		return nombreCompleto;
	}
	
}
