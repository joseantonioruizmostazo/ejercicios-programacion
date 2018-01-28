/*
 * Ejercicios 29-34
 * 
 * Crea una biblioteca de funciones para arrays bidimensionales (de dos dimensiones)
 * de números enteros que contenga las siguientes funciones:
 * 29. generaArrayBiInt: Genera un array de tamaño n x m con números
 * aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
 * 30. filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa como
 * parámetro.
 * 31. columnaDeArrayBiInt: Devuelve la columna j-ésima del array que se
 * pasa como parámetro.
 * 32. coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array
 * con dos elementos) de la primera ocurrencia de un número dentro de un
 * array bidimensional. Si el número no se encuentra en el array, la función
 * devuelve el array {-1, -1}.
 * 33. esPuntoDeSilla: Dice si un número es o no punto de silla, es decir,
 * mínimo en su fila y máximo en su columna.
 * 34. diagonal: Devuelve un array que contiene una de las diagonales del
 * array bidimensional que se pasa como parámetro. Se pasan como
 * parámetros fila, columna y dirección. La fila y la columna determinan
 * el número que marcará las dos posibles diagonales dentro del array. La
 * dirección es una cadena de caracteres que puede ser “nose” o “neso”. La
 * cadena “nose” indica que se elige la diagonal que va del noroeste hacia
 * el sureste, mientras que la cadena “neso” indica que se elige la diagonal
 * que va del noreste hacia el suroeste.
 * 
 */

package ejercicios.tema8;
import java.util.Scanner;
import ejercicios.tema8.arrays.ArraysBiDim;
import ejercicios.tema8.arrays.ArraysUniDim;

public class Ejercicios29a34 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    //29. generaArrayBiInt: Genera un array de tamaño n x m con números aleatorios cuyo intervalo (mínimo y máximo)
    //se indica como parámetro.
    System.out.print("Introduce las filas del array: ");
    int filas = Integer.parseInt(s.nextLine());
    System.out.print("Introduce las columnas del array: ");
    int columnas = Integer.parseInt(s.nextLine());
    System.out.print("Introduce el valor mínimo del intervalo: ");
    int min = Integer.parseInt(s.nextLine());
    System.out.print("Introduce el valor máximo del intervalo: ");
    int max = Integer.parseInt(s.nextLine());
    System.out.println("El array bidimensional con los parámtros elegidos es: \n");
    int [][] x = ArraysBiDim.generaArrayBiInt(filas, columnas, min, max);
    ArraysBiDim.mostrarArrayBiInt(x);
    
    //30. filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa como parámetro.
    System.out.print("Introduce la fila que desea mostrar del array: ");
    int fila = Integer.parseInt(s.nextLine());
    int [] array = ArraysBiDim.filaDeArrayBiInt(x, fila);
    ArraysUniDim.mostrarArrayInt(array);
    System.out.println();
    
    //31. columnaDeArrayBiInt: Devuelve la columna j-ésima del array que se pasa como parámetro.
    System.out.print("Introduce la columna que desea mostrar del array: ");
    int columna = Integer.parseInt(s.nextLine());
    array = ArraysBiDim.columnaDeArrayBiInt(x, columna);
    ArraysUniDim.mostrarArrayInt(array);
    System.out.println();
    
    //32. coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array con dos elementos) de la primera 
    //ocurrencia de un número dentro de un array bidimensional. Si el número no se encuentra en el array, la función
    //devuelve el array {-1, -1}.
    System.out.print("Introduce el número del que se desea mostrar la fila y la columna de su primera ocurrencia: ");
    int numero = Integer.parseInt(s.nextLine());
    System.out.println();
    array = ArraysBiDim.coordenadasEnArrayBiInt(x, numero); 
    System.out.println("Las coordenadas de la primera ocurrencia del número Introducido son: ");
    ArraysUniDim.mostrarArrayInt(array);
    System.out.println();
    
    //33. esPuntoDeSilla: Dice si un número es o no punto de silla, es decir, mínimo en su fila y máximo en su columna.
    System.out.println("¿Es punto de silla el número Introducido?: " + ArraysBiDim.esPuntoDeSilla(x, numero));
    
    //34. diagonal: Devuelve un array que contiene una de las diagonales del array bidimensional que se
    //pasa como parámetro. Se pasan como parámetros fila, columna y dirección. La fila y la columna determinan
    //el número que marcará las dos posibles diagonales dentro del array. La dirección es una cadena de
    //caracteres que puede ser “nose” o “neso”. La cadena “nose” indica que se elige la diagonal que va del noroeste hacia
    //el sureste, mientras que la cadena “neso” indica que se elige la diagonal que va del noreste hacia el suroeste.
    System.out.print("Introduce la fila que determine el número que marcará la diagonal: ");
    fila = s.nextInt();
    System.out.print("Introduce la columna que determine el número que marcará la diagonal: ");
    columna = s.nextInt();
    System.out.print("Introduce la dirección de la diagonal: 'nose' o 'neso'");
    String direccion = s.next();
    System.out.print("La diagonal extraída es: ");
    array = ArraysBiDim.diagonal(x, fila, columna, direccion);
    ArraysUniDim.mostrarArrayInt(array);
    System.out.println();
  } 
}
