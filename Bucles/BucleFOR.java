import java.util.*;

public class BucleFOR {
    public static void main(String[] args) throws Exception {
        //Bucle FOR es útil cuando sabemos exactamente cuántas veces queremos que se repita el bloque de código

        //for(inicialización; condición; actualización) {
        //}
        
       for (int i = 1; i <= 5; i++){
            System.out.println("resultado: " + i);
       }



       for (int i = 1; i <= 15; i++){
            if(i % 2 == 0) {
                System.out.println(i + " es par");
            } else {
                System.out.println(i + " no es par");
            }
       }



       for (int x = 1; x <= 3; x++) {
            Scanner entrada3 = new Scanner(System.in);
            System.out.print("Introduzca su contraseña: ");
            String password = entrada3.nextLine();
            if(password.equals("password")) {
                System.out.println("Contraseña correcta");
                break;
            } else {
                System.out.println("Contraseña incorrecta");
                continue;
            }
        }



        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }



        int multiploDe = 17;
        int numInicial = 315;
        int numFinal = 9100000;
        int contador = 0;
        for (int i = numInicial; i <= numFinal; i++) {
            if(i % multiploDe == 0) {
                contador++;
            }
        }
        System.out.printf("Entre 315 y %d hay %d multiplos de %d.%n", numFinal, contador, multiploDe);



        int multiploDe2 = 23;
        int numInicial2 = 70;
        int numFinal2 = 3000;
        int contador2 = 0;
        for(int ini2 = numInicial2; ini2 <= numFinal2; ini2++) {
            if(ini2 % multiploDe2 == 0) {
                contador2++;
            }
        }
        System.out.printf("Entre 70 y %d hay %d de múltiplos de %d%n", numFinal2, contador2, multiploDe2);

        

        int multiploDe3 = 13;
        int numInicial3 = 50;
        int numFinal3 = 2500;
        int contador3 = 1;
        for(int ini3 = numInicial3; ini3 <= numFinal3; ini3++) {
            if(ini3 % multiploDe3 == 0) {
                contador3++;
            }
        }
        System.out.printf("Entre 50 y %d hay %d múltiplos de %d%n", numFinal3, contador3, multiploDe3);



        for(int diasRestantes = 10; diasRestantes >= 0; diasRestantes--) {
            if(diasRestantes >= 1) {
                System.out.println("Quedan " + diasRestantes + " días.");
            } else {
                System.out.println("Es tu cumpleaños.");
            }
        }



        Scanner opcion = new Scanner(System.in);
        
        System.out.println("Bienvenido al asistente de iteraciones");
        System.out.println("1. Cuenta hasta un número máximo");
        System.out.println("2. Cuenta desde este número");
        System.out.print("¿Qué operación desea realizar? ");
        int number = opcion.nextInt();
        if(number == 1) {
            System.out.println("Procediendo con la operación...");
            System.out.print("Seleccione un número máximo: ");
            int valorMaximo = opcion.nextInt();

            for (int valorInicial = 1; valorInicial <= valorMaximo; valorInicial++) {
                System.out.println(valorInicial);
            }
        } else if (number == 2) {
            System.out.println("Procediendo con la operación...");
            System.out.print("Seleccione un valor: ");
            
            for(int valorInicial = opcion.nextInt(); valorInicial <= 10; valorInicial++) {
                System.out.println(valorInicial);
            }
        } else {
            System.out.println("Error");
        }



        Scanner entrada = new Scanner (System.in);
        System.out.print("Introduzca el valor inicial: ");
        int inicio = entrada.nextInt();
        System.out.print("Introduzca el valor final: ");
        int f = entrada.nextInt();
        int suma = 0;

        for(int i = inicio;i <= f;i++) {
            suma = suma + i;
        }
        System.out.printf("La suma de todos los dígitos entre %d y %d es %d.%n", inicio, f, suma);




        Scanner valor = new Scanner(System.in);
        System.out.print("Introduzca la tabla de multiplicar: ");
        int numero2 = valor.nextInt();
        System.out.println("________________________" + "TABLA DE MULTIPLICAR DEL " + numero2 + "__________________");
        for(int b = 0;b <= 10; b++) {
            System.out.printf("%d x %d = %d%n", numero2, b, (numero2 * b));
        }
    }
}
