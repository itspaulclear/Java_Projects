import java.util.*;
import java.util.Arrays;

public class metodosArrays {
    public static void main(String[] args) throws Exception {
        // Ordenar elementos de un array 
        // Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios primos entre los números deseados, por último nos indica cual es el mayor de todos. Haz un método para comprobar que el número aleatorio es primo, puedes hacer todos lo métodos que necesites.

        Scanner primos = new Scanner(System.in);
        System.out.print("Introduce el tamaño del array de primos: ");
        int size = primos.nextInt();
        double[] arrayPrimos = new double[size];

        for(int i = 0; i < arrayPrimos.length; i++) {
            double random = Math.floor(Math.random() * 10);
            if(random % random == 0 && random % 1 == 0) {
                arrayPrimos[i] = random;
            } else {
                i--;
            }
        }
        for(int i = 0; i < arrayPrimos.length - 1; i++) {
            for(int j = i + 1; j < arrayPrimos.length; j++) {
                if(arrayPrimos[j] < arrayPrimos[i]) {
                    double aux = arrayPrimos[j];
                    arrayPrimos[j] = arrayPrimos[i];
                    aux = arrayPrimos[i];
                }
            }
        }

        for(double arrayPrimo : arrayPrimos) {
            System.out.printf("%.0f ", arrayPrimo);
        }

        System.out.println();
        Arrays.sort(arrayPrimos);

        for(double arrayPrimo : arrayPrimos) {
            System.out.printf("%.0f ", arrayPrimo);
        }

        // Filtrar elementos de un array

        System.out.println();
        Scanner peticion = new Scanner(System.in);

        int[] miNumero = {56, 123, 18, 87, 162, 42, 199, 75, 5, 111};
        System.out.print("Introduce el número a partir del cual quieres filtrar: ");
        ArrayList<Integer> miNumeroMod = new ArrayList<>();
        int maximo = peticion.nextInt();

        for(int numero : miNumero) {
            if(numero > maximo) {
                miNumeroMod.add(numero);
            }
        }

        Collections.sort(miNumeroMod);
        System.out.println("Numeros filtrado a partir de " + maximo + ": " + miNumeroMod);

        // Buscar un elemento en un array

        int[] numero20 = {3, 67, 90, 12, 54, 32, 89, 43};

        Scanner buscar = new Scanner(System.in);
        System.out.print("Introduce el número que desea buscar: ");
        int peticion2 = buscar.nextInt();
        boolean check = false;

        for(int numero : numero20) {
            if(numero == peticion2) {
                check = true;
                break;
            }
        }

        if(check == true) {
            System.out.println("El valor " + peticion2 + " ha sido encontrado en el array");
        } else {
            System.out.println("El valor " + peticion2 + " no ha sido encontrado en el array");
        }

        // Modificación del array

        int[] numero21 = {67, 143, 55, 89, 176, 32, 110, 4, 198, 70};
        int[] numero21Mod = new int[10];

        for(int i = 0; i < numero21.length; i++) {
            numero21[i] *= 2;
        }

        Arrays.sort(numero21);

        System.out.println("El array modificado es el siguiente: " + Arrays.toString(numero21));

        // Eliminación de elementos del array

        Scanner eliminacion = new Scanner(System.in);
        int numero22[] = {127, 53, 215, 89, 162, 42, 276, 198, 71, 234};
        System.out.println(Arrays.toString(numero22));
        System.out.print("Introduce el valor que desea eliminar del array: ");
        int numeroEliminar = eliminacion.nextInt();
        ArrayList<Integer> numero22Mod = new ArrayList<>();

        for(int numero : numero22) {
            if(numero != numeroEliminar) {
                numero22Mod.add(numero);
            }
        }

        int[] numerosActualizados = new int[numero22Mod.size()];

        for(int i = 0; i < numerosActualizados.length; i++) {
            numerosActualizados[i] = numero22Mod.get(i);
        }

        System.out.println("Array original con el valor " + numeroEliminar + ": " + Arrays.toString(numero22));
        System.out.println("Array modificado sin el valor " + numeroEliminar + ": " + Arrays.toString(numerosActualizados));

        // Método toString()

        int[] numeritos = {127, 53, 215, 89, 162, 42, 276, 198, 71, 234};

        System.out.println("array: " + Arrays.toString(numeritos));

        // Método sort()

        Arrays.sort(numeritos);
        System.out.println("array: " + Arrays.toString(numeritos));

        // Método equals()

        int[] numbers = {127, 53, 215, 89, 162, 42, 276, 198, 71, 234};
        int[] numbers2 = {127, 53, 215, 89, 162, 42, 276, 198, 71, 234};
        boolean isEqual = Arrays.equals(numbers, numbers2);

        System.out.println("¿Son iguales? " + isEqual);

        // Método fill()

        int[] numbers3 = new int[5];
        Arrays.fill(numbers3, 45);
        System.out.println("Array lleno de 45: " + Arrays.toString(numbers3));

        // Método copyOf()

        int[] originalArray =  {127, 53, 215, 89, 162, 42, 276, 198, 71, 234};
        int[] copyArray = Arrays.copyOf(originalArray, originalArray.length);

        System.out.println(Arrays.toString(copyArray));

        // Método binarySearch()

        int numbers12[] = {2, 34, 78, 12, 32, 56, 89};
        int target = 12;
        int index = Arrays.binarySearch(numbers12, target);

        if(index >= 0) {
            System.out.println("Elemento " + target + " encontrado en el índice: " + index);
        } else {
            System.out.println("Elemento " + target + " no encontrado");
        }

        // Métodos deepEquals() y deepToString() para matrices
    }
}
