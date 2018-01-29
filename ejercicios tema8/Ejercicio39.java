/*
 * Tema 8, ejercicio 39
 * 
 * 
 * 
 * @author José Ruiz
 */

package ejercicios.tema8;
import java.util.Scanner;
import ejercicios.tema8.matematicas.Varios;

public class Ejercicio39 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce el número que quiere pasar a palabras: ");
    int numero = Integer.parseInt(s.nextLine());
    System.out.println("Su numero convertido a palabras es: " + Varios.convierteEnPalabras(numero));
  }
}