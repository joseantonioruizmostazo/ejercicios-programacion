/**
 * Tema 7.2, ejercicio 1
 * 
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num
 * y asigna los valores según la siguiente tabla. Muestra el contenido de todos
 * los elementos del array dispuestos en forma de tabla como se muestra en la
 * figura.
 * 
 * @author José Ruiz
 * 
 */

public class Ejercicio1 {
  public static void main(String[] args) {
    
    System.out.print("A continuación se mostrará el contenido de los elementos de un array bidimensional\n");
    System.out.println("en forma de tabla.\n");
    
    int[][] num = new int[3][6];
    
    num[0][0] = 0;
    num[0][1] = 30;
    num[0][2] = 2;
    num[0][5] = 5;
    num[1][0] = 75;
    num[1][4] = 0;
    num[2][2] = -2;
    num[2][3] = 9;
    num[2][5] = 11;
    
    int fila;
    int columna;
    
    System.out.print("           ");

    for(columna = 0; columna < 6; columna++) {

      System.out.print("  Columna " + columna + " ");
    }
    System.out.println();

    for(fila = 0; fila < 3; fila++) {

      System.out.print("\nFila: " + fila);

      for(columna = 0; columna < 6; columna++) {
        System.out.printf("%11d ", num[fila][columna]);
      }
    }
  }
}
