/**
 * Tema 6, ejercicio 1
 * 
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 * 
 * @author José Ruiz
 */

public class Ejercicio1 {
  public static void main(String[] args) {
    
    int dado;
    int suma = 0;
    
    System.out.print("A continuación se mostrará la tirada de tres dados y se sumarán todos los puntos de los tres dados.\n");
    
    for (int i = 1; i <= 3; i++) {
      dado = ((int)(Math.random() * 6) + 1);
      System.out.println("Dado " + i + ": " + dado);
      suma += dado;
    }
    System.out.println();
    System.out.print("La suma de los dados es: " + suma);
    
  }
}
