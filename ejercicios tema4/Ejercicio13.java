/**
 * Tema 4, ejercicio 13
 * 
 * Escribe un programa que ordene tres números enteros introducidos por
 * teclado.
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    double aux;
    
    System.out.println("Ordenar 3 números de menor a mayor.\n");
    System.out.println("Por favor, introduzca cada número y pulse INTRO:");
    double a = Double.parseDouble(s.nextLine());
    double b = Double.parseDouble(s.nextLine());
    double c = Double.parseDouble(s.nextLine());

    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
    
    if (b > c) {
      aux = b;
      b = c;
      c = aux;
    }
    
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
        
    System.out.println("Los números introducidos ordenados de menor a mayor son " + a + ", " + b + " y " + c + ".");
    
  }
}
