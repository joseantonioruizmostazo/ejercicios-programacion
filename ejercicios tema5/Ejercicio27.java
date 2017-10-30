/**
 * Tema 5, ejercicio 27
 * 
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
 * entre 1 y un número leído por teclado.
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio27 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int suma = 0;
    int cantidad = 0;
    
    System.out.print("A continuación se mostrarán, se contarán y se sumarán todos los múltiplos\nde 3 que haya entre 1 y el número que introduzca a continuación\n");
    
    System.out.print("Por favor, introduzca un entero mayor que 1: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    
    for (int i = 1; i < numeroIntroducido; i++) {
      if ((i % 3) == 0) {
        System.out.print(i + " ");
        cantidad++;
        suma += i;
      }
    }
    System.out.print("\nDesde 1 hasta " + numeroIntroducido + " hay " + cantidad);
    System.out.println(" múltiplos de 3 y suman " + suma);
  }
}
