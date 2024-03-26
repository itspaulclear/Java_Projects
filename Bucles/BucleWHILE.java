import java.util.*;

public class BucleWHILE {
    public static void main(String[] args) throws Exception {
        //Bucle WHILE es útil cuando no sabemos cuantas veces necesitamos que se ejecute el bucle, pero sabemos la condición para que se siga ejecutando

        //While(condicion){
        //}
       
        int x = 0;
        while(x <= 5) {
            System.out.println("x es menor que 5, ahora x es " + x);
            x++;
        }



        int multiploDe = 17;
        int numInicial = 315;
        int numFinal = 9100000;
        int contador = 0;
        while(numInicial <= numFinal) {
            if(numInicial % multiploDe == 0) {
                contador++;
            }
            numInicial++;
        }
        System.out.printf("Entre 315 y %d hay %d múltiplos de %d%n", numFinal, contador, multiploDe);
    


        int multiploDe2 = 23;
        int numInicial2 = 70;
        int numFinal2 = 3000;
        int contador2 = 0; 
        while (numInicial2 <= numFinal2) {
            if(numInicial2 % multiploDe2 == 0) {
                contador2++;
            }
            numInicial2++;
        }
        System.out.printf("Entre 70 y %d hay %d múltiplos de %d%n", numFinal2, contador2, multiploDe2);



        int multiploDe3 = 13;
        int numInicial3 = 50;
        int numFinal3 = 2500;
        int contador3 = 1;
        while(numInicial3 <= numFinal3) {
            if(numInicial3 % multiploDe3 == 0) {
                contador3++;
            }
            numInicial3++;
        }
        System.out.printf("Entre 50 y %d hay %d múltiplos de %d%n", numFinal3, contador3, multiploDe3);



        int i = 1;
        for(int L = i; L <= 5; L++) {
            System.out.printf("%d ", L);
        }
        System.out.println(" ");
    


        // Pide a un usuario que introduzca un número entero y positivo. Sumar todos los úmeros enteros desde 1 hasta N que es el número que mete el usuario. Imprime el resultado.
    
        Scanner numero = new Scanner(System.in);
        System.out.print("Introduce un número entero y positivo: ");
        int n1 = numero.nextInt();
        int nInicial = 1;
        int suma = 0;
        while(nInicial <= n1) {
            suma += nInicial;
            nInicial++;
        }
        System.out.printf("La suma total de %d es %d%n", n1, suma);
    


        // Queremos ahorrar 10 euros por semana y por cada semana adicional debemos sumarle 10 euros hasta llegar a 60 euros, calcula el número de semanas en llegar a esa cantidad.
        
        Scanner ahorro = new Scanner(System.in);
        System.out.print("¿Cuánto quieres ahorrar? ");
        int objetivoAhorro = ahorro.nextInt();
        System.out.print("¿Cuánto vas a ahorrar por semana? ");
        int dineroSemana = ahorro.nextInt();
        System.out.print("¿De cuánto dinero partes? ");
        int dineroInicial = ahorro.nextInt();
        int dineroIncremental = 0;
        int semanaInicial = 0;
        int contador4 = 0;
    
        while(contador4 < objetivoAhorro) {
            dineroInicial = dineroInicial + dineroIncremental + dineroSemana;
            contador4 = contador4 + dineroIncremental + dineroSemana;
            semanaInicial++;
            dineroIncremental += 10;
        }
        System.out.printf("Vas a tardar %d semanas en alcanzar %d euros%n", semanaInicial, objetivoAhorro);
    


        // Una persona invierte 1000 euros en el bbva, y le dan 2% de interés mensual, cuánto dinero tiene esta persona en un año?
    
        Scanner inversion = new Scanner(System.in);

        System.out.print("Introduce el dinero de inversión: ");
        double dinero = inversion.nextDouble();

        System.out.print("Introduca la tasa de inversion: ");
        double intereses = inversion.nextDouble() / 100;

        System.out.print("Introduce el tiempo de inversión: ");
        int meses = inversion.nextInt();

        int mes = 1;
    
        while(mes <= meses) {
            dinero = dinero + (dinero * intereses); //dinero += dinero * interes;
            mes++;
        }
        System.out.printf("Tendrás %.2f euros en %d meses%n", dinero, meses);
    

        // Inicio de sesion con un nombre de usuario y contraseña. 
        // Contraseña: debe contener 8 caracteres, debe contener al menos 1 mayúscula, debe contener al menos 1 número.
        // Instrucciones: introduzca su nombre, su contraseña, si no cumple las condiciones darle 3 intentos, si cumple mensaje de éxito

        Scanner entrada = new Scanner(System.in);
        System.out.println("==================");
        System.out.println("==== REGISTRO ====");
        System.out.println("==================");
        System.out.print("Introduzca un nombre de usuario: ");
        String usuario = entrada.nextLine();
        System.out.print("Introduzca una contraseña: ");
        String contraseña = entrada.nextLine();

        while(true) {
            if(contraseña.length() < 8) {
                System.out.println("La contraseña debe tener al menos 8 caractéres");
                System.out.print("Introduzca una nueva contraseña: ");
                contraseña = entrada.nextLine();
                continue;
            } else if(!contraseña.matches(".*[A-Z].*")) {
                System.out.println("La contraseña debe tener al menos una mayúscula");
                System.out.print("Introduzca una nueva contraseña: ");
                contraseña = entrada.nextLine();
                continue;
            } else if(!contraseña.matches(".*[0-9].*")) {
                System.out.println("La contraseña debe tener al menos un número");
                System.out.print("Introduzca una nueva contraseña: ");
                contraseña = entrada.nextLine();
                continue;
            } else {
                System.out.println("Contraseña correcta. Proceda al inicio de sesión");
                break;
            }
        }

        boolean accesoConcedido = false;
        int intentos = 3;

        System.out.println(" ");
        System.out.println("==========================");
        System.out.println("==== Inicio de sesión ====");
        System.out.println("==========================");
        System.out.print("Introduzca su nombre de usuario: ");
        String inicioUsuario = entrada.nextLine();
        System.out.print("Introduzca su contraseña: ");
        String inicioContraseña = entrada.nextLine();

        while(intentos >= 0 && !accesoConcedido) {
            if(inicioUsuario.equals(usuario) && inicioContraseña.equals(contraseña)) {
                System.out.println("Has iniciado sesión con éxito");
                accesoConcedido = true;
            } else {
                System.out.println("Usuario o contraseña incorrectos. Le queda " + intentos + " intentos");
                intentos--;
                System.out.print("Introduzca su nombre de usuario: ");
                inicioUsuario = entrada.nextLine();
                System.out.print("Introduzca su contraseña: ");
                inicioContraseña = entrada.nextLine();
            }
        }
    }
}
