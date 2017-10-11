/**
 * Tema 3, ejercicio 10
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    
    System.out.println("Conversor de Mb a Kb");
    System.out.print("Por favor, introduce la cantidad de Mb: ");
    int mb = Integer.parseInt(s.nextLine());
    System.out.println( mb + " Mb son " + (mb * 1024) + " Kb");
    
  }
}
