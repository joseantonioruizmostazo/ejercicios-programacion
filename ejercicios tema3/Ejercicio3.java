/**
 * Tema 3, ejercicio 3
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
