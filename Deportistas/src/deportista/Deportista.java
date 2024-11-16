package deportista;

public abstract class Deportista {
    // Propiedades 
    private String nombre;
    private int edad;
    private double peso;
    private double estatura;
    private String equipo;
    private int puntuacionEquipo;
    private long presupuestoEquipo;
    private double anyosJugados;

    // Constructores
    public Deportista(String nombre, int edad, double peso, double estatura, String equipo, int puntuacionEquipo, long presupuestoEquipo, double anyosJugados) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.equipo = equipo;
        this.puntuacionEquipo = puntuacionEquipo;
        this.presupuestoEquipo = presupuestoEquipo;
        this.anyosJugados = anyosJugados;
    }

    // Metodos
    public abstract double eficiencia();
    
    public abstract boolean renovacion();
    
    public abstract void valorDeMercado(String tipoDeCotizacion);
    
    public abstract double riesgoDeLesion();
    
    public abstract int sueldo();
    
    @Override
    public String toString() {
            return String.format("%s, con %d años, con un peso de %.2f kg. y de %.2f metros de altura, lleva jugando %.1f años en el %s, con una puntuación de %d puntos y un presupuesto de %d euros", nombre, edad, 
                            peso, estatura, anyosJugados, equipo, puntuacionEquipo, presupuestoEquipo);
    }
    
    public void pintar(String color) {
        String black = "\033[30m"; 
        String red = "\033[31m"; 
        String green = "\033[32m"; 
        String yellow = "\033[33m"; 
        String blue = "\033[34m"; 
        String purple = "\033[35m"; 
        String reset = "\u001B[0m";
        System.out.printf("%s", color.equals("negro") ? black : 
                color.equals("rojo") ? red : color.equals("verde") ? green : 
                color.equals("amarillo") ? yellow : color.equals("azul") ? blue :
                color.equals("morado") ? purple : reset);
    }
    
    public void ficharClub(String equipo) {
        this.setEquipo(equipo);
        System.out.printf("Se ha producido un traspaso al equipo: \"%s\"%n", equipo);
    }
    
    public void show() {
        System.out.printf("DATOS DEPORTISTA%n");
        System.out.printf("==================%n");
        System.out.printf("Nombre: %s%n", nombre);
        System.out.printf("Edad: %d años%n", edad);
        System.out.printf("Peso: %.2f kg.%n", peso);
        System.out.printf("Estatura: %.2f metros%n", estatura);
        System.out.printf("Equipo: %s%n", equipo);
        System.out.printf("Puntuación del equipo: %d puntos%n", puntuacionEquipo);
        System.out.printf("Presupuesto del equipo: %d euros%n", presupuestoEquipo);
        System.out.printf("Años jugados: %.2f años%n", anyosJugados);
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    
    public int getPuntuacionEquipo() {
        return puntuacionEquipo;
    }

    public long getPresupuestoEquipo() {
        return presupuestoEquipo;
    }

    public double getAnyosJugados() {
        return anyosJugados;
    }
    
}
