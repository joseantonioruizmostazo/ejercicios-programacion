/**
 * Tema 3, ejercicio 11
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    
    System.out.println("Conversor de Kb a Mb");
    System.out.print("Por favor, introduce la cantidad de Kb: ");
    int kb = Integer.parseInt(s.nextLine());
    System.out.printf( kb + " Kb son " + (kb / (double)1024) + " Mb");
    
  }
}
