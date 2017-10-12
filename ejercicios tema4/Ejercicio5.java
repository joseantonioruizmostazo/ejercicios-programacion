/**
 * Tema 4, ejercicio 5
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    
    System.out.println("Cálculo de ecuaciones de primer grado del tipo ax + b = 0\n");
    System.out.print("Por favor, introduce el valor de a: ");
    double a = Double.parseDouble(s.nextLine());
    System.out.print("Por favor, ahora introduce el valor de b: ");
    double b = Double.parseDouble(s.nextLine());
    if ((a == 0) && (b != 0)) {
      System.out.println("Esa ecuación no tiene solución real.");
    } else {
      System.out.println("x = " + (-b/a));
    }
  }
}
