/**
 * Tema 5, ejercicio 3
 * 
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do while . .
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do while\n");
    
    int i = 0;
    
    do {
      System.out.println(i);
      i += 5;
    } while (i <= 100);
    
    System.out.print("Terminado");
  }
}
