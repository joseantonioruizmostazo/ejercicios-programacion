/*
 * Tema 8, ejercicio 35
 * 
 * Crea una función con la siguiente cabecera:
 * 
 * public static String convierteEnPalotes(int n)
 * 
 * Esta función convierte el número n al sistema de palotes y lo devuelve en una
 * cadena de caracteres. Por ejemplo, el 470213 en decimal es el | | | | - | | | | | | | - - | | - | - | | | en el sistema
 * de palotes. Utiliza esta función en un programa para comprobar que funciona bien. Desde la función no se debe mostrar nada
 * por pantalla, solo se debe usar print desde el programa principal.
 * 
 * @author José Ruiz
 */

package ejercicios.tema8;
import java.util.Scanner;
import ejercicios.tema8.matematicas.Varios;

public class Ejercicio35 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce el número que quiere pasar a palotes: ");
    int numero = Integer.parseInt(s.nextLine());
    System.out.println("Su numero convertido al sistema de palotes es: " + Varios.convierteEnPalotes(numero));
  }
}