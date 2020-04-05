//Practica 7. Daniel Alfredo Apesteguia Timoner.
//Tengo que repetirlo, no me leí el enunciado entero
package practica;

import java.io.*;
import java.util.*;

public class proyectoreal {
    //PROGRAMA CON BYTES Y WRITE
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
                    if (byte_entrada == 123) { //123 BITS representan el carácter {
                        recorrer = 0;
                    } else if (byte_entrada == 35 || recorrer == 0) { //35 BITS representan el carácter #
                        if (recorrer == 1) {
                            archivo_creado.write(informacion_pelicula[0].getBytes("UTF-8"));
                            archivo_creado.write(13);
                            archivo_creado.write(13);
                            archivo_creado.write(informacion_pelicula[recorrer].getBytes("UTF-8"));
                        } else {
                            archivo_creado.write(13);
                            archivo_creado.write(13);
                            archivo_creado.write(informacion_pelicula[recorrer].getBytes("UTF-8"));
                            if (byte_entrada != 35) {
                                archivo_creado.write(byte_entrada);
                            }

                        }
                        recorrer++;

                    } else {
                        archivo_creado.write(byte_entrada);
                    }
                } else {
                    final_archivo = true;
                }
            }
        } catch (IOException ex) {
            System.out.print("Error en la lectura del archivo: " + ex);
        }

    }
    //PROGRAMA CON CHAR Y PRINTWRITER
    public static void caracter_a_caracter() {
        String[] informacion_pelicula = {"-----", "Año: ", "Director: ", "Duración: ", "Sinopsis: ", "Reparto: ", "Sesión: "};
        int recorrer = 0;
        try {
            FileInputStream archivo_lectura = new FileInputStream("C:/Users/alumn/Desktop/X/Programacion/JAVA/S1/Practica_7/src/practica/rafa.txt");
            FileWriter escritura = new FileWriter("C:/Users/alumn/Desktop/X/Programacion/JAVA/S1/Practica_7/src/practica/rafaBeta.txt");
            PrintWriter printwriter = new PrintWriter(escritura);
            
            printwriter.println("--------------------------------------");
            printwriter.println(" ");
            printwriter.println("Cartelera de CineFBMoll");
            printwriter.println(" ");
            printwriter.println("--------------------------------------");
            int c = 0;
            while (c != -1) {
                char letra = (char) c; //Convierte el valor en bits en su carácter
                if (letra == 123) { //El carácter 123 es el carácter {
                    recorrer = 0;
                } else if (c == 35 || recorrer == 0) { //El carácter 35 es el carácter #
                    if (recorrer == 1) { //Para imprimir las letras de la película
                        printwriter.print("-------");
                        printwriter.println(" ");
                        printwriter.println(" ");
                        printwriter.print(informacion_pelicula[recorrer]);
                    } else { //Para poner si es el título, año, director, género...)
                        printwriter.println(" ");
                        printwriter.println(" ");
                        printwriter.print(informacion_pelicula[recorrer]);
                        if (letra != 35) { //Esta condición es para imprimir la primera letra de la película.
                            printwriter.print(letra);
                        }
                    }
                    recorrer++;
                } else {
                    escritura.write(letra);
                }

                c = archivo_lectura.read();
            }
            escritura.close();
        } catch (IOException ex) {
            System.out.println("Error en el FileStream:"+ex);
        }
    
    }

    //PROGRAMA CON BUFFER Y LINEA A LINEA
    public static void linea_a_linea() {

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
