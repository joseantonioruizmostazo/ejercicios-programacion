/*
 * Tema 8, ejercicio 37
 * 
 * Crea una función con la siguiente cabecera:
 * 
 * public String convierteEnMorse(int n)
 * 
 * Esta función convierte el número n al sistema Morse y lo devuelve en una
 * cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
 * Morse. Utiliza esta función en un programa para comprobar que funciona bien.
 * Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
 * desde el programa principal.
 * 
 * @author José Ruiz
 */

package ejercicios.tema8;
import java.util.Scanner;
import ejercicios.tema8.matematicas.Varios;

public class Ejercicio37 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce el número que quiere pasar a código morse: ");
    int numero = Integer.parseInt(s.nextLine());
    System.out.println("Su numero convertido al codigo morse es: " + Varios.convierteEnMorse(numero));
  }
}