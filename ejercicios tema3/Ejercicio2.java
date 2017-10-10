/**
 * Tema 3, ejercicio 2
 * 
 * @author José Ruiz
 */

public class Ejercicio2 {
  public static void main(String[] args) {
    
    String linea;
    
    
    System.out.print("Introduce una cantidad en euros que quieras convertir a pesetas: ");
    double euros = Double.parseDouble(System.console().readLine());

    int pesetas = (int) (euros * 166.386);
    
    System.out.print(euros + " euros son  " + pesetas + " pesetas.");
    
  }
}
