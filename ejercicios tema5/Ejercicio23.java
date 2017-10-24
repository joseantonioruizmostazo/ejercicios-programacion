/**
 * Tema 5, ejercicio 23
 * 
 * Escribe un programa que permita ir introduciendo una serie indeterminada
 * de números mientras su suma no supere el valor 10000. Cuando esto último
 * ocurra, se debe mostrar el total acumulado, el contador de los números
 * introducidos y la media.
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio23 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int n = 0;
    int suma = 0;
    int cantidadNumeros = 0;
    int media = 0;
    
    System.out.print("Podrás introducir una serie de números hasta que su suma total supere 10.000\n");
    System.out.print("entonces se mostrará la suma, la cantidad de números introducidos y su media.\n");
    System.out.print("Por favor, comienza a introducir los números:\n");
    
    while (suma < 10000) {
      n = Integer.parseInt(s.nextLine());
      cantidadNumeros++;
      suma += n;
    }
    
    System.out.println("La suma total de todos los números es: " + suma);
    System.out.println("La cantidad de números introducidos es: " + cantidadNumeros);
    System.out.println("Y su media es: " + (media = (suma / cantidadNumeros)));
    
  }
}
    
