/**
 * Tema 3, ejercicio 3
 * 
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * @author José Ruiz
 */

public class Ejercicio3 {
  public static void main(String[] args) {
    
    System.out.print("Introduce una cantidad en pesetas que quieras convertir a euros: ");
    int pesetas = Integer.parseInt(System.console().readLine());

    double euros = (double) (pesetas / 166.386);
    
    System.out.printf("%d pesetas son %.2f euros", pesetas, euros);
    
  }
}
