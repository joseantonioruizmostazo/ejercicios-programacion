/*
 * Tema 8, ejercicio 36
 * 
 * Crea la función de manejo de arrays que tenga la siguiente cabecera y que
 * haga lo que se especifica en los comentarios (puedes incluirla en tu propia
 * biblioteca de rutinas):
 * 
 * public static int[] filtraPrimos(int x[]) // Devuelve un array con todos los
 *                                           // números primos que se encuentren
 *                                           // en otro array que se pasa como
 *                                           // parámetro.
 *                                           // Obviamente el tamaño del array
 *                                           // que se devuelve será menor o
 *                                           // igual al que se pasa como
 *                                           // parámetro.
 * 
 * Utiliza esta función en un programa para comprobar que funcionan bien. Para
 * que el ejercicio resulte más fácil, las repeticiones de primos se conservan; es
 * decir, si en el array x el número 13 se repite 3 veces, en el array devuelto
 * también estará repetido 3 veces. Si no existe ningún número primo en x, se
 * devuelve un array con el número -1 como único elemento.
 * 
 * @author José Ruiz
 */

package ejercicios.tema8;
import java.util.Scanner;
import ejercicios.tema8.matematicas.Varios;
import ejercicios.tema8.arrays.ArraysUniDim;

public class Ejercicio36 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce el valor mínimo del array: ");
    int minimo = s.nextInt();
    System.out.print("Introduce el valor máximo del array: ");
    int maximo = s.nextInt();
    System.out.print("Introduce el tamaño del array: ");
    int tamanyo = s.nextInt();
    int [] array = ArraysUniDim.generaArrayInt(tamanyo, minimo, maximo);
    System.out.println("El array original es: ");
    ArraysUniDim.mostrarArrayInt(array);
    System.out.println();
    System.out.println("Su array con números primos es: ");
    ArraysUniDim.mostrarArrayInt(ArraysUniDim.filtraPrimos(array));
    System.out.println();
  }
}