/**
 * Tema 3, ejercicio 11
 * 
 * Realiza un conversor de Kb a Mb.
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
    System.out.printf("%d Kb son %.2f Mb", kb, (double)kb/1024 );
    
  }
}
