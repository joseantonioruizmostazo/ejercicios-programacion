/**
 * Tema 5, ejercicio 4
 * 
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
 * utilizando un bucle for .
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás\n");
    
    for (int i = 320; i >= 160; i= i - 20) {
      System.out.println(i);
    }
  }
}
