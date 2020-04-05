//Practica 7. Daniel Alfredo Apesteguia Timoner.
//Tengo que repetirlo, no me leí el enunciado entero
package practica;

import java.io.*;
import java.util.*;

public class proyectoreal {

    public static void byte_a_byte() {
        String[] informacion_pelicula = {"-----", "Año: ", "Director: ", "Duración: ", "Sinopsis: ", "Reparto: ", "Sesión: "};
        int recorrer = 0;
        try {
            FileInputStream archivo_lectura = new FileInputStream("C:/Users/alumn/Desktop/X/Programacion/JAVA/S1/Practica_7/src/practica/rafa.txt");
            FileOutputStream archivo_creado = new FileOutputStream("C:/Users/alumn/Desktop/X/Programacion/JAVA/S1/Practica_7/src/practica/rafaAlpha.txt");
            boolean final_archivo = false;
            archivo_creado.write("----------------------------".getBytes());
            archivo_creado.write(13);
            archivo_creado.write(13);
            archivo_creado.write("Cartelera de CineFBMoll".getBytes());
            archivo_creado.write(13);
            archivo_creado.write(13);
            archivo_creado.write("----------------------------".getBytes());
            while (!final_archivo) {
                int byte_entrada = archivo_lectura.read();
                if (byte_entrada != -1) {
                    if (byte_entrada == 123) {
                        recorrer = 0;
                    } else if (byte_entrada == 35 || recorrer == 0) {
                        if (recorrer == 1){
                            archivo_creado.write(informacion_pelicula[0].getBytes("UTF-8"));
                            archivo_creado.write(13);
                            archivo_creado.write(13);
                            archivo_creado.write(informacion_pelicula[recorrer].getBytes("UTF-8"));
                        }
                        else {
                            archivo_creado.write(13);
                            archivo_creado.write(13);
                            archivo_creado.write(informacion_pelicula[recorrer].getBytes("UTF-8"));
                            if(byte_entrada != 35){
                                archivo_creado.write(byte_entrada);
                            }
                            
                        }
                        recorrer++;
                        
                    }
                    else{
                        archivo_creado.write(byte_entrada);
                    }
                }
            else{
                    final_archivo = true;
                }
        }
    }
    catch (IOException ex

    
        ) {
            System.out.print("Error en la lectura del archivo: " + ex);

    }

}

public static void caracter_a_caracter(){
    }
    
    public static void linea_a_linea(){
        
    }
    
/*    public String introFicheroEntrada(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el fichero de entrada:");
        fichero_entrada = sc.next();
        return fichero_entrada;
    }
    public String introFicheroSalida(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el fichero de salida:");
        fichero_salida = sc.next();
        return fichero_salida;
    }
    
*/    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------- MENU ---------");
        System.out.println("\t1) 1: Lectura y escritura del fichero de cartelera byte a byte (byte Streams).");
        System.out.println("\t2) 2: Lectura y escritura de fichero de cartelera carácter a carácter (character Streams).");
        System.out.println("\t3) 3: Lectura y escritura de fichero línea a línea con buffers (character Streams).");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                byte_a_byte();  
                break;
            case 2:
                caracter_a_caracter();
                break;
            case 3:
                linea_a_linea();
                break;
            default:
                System.out.println("Ese valor no representa nada, inútil.");
        }
    }
}
