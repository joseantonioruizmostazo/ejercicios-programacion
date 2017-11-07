/**
 * Tema 5, ejercicio 41
 * 
 * Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
 * hay dentro de un número. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 * 
 * Ejemplo 1:
 * Por favor, introduzca un número entero positivo: 406783
 * El 406783 contiene 4 dígitos pares y 2 dígitos impares.
 * 
 * Ejemplo 2:
 * Por favor, introduzca un número entero positivo: 3177840
 * El 3177840 contiene 3 dígitos pares y 4 dígitos impares
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio41 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("A continuación se mostrarán cuántos dígitos pares e impares tiene un número introducido.\n");
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    
    long n = numeroIntroducido;
    int cuentaPares = 0;
    int cuentaImpares = 0;
        
    while (n > 0) {
      if ((n % 10) % 2 == 0) {
        cuentaPares++;
      } else {
        cuentaImpares++;
      }
      n /= 10;
    }
    System.out.print("El " + numeroIntroducido + " contiene " + cuentaPares + " dígitos pares y " + cuentaImpares + " dígitos impares.");
  }
}
