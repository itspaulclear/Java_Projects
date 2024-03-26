package _collections;

public class Test {
	public static void main(String[] args) {
		Parking p1 = new Parking("p1", 10);
		Coche r1 = new Coche(Marca.MA, Color.NA);
		Coche r2 = new Coche(Marca.TO, Color.VE);
		Coche r3 = new Coche(Marca.SE, Color.AZ);
		Coche r4 = new Coche(Marca.LE, Color.VI);
		Coche r5 = new Coche(Marca.CH, Color.RO);
		Coche r6 = new Coche(Marca.MA, Color.NA);
		Coche r7 = new Coche(Marca.TO, Color.VE);
		Coche r8 = new Coche(Marca.SE, Color.AZ);
		Coche r9 = new Coche(Marca.LE, Color.VI);
		Coche r10 = new Coche(Marca.CH, Color.RO);
		Coche r11 = new Coche(Marca.WV, Color.NA);
		
		p1.entraCoche(r1);
		p1.entraCoche(r2);
		p1.entraCoche(r3);
		p1.entraCoche(r4);
		p1.entraCoche(r5);
		p1.entraCoche(r6);
		p1.entraCoche(r7);
		p1.entraCoche(r8);
		p1.entraCoche(r9);
		p1.entraCoche(r10);
		p1.entraCoche(r11);
		
		p1.vaciaParking();
		
		Parking p2 = new Parking("Parking Malvarrosa", 15);
		Coche c6 = new Coche(Marca.MA, Color.NA);
		Coche c7 = new Coche(Marca.LE, Color.VI);
		Coche c8 = new Coche(Marca.TO, Color.VE);
		Coche c9 = new Coche(Marca.TO, Color.RO);
		Coche c10 = new Coche(Marca.SE, Color.AZ);
		Coche c11 = new Coche(Marca.SE, Color.AZ);
		Coche c12 = new Coche(Marca.WV, Color.AZ);
		Coche c13 = new Coche(Marca.TO, Color.RO);
		Coche c14 = new Coche();
		Coche c15 = new Coche(Marca.WV, Color.AZ);
		
		p2.entraCoche(c6);
		p2.entraCoche(c6);
		p2.entraCoche(c7);
		p2.entraCoche(c8);
		p2.entraCoche(c9);
		p2.entraCoche(c10);
		p2.entraCoche(c11);
		p2.entraCoche(c12);
		p2.entraCoche(c13);
		p2.entraCoche(c14);
		p2.saleCoche(c14);
		p2.entraCoche(c15);
		
		p2.reportParking();
		p2.reportColores();
		p2.reportMarcas();
		p2.reportCochesIguales();
		p2.reportSetCoches();
		
		p2.vaciaParking();
		p2.reportColores();
		p2.entraCoche(c6);
		p2.entraCoche(c6);
		p2.entraCoche(c10);
		p2.entraCoche(c10);
		p2.reportParking();		
		p2.vaciaParking();
	}
}
