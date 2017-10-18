/**
 * Tema 5, ejercicio 1
 * 
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for .
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for\n");
    
    for (int i = 0; i <= 100; i= i + 5) {
      System.out.println(i);
    }
  }
}
