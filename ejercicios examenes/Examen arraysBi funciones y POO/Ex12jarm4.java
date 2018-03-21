/**
 * Examen  2º Trimestre DAM
 * José Antonio Ruiz Mostazo
 * 19/02/18
 * 
 * Ejercicio 4
 * 
 * Implementa una función con nombre corteza que sea capaz de extraer la capa exterior de un array
 * bidimensional. Esta capa se extrae en forma de array de una dimensión. La extracción de números
 * comienza en la esquina superior izquierda y continúa en el sentido de las agujas del reloj. Se debe
 * entregar tanto el código de la función como el código de prueba que la usa. La cabecera de la función
 * es la siguiente:
 * public static int[] corteza(int[][] n)
 * 
 * @author José Ruiz
 * 
 */

package ex12jarm;

public class Ex12jarm4 {

  public static void main(String[] args) {
  
    
  int [][] a = {{45, 92, 14, 20, 25, 78}, {35, 72, 24, 45, 42, 60}, {32, 42, 64, 23, 41, 39},
                  {98, 45, 94, 11, 18, 48}};
    
    int b [] = ex12jarm.funciones.Corteza.corteza(a);
    
    
    System.out.println("El array original: ");
    System.out.println();
    ex12jarm.funciones.Corteza.muestraArrayBi(a);
    System.out.println();
    System.out.println("El array unidimensional generado por corteza(a): ");
    System.out.println();
    ex12jarm.funciones.Corteza.muestraArray(b);
  }
}
