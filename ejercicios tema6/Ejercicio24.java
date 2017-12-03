/**
 * Tema 6, ejercicio 24
 * 
 * Escribe un programa que, dado un número introducido por teclado, elija al azar
 * uno de sus dígitos.
 * 
 * Ejemplo 1:
 * Por favor, introduzca un número entero positivo: 406783
 * 7
 * 
 * Ejemplo 2:
 * Por favor, introduzca un número entero positivo: 406783
 * 3
 * 
 * Ejemplo 3:
 * Por favor, introduzca un número entero positivo: 406783
 * 0
 * 
 * @author José Ruiz
 */

import java.util.Scanner;

public class Ejercicio24 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("A continuación deberá introducir un número positivo por teclado\n");
    System.out.println("y se elegirá al azar un dígito de ese número\n");
    
    int numeroIntroducido;
    int longitud = 0;
    int posicion;                 
    int numero; 
    
    System.out.print("Por favor, introduzca un número positivo: ");
    numeroIntroducido = Integer.parseInt(s.nextLine());
    
    numero = numeroIntroducido;
    
    //calcula la longitud
    while (numero > 0) {
      numero /= 10;
      longitud++;
    }
    
    System.out.println();
    //elige una posicion al azar dentro del número
    posicion = ((int)(Math.random() * longitud) + 1);
    
    // extrae el dígito de esa posición
    System.out.println("El dígito escogido al azar es: " + (numeroIntroducido / (int)(Math.pow(10, longitud - posicion))) % 10);
  }
}
