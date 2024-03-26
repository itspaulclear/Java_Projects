package _collections;

import java.util.Random;

public enum Color {
	RO("Rojo"),
	NA("Naranja"),
	AM("Amarillo"),
	VE("Verde"),
	AZ("Azul"),
	IN("Índigo"),
	VI("Violeta"),;
	
	private static Random rand = new Random();
	public static Color colorRandom() {
		Color[] colores = Color.values();
		return colores[rand.nextInt(colores.length)];
	}
	private String nombreCompleto;
	
	private Color(String nombreColor) {
		this.nombreCompleto = nombreColor;
	}

	public String getNombreColor() {
		return nombreCompleto;
	}	
	
}
