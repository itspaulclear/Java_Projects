import java.util.*;

public class index {
    public static void main(String[] args) throws Exception {
        int[] misNumeros = new int[8]; //No se conocen los datos que van a ser proporcionados
        misNumeros[0] = 10;
        misNumeros[1] = 20;
        misNumeros[2] = 30;
        misNumeros[3] = 40;
        misNumeros[4] = 50;
        misNumeros[5] = 60;
        misNumeros[6] = 70;
        misNumeros[7] = 80;

        System.out.println("El primer elemento es: " + misNumeros[0]);
        
        int longitud = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuántas celdas quieres? ");
        longitud = entrada.nextInt();
        int numero3[] = new int[longitud];

        int[] numeros = {1, 2, 3, 4, 5};
        int primerElemento = numeros[0];
        int segundoElemento = numeros[1];

        System.out.println("1º posicion: " + primerElemento);
        System.out.println("2º posicion: " + segundoElemento);

        //Imprimir todo el contenido del array

        for(int i = 0; i < numeros.length; i++) {  //se hace con for porque se sabe el número de iteraciones que tiene que dar el bucle
            System.out.println("Posición " + i + ": " + numeros[i]);
        }  

        //Sumar todos el contenido del array

        int suma = 0;
        for(int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println("La suma total de todos los elementos es de " + suma);
    }
}