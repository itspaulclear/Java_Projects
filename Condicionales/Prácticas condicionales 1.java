import java.util.*;

public class practicasClassroom {
    public static void main(String[] args) throws Exception {
        // Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
       
        Scanner numerosIguales = new Scanner(System.in);
        double n1;
        double n2;

        System.out.print("Introduzca el primer número: ");
        n1 = numerosIguales.nextDouble();
        System.out.print("Introduzca el segundo número: ");
        n2 = numerosIguales.nextDouble();
        if(n1 > n2) {
            System.out.printf("%.2f es mayor que %.2f.%n", n1, n2);
        } else if (n2 > n1) {
            System.out.printf("%.2f es mayor que %.2f.%n", n2, n1);
        } else if (n1 == n2) {
            System.out.printf("%.2f y %.2f son iguales.%n", n1, n2);
        } else {
            System.out.print("ERROR%n");
        }

        // Realiza un programa que pida un número por teclado y nos indique si es par o impar.

        Scanner numeroPar = new Scanner(System.in);
        System.out.print("Introduzca el número: ");
        int nPar = numeroPar.nextInt();

        if(nPar % 2 == 0) {
            System.out.println(nPar + " es par");
        } else if((nPar % 2) != 0) {
            System.out.println(nPar + " no es par");
        } else {
            System.out.println("ERROR");
        }

        // Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el segundo número es 0, debe mostrar un mensaje de error.

        Scanner numeroDivision = new Scanner(System.in);
        System.out.print("Introduzca el dividendo: ");
        int dividendo = numeroDivision.nextInt();
        System.out.print("Introduzca el divisor: ");
        int divisor = numeroDivision.nextInt();
        if(divisor > 0) {
            System.out.printf("El resultado de la división es %d con resto %d%n", (dividendo / divisor), (dividendo % divisor));
        } else if (divisor == 0) {
            System.out.println("ERROR%n");
        } else {
            System.out.println("Introduzca un número mayor a 0%n");
        }

        // Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.

        Scanner mayuscula = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String cadena = mayuscula.nextLine();
        if(cadena.matches(".*[A-Z].*")) {
            System.out.println("Contiene mayúsculas");
        } else {
            System.out.println("No contiene mayúsculas");
        }

        // Realiza un programa que calcule la potencia de un número, dado este y su exponente. Pueden ocurrir tres casos:
            // * El exponente sea positivo: imprime resultado en pantalla.
            // * El exponente sea 0, el resultado es 1.
            // * El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.
        
        Scanner potencia = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int nPotencia = potencia.nextInt();
        System.out.print("Introduzca el exponente: ");
        int nExponente = potencia.nextInt();
        double potenciaOperacion = Math.pow(nPotencia, nExponente);

        if(nExponente > 0) {
            System.out.printf("El resultado es %.2f%n", potenciaOperacion);
        } else if(nExponente == 0) {
            System.out.printf("El resultado es 1%n");
        } else if(nExponente < 0) {
            System.out.printf("El resultado es 1 con exponente %d%n", Math.abs(nExponente));
        } else {
            System.out.printf("ERROR%n");
        }

        //Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.
            // * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
            //* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
            //*Otros casos -> NO ACEPTADA

        Scanner solicitud = new Scanner(System.in);
        System.out.print("Introduzca su edad: ");
        int edad = solicitud.nextInt();
        System.out.print("Introduzca su nota: ");
        double nota = solicitud.nextDouble();
        System.out.print("Introduzca su sexo: ");
        String sexo = solicitud.next();

        if(nota >= 5 && edad >= 18 && sexo.equalsIgnoreCase("M")) {
            System.out.println("POSIBLE");
        } else if(nota >= 5 && edad >= 18 && sexo.equalsIgnoreCase("F")) {
            System.out.println("ACEPTADA");
        } else {
            System.out.println("NO ACEPTADA");
        }

        // Realiza un programa que pida los puntos centrales de dos circunferencias (x1, y1), (x2, y2) y los radios de las mismas (r1, r2). El programa debe clasificar según corresponda como: exteriores, tangentes exteriores, secantes, tangentes interiores, interiores o concéntricas.

        Scanner circunferencia = new Scanner(System.in);
        System.out.println("_________Introduzca los valores de la primera circunferencia _________");
        System.out.print("Introduzca el valor x: ");
        double X1 = circunferencia.nextDouble();
        System.out.print("Introduzca el valor y: ");
        double Y1 = circunferencia.nextDouble();
        System.out.print("Introduzca el valor del radio: ");
        double R1 = circunferencia.nextDouble();
        System.out.println("_________Introduzca los valores de la segunda circunferencia_________");
        System.out.print("Introduzca el valor x: ");
        double X2 = circunferencia.nextDouble();
        System.out.print("Introduzca el valor y: ");
        double Y2 = circunferencia.nextDouble();
        System.out.print("Introduzca el valor del radio: ");
        double R2 = circunferencia.nextDouble();
        double distancia = Math.sqrt((Math.pow(X2 - X1, 2)) + (Math.pow(Y2 - Y1, 2)));

        if(distancia > (R1 + R2)) {
            System.out.printf("Circunferencia exterior%n");
        } else if (distancia == (R1 + R2)) {
            System.out.printf("Tangentes exteriores");
        } else if((distancia < (R1 + R2)) && (distancia > (Math.abs(R1 - R2)))) {
            System.out.printf("Secantes%n");
        } else if((distancia > 0) && (distancia < (Math.abs(R1 - R2)))) {
            System.out.printf("Interiores%n");
        } else if(distancia == (R1 - R2)) {
            System.out.printf("Tangentes interiores%n");
        } else if(distancia == 0) {
            System.out.printf("Concéntricas%n");
        } else {
            System.out.printf("ERROR%n");
        }

        // Realiza un programa que clasifique un triángulo tras recibir el tamaño de sus lados. Se debe clasificar como triángulo rectángulo, isósceles, equilátero o escaleno.

        Scanner triangulo = new Scanner(System.in);
        System.out.print("Introduzca el primer lado del triángulo: ");
        double L1 = triangulo.nextDouble();
        System.out.print("Introduzca el segundo lado del triángulo: ");
        double L2 = triangulo.nextDouble();
        System.out.printf("Introduzca el tercer lado del triángulo: ");
        double L3 = triangulo.nextDouble();
        String tipoTriangulo = "";

        if(Math.pow(L1, 2) == Math.pow(L2, 2) + Math.pow(L3, 2)) {
            tipoTriangulo = "rectángulo";
        } else if(L1 == L2 && L1 != L3 || L2 == L3 && L2 != L1 || L3 == L2 && L3 != L1){
            tipoTriangulo = "isósceles";
        } else if(L1 == L2 && L1 == L3 || L2 == L1 && L2 == L3 || L3 == L1 && L3 == L2) {
            tipoTriangulo = "equilátero";
        } else if (L1 != L2 && L1 != L3 || L2 != L1 && L2 != L3 || L3 != L1 && L3 != L2) {
            tipoTriangulo = "escaleno";
        } else {
            System.out.printf("Error%n");
        }
       
        System.out.printf("Triángulo %s%n", tipoTriangulo);

        // Escribe un programa que reciba un año y nos diga si es bisiesto o no.

        Scanner bisiesto = new Scanner(System.in);
        System.out.print("Escribe un año: ");
        int año = bisiesto.nextInt();

        if(año % 400 == 0) {
            System.out.println("Año bisiesto");
        } else if(año % 100 == 0) {
            System.out.println("Año no bisiesto");
        } else if(año % 4 == 0) {
            System.out.println("Año bisiesto");
        } else {
            System.out.println("Año no bisiesto");
        }

        // La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se requiere determinar cuanto recibirá un productor por la uva que entrega en un embarque considerando lo siguiente:

        // * Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de tamaño 2.

        // * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.

        Scanner kiloUva = new Scanner(System.in);

        System.out.print("Introduce el precio del kilo de uva: ");
        double precioKilo = kiloUva.nextDouble();
        System.out.print("Introduce los kilos de uva: ");
        double kilosUvas = kiloUva.nextDouble();
        System.out.print("Introduce el tipo de uva (A o B): ");
        String tipo = kiloUva.next();
        System.out.print("Introduce el tamaño de uva (1 o 2): ");
        int tamaño = kiloUva.nextInt();
        String uva = tipo + tamaño;

        if(uva.equalsIgnoreCase("A1")) {
            System.out.printf("El productor recibirá %.2f euros.%n", ((kilosUvas * precioKilo) + (precioKilo * 0.2)));
        } else if(uva.equalsIgnoreCase("A2")) {
            System.out.printf("El productor recibira %.2f euros.%n", ((kilosUvas * precioKilo) + (precioKilo * 0.3)));
        } else if(uva.equalsIgnoreCase("B1")) {
            System.out.printf("El productor recibirá %.2f euros.%n", ((kilosUvas * precioKilo) - (precioKilo * 0.3)));
        } else if(uva.equalsIgnoreCase("B2")) {
            System.out.printf("El productor recibirá %.2f euros.%n", ((kilosUvas * precioKilo) - (precioKilo * 0.5)));
        } else {
            System.out.printf("ERROR%n");
        }

        // El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente:
        // * Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
        // * De 50 a 99 alumnos, el costo es de 70 euros.
        // * De 30 a 49 alumnos, el costo es de 95 euros.
        // * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.

        // Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.

        Scanner alumnos = new Scanner(System.in);
        System.out.print("Introduce el número de alumnos: ");
        double numero = alumnos.nextDouble();

        if(numero >= 100) {
            System.out.printf("Se debe pagar %.2f euros a la compañía y cada alumno debe pagar 65 euros%n", (numero * 65));
        } else if(numero >= 50 && numero <= 99) {
            System.out.printf("Se debe pagar %.2f euros a la compañía y cada alumno debe pagar 70 euros%n", (numero * 70));
        } else if(numero >= 30 && numero <= 49) {
            System.out.printf("Se debe pagar %.2f euros a la compañía y cada alumno debe pagar 95 euros%n", (numero * 95));
        } else if(numero < 30) {
            System.out.printf("Se debe pagar 4000 euros a la compañía y cada alumno debe pagar %.2f euros%n", (4000 / numero));
        }

        /* La política de cobro de una compañía telefónica es:
           Cuando se realiza una llamada, el cobro es por el tiempo que esta dura:
           - Los primeros cinco minutos cuestan 1 euro
           - Los siguientes tres, 80 céntimos
           - los siguientes dos minutos a 70 céntimos
           - A partir del décimo minuto, 50 céntimos.
            Además, se carga:
            - Un impuesto de 3% cuando es domingo
            - Y si es otro día, en turno de mañana 15% y en turno de tarde 10%.
            Realiza un algoritmo para determinar cuánto debe pagar por cada concepto una persona que realiza una llamada. */

            Scanner llamada = new Scanner(System.in);
            System.out.print("Introduce la duración de la llamada: ");
            int duracion = llamada.nextInt();
            System.out.print("Introduce el día de la llamada: ");
            int dia = llamada.nextInt();
            System.out.print("Introduce el turno en el que ha realizado la llamada (manyana - tarde): ");
            String turno = llamada.next();
            double cobroDuracion = 0;
            double cobroTotal = 0;
            double impuesto = 0;
        
            if(duracion <= 5) {
                if(dia == 7) {
                    cobroDuracion = 0.2 * duracion;
                    impuesto = duracion * 0.03;
                    cobroTotal = cobroDuracion + impuesto;
                } else if((dia == 1) || (dia == 2) || (dia == 3) || (dia == 4) || (dia == 5) || (dia == 6)) {
                    if(turno.equalsIgnoreCase("Manyana")) {
                        cobroDuracion = 0.2 * duracion;
                        impuesto = duracion * 0.15;
                        cobroTotal = cobroDuracion + impuesto;
                    } else if(turno.equalsIgnoreCase("Tarde")) {
                        cobroDuracion = 0.2 * duracion;
                        impuesto = duracion * 0.1;
                        cobroTotal = cobroDuracion + impuesto;
                    } else {
                        System.out.println("ERROR");
                    }
                } else {
                    System.out.println("ERROR");
                }
            } else if(duracion >= 6 && duracion <= 8) {
                if(dia == 7) {
                    cobroDuracion = (1 + ((duracion - 5) * 0.267));
                    impuesto = duracion * 0.03;
                    cobroTotal = cobroDuracion + impuesto;
                } else if((dia == 1) || (dia == 2) || (dia == 3) || (dia == 4) || (dia == 5) || (dia == 6)) {
                    if(turno.equalsIgnoreCase("Manyana")) {
                        cobroDuracion = (1 + ((duracion - 5) * 0.267));
                        impuesto = duracion * 0.15;
                        cobroTotal = cobroDuracion + impuesto;
                    } else if(turno.equalsIgnoreCase("Tarde")) {
                        cobroDuracion = (1 + ((duracion - 5) * 0.267));
                        impuesto = duracion * 0.1;
                        cobroTotal = cobroDuracion + impuesto;
                    } else {
                        System.out.println("ERROR");
                    }  
                } else {
                    System.out.println("ERROR");
                }
            } else if(duracion > 8 && duracion <= 10) {
                if(dia == 7) {
                    cobroDuracion = (1.8 + ((duracion - 8) * 0.35));
                    impuesto = duracion * 0.03;
                    cobroTotal = cobroDuracion + impuesto;
                } else if((dia == 1) || (dia == 2) || (dia == 3) || (dia == 4) || (dia == 5) || (dia == 6)) {
                    if(turno.equalsIgnoreCase("Manyana")) {
                        cobroDuracion = (1.8 + ((duracion - 8) * 0.35));
                        impuesto = duracion * 0.15;
                        cobroTotal = cobroDuracion + impuesto;
                    } else if(turno.equalsIgnoreCase("Tarde")) {
                        cobroDuracion = (1.8 + ((duracion - 8) * 0.35));
                        impuesto = duracion * 0.1;
                        cobroTotal = cobroDuracion + impuesto;
                    } else {
                        System.out.println("ERROR");
                    }
                } else {
                    System.out.println("ERROR");
                }
            } else if(duracion > 10) {
                if(dia == 7) {
                    cobroDuracion = (2.5 + ((duracion - 10) * 0.5));
                    impuesto = duracion * 0.03;
                    cobroTotal = cobroDuracion + impuesto;
                } else if((dia == 1) || (dia == 2) || (dia == 3) || (dia == 4) || (dia == 5) || (dia == 6)) {
                    if(turno.equalsIgnoreCase("Manyana")) {
                        cobroDuracion = (2.5 + ((duracion - 10) * 0.5));
                        impuesto = duracion * 0.15;
                        cobroTotal = cobroDuracion + impuesto;
                    } else if(turno.equalsIgnoreCase("Tarde")) {
                        cobroDuracion = (2.5 + ((duracion - 10) * 0.5));
                        impuesto = duracion * 0.1;
                        cobroTotal = cobroDuracion + impuesto;
                    } else {
                        System.out.println("ERROR");
                    }
                } else {
                    System.out.println("ERROR");
                }
            } else {
                System.out.println("ERROR");
            }
            System.out.printf("Cobro por duracion:    %.2f euros%n", cobroDuracion);
            System.out.printf("Cobro por impuestos:   %.2f euros%n", impuesto);
            System.out.printf("Cobro total:           %.2f euros%n", cobroTotal);
        
        /* Ejercicio 13: Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
        Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
    
        Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: “ERROR: número incorrecto”. */

        Scanner dado = new Scanner(System.in);
        System.out.print("Introduce el resultado del dado: ");
        int resultado = dado.nextInt();

        if(resultado <= 6) {
            if(resultado == 1) {
                System.out.println("Resultado: seis");
            } else if(resultado == 2) {
                System.out.println("Resultado: cinco");
            } else if(resultado == 3) {
                System.out.println("Resultado: cuatro");
            } else if(resultado == 4) {
                System.out.println("Resultado: tres");
            } else if(resultado == 5) {
                System.out.println("Resultado: dos");
            } else if (resultado == 6) {
                System.out.println("Resultado: uno");
            } else {
                System.out.println("ERROR: número incorrecto");
            }
        } else if (resultado < 1 || resultado > 6) {
            System.out.println("ERROR: número incorrecto");
        }

        /* Ejercicio 14: Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si introducimos otro número nos da un error. */

        Scanner semana = new Scanner(System.in);
        System.out.print("Introduce el día de la semana: ");
        int diaSemana = semana.nextInt();

        if(diaSemana == 1) {
            System.out.println("Es lunes");
        } else if(diaSemana == 2) {
            System.out.println("Es martes");
        } else if(diaSemana == 3) {
            System.out.println("Es miércoles");
        } else if(diaSemana == 4) {
            System.out.println("Es jueves");
        } else if(diaSemana == 5) {
            System.out.println("Es viernes");
        } else if(diaSemana == 6) {
            System.out.println("Es sábado");
        } else if(diaSemana == 7) {
            System.out.println("Es domingo");
        } else {
            System.out.println("ERROR: número incorrecto");
        }

        /* Ejercicio 15: Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el mes correspondiente. */

        Scanner mes = new Scanner(System.in);
        System.out.print("Introduce el número del mes: ");
        int nMes = mes.nextInt();

        if(nMes == 1) {
            System.out.println("ENERO: 31 días");
        } else if(nMes == 2) {
            System.out.println("FEBRERO: 28 / 29 días");
        } else if(nMes == 3) {
            System.out.println("MARZO: 31 días");
        } else if(nMes == 4) {
            System.out.println("ABRIL: 30 días");
        } else if(nMes == 5) {
            System.out.println("MAYO: 31 días");
        } else if(nMes == 6) {
            System.out.println("JUNIO: 30 días");
        } else if(nMes == 7) {
            System.out.println("JULIO: 31 días");
        } else if(nMes == 8) {
            System.out.println("AGOSTO: 31 días");
        } else if(nMes == 9) {
            System.out.println("SEPTIEMBRE: 30 días");
        } else if(nMes == 10) {
            System.out.println("OCTUBRE: 31 días");
        } else if(nMes == 11) {
            System.out.println("NOVIEMBRE: 30 días");
        } else if(nMes == 12) {
            System.out.println("DICIEMBRE: 31 días");
        } else {
            System.out.println("ERROR: introduce un número válido");
        }

        /* Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:

        ZONA UBICACIÓN
        COSTO/KILOGRAMO
        1 América del Norte
        24,00 euros
        2 América Central
        20, 00 euros
        3 América del Sur
        21,00 euros
        4 Europa
        10,00 euros
        5 Asia
        18,00 euros

        Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por cuestiones de logística y seguridad.
        determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega. */

        Scanner paquete = new Scanner(System.in);
        System.out.print("Introduce el peso del paquete en kilos: ");
        double pesoPaquete = paquete.nextDouble();
        System.out.print("Introduce la zona de envío: ");
        String zonaPaquete = paquete.next();
        double costeEnvio = 0;
        int costeKilo = 0;

        if(zonaPaquete.equalsIgnoreCase("AmericaDelNorte")) {
            costeKilo = 24;
            costeEnvio = costeKilo * pesoPaquete;
        } else if(zonaPaquete.equalsIgnoreCase("AmericaCentral")) {
            costeKilo = 20;
            costeEnvio = costeKilo * pesoPaquete;
        } else if(zonaPaquete.equalsIgnoreCase("AmericaDelSur")) {
            costeKilo = 21;
            costeEnvio = costeKilo * pesoPaquete;
        } else if(zonaPaquete.equalsIgnoreCase("Europa")) {
            costeKilo = 10;
            costeEnvio = costeKilo * pesoPaquete;
        } else if(zonaPaquete.equalsIgnoreCase("Asia")) {
            costeKilo = 18;
            costeEnvio = costeKilo * pesoPaquete;
        } else {
            System.out.println("Introduce una localización válida");
        }
        System.out.printf("Coste por kilo: %d euros%n", costeKilo);
        System.out.printf("Coste total:    %.2f euros%n", costeEnvio);
    }
}