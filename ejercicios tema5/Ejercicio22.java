/**
 * Tema 5, ejercicio 22
 * 
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio22 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("A continuación se mostrarán por pantalla todos los números primos comprendidos entre 2-100 ambos incluídos.\n");
    
    boolean esPrimo = true;
    
    for (int n = 2; n <= 100; n++) {

    // Comprobacion
    esPrimo = true;
    for (int i = 2; i < n; i++) {
      if ((n % i) == 0) {
        esPrimo = false;
      }
    }
    
    // si n es primo, me lo muestras
    if (esPrimo) {
      System.out.print(n + " ");
      }
    }
  }
}
