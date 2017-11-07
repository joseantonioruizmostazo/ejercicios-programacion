/**
 * Tema 5, ejercicio 42
 * 
 * Escribe un programa que pida un número entero positivo por teclado y que
 * muestre a continuación los 5 números consecutivos a partir del número
 * introducido. Al lado de cada número se debe indicar si se trata de un primo o
 * no.
 * 
 * Ejemplo:
 * Por favor, introduzca un número entero positivo: 17
 * 17 es primo
 * 18 no es primo
 * 19 es primo
 * 20 no es primo
 * 21 no es primo
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio42 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("A continuación se mostrarán 5 números consecutivos a partir de uno introducido y se dirá si son primos o noln.\n");
    System.out.print("Por favor, introduzca un número entero positivo: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
       
    boolean esPrimo;

    for (int n = numeroIntroducido; n < numeroIntroducido + 5; n++) {

      // comprueba si n es primo
      esPrimo = true;
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          esPrimo = false;
        }
      }

      // muestra por pantalla si n es primo o no
      if (esPrimo) {
        System.out.println(n + " es primo");
      } else {
        System.out.println(n + " no es primo");
      }
    }
    System.out.println();
  }
}
