/**
 * Tema 5, ejercicio 17
 * 
 * Realiza un programa que sume los 100 números siguientes a un número entero
 * y positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int numeroIntroducido = 0;
    
    do {
      System.out.print("Introduzca un número entero positivo: ");
      numeroIntroducido = Integer.parseInt(s.nextLine());
      
      if(numeroIntroducido < 0) {
        System.out.println("El número introducido no es correcto, debe introducir un número positivo.");
      }
    } while (numeroIntroducido < 0);
    
    int suma = 0;
    
    for(int i = numeroIntroducido; i < numeroIntroducido + 100; i++) {
      suma += i;
    }

    System.out.println("La suma de los 100 números siguientes a " + numeroIntroducido + " es " + suma);
  }
}
