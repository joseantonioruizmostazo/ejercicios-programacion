 /**
 * Tema 2, ejercicio 5
 * 
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
 * convertir deberá estar almacenada en una variable.
 * 
 * @author José Ruiz
 */

public class Ejercicio5 {
  public static void main(String[] args) {
  
    int pesetas = 12345;
    double euros = pesetas / 166.386;
    
    System.out.println(pesetas + " pesetas son " + euros + " euros.");
    System.out.printf("%d pesetas son %.2f euros.\n", pesetas, euros);
  }
}
