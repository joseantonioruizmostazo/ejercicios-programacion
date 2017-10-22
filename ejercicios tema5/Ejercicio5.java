/**
 * Tema 5, ejercicio 5
 * 
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
 * utilizando un bucle while.
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utillizando\nun bucle while");
    
    int i = 320;
    
    while (i >= 160) {
      System.out.println(i);
       i -= 20;
    }
    System.out.print("Terminado");
  }
}
