/**
 * Tema 4, ejercicio 17
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Cálculo de la última cifra de un número entero\n");
    System.out.println("Por favor, introduce un número entero: ");
    
    int numero = Integer.parseInt(s.nextLine());
    
    System.out.println("La última cifra del número introducido es " + (numero % 10));
  }
}
