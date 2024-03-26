import java.util.*;

public class BucleDOWHILE {
    public static void main(String[] args) throws Exception {
        //Bucle DO-WHILE es similar a WHILE pero el código dentro del bucle se ejecuta al menos una vez, ya que la condición se evalúa al ejecutar el código

        //do{
        //(código a ejecutar)
        //}while(condición);

        int y = 0;
        do {
            System.out.println("y es " + y);
            y++; 
        } while(y <= 5);
            


        int multiploDe = 17;
        int numInicial = 315;
        int numFinal = 9100000;
        int contador = 0;
        do {
            if (numInicial % multiploDe == 0) {
                contador++;
            }
            numInicial++;
        } while(numInicial <= numFinal);
        System.out.printf("Entre 315 y %d hay %d múltiplos de %d%n", numFinal, contador, multiploDe);



        int multiploDe2 = 23;
        int valorInicial2 = 70;
        int valorFinal2 = 3000;
        int contador2 = 0;
        do {
            if(valorInicial2 % multiploDe2 == 0) {
                contador2++;
            }
            valorInicial2++;
        } while(valorInicial2 <= valorFinal2);
        System.out.printf("Entre 70 y %d hay %d múltiplos de %d%n", valorFinal2, contador2, multiploDe2);



        int multiploDe3 = 13;
        int numInicial3 = 50;
        int numFinal3 = 2500;
        int contador3 = 1;
        do {
            if(numInicial3 % multiploDe3 == 0) {
                contador3++;
            }
            numInicial3++;
        } while(numInicial3 <= numFinal3);
        System.out.printf("Entre 50 y %d hay %d múltiplos de %d%n", numFinal3, contador3, multiploDe3);
    }
}