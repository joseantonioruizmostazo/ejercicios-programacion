/**
 * Tema 4, ejercicio 21
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio21 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
   
    System.out.println("Calcula la nota de programación de un trimestre\n");
    System.out.print("Por favor, introduzca la nota del primer control: ");
    double c1 = Double.parseDouble(s.nextLine());
    System.out.print("Por favor, introduzca la nota del segundo control: ");
    double c2 = Double.parseDouble(s.nextLine());
    
    double media = ((c1 + c2) / 2);
    System.out.print("Tienes un " + media + " de nota media, debes presentarte a la recuperación\n");
    
    if (media < 5) {
      System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
      String recuperacion = (s.nextLine());
      if (recuperacion.equals("apto")) {
        media = 5;
      }
    }
    
    System.out.print("Finalmente tu nota de Programación es " + media);
    
  }
}
    
    
    
