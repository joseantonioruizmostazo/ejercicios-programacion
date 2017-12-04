/**
 * Tema 7, ejercicio 11
 * 
 * Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
 * primos a las primeras posiciones, desplazando el resto de números (los que
 * no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
 * el array resultante.
 * 
 * @author José Ruiz
 * 
 */

import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("A continuación se introducirán 10 números por teclado y se mostrarán\n");
    System.out.print("los 10 números, pero las primeras posiciones serán ocupadas\n");
    System.out.println("por los números primos y el resto por no primos.\n");
    
    //se declara un array original array, otro solo de pares y otro de impares
    int[] numeros = new int[10];
    int[] primos = new int[10];
    int[] noPrimos = new int[10];
    int cantidadPrimos = 0;
    int cantidadNoPrimos = 0;
    boolean esPrimo = false;
    
    //se recogen en el array original los 10 numeros introducidos por teclado, en el array primos los primos y en el noPrimos los noPrimos
    for (int i = 0; i < 10; i++) {
      numeros [i] = Integer.parseInt(s.nextLine());
      
      // Comprueba si el número es o no primo.
      esPrimo = true;
      for (int j = 2; j < numeros [i] - 1; j++) {
        if (numeros [i] % j == 0) {
          esPrimo = false;
        }
      }
      
      // Si el número es primo, se mete en un array y si
      // no es primo, se mete en otro diferente.
      if (esPrimo) {
        primos [cantidadPrimos++] = numeros [i];
      } else {
        noPrimos [cantidadNoPrimos++] = numeros [i];
      }
    }
    
    System.out.println("Array original:\n");
    
    System.out.print("Índice ");
    //se pinta el indice
    for (int i = 0; i < 10; i++) {
      System.out.printf("[ %3d ]", i);
    }
    System.out.println();
    System.out.print("Números");
    //se pintan los 10 numeros
    for (int i = 0; i < 10; i++) {
      System.out.printf("[ %3d ]", numeros [i]);
    }
    // Mete los primos en las primeras posiciones del array original.
    for (int i = 0; i < cantidadPrimos; i++) {
      numeros [i] = primos[i];
    }
    
    // Mete los no primos en los huecos que quedan.
    for (int i = cantidadPrimos; i < 10; i++) {
      numeros [i] = noPrimos[i - cantidadPrimos];
    }
    
    System.out.println();
    System.out.println();
    
    //comienzo array rotado primero primos
    System.out.println("Array rotado, primero números primos:\n");
    
    System.out.println();
    
    System.out.print("Índice ");
    //se pinta el indice
    for (int i = 0; i < 10; i++) {
      System.out.printf("[ %3d ]", i);
    }
    
    System.out.println();
    System.out.print("Números");
    //se pintan los 10 numeros
    for (int i = 0; i < 10; i++) {
      System.out.printf("[ %3d ]", numeros [i]);
    }
    System.out.println();
  }
}
