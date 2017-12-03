/**
 * Tema 7, ejercicio 6
 * 
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición 0
 * debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
 * la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
 * del array.
 * 
 * @author José Ruiz
 * 
 */

import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("A continuación introducirás 15 números y se almacenarán en un array\n");
    System.out.println("se mostrara ese array original y después otro array con los números rotados una posición a su derecha\n");
    System.out.println("Por favor, introduzca 15 números:");
    
    int[] numero = new int[15];
    int aux;
    
    //Se recogen 15 números
    for (int i = 0; i < 15; i++) {
      numero [i] = Integer.parseInt(s.nextLine());
    }
    
    System.out.println();
    System.out.println("Array original:\n");
    
    System.out.print("Índice              ");
    //se pinta el indice
    for (int i = 0; i < 15; i++) {
      System.out.printf("[ %3d ]", i);
    }
    System.out.println();
    System.out.print("Números introducidos");
    //se pintan los 15 numeros
    for (int i = 0; i < 15; i++) {
      System.out.printf("[ %3d ]", numero [i]);
    }
    
    System.out.println();
    System.out.println();
    //comienzo array rotado
    System.out.println("Array rotado:\n");
    //se guarda el ultimo valor en la variable aux
    aux = numero [14];
    //se va rotando el valor desde las ultimas posiciones a las primeras
    for (int i = 14; i > 0; i--) {
      numero [i] = numero [i - 1];
    }
    //se mete el valor guardado en aux en la posicion 0 del array
    numero [0] = aux;
    
    System.out.print("Índice              ");
    //se pinta el indice
    for (int i = 0; i < 15; i++) {
      System.out.printf("[ %3d ]", i);
    }
    
    System.out.println();
    System.out.print("Números introducidos");
    //se pintan los 15 numeros
    for (int i = 0; i < 15; i++) {
      System.out.printf("[ %3d ]", numero [i]);
    }
    System.out.println();
  }
}
