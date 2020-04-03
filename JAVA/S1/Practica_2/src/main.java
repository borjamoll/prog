/* Daniel Alfredo Apesteguia Timoner */
import java.util.*;

public class main {

    public static void testMatriz() {
        //Matriz manual
        int matriz[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i++) { //Número de filas
            for (int j = 0; j < 3; j++) { //Número de columnas
                System.out.print(matriz[i][j]);

            }
            System.out.println("");
        }
        //Matriz usuario
        int matriz2[][], nFilas, nColumnas;
        Scanner sc = new Scanner(System.in);

        //Especificación de filas y columnas
        System.out.print("Número de filas: ");
        nFilas = Integer.parseInt(sc.nextLine());
        System.out.print("Número de columnas: ");
        nColumnas = Integer.parseInt(sc.nextLine());
        matriz2 = new int[nFilas][nColumnas];

        for (int i = 0; i < nFilas; i++) { //Número de filas
            for (int j = 0; j < nColumnas; j++) { //Número de columnas
                System.out.print("Matriz [" + i + "][" + j + "]: ");
                matriz2[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < nFilas; i++) { //Número de filas
            for (int j = 0; j < nColumnas; j++) { //Número de columnas
                System.out.print(matriz2[i][j]);

            }
            System.out.println("");
        }
    }
//    Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente 
//    forma: la posición T[n,m] debe contener n+m. Después se debe mostrar su contenido.  

    public static void tabla5x5() {
        int matriz[][] = new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i + j;
            }
        }
        for (int i = 0; i < 5; i++) { //Número de filas
            for (int j = 0; j < 5; j++) { //Número de columnas
                System.out.print(matriz[i][j]);

            }
            System.out.println("");
        }
    }

//    Crear y cargar una tabla de tamaño 4x4 y decir si es simétrica o no, es decir, 
//    si se obtiene la misma tabla al cambiar filas por columnas.
    public static void tabla4x4() {
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        int matrizSim[][] = new int[4][4];
        boolean simetrico = true;
        for (int i = 0; i < 4; i++) { //Número de filas
            for (int j = 0; j < 4; j++) { //Número de columnas
                System.out.print("Matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                matrizSim[j][i] = matriz[i][j];
            }
        }
//        for (int i = 0; i < 4; i++) { //Generador de matriz inversa
//            for (int j = 0; j < 4; j++) { //Número de columnas
//                matrizSim[j][i] = matriz[i][j];
//            }
//        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] != matrizSim[i][j]) {
                    simetrico = false;
                }
            }
        }
        if (simetrico) {
            System.out.println("Es simétrico");
        } else {
            System.out.println("No es simétrico.");
        }
    }

//    Crear y cargar dos matrices de tamaño 3x3 , sumarlas y mostrar su suma
    public static void matrices3x3() {
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int matriz2[][] = new int[3][3];
        int matrizFinal[][] = new int[3][3];
        //Matriz número 1
        for (int i = 0; i < 3; i++) { //Número de filas
            for (int j = 0; j < 3; j++) { //Número de columnas
                System.out.print("Matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();

            }
        }
        //Matriz número 2
        for (int i = 0; i < 3; i++) { //Número de filas
            for (int j = 0; j < 3; j++) { //Número de columnas
                System.out.print("Matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        //Sumar matrices
        for (int i = 0; i < 3; i++) { //Número de filas
            for (int j = 0; j < 3; j++) { //Número de columnas
                matrizFinal[i][j] = matriz[i][j] + matriz2[i][j];
            }
        }

    }

//    Crear una tabla de tamaño 7x7 y rellenarla de forma que los elementos de 
//    la diagonal principal sean 1 y el resto 0.
    public static void tabla7x7() {
        int matriz[][] = new int[7][7];
        for (int i = 0; i < matriz.length; i++) { //Número de filas
            for (int j = 0; j < matriz.length; j++) { //Número de columnas
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;

                }
            }
        }
        for (int i = 0; i < matriz.length; i++) { //Número de filas
            for (int j = 0; j < matriz.length; j++) { //Número de columnas
                System.out.print(matriz[i][j]);

            }
            System.out.println("");
        }

    }
//   Crear una matriz “marco” de tamaño 8x6: todos sus elementos deben ser 0 
//   salvo los de los bordes que deben ser 1. Mostrar la matriz.

    public static void matrizMarco8x6() {
        int matriz[][] = new int[8][6];
        for (int i = 0; i < matriz.length; i++) { //Número de filas
            for (int j = 0; j < matriz[i].length; j++) { //Número de columnas
                if (j == 5) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;

                }
            }
        }
        for (int i = 0; i < matriz.length; i++) { //Número de filas
            for (int j = 0; j < matriz[i].length; j++) { //Número de columnas
                System.out.print(matriz[i][j]);

            }
            System.out.println("");
        }

    }

//    Crear una matriz “marco” cuyo tamaño se pedirá al usuario por teclado. 
//    Todos sus elementos deben ser 0 salvo los de los bordes que deben ser 1. Mostrar la matriz. 

    public static void matrizMarcoCustom() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número filas: ");
        int filas = sc.nextInt();
        System.out.print("Número de columnas: ");
        int columnas = sc.nextInt();
        int matriz[][] = new int [filas][columnas];
        for (int i = 0; i < matriz.length; i++) { //Número de filas
            for (int j = 0; j < matriz[i].length; j++) { //Número de columnas
                if (j == matriz[i].length-1) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;

                }
            }
        }
        for (int i = 0; i < matriz.length; i++) { //Número de filas
            for (int j = 0; j < matriz[i].length; j++) { //Número de columnas
                System.out.print(matriz[i][j]);

            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------- MENU ---------");
        System.out.println("\t1) EJ 1: Crear tabla 5x5");
        System.out.println("\t2) EJ 2: Crear tabla 4x4 + Simetria");
        System.out.println("\t3) EJ 3: Crear dos tablas 3x3");
        System.out.println("\t4) EJ 4: Crear tabla 7x7");
        System.out.println("\t5) EJ 5: Crear matriz marco 8x6");
        System.out.println("\t6) EJ 6: Crear matriz marco, custom size");
        System.out.println("\t7) Abandonar");
        System.out.print("\n> ");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 0:
                testMatriz();
            case 1:
                tabla5x5();
                break;
            case 2:
                tabla4x4();
                break;
            case 3:
                matrices3x3();
                break;
            case 4:
                tabla7x7();
                break;
            case 5:
                matrizMarco8x6();
                break;
            case 6:
                matrizMarcoCustom();
                break;
            case 7:
                break;
            default:
                System.out.println("El valor especificado (" + opcion + ") no está entre las opciones");
        }

    }
}
