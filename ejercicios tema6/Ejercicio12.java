/**
 * Tema 6, ejercicio 12
 * 
 * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
 * con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
 * convertir un entero en un carácter.
 * 
 * @author José Ruiz
 */

public class Ejercicio12 {
  public static void main(String[] args) {
    
    System.out.println("A continuación se llenará la pantalla de caracteres aleatorios a lo matrix\n");
    
    int linea = 0;
   
    for (int i = 1; i > 0; i++) {
      System.out.print("\033[32m");
      int numeros = ((int)(Math.random() * 95 ) + 32);
      System.out.print((char)numeros);

      if (linea++ == 142) {
        linea = 0;
        System.out.println();
      }
    }  
  }
}
