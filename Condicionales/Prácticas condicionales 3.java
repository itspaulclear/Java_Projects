import java.lang.reflect.Array;
import java.util.*;

public class condicionales {
    public static void main(String[] args) throws Exception {
        // A. Se debe crear un programa en Java que permita al usuario ingresar los precios de cuatro productos diferentes. Para cada producto, el programa calculará el IVA correspondiente (21% del precio) y mostrará el precio final incluyendo el IVA. Luego, el programa calculará y mostrará el IVA total de los cuatro productos, el precio total sin IVA y el precio total incluyendo el IVA de los cuatro productos combinados. Finalmente, el programa imprimirá un resumen con el "total sin IVA", el "IVA total" y el "total con IVA" en formato de dos decimales.
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduzca el valor del primer producto:");
        double valor1 = entrada.nextDouble();
        double IVA1 = ((valor1 * 21) / 100);
        double precioFinal1 = valor1 + IVA1;
        System.out.println("El IVA es del 21%, valor del IVA: "+ IVA1 + " euros, precio final: " + precioFinal1 + " euros.");

        System.out.print("Introduzca el valor del segundo producto:");
        double valor2 = entrada.nextDouble();
        double IVA2 = ((valor2 * 21) / 100);
        double precioFinal2 = valor2 + IVA2;
        System.out.println("El IVA es del 21%, valor del IVA: " + IVA2 + " euros, precio final: " + precioFinal2 + " euros.");

        System.out.print("Introduzca el valor del tercer producto:");
        double valor3 = entrada.nextDouble();
        double IVA3 = ((valor3 * 21) / 100);
        double precioFinal3 = valor3 + IVA3;
        System.out.println("El IVA es del 21%, valor del IVA: " + IVA2 + " euros, precio final: " + precioFinal2 + " euros.");

        System.out.print("Introduzca el valor del cuarto producto:");
        double valor4 = entrada.nextDouble();
        double IVA4 = ((valor4 * 21) / 100);
        double precioFinal4 = valor4 + IVA4;
        System.out.println("El IVA es del 21%, valor del IVA: " + IVA4 + " euros, precio final: " + precioFinal4 + " euros.");

        double IVAtotal = IVA1 + IVA2 + IVA3 + IVA4;
        double sumaSinIVA = valor1 + valor2 + valor3 + valor4;
        double sumaTotal = precioFinal1 + precioFinal2 + precioFinal3 + precioFinal4;
        System.out.println("El IVA total es: " + IVAtotal + " euros, el precio total es:" + sumaTotal + " euros.");

        System.out.println("_________________________________________________________________________________");
        System.out.println("LIQUIDACIÓN");
        System.out.printf("el total sin IVA: %.2f\n", sumaSinIVA);
        System.out.printf("el 'IVA' es: %.2f\n" , IVAtotal);
        System.out.printf("el total con IVA: %.2f\n", sumaTotal);



        // B. En  una  tienda   de  descuento se  efectúa una   promoción  en la   cual  se  hace  undescuento sobre el valor de la compra total según el color de la bolita que el clientesaque al pagar en caja. Si la bolita es de color blanco no se le hará descuentoalguno, si es verde se le hará un 10% de descuento, si es amarilla un 25%, si es azul un 50% y si es roja un 100%. Determinar la cantidad final que el cliente deberápagar por su compra. se sabe que solo hay bolitas de los colores mencionados.
        Scanner entrada2 = new Scanner(System.in);
        System.out.print("Introduce el valor de la compra: ");

        float precioProducto = entrada2.nextFloat();
        System.out.print("Introduce el color de la bolita: ");
        entrada2.nextLine();
        String colorBolita = entrada2.nextLine();
        if(colorBolita.equals("Blanca")) {
            System.out.println(precioProducto + " euros");
        } else if(colorBolita.equals("Verde")) {
            System.out.println((precioProducto - (precioProducto * 0.1)) + " euros");
        } else if(colorBolita.equals("Amarilla")) {
            System.out.println((precioProducto - (precioProducto * 0.25)) + " euros");
        } else if(colorBolita.equals("Azul")) {
            System.out.println((precioProducto - (precioProducto * 0.5)) + " euros");
        } else {
            System.out.println((precioProducto - (precioProducto * 1)) + " euros");
        }


        // C. El  seguro social requiere clasificar a  las personas que se jubilaran en  el año de 1997.Existen tres tipos de jubilaciones: por edad, por antigüedad joven y por antigüedad adulta.Las   personas   adscritas   a   la   jubilación   por   edad   deben   tener   60   años   o   más   y   unaantigüedad en su empleo de menos de 25 años. Las   personas   adscritas   a   lajubilación por antigüedad joven deben tener menos de 60 años y una antigüedad en suempleo de 25 años o más.Las personas adscritas a la jubilación por antigüedad adulta deben tener 60años o más y una antigüedad en su empleo de 25 años o más.Determinar en que tipo de jubilación, quedara adscrita una persona.

        Scanner entrada3 = new Scanner(System.in);

        System.out.print("Indique su edad: ");
        int edad = entrada3.nextInt();
        System.out.print("Indique su periodo de cotización: ");
        int añosCotizacion = entrada3.nextInt();
        if(edad >= 60 && añosCotizacion < 25) {
            System.out.println("Tipo de jubilación por edad");
        } else if (edad < 60 && añosCotizacion >= 25) {
            System.out.println("Tipo de jubilación por antigüedad joven");
        } else if (edad >= 60 && añosCotizacion >= 25) {
            System.out.println("Tipo de jubilación por antigüedad adulta");
        } else {
            System.out.println("ERROR");
        }




        // D. En una fábrica de computadoras se planea ofrecer a los clientes un descuento quedependerá del número de computadoras que compre.  Si las computadoras sonmenos de cinco se les dará un 10% de descuento sobre el total de la compra; si elnúmero de computadoras es mayor o igual a cinco pero menos de diez se le otorgaun 20% de descuento; y si son 10 o más se les da un 40% de descuento. El precio de cada computadora es de $1, 200,000.
        Scanner entrada4 = new Scanner(System.in);

        System.out.print("Indique el número de ordenadores comprados: ");
        int ordenadores = entrada4.nextInt();
        if(ordenadores < 5) {
            System.out.println(((1200 * ordenadores) - ((1200 * ordenadores) * 0.1)) + " euros.");
        } else if ((ordenadores >= 5) && (ordenadores < 10)) {
            System.out.println(((1200 * ordenadores) - ((1200 * ordenadores) * 0.2)) + " euros.");
        } else if (ordenadores >= 10) {
            System.out.println(((1200 * ordenadores) - ((1200 * ordenadores) * 0.4)) + " euros.");
        } else {
            System.out.println("ERROR");
        }



        // E. Se debe crear un programa en Java que permita al usuario ingresar la cantidad de kilogramos de manzanas compradas. El programa calculará el precio total a pagar aplicando diferentes descuentos según la cantidad ingresada: si es menor o igual a 2 kg, se cobrará 1.2 euros por kg sin descuento; si está entre 2.01 y 5 kg, se aplicará un 10% de descuento; si está entre 5.01 y 10 kg, el descuento será del 15%; y si supera los 10 kg, el descuento será del 20%. En caso de ingresar una cantidad negativa, el programa mostrará un mensaje de error.
        Scanner entrada5 = new Scanner(System.in); 

        System.out.print("Indique el número de kg de manzanas compradas: ");
        double manzanas = entrada5.nextDouble();
        if (manzanas >= 0 && manzanas <= 2) {
            System.out.println(1.2 * manzanas);
        } else if (manzanas >= 2.01 && manzanas <= 5) {
            System.out.println((1.2 * manzanas) - ((1.2 * manzanas) * 0.1));
        } else if (manzanas >= 5.01 && manzanas <= 10) {
            System.out.println((1.2 * manzanas) - ((1.2 * manzanas) * 0.15));
        } else if (manzanas >= 10.01) {
            System.out.println((1.2 * manzanas) - ((1.2 * manzanas) * 0.2));
        } else {
            System.out.println("ERROR");
        }



        // F. Se debe crear un programa en Java que simule un menú de tienda en línea, presentando al usuario las opciones de ver productos, ver carrito de compra, añadir productos y salir. Si elige ver productos o carrito, mostrará un mensaje indicando que se listarán. Si elige añadir productos, se le presentará un submenú con tres opciones (pelota, muñeca, bicicleta) para seleccionar, y según su elección, se mostrará un mensaje con el producto seleccionado. Si elige salir, se mostrará un mensaje de salida. En caso de ingresar una opción no válida, el programa mostrará un mensaje de "Opción incorrecta".
        Scanner entrada6 = new Scanner(System.in);

        System.out.println("Bienvenido a nuestra tienda");
        System.out.println("1. Ver productos");
        System.out.println("2. Ver carrito de compra");
        System.out.println("3. Añadir productos");
        System.out.println("4. Salir");
        System.out.println("_____________________________");
        System.out.print("Seleccione una opción: ");
        int numero = entrada6.nextInt();

        switch(numero) {
            case 1:
                System.out.println("Mostrando lista de productos...");
                break;
            case 2:
                System.out.println("Mostrando carrito de la compra...");
                break;
            case 3:
                System.out.println("¿Qué productos deseas añadir?");
                System.out.println("1. Pelota");
                System.out.println("2. Muñeca");
                System.out.println("3. Bicicleta");
                System.out.println("________________________________");
                System.out.print("Indique el número: ");
                int n1 = entrada6.nextInt();
                if (n1 == 1) {
                    System.out.println("Has seleccionado la pelota");
                } else if (n1 == 2) {
                    System.out.println("Ha seleccionado la muñeca");
                } else if (n1 == 3) {
                    System.out.println("Has seleccionado la bicicleta");
                } else {
                    System.out.println("Opción equivocada");
                }
                break;
            case 4:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }



        // G. Se debe crear un programa en Java que permita al usuario ingresar su nombre y el departamento al que pertenece (Atención al cliente, Logística o Gerencia), así como sus años de antigüedad en la empresa. El programa calculará los días de vacaciones a los que tiene derecho el empleado según el departamento y los años de antigüedad, aplicando diferentes reglas: en Atención al cliente, 6 días al primer año, 14 días entre 2 y 6 años, y 20 días a partir de 7 años; en Logística, 7 días al primer año, 15 días entre 2 y 6 años, y 22 días a partir de 7 años; en Gerencia, 10 días al primer año, 20 días entre 2 y 6 años, y 30 días a partir de 7 años. Si el empleado no ha cumplido 1 año, se indicará que no tiene derecho a vacaciones, y si ingresa un departamento inválido, se mostrará un mensaje de error.
        Scanner entrada7 = new Scanner(System.in);

        System.out.print("Introduzca su nombre: ");
        String nombre = entrada7.nextLine();
        System.out.println("_______________________");
        System.out.println("1. Atención al cliente");
        System.out.println("2. Logística");
        System.out.println("3. Gerencia");
        System.out.print("Introduzca la clave de su departamento: ");
        int claveDepartamento = entrada7.nextInt();
        System.out.print("Introduzca sus años de antigüedad en la empresa: ");
        int antiguedad = entrada7.nextInt();

        if(claveDepartamento == 1) {
            if(antiguedad == 1) {
                System.out.println("Tienes 6 días disponibles de vacaciones.");
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                System.out.println("Tienes 14 días disponibles de vacaciones.");
            } else if (antiguedad >= 7) {
                System.out.println("Tienes 20 días disponibles de vacaciones.");
            } else {
                System.out.println("Aun no tienes derecho a vacaciones");
            }
        } else if(claveDepartamento == 2) {
            if(antiguedad == 1) {
                System.out.println("Tienes 7 días disponibles de vacaciones.");
            } else if(antiguedad >= 2 && antiguedad <= 6) {
                System.out.println("Tines 15 días disponibles de vacaciones.");
            } else if (antiguedad >= 7) {
                System.out.println("Tienes 22 días disponibles de vacaciones.");
            } else {
                System.out.println("Aun no tienes derecho a vacaciones");
            }
        } else if(claveDepartamento == 3) {
            if(antiguedad == 1) {
                System.out.println("Tienes 10 días disponibles de vacaciones.");
            } else if(antiguedad >= 2 && antiguedad <= 6) {
                System.out.println("Tienes 20 días disponibles de vacaciones.");
            } else if (antiguedad >= 7) {
                System.out.println("Tienes 30 días disponibles de vacaciones.");
            } else {
                System.out.println("Aun no tienes derecho a vacaciones");
            }
        } else {
            System.out.println("ERROR");
        }
    }
}

