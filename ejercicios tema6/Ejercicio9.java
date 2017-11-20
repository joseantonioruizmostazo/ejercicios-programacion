/**
 * Tema 6, ejercicio 9
 * 
 * Realiza un programa que vaya generando números aleatorios pares entre 0
 * y 100 y que no termine de generar números hasta que no saque el 24. El
 * programa deberá decir al final cuántos números se han generado.
 * 
 * @author José Ruiz
 */

public class Ejercicio9 {
  public static void main(String[] args) {
    
    System.out.print("A continuación se mostrarán números enteros aleatorios pares entre 0 y 100.\n");
    System.out.println("Cuando el programa saque el 24 terminará de generar números y ");
    System.out.println("se dirán cuántos números se han generado.");
    
    //La cantidad empieza en 0 por si el 24 aparece el primero.
    int cantidad = 0;
    
    //Se crea un bucle infinito.
    for (int i = 1; i > 0 ; i++) {
      
      //Se generan números al azar entre 0 y 100 ambos incluídos de manera infinita por el bucle anterior.
      int numero = ((int)(Math.random() * 101) + 0);
      
      //Si el módulo 2 de ese número (es decir que sea par) y además sea distintio de 24, lo imprimimos y aumentamos en 1 la cantidad.
      if ((numero % 2 == 0) && (numero != 24)) {
       
        System.out.println("Número " + (cantidad + 1) + ": " + numero);
        cantidad++;
      }
      
      //Si el número es igual a 24, i tomará un valor por debajo de 0 y finalizara el bucle for
      if (numero == 24) {
        i = -1;
      }
    }
    System.out.println();
    System.out.println("Se ha/n generado " + (cantidad) + " número/s");
  }
}
