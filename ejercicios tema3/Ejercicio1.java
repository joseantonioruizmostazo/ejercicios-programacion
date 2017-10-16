/**
 * Tema 3, ejercicio 1
 * 
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación.
 * 
 * @author José Ruiz
 */

public class Ejercicio1 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt( linea );
    
    System.out.print("Por favor, introduce otro número: ");
    linea = System.console().readLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt( linea );
    
    int total;
    total = primerNumero * segundoNumero;
    
    
    System.out.print("El primer número introducido es " + primerNumero);
    System.out.println(" y el segundo número es " + segundoNumero);
    System.out.print("La multiplicación entre los dos números es " + total);
    
  }
}
