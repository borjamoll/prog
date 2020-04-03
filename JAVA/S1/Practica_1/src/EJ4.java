/* Daniel Alfredo Apesteguia Timoner */
import java.util.*;
public class EJ4 {
    public static void main(String[] args) {
        final int repeticiones = 10; // Veces que se repetirá el programa
        List<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in); 
        
        for ( int i = 0; i < repeticiones; i ++) { // Leer 10 números
            System.out.print("Número: ");
            int numero = Integer.parseInt(sc.nextLine());
            numeros.add(numero);
        }   
        
        for ( int i = 0 ; i < repeticiones / 2; i++)  {
            int segundo = (repeticiones - i)-1;
            System.out.println(numeros.get(i));
            System.out.println(numeros.get(segundo));
        }
        sc.close();
}
}
