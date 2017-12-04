/**
 * Tema 7, ejercicio 9
 * 
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra “par” o “impar” según proceda.
 * 
 * @author José Ruiz
 * 
 */

import java.util.Scanner;

public class Ejercicio9 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("A continuación introducirá 8 números por teclado y se mostrarán\n");
    System.out.println("junto con las palabras (par) o (impar) al lado del número según proceda\n");
    
    int[] numeros = new int[8];
    
    //Se recogen 8 numeros en un array
    for (int i = 0; i < 8; i++) {
      numeros [i] = Integer.parseInt(s.nextLine());
    }
    
    System.out.println();
    
    //se muestran los números del array
    for (int i = 0; i < 8; i++) {
      //Cálculo de los impares y pares
      if (numeros [i] % 2 == 0) {
        System.out.println(numeros [i] + " Par");
      } else {
        System.out.println(numeros [i] + " Impar");
      } 
    }
  }
}
