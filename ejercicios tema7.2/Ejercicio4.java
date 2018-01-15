/**
 * Tema 7.2, ejercicio 4
 * 
 * Modifica el programa anterior de tal forma que las sumas parciales y la suma
 * total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
 * que el ordenador se queda “pensando” antes de mostrar los números.
 * 
 * @author José Ruiz
 * 
 */


import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) 
    throws InterruptedException {
    
    Scanner s = new Scanner(System.in);
    
      System.out.print("A continuación se mostrará el contenido de los elementos de un array bidimensional\n");
      System.out.println("en forma de tabla y las sumas de sus filas, columnas y total.\n");

      int[][] num = new int[4][5]; //se declara el array

      int fila;
      int columna;

      //Se generan 20 números aleatorios de entre 100 y 999 en un array de 4 filas y 5 columnas

      for (fila = 0; fila < 4; fila++) {
        for (columna = 0; columna < 5; columna++) {
          num [fila][columna] = (int)(Math.random() * 900 + 100);
        }
      }
      System.out.println();

      int sumaFila;
      int sumaColumna = 0;
      int sumaTotal = 0;

      //se pintan los valores previos introducidos, se suma cada fila y se muestra el total de cada fila.
      for(fila = 0; fila < 4; fila++) {
        sumaFila = 0;
        for(columna = 0; columna < 5; columna++) {
          sumaFila += num[fila][columna];
          Thread.sleep(300);
          System.out.printf("%7d ", num[fila][columna]);
        }
        Thread.sleep(2000);
        System.out.printf("|%7d ", sumaFila);
        System.out.println();
      }
      System.out.println("    ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
      //se suman los valores de cada columna y se muestra su total, finalmente se muestra el total de todo el array.
      for(columna = 0; columna < 5; columna++) {
        sumaColumna = 0;
        for(fila = 0; fila < 4; fila++) {
          sumaColumna += num[fila][columna];
          sumaTotal += num[fila][columna];
        }
        Thread.sleep(2000);
        System.out.printf("%7d ", sumaColumna);
      }
      Thread.sleep(3000);
      System.out.printf("|%7d ", sumaTotal);
    }
}
