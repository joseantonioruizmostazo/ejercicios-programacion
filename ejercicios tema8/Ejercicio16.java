/*
 * Tema 8, ejercicio 16
 * 
 * Muestra los números capicúa que hay entre 1 y 99999.
 * 
 * @author José Ruiz
 */

package ejercicios.tema8;
import ejercicios.tema8.matematicas.Varios;

public class Ejercicio16 {

  public static void main(String[] args) {

    System.out.println("A continuación se mostrarán todos los números capicua que hay entre  1 y 99999\n");

    for (int i = 1; i <= 99999; i++) {
      if (Varios.esCapicua(i)){
      System.out.println(i);
      }
    }
  }
}