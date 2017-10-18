/**
 * Tema 5, ejercicio 8
 * 
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Muestra la tabla de multiplicar de un número introducido por teclado\n");
    System.out.print("Por favor introduce un número y pulse intro: ");
    int n = Integer.parseInt(s.nextLine());
    System.out.println(" ");
    System.out.println("┏━━━━━━━━━━━━━━━┓");
    for(int i = 0; i <= 10; i= i + 1) {
      System.out.printf("┃ %2d x %2d = %3d ┃\n",n , i, n * i);
    }
    System.out.println("┗━━━━━━━━━━━━━━━┛");
    System.out.println(" ");
    System.out.print("Terminado");
  }
}
