/**
 * Tema 7, ejercicio 5
 * 
 * Escribe un programa que pida 10 números por teclado y que luego muestre
 * los números introducidos junto con las palabras “máximo” y “mínimo” al lado
 * del máximo y del mínimo respectivamente.
 * 
 * @author José Ruiz
 * 
 */

import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("A continuación introducirás 10 números y luego se  mostrarán\n");
    System.out.println("marcando el máximo y el mínimo de ellos\n");
    System.out.println("Por favor, introduzca 10 números:");
    
    int[] numero = new int[10];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    
    //Se recogen 10 números
    for (int i = 0; i < 10; i++) {
      numero [i] = Integer.parseInt(s.nextLine());
      
      //Cálculo del número mayor
      if (numero [i] > maximo) {
        maximo = numero [i];
      }
      
      //Cálculo del número menor  
      if (numero [i] < minimo) {
        minimo = numero [i];
      }
    }
    
    System.out.println();
    System.out.println("Muestreo de números:");
    //se pintan los 10 numeros
    for (int i = 0; i < 10; i++) {
      System.out.print(numero [i]);
      //si el numero es igual al maximo introducido pintale maximo
      if (numero [i] == maximo) {
        System.out.print(" Máximo");
       //si el numero es igual al minimo introducido pintale minimo
      }else if (numero [i] == minimo) {
        System.out.print( " Mínimo");
      }
      //este salto de linea sigue estando dentro del for y sirve para que maximo
      //minimo se pinte al lado de sus numeros correspondientes
      System.out.println();
    }
  }
}

