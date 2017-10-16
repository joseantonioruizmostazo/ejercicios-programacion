 /**
 * Tema 2, ejercicio 4
 * 
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
 * convertir deberá estar almacenada en una variable.
 * 
 * @author José Ruiz
 */

public class Ejercicio4 {
  public static void main(String[] args) {
  
    double euros = 25.60;
    int pesetas = (int) (euros * 166.386);
    
    System.out.println(euros + " euros son " + pesetas + " pesetas.");
  }
}
    
