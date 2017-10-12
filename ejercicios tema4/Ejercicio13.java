/**
 * Tema 4, ejercicio 13
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
    double a = Double.parseDouble(System.console().readLine());
    double b = Double.parseDouble(System.console().readLine());
    double c = Double.parseDouble(System.console().readLine());

    // ordenación de los dos primeros números
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
    
    // ordenación de los dos últimos números
    if (b > c) {
      aux = b;
      b = c;
      c = aux;
    }
    
    // se vuelven a ordenar los dos primeros
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
        
    System.out.println("Los números introducidos ordenados de menor a mayor son " + a + ", " + b + " y " + c + "."); 
  }
}
