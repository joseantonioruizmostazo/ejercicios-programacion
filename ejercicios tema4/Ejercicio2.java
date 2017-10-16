/**
 * Tema 4, ejercicio 2
 * 
 * Realiza un programa que pida una hora por teclado y que muestre luego
 * buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los
 * tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en
 * cuenta las horas, los minutos no se deben introducir por teclado.
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio2 {
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    
    System.out.print("Por favor, introduce una hora del día en formato 24 horas: ");
    int hora = Integer.parseInt(s.nextLine());
    
    if ((hora >= 6) && (hora <= 12)) {
      System.out.println("¡Buenos dias!");
    }
    
    if ((hora >= 13) && (hora <= 20)) {
      System.out.println("¡Buenas tardes!");
    }
    
    if (((hora >= 21) && (hora <= 24)) || ((hora <=5) && (hora >=0))) {
      System.out.println("¡Buenas noches!");
    }
    
    if ((hora >= 24) || (hora < 0)) {
      System.out.println("Lo siento, esa hora no es correcta");
    }
  }
}
