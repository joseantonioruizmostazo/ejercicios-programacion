/**
 * Tema 7, ejercicio 10
 * 
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
 * y que los almacene en un array. El programa debe ser capaz de pasar todos
 * los números pares a las primeras posiciones del array (del 0 en adelante) y
 * todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
 * es necesario.
 * 
 * @author José Ruiz
 * 
 */

import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("A continuación se mostrarán 20 números aleatorios entre 0 y 100\n");
    System.out.print("luego se mostrarán los 20 números, pero las primeras posiciones serán ocupadas\n");
    System.out.println("por los números pares y el resto serán impares.\n");
    
    //se declara un array original array, otro solo de pares y otro de impares
    int[] numeros = new int[20];
    int[] par = new int[20];
    int[] impar = new int[20];
    int pares = 0;
    int impares = 0;
    
    //se recogen en el array original los 20 numeros aleatorios entre 0 y 100, en el array par los pares y en el impar los impares
    for (int i = 0; i < 20; i++) {
      numeros [i] = (int)(Math.random() * 101);
      if (numeros[i] % 2 == 0) {
        par[pares++] = numeros[i];
      } else {
        impar[impares++] = numeros[i];
      }
    }
    
    System.out.println("Array original:\n");
    
    System.out.print("Índice ");
    //se pinta el indice
    for (int i = 0; i < 20; i++) {
      System.out.printf("[ %3d ]", i);
    }
    System.out.println();
    System.out.print("Números");
    //se pintan los 20 numeros
    for (int i = 0; i < 20; i++) {
      System.out.printf("[ %3d ]", numeros [i]);
    }
    // Mete los pares en las primeras posicionesvdel array original.
    for (int i = 0; i < pares; i++) {
      numeros [i] = par[i];
    }
    
    // Mete los impares en los huecos que quedan.
    for (int i = pares; i < 20; i++) {
      numeros [i] = impar[i - pares];
    }
    
    System.out.println();
    System.out.println();
    
    //comienzo array rotado primero pares
    System.out.println("Array rotado, primero números pares:\n");
    
    System.out.println();
    
    System.out.print("Índice ");
    //se pinta el indice
    for (int i = 0; i < 20; i++) {
      System.out.printf("[ %3d ]", i);
    }
    
    System.out.println();
    System.out.print("Números");
    //se pintan los 15 numeros
    for (int i = 0; i < 20; i++) {
      System.out.printf("[ %3d ]", numeros [i]);
    }
    System.out.println();
  }
}


