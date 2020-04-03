/* Daniel Alfredo Apesteguia Timoner */
import java.util.*;
public class EJ3 {
    public static void main(String[] args) {
        final int repeticiones = 5; // Veces que se repetirá el programa
        List<Integer> nPositivo = new ArrayList<>();
        List<Integer> nNegativo = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int zeros = 0;

        //Leer + Separación de numeros positivos, negativos y zeros. 
        for (int i = 0; i < repeticiones; i++) { // Leer 5 números
            System.out.print("Número: ");
            int numero = Integer.parseInt(sc.nextLine());
            if (numero > 0) {
                nPositivo.add(numero); //Agregar números positivos a una lista
            } else if (numero < 0) {
                nNegativo.add(numero); //Agregar números negativos a una lista
            } else {
                zeros++; //Sumar números negativos

            }
        }

        int sizePositivos = nPositivo.size();
        int mediaPositivos = 0;
        int sizeNegativos = nNegativo.size();
        int mediaNegativos = 0;

        //Cálculo de la media de positivos
        if (sizePositivos > 0) {
            int numerosPositivos = 0;
            for (int i = 0; i < sizePositivos; i++) {
                numerosPositivos += nPositivo.get(i);
            }
            mediaPositivos = numerosPositivos / sizePositivos;
        }
        //Cálculo de la media de negativos
        if (sizeNegativos > 0) {
           int numerosNegativos = 0;
           for (int i = 0; i < sizeNegativos; i++) {
               numerosNegativos += nNegativo.get(i);
           }
           mediaNegativos = numerosNegativos / sizeNegativos;
        }

        System.out.println("Media de números positivos: " + mediaPositivos);
        System.out.println("Media de números negativos: " + mediaNegativos);
        System.out.println("Total de zeros: " + zeros);
    } 
}
