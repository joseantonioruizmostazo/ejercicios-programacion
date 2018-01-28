/*
 * Ejercicios 20-28
 * 
 * Crea una biblioteca de funciones para arrays (de una dimensión) de números
 * enteros que contenga las siguientes funciones:
 * 20. generaArrayInt: Genera un array de tamaño n con números aleatorios
 * cuyo intervalo (mínimo y máximo) se indica como parámetro.
 * 21. minimoArrayInt: Devuelve el mínimo del array que se pasa como
 * parámetro.
 * 22. maximoArrayInt: Devuelve el máximo del array que se pasa como
 * parámetro.
 * 23. mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
 * 24. estaEnArrayInt: Dice si un número está o no dentro de un array.
 * 25. posicionEnArray: Busca un número en un array y devuelve la posición
 * (el índice) en la que se encuentra.
 * 26. volteaArrayInt: Le da la vuelta a un array.
 * 27. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de
 * un array.
 * 28. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de
 * un array.
 * 
 */

package ejercicios.tema8;
import java.util.Scanner;
import ejercicios.tema8.arrays.ArraysUniDim;

public class Ejercicios20a28 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    //20. generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo) se indica
    //como parámetro.
    System.out.print("Introduce el tamaño del array: ");
    int numero = Integer.parseInt(s.nextLine());
    System.out.print("Introduce el parámetro mínimo del array: ");
    int min = Integer.parseInt(s.nextLine());
    System.out.println();
    System.out.print("Introduce el parámetro máximo del array: ");
    int max = Integer.parseInt(s.nextLine());
    System.out.println();
    int [] x;
    System.out.println("El array generado es: \n");
    x = ArraysUniDim.generaArrayInt(numero, min, max);
    ArraysUniDim.mostrarArrayInt(x);
    System.out.println();
    System.out.println();
    
    //21. minimoArrayInt: Devuelve el valor mínimo del array que se pasa como parámetro.
    System.out.print("El valor mínimo del array es: ");
    System.out.println("[" + ArraysUniDim.minimoArrayInt(x) + "]");
    
    //22. minimoArrayInt: Devuelve el valor máximo del array que se pasa como parámetro.
    System.out.print("El valor máximo del array es: ");
    System.out.println("[" + ArraysUniDim.maximoArrayInt(x) + "]");
    
    //23. mediaArrayInt: Devuelve la media del array que se pasa como parámetro..
    System.out.printf("La media del array es: [%.2f]", ArraysUniDim.mediaArrayInt(x));
    System.out.println();
    
    //24. estaEnArrayInt: Dice si un número está o no dentro de un array. 
    System.out.print("Introduce el número que desea comprobar si está o no en el array: ");
    int num = Integer.parseInt(s.nextLine());
    System.out.println("¿Se encuentra el número en el array? " + ArraysUniDim.estaEnArrayInt(x,num));
    
    //25. posicionEnArray: Busca un número en un array y devuelve la posición (el índice) en la que se encuentra.
    System.out.print("Introduce el número del que desea conocer su posición, si el número introducido no se encuentra\n");
    System.out.print(" en el array se devolverá el valor -1: ");
    int n = Integer.parseInt(s.nextLine());
    System.out.println("El número se encuentra en la posición: " + ArraysUniDim.posicionEnArray(x, n));
    
    //26. volteaArrayInt: Le da la vuelta a un array.
    System.out.print("El array volteado es: ");
    ArraysUniDim.volteaArrayInt(x);
    System.out.println();
    
    //27. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array.
    System.out.print("Introduce el número de posiciones que desea que el array rote hacia la derecha: ");
    int rotaDerecha = Integer.parseInt(s.nextLine());
    System.out.println();
    System.out.println("El nuevo array rotado a la derecha es: ");
    int [] rotado;
    rotado = ArraysUniDim.rotaDerechaArrayInt(x, rotaDerecha);
    for (int i = 0; i < rotado.length - 1; ++i) {
      System.out.print("[" + rotado[i] + "]");
    }
    System.out.println();
    
    //28. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de un array.
    System.out.print("Introduce el número de posiciones que desea que el array rote hacia la izquierda: ");
    int rotaIzquierda = Integer.parseInt(s.nextLine());
    System.out.println();
    System.out.println("El nuevo array rotado a la izquierda es: ");
    rotado = ArraysUniDim.rotaIzquierdaArrayInt(x, rotaIzquierda);
    for (int i = 0; i < rotado.length - 1; ++i) {
      System.out.print("[" + rotado[i] + "]");
    }
    System.out.println();
  } 
}
