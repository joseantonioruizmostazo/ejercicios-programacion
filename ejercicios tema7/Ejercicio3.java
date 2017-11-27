/**
 * Tema 7, ejercicio 3
 * 
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en
 * mostrarse y viceversa.
 * 
 * @author José Ruiz
 * 
 */

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("A continuación deberás introducir 10 números por teclado\n");
    System.out.println("y posteriormente se mostrarán por pantalla en orden inverso al introducido.\n");
    
    int[] num = new int[10];

    for (int i = 0; i < 10; i++) {
      System.out.print("Número " + (i + 1) + ": ");
      num[i] = Integer.parseInt(s.nextLine());
    }
    
    System.out.println();
    System.out.print("La secuencia de números introducidos mostrada al revés sería esta: ");
    
    for (int i = 9; i >= 0; i--) {
    System.out.print(num[i] + " ");
    }
  }
}
