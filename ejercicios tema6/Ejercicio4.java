/**
 * Tema 6, ejercicio 4
 * 
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos)
 * separados por espacios.
 * 
 * @author José Ruiz
 */

public class Ejercicio4 {
  public static void main(String[] args) {
    
    System.out.print("A continuación se mostrarán 20 números enteros aleatorios entre 0 y 10 (ambos incluidos)\n");
    
    for (int i = 1; i <= 20; i++) {
      System.out.print((int)(Math.random() * 11) + " ");
    }
  }
}
