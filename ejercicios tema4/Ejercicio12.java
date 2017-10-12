/**
 * Tema 4, ejercicio 12
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);


int puntos = 0;
    String respuesta;
    
    System.out.println("CUESTIONARIO DE 1º DAM\n");
    System.out.println("Responde a las siguientes cuestiones escribiendo (a, b ó c) en cada respuesta\nque crea correcta\n");
    
    System.out.println("1. ¿En qué tipo de organización se utiliza la función hash?");
    System.out.println("a) Directa\nb) Secuencial\nc) Indexada"); 
    System.out.print("=> ");
    respuesta = (s.nextLine());  
    if (respuesta.equals("a")) {
      puntos++;
    }

    System.out.println("2. Una base de datos sin errores decimos que es una base de datos:");
    System.out.println("a) limpia\nb) Integra\nc) perfecta"); 
    System.out.print("=> ");
    respuesta = (s.nextLine());  
    if (respuesta.equals("b")) {
      puntos++;
    }

    System.out.println("3. Para insertar un hiperenlace en una página se utiliza la etiqueta...");
    System.out.println("a) href\nb) a\nc) link"); 
    System.out.print("=> ");
    respuesta = (s.nextLine());  
    if (respuesta.equals("b")) {
      puntos++;
    }
    
    System.out.println("4. ¿Qué comando utilizamos en el terminal para crear una carpeta?");
    System.out.println("a) newcarpet\nb) createfolder\nc) mkdir"); 
    System.out.print("=> ");
    respuesta = (s.nextLine());  
    if (respuesta.equals("c")) {
      puntos++;
    }
    
    System.out.println("5. ¿Cuál de las siguientes memorias es volátil?");
    System.out.println("a) RAM\nb) EPROM\nc) ROM"); 
    System.out.print("=> ");
    respuesta = (s.nextLine());  
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("\nHa obtenido " + puntos + " puntos.");
  }
}
