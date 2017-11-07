/**
 * Tema 5, ejercicio 37
 * 
 * Realiza un conversor del sistema decimal al sistema de “palotes”.
 * Ejemplo:
 * Por favor, introduzca un número entero positivo: 47021
 * El 470213 en decimal es el | | | | - | | | | | | | - - | | - | en el sistema de palotes.
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio37 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("A continuación se transformará un número entero positivo introducido al sistema de palotes.\n");
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());

    // Voltea el número introducido ////////////////////////////////////////////
    long numero = numeroIntroducido;
    long volteado = 0;

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } // while

    // Pinta el número con palotes /////////////////////////////////////////////
    int palotes;
    
    while (volteado > 0) {
      palotes = (int)(volteado % 10); // último dígito de volteado
      // Pinta el dígito con palotes. Por ej. si es un 3, pinta 3 palotes.
      for (int i = 0; i < palotes; i++) {
        System.out.print("|");
      }
      if (volteado > 10) { // para no pintar el último guión
        System.out.print(" - "); // separador de dígitos
      }
      volteado = volteado / 10; // quita el último dígito a volteado
    } // while    
  }
}
