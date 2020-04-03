//Daniel Alfredo Apesteguia Timoner. Escribiendo
package streams;

import java.io.*;

public class pildoras3 {

    public static void main(String[] args) {
        Escribiendo accede_es = new Escribiendo();
        
        accede_es.escribir();
    }
}

    class Buffing {

        public void escribir() {
            
            try{
                entrada = new FileReader("C:/")
                
                for(int i = 0; i < frase.length(); i++){ //Agregar todos los carácteres de la frase
                    escritura.write(frase.charAt(i));
                }
                System.out.println("Archivo creado correctamente.");
                
                escritura.close();
            }
            catch(IOException e){
                System.out.println("Error de JAVAIO.");
            }
        }
    
}

