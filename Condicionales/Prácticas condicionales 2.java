import java.util.*;

public class index {
    public static void main(String[] args) throws Exception {

        // Realizar un programa que simule un inicio de sesión solicitando el nombre de usuario y contraseña, y mostrar un mensaje en pantalla, inicio de sesión correcto/ nombre de usuario incorrecto.

        Scanner entrada = new Scanner(System.in);

        System.out.print("Inserte el valor de compra: ");
        float valor = entrada.nextFloat();
        System.out.print("Inserte el método de pago: ");
        entrada.nextLine();
        String metodo = entrada.nextLine();
        float descuento = ((valor * 5) / 100);
        float recargo = ((valor * 3) / 100);

        if(metodo.equals("contado")) {
            System.out.printf("El descuento sería de %.2f euros. El precio final es de %.2f euros.%n", descuento, (valor - descuento));
        } else if (metodo.equals("tarjeta")) {
            System.out.printf("El recargo sería de %.2f euros. El precio final es de %.2f euros.%n", recargo, (valor + recargo));
        }

        // La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque considerando lo siguiente:
        // -	Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de tamaño 2.
        // -	Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.

        Scanner ventaUvas = new Scanner(System.in);
        System.out.print("Introduzca los kilos de uva: ");
        double kilosUvas = ventaUvas.nextDouble();
        System.out.print("Introduzca el precio inicial del kilo de uva: ");
        double precioUvas = ventaUvas.nextDouble();
        Scanner entrada2 = new Scanner(System.in);
        System.out.print("Introduzca el tipo A o B de uva: ");
        String tipoUvas = entrada2.nextLine();
        System.out.print("Introduzca el tamaño 1 o 2 de uva: ");
        int tamanoUvas = entrada2.nextInt();

        if(tipoUvas.equals("A") || tipoUvas.equals("a")) {
            if(tamanoUvas == 1) {
                System.out.printf("El productor recibirá %.2f euros %n", ((kilosUvas * precioUvas) + (kilosUvas * 0.2)));
            } else if(tamanoUvas == 2) {
                System.out.printf("El productor recibirá %.2f euros %n", ((kilosUvas * precioUvas) + (kilosUvas * 0.3)));
            } else {
                System.out.printf("Error %n");
            }
        } else if(tipoUvas.equals("B") || tipoUvas.equals("b")) {
            if(tamanoUvas == 1) {
                System.out.printf("El productor recibirá %.2f euros %n", ((kilosUvas * precioUvas) - (kilosUvas * 0.3)));
            } else if(tamanoUvas == 2) {
                System.out.printf("El productor recibirá %.2f euros %n", ((kilosUvas * precioUvas) - (kilosUvas * 0.5)));
            } else {
                System.out.printf("Error %n");
            }
        } else {
            System.out.printf("Error %n");
        }

        // Realiza un programa que calcule la aceptación de una solicitud en base a edad, nota y sexo:
        // - Mínimo nota (5), edad (18), sexo M = Pichi picha
        // - Mínimo nota (5), edad (18), sexo F = aceptada
        // - Otros casos = no aceptado

        Scanner solicitudes = new Scanner(System.in);
        System.out.println("_______________________________________");
        System.out.println("Bienvenido al servicio de solicitudes");
        System.out.println("_______________________________________");
        System.out.print("Introduzca la edad: ");
        int edad = solicitudes.nextInt();
        System.out.print("Introduzca la nota: ");
        double nota = solicitudes.nextDouble();
        System.out.print("Introduzca el sexo: ");
        String sexo = solicitudes.next(); //Al utilizar scanner, si se quiere utilizar un string tras emplear nextDouble() es necesario inicializar un nuevo Scanner o emplear .next() 
        boolean hombre = sexo.equalsIgnoreCase("hombre"); //Toma en cuenta tanto mayúsculas como minúsculas
        boolean mujer = sexo.equalsIgnoreCase("mujer");
        
        if((nota >= 5) && (edad >= 18)) {
            if(hombre) {
                System.out.println("Pichi picha");
            } else if(mujer) {
                System.out.println("Aceptada");
            } else {
                System.out.println("Datos desconocidos");
            }
        } else {
            System.out.println("No aceptado/a");
        }

        // Realiza un programa que responda ante una pregunta

        Scanner entrada3 = new Scanner(System.in);
        System.out.println("Introduce tu respuesta(si o no): ");
        String respuesta = entrada3.nextLine();

        if(respuesta.equalsIgnoreCase("si")) {
            System.out.println("Has respondido que sí");
        } else if(respuesta.equalsIgnoreCase("no")) {
            System.out.println("Has respondido que no");
        } else {
            System.out.println("Respuesta no reconocida");
        }
    }
}

