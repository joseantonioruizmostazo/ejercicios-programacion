/**
 * Tema 4, ejercicio 3
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio3 {
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    String numero;
    
    System.out.print("Por favor, introduce un número entre (1-7) ambos incluídos: ");
    numero = (s.nextLine());
    
    
    switch(numero) {
      case "1":
      System.out.println("Lunes");
        break;
      case "2":
      System.out.println("Martes");
        break;
      case "3":
      System.out.println("Miércoles");
        break;
      case "4":
      System.out.println("Jueves");
        break;
      case "5":
      System.out.println("Viernes");
        break;
      case "6":
      System.out.println("Sábado");
        break;
      case "7":
      System.out.println("Domingo");
        break;
      default:
        System.out.println("Lo siento, ese número no es correcto");
        
    }
  }
}
