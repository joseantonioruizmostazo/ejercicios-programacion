/**
 * Tema 5, ejercicio 9
 * 
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado.
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio9 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int numeroDeDigitos = 1;
    int n;
    int numeroIntroducido;
    
    System.out.println("Por favor, introduzca un número y te diré cuantos dígitos tiene.\n");
    numeroIntroducido = Integer.parseInt(s.nextLine());
    
    if (numeroIntroducido < 0) {
      numeroIntroducido = (numeroIntroducido * -1);
    }
    
    n = numeroIntroducido;
    
    while (n > 9) {
      n /= 10;
      numeroDeDigitos++;
    }
    
    System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito/s.");

  }
}
