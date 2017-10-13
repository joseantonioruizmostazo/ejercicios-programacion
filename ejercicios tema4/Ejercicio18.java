/**
 * Tema 4, ejercicio 18
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio18 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int n, primeraCifra = 0;
    
    System.out.println("Cálculo de la primera cifra de un número entero\n");
    System.out.println("Por favor, introduce un número entero máximo de 5 cifras: ");
    
    n = Integer.parseInt(s.nextLine());
    
    if ( n < 10 ) {
      primeraCifra = n;
    }
    
    if (( n >= 10 ) && ( n < 100 )) {
      primeraCifra = n / 10;
    }
    
    if (( n >= 100 ) && ( n < 1000 )) {
      primeraCifra = n / 100;
    }
    
    if (( n >= 1000 ) && ( n < 10000 )) {
      primeraCifra = n / 1000;
    }
    
    if ( n >= 10000 ) {
      primeraCifra = n / 10000;
    }
    
    System.out.println("La primera cifra del número introducido es " + primeraCifra);
  }
}
