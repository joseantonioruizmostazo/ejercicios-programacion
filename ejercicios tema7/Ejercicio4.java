/**
 * Tema 7, ejercicio 4
 * 
 * Define tres arrays de 20 números enteros cada una, con nombres numero,
 * cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el
 * array cuadrado se deben almacenar los cuadrados de los valores que hay en el
 * array numero. En el array cubo se deben almacenar los cubos de los valores que
 * hay en numero. A continuación, muestra el contenido de los tres arrays dispuesto
 * en tres columnas.
 * 
 * @author José Ruiz
 * 
 */


public class Ejercicio4 {
  public static void main(String[] args) {
    
    System.out.println("A continuación se mostrarán 20 números junto con sus cuadrados y sus cubos\n");
    
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    
    //Se recogen 20 números aleatorios comprendidos entre el 0 y el 100
    for (int i = 0; i <= 19; i++) {
      numero [i] = (int)(Math.random() * 101);
    }
    
    //Se realizan los cuadrados multiplicando por si mismo una vez el array numero.
    for (int i = 0; i <= 19; i++) {
      cuadrado [i] = (numero [i] * numero [i]);
    }
    
    //Se realizan los cubos multiplicando por si mismo dos veces el array numero.
    for (int i = 0; i <= 19; i++) {
      cubo [i] = (cuadrado [i] * numero [i]);
    }
    System.out.println(" | Normal| Cuadrado |   Cubo  |");
    //Muestra el resultado en tres columnas de los números, sus cuadrados y sus cubos.
    for (int i = 0; i <= 19; i++) {
      System.out.printf(" |" + "%6s" + " | " + "%8s" + " | " + "%7s" + " | \n", numero[i], cuadrado [i], cubo [i]);
    }
  }
}
