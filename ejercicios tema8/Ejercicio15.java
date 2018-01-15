/*
 * Tema 8, ejercicio 15
 * 
 * Muestra los números primos que hay entre 1 y 1000.
 * 
 * @author José Ruiz
 */

package ejercicios.tema8;
import java.util.Scanner;
import ejercicios.tema8.matematicas.Varios;

public class Ejercicio15 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("A continuación se mostrarán todos los números primos que hay entre  1 y 1000\n");

    for (int i = 1; i < 1000; i++) {
      if (Varios.esPrimo(i)){
      System.out.print(i + " ");
      }
    }
  }
}
