/* Daniel Alfredo Apesteguia Timoner */
import java.util.*;

public class EJ5 {

    public static void main(String[] args) {
        List<Integer> serieA = new ArrayList<>();
        List<Integer> serieB = new ArrayList<>();
        List<Integer> serieC = new ArrayList<>();

        crearLista(serieA);
        crearLista(serieB);
        crearListaCombinada(serieA,serieB,serieC);
        System.out.println("Lista combinada: " + serieC.toString());
    }

    public static void crearLista(List<Integer> numeros) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) { // Leer 10 números enteros
            System.out.print("Número: ");
            int numero = Integer.parseInt(sc.nextLine());
            numeros.add(numero);
        }
    }

    public static void crearListaCombinada(List<Integer> lista_1, List<Integer> lista_2, List<Integer> lista_3) {
        for (int i = 0; i < 10; i++) { 
            lista_3.add(lista_1.get(i));
            lista_3.add(lista_2.get(i));
                    
        }
    }
}
