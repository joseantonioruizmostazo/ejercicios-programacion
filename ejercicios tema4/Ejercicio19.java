/**
 * Tema 4, ejercicio 19
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio19 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int n, digitos = 0;
    
    System.out.println("Cálculo del número de dígitos de un número entero, puede ser negativo o positivo\n");
    System.out.println("Por favor, introduce un número entero máximo de 5 cifras: ");
    
    n = Math.abs(Integer.parseInt(s.nextLine()));
    
    if ( n < 10 ) {
      digitos = 1;
    }
    
    if (( n >= 10 ) && ( n < 100 )) {
      digitos = 2;
    }
    
    if (( n >= 100 ) && ( n < 1000 )) {
      digitos = 3;
    }
    
    if (( n >= 1000 ) && ( n < 10000 )) {
      digitos = 4;
    }
    
    if (( n >= 10000 ) && ( n <= 99999 )) {
      digitos = 5;
    }
    
    System.out.println("El número introducido tiene " + digitos + " dígitos");
    
  }
}
