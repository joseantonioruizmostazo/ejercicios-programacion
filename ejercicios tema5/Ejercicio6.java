/**
 * Tema 5, ejercicio 6
 * 
 * Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
 * do-while.
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle do while.\n");
    
    int i = 320;
    
    do {
      System.out.println(i);
      i -= 20;
    } while (i >= 160);
    
    System.out.print("Terminado");
  }
}
