/**
 * Tema 5, ejercicio 25
 * 
 * Realiza un programa que pida un número por teclado y que luego muestre ese
 * número al revés.
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio25 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int volteado = 0;
    
    System.out.print("Por favor, introduzca un número y se mostrará al revés: ");
    
    int n = Integer.parseInt(s.nextLine());
    
    while (n > 0) {
      volteado = (n % 10) + (volteado * 10);
      n /= 10;
      
    }
    
    System.out.print("El número introducido mostrado al revés es: " + volteado);
    
  }
}
