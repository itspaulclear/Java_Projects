package _collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Parking {
	private String nombre;
	private int totalPlazas;
	private List<Coche> listaCoches = new ArrayList<>();
	private Map<Color, Integer> mapColor = new HashMap<>();
	private Map<Marca, Integer> mapMarca = new HashMap<>();
	private Map<String, Integer> mapIguales = new HashMap<>();
	private Set<String> setCoches = new HashSet<>();
	
	public Parking(String nombre, int totalPlazas) {
		this.nombre = nombre;
		this.totalPlazas = totalPlazas;
	}
	
	private void entraColor(Coche c) {
		if(mapColor.containsKey(c.getColor())) {
			mapColor.put(c.getColor(), mapColor.get(c.getColor()) + 1);
		} else if(!mapColor.containsKey(c.getColor())){
			mapColor.put(c.getColor(), 1);
		} 
	}
	
	private void saleColor(Coche c) {
		if(mapColor.containsKey(c.getColor()))
			mapColor.put(c.getColor(), mapColor.get(c.getColor()) - 1);
		if(mapColor.get(c.getColor()) == 0)
			mapColor.remove(c.getColor());
	}
	
	private void entraMarca(Coche c) {
		if(mapMarca.containsKey(c.getMarca())) {
			mapMarca.put(c.getMarca(), mapMarca.get(c.getMarca()) + 1);
		} else if(!mapMarca.containsKey(c.getMarca())){
			mapMarca.put(c.getMarca(), 1);
		}
	}
	
	private void saleMarca(Coche c) {
		if(mapMarca.containsKey(c.getMarca()))
			mapMarca.put(c.getMarca(), mapMarca.get(c.getMarca()) - 1);
		if(mapMarca.get(c.getMarca()) == 0)
			mapMarca.remove(c.getMarca());
	}
	
	private void entranIguales(Coche c) {
	    String key = c.getMarca().name() + " " + c.getColor().name();
	    if (mapIguales.containsKey(key)) {
	        mapIguales.put(key, mapIguales.get(key) + 1);
	    } else if(!mapIguales.containsKey(key)){
	        mapIguales.put(key, 1);
	    } 
	} 
	
	private void salenIguales(Coche c) {
	    String key = c.getMarca().name() + " " + c.getColor().name();
		if(mapIguales.containsKey(key)) 
			mapIguales.put(key, mapIguales.get(key) - 1);
		if(mapIguales.get(key) == 0) 
			mapIguales.remove(key);
	}
	
	private void entraSet(Coche c) {
		String key = c.getMarca().name() + " " + c.getColor().name();
		if(!setCoches.contains(key)) {
			setCoches.add(key);
		} 
	}
	
	private void saleSet(Coche c) {
		String key = c.getMarca().name() + " " + c.getColor().name();
		if(setCoches.contains(key))
			setCoches.remove(key);
	}
	
	public boolean hayPlazasLibres() { 
		return listaCoches.size() < totalPlazas;
	}
	
	public boolean entraCoche(Coche c) {
		boolean cocheDuplicado = false;
		for(int i = 0; i < listaCoches.size(); i++) {
			if(listaCoches.get(i).hashCode() == c.hashCode()) {
				cocheDuplicado = true;
			} else {
				cocheDuplicado = false;
			}
		}
		
		if(hayPlazasLibres() && !cocheDuplicado) { 
			entraColor(c);
			entraMarca(c);
			entranIguales(c);
			entraSet(c);
			listaCoches.add(c);
		} else if(!hayPlazasLibres()) {
			return false;
		}
		return false;
	} 
	
	public boolean saleCoche(Coche c) {
		if(listaCoches.contains(c)) {
			saleColor(c);
			saleMarca(c);
			salenIguales(c);
			saleSet(c);
			return listaCoches.remove(c);
		}
		if (!listaCoches.contains(c) || listaCoches.size() == 0) {
			return false;			
		}
		return false;
	}
	
	public boolean saleCocheAleatorio() { 
		if(!listaCoches.isEmpty()) {
			Random aleatorios = new Random();
			Coche cocheEliminado = listaCoches.get(aleatorios.nextInt(listaCoches.size()));
			saleColor(cocheEliminado);
			saleMarca(cocheEliminado);
			salenIguales(cocheEliminado);
			saleSet(cocheEliminado);
			return listaCoches.remove(cocheEliminado);
		}
		return false;
	}
	
	public boolean vaciaParking() {
		if(listaCoches.isEmpty()) {
			return false;
		} else {
			for(int index = 0; index < listaCoches.size(); index++) {
				System.out.printf("Ha salido el coche de marca %s y color %s (%d / %d)%n", 
						listaCoches.get(index).getMarca().getNombreMarca(), listaCoches.get(index).getColor().getNombreColor(), listaCoches.size(), totalPlazas);
				listaCoches.remove(listaCoches.get(index));
				index--;
			}
			System.out.printf("PARKING VACIADO (%d / %d)%n", listaCoches.size(), totalPlazas);
		}
		mapColor.clear();
		mapMarca.clear();
		mapIguales.clear();
		setCoches.clear();
		System.out.println();
		return false;
	}
	
	public void reportParking() {
		System.out.printf("LISTADO COCHES%n");
		System.out.printf("--------------%n");
		System.out.printf("Parking: %s%n", nombre);
		for(Coche coche : listaCoches) {
			System.out.printf("  Coche: %s %s%n", coche.getMarca(), coche.getColor());
		}
		System.out.printf("Total coches: %s, plazas libres: %s.%n", listaCoches.size(), totalPlazas - listaCoches.size());
		System.out.println();
	}
	
	public void reportColores() {
	    System.out.printf("REPORT DE COLORES%n");
	    System.out.printf("-----------------%n");
	    System.out.printf("Parking: %s%n", nombre);
	    int totalColores = 0;
	    for (Color color : mapColor.keySet()) {
	    	totalColores += mapColor.get(color);
	        System.out.printf("El coche de color %s se repite %d ve%s%n", color.getNombreColor(), mapColor.get(color), mapColor.get(color) > 1 ? "ces" : "z");
	    } 
	    System.out.printf("Total coches: %d%n", totalColores);
	    System.out.println();
	}
	
	public void reportMarcas() {
		System.out.printf("REPORT DE MARCAS%n");
		System.out.printf("----------------%n");
		System.out.printf("Parking: %s%n", nombre);
		int totalMarcas = 0;
		for(Marca marca : mapMarca.keySet()) {
			totalMarcas += mapMarca.get(marca);
			System.out.printf("El coche de marca %s se repite %d ve%s%n", marca.getNombreMarca(), mapMarca.get(marca), mapMarca.get(marca) > 1 ? "ces" : "z");
		}
		System.out.printf("Total coches: %d%n", totalMarcas);
		System.out.println();
	}
	
	public void reportCochesIguales() {
	    System.out.printf("REPORT DE COCHES IGUALES%n");
	    System.out.printf("------------------------%n");
	    System.out.printf("Parking: %s%n", nombre);
	    int totalCoches = 0;
	    for (Map.Entry<String, Integer> entry : mapIguales.entrySet()) {
	        String key = entry.getKey();
	        String[] division = key.split(" ");
	        String marca = division[0];
	        String color = division[1];
	        int numCoches = entry.getValue();
	        System.out.printf("Coche: %s %s se repite %d ve%s%n", marca, color, numCoches, numCoches > 1 ? "ces" : "z");
	        totalCoches += numCoches;
	    }
	    System.out.printf("Total coches: %d%n", totalCoches);
	    System.out.println();
	}
	
	public void reportSetCoches() {
		System.out.printf("REPORT SET DE COCHES%n");
		System.out.printf("--------------------%n");
		System.out.printf("Parking: %s%n", nombre);
		for(String key : setCoches) {
			System.out.printf("Coche: %s %s%n", key.split(" ")[0], key.split(" ")[1]);
		}
		System.out.printf("Total items: %d%n", setCoches.size());
		System.out.println();
	}
}
