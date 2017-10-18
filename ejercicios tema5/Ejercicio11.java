/**
 * Tema 5, ejercicio 11
 * 
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Calcular el cuadrado y el cubo de 5 números consecutivos a partir de un número elegido\n");
    System.out.print("Por favor introduce un número y pulse intro: ");
    int n = Integer.parseInt(s.nextLine());
    System.out.println(" ");
    
    System.out.println("┃ Número ┃ Número² ┃ Número³ ┃");
    System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
    System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
    for(int i = n; i <= n + 5; i= i + 1) {
      System.out.printf("┃ %6d ┃ %7d ┃ %7d ┃\n",i , i * i, i * i * i);
    }
    System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
    System.out.println(" ");
    System.out.print("Terminado");
  }
}
