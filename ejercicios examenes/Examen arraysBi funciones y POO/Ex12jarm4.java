/**
 * Examen  2º Trimestre DAM
 * José Antonio Ruiz Mostazo
 * 19/02/18
 * 
 * Ejercicio 3
 * 
 * Realiza una función que tome como parámetro un array de cadenas de caracteres y que devuelva otro
 * array con los mismos valores habiendo eliminado las posibles repeticiones. Se distinguen mayúsculas
 * de minúsculas, por tanto "hola" es distinto de "Hola". Por ejemplo, si el array a contiene los valores
 * {"casa", "coche", "sol", "mesa", "mesa", "coche", "ordenador", "sol", "CASA"}, la sentencia
 * sinRepetir(a) devolvería el array {"casa", "coche", "sol", "mesa", "ordenador", "CASA"}. Se
 * debe entregar tanto el código de la función como el código de prueba que la usa. La cabecera de la
 * función es la siguiente:
 * public static String[] sinRepetir(String[] s)
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
