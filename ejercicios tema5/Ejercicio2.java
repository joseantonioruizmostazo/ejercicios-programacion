/**
 * Tema 5, ejercicio 2
 * 
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while . .
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while\n");
    
    int i = 0;
    
    while (i <= 100) {
      System.out.println(i);
       i += 5;
    }
    System.out.print("Terminado");
  }
}
