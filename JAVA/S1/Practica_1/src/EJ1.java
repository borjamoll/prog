/* Daniel Alfredo Apesteguia Timoner */
import java.util.*;
public class EJ1 {
    public static void main(String[] args) {
        final int repeticiones = 5; // Veces que se repetirá el programa
        String[] numeros = new String[repeticiones];
        Scanner sc = new Scanner(System.in); 
        
        for ( int i = 0; i < repeticiones; i ++) { // Leer 5 números
            System.out.print("Número: ");
            numeros[i] = sc.nextLine();
        }
        for ( int i = 0; i < repeticiones; i ++) { // Imprimir en mismo orden
            System.out.println(numeros[i]);
            
            
        }
        sc.close();
    }
}
