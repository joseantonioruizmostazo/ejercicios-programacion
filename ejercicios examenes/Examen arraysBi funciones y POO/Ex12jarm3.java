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

public class Ex12jarm3 {

  public static void main(String[] args) {
    
    String [] array = {"casa", "coche", "sol", "mesa", "mesa", "coche", "ordenador", "sol", "CASA"};
    
    String [] a = {"casa", "coche", "sol", "mesa", "mesa", "coche", "ordenador", "sol", "CASA"};
    
    ex12jarm.funciones.Cadena.muestraArraySt(a);
    
    System.out.println();
    
    String [] b = ex12jarm.funciones.Cadena.sinRepetir(a);
    
    ex12jarm.funciones.Cadena.muestraArraySt(b);
    
    
  }
}
