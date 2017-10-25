/**
 * Tema 5, ejercicio 24
 * 
 * Escribe un programa que lea un número n e imprima una pirámide de números
 * con n filas como en la siguiente figura:
 * 
 *    1
 *   121
 *  12321
 * 1234321
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio24 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int alturaIntroducida = Integer.parseInt(s.nextLine());
    
    int altura = 1;
    int i = 0;
    int espacios = alturaIntroducida-1;
    
    while (altura <= alturaIntroducida) {
      
      // inserta espacios
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      // pinta la línea hasta el centro
      for (i = 1; i < altura; i++) {
        System.out.print(i);
      }
      // pinta la línea desde el centro hasta el final
      for (i = altura; i > 0; i--) {
        System.out.print(i);
      } 

      System.out.println();

      altura++;
      espacios--;
    }
  }
}
