package _collections;

public class Coche {
	private Marca marca;
	private Color color;
	
	public Coche(Marca marca, Color color) {
		this.marca = marca;
		this.color = color;
	}
	
	public Coche() {
		marca = Marca.marcaRandom();
		color = Color.colorRandom();
	}
	
	// Implementar método equals y quitar duplicado de coche en Parking
	
	@Override
	public String toString() {
		return String.format("Coche: %s %s", marca, color);
	}
	
	public Marca getMarca() {
		return marca;
	}

	public Color getColor() {
		return color;
	}
	
}
