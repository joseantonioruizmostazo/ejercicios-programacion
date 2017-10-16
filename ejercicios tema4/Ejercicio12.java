/**
 * Tema 4, ejercicio 12
 * 
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. El
 * programa mostrará al final la calificación obtenida. Pásale el minicuestionario
 * a tus compañeros y pídeles que lo hagan para ver qué tal andan de conoci-
 * mientos en las diferentes asignaturas del curso.
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
    
    System.out.println("6. Double se utiliza para números:");
    System.out.println("a) Primos\nb) Decimales\nc) Enteros"); 
    System.out.print("=> ");
    respuesta = (s.nextLine());  
    if (respuesta.equals("b")) {
      puntos++;
    }
    
    System.out.println("7. ¿Cuáles son los tipos de medidas preventivas?");
    System.out.println("a) Colectivas e individuales\nb) Permisivas y prohibitivas\nc) flamables e inflamables"); 
    System.out.print("=> ");
    respuesta = (s.nextLine());  
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("8. ¿Cuál es la responsabilidad del empresario, en cuanto a medidas preventivas?");
    System.out.println("a) Pasearse por la oficina\nb) Formar e informar a los trabajadores\nc) Procurar que no se cumplan"); 
    System.out.print("=> ");
    respuesta = (s.nextLine());  
    if (respuesta.equals("b")) {
      puntos++;
    }
    
    System.out.println("9. ¿Cuántos tipos de esquemas existen?");
    System.out.println("a) Externo, interno y medio\nb) Conceptual, interno y periférico\nc) Externo, interno y conceptual"); 
    System.out.print("=> ");
    respuesta = (s.nextLine());  
    if (respuesta.equals("c")) {
      puntos++;
    }
    System.out.println("10. ¿Qué puntuación crees que sacarás en este cuestionario?");
    System.out.println("a) Debido a esta pregunta ya no lo sé...\nb) Un ¡10!\nc) Si fallo esta pregunta solo creo que un 9"); 
    System.out.print("=> ");
    respuesta = (s.nextLine());  
    if (respuesta.equals("b")) {
      puntos++;
    }
    
    System.out.println("\nHa obtenido " + puntos + " puntos.");
    
  }
}
