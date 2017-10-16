/**
 * Tema 4, ejercicio 14
 * 
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduzca un número entero: ");
      int numero = Integer.parseInt(s.nextLine());

      if ((numero % 2) == 0) {
      System.out.print("El número introducido es par");
    } else {
    System.out.print("El número introducido es impar");
    }

      if ((numero % 5) == 0) {
      System.out.println(" y divisible entre 5.");
    } else {
      System.out.println(" y no es divisible entre 5.");
      
    }
  }
}
