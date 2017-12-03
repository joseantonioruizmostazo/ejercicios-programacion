/**
 * Tema 6, ejercicio 25
 * 
 * Escribe un programa que muestre por pantalla 100 números enteros separados
 * por un espacio. Los números deben estar generados de forma aleatoria
 * en un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
 * almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
 * 
 * @author José Ruiz
 */


public class Ejercicio25 {
  public static void main(String[] args) {
    
    System.out.print("A continuación se mostrarán 100 números enteros separados por espacios\n");
    System.out.print("en un rango entre 10 y 200 ambos incluídos, además los primos\n");
    System.out.println("se mostrarán entre almohadillas(#19#) y los múltiplos de 5 entre corchetes ([25])\n");
    
    int numeros;
    
    //100 numeros aleatorio del 10 al 200 ambos incluídos
    for (int i = 0; i < 100; i++) {
      numeros = ((int)(Math.random() * 191) + 10);
      
      // Comprueba si el número es primo
      boolean esPrimo = true;
      for (int j = 2; j < numeros; j++) {
        if ((numeros % j) == 0) {
          esPrimo = false;
        }
      }
      if (esPrimo) {
        System.out.print(" #" + numeros + "# ");
        // múltiplo de 5
      } else if ((numeros % 5) == 0) {
        System.out.print(" [" + numeros + "] ");
      } else {
        System.out.print(" " + numeros + " ");
      }
    }
  }
}
