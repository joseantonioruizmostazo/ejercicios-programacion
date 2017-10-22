/**
 * Tema 5, ejercicio 19
 * 
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se debe
 * pedir por teclado.
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio19 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int alturaIntroducida = Integer.parseInt(s.nextLine());

    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = s.nextLine();
    
    int altura = 1;
    int i = 0;
    int espacios = alturaIntroducida-1;
    
    while (altura <= alturaIntroducida) {
      
      // inserta espacios
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      // pinta la línea
      for (i = 1; i < altura * 2; i++) {
        System.out.print(relleno);
      }

      System.out.println();

      altura++;
      espacios--;
    }
  }
}
