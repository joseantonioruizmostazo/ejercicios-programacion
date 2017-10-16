/**
 * Tema 4, ejercicio 9
 * 
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo
 * ax 2 + bx + c = 0).
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio9 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    
    double x1, x2;

    System.out.println("Este programa resuelve ecuaciones de segundo grado.\n");
    System.out.println("ax^2 + bx + c = 0\n");
    
    System.out.println("Por favor, introduzca los valores.");
    
    System.out.print("a = ");
    double a = Double.parseDouble(s.nextLine());
    
    System.out.print("b = ");
    double b = Double.parseDouble(s.nextLine());
    
    System.out.print("c = ");
    double c = Double.parseDouble(s.nextLine());
    
    
    if ((a == 0) && (b == 0) && (c == 0)) {
      System.out.println("La ecuación tiene infinitas soluciones.");
    }
    
    
    if ((a == 0) && (b == 0) && (c != 0)) {
      System.out.println("La ecuación no tiene solución.");
    }
      
    
    if ((a != 0) && (b != 0) && (c == 0)) {
      System.out.println("x1 = 0");
      System.out.println("x2 = " + (-b / a));
    }

    
    if ((a == 0) && (b != 0) && (c != 0)) {
      System.out.println("x1 = x2 = " + (-c / b));
    }

    
    if ((a != 0) && (b != 0) && (c != 0)) {
        
      double discriminante = b * b - (4 * a * c);
      
      if (discriminante < 0) {
          System.out.println("La ecuación no tiene soluciones reales");
      } else {
        System.out.println("x1 = " + (-b + Math.sqrt(discriminante))/(4 * a * c));
        System.out.println("x2 = " + (-b - Math.sqrt(discriminante))/(4 * a * c));
      }
    }
  }
}
