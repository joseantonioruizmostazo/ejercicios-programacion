/**
 * Tema 5, ejercicio 29
 * 
 * Escribe un programa que muestre por pantalla todos los números enteros
 * positivos menores a uno leído por teclado que no sean divisibles entre otro
 * también leído de igual forma.
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio29 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int primerNumero;
    int segundoNumero;
    int i;
    
    System.out.print("Introducirá dos números por teclado y se mostrarán los\nnúmeros enteros positivos menores al primero número introducido que no sean\ndivisibles por el segundo número introducido\n");
    
    System.out.print("Introduzca un número entero: ");
    primerNumero = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca otro número entero: ");
    segundoNumero = Integer.parseInt(s.nextLine());
    
    for (i = 0; i <= primerNumero; i++) {
      if ((i % segundoNumero) != 0) {
        System.out.print(i + " ");
      }
    }
  }
}
