//Practica 7. Daniel Alfredo Apesteguia Timoner
//FileWriter escritura = new FileWriter("C:/Users/alumn/Desktop/texto_nuevo.txt", true);
package practica;

import java.io.*;

public class proyecto {

    public static void main(String[] args) {
        String[] informacion_pelicula = {"-----", "Año: ", "Director: ", "Duración: ", "Sinopsis: ", "Reparto: ", "Sesión: "};
        int recorrer = 0;
        try {
            //Leer el archivo
            System.out.println("--------------------------------------");
            System.out.println(" ");
            System.out.println("Cartelera de CineFBMoll");
            System.out.println(" ");
            System.out.println("--------------------------------------");
            FileInputStream archivo_lectura = new FileInputStream("C:/Users/alumn/Desktop/X/Programacion/JAVA/S1/Practica_7/src/practica/rafa.txt");
            int c = 0;
            while (c != -1) {
                char letra = (char) c; //Convierte el valor en bits en su carácter
                if (c == 123) { //El carácter 123 es el carácter {
                    recorrer = 0;
                } else if (c == 35 || recorrer == 0) { //El carácter 35 es el carácter #
                    if (recorrer == 1) { //Para imprimir las letras de la película
                        System.out.print("-----");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.print(informacion_pelicula[recorrer]);
                    } else { //Para poner si es el título, año, director, género...)
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.print(informacion_pelicula[recorrer]);
                        if (c != 35) { //Esta condición es para imprimir la primera letra de la película.
                            System.out.print(letra);
                        }
                    }
                    recorrer++;
                } else {
                    System.out.print(letra);
                }

                c = archivo_lectura.read();
            }
        } catch (IOException e) {
            System.out.println("Error en el FileStream.");
        }
    }

}
//C:\Users\alumn\Desktop\X\Programacion\JAVA\S1\Practica_7\src\practica\rafa_final.txt
