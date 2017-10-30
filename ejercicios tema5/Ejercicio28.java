/**
 * Tema 5, ejercicio 28
 * 
 * Escribe un programa que calcule el factorial de un número entero leído por
 * teclado.
 * 
 * Ejemplo:
 * 
 * Por favor, introduzca un número entero: 6
 * 6! = 720
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio28 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    long i = 1;
    int j = 1;
    
    System.out.print("A continuación se mostrará el factorial de un número que introduzca por teclado.\n");
    
    System.out.print("Por favor, introduzca un número entero positivo que se encuentre desde (0 a 20): ");
    long numeroIntroducido = Integer.parseInt(s.nextLine());
    
    for (j = 1; j <= numeroIntroducido; j++) {
      
        i = i * j;
    }
     
    System.out.print(numeroIntroducido + "! es " + i); 
  }
}
