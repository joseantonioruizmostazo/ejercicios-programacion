/**
 * Tema 6, ejercicio 19
 * 
 * Escribe un programa que muestre 50 números enteros aleatorios comprendidos
 * entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
 * luego el máximo de los pares el mínimo de los impares y la media de todos los
 * números generados.
 * 
 * @author José Ruiz
 */
package ejercicios.tema6;

public class Ejercicio19 {
  public static void main(String[] args) {
    
    int numeros;
    int numeroParMayor = -100;
    int numeroImparMenor = 200;
    int suma = 0;
    int media;
    System.out.println("A continuación se mostrarán 50 números enteros aleatorios entre -100 y 200\n(ambos incluidos)\n");
    
    //Muestra 50 numeros enteros aleatorios entre -100 y 200 (ambos incluídos)
    for (int i = 1; i <= 50; i++) {
      numeros = ((int)(Math.random() * 301) -100);
      System.out.print(numeros + " ");
      
      //Suma todos los números
      suma += numeros;
      
      //Cálculo del número par mayor e impar menor
      if (numeros % 2 == 0) {
        if (numeros > numeroParMayor) {
        numeroParMayor = numeros;
        }
      } else {
        if (numeros < numeroImparMenor) {
        numeroImparMenor = numeros;
        }
      }
    }
    
    System.out.println("\n");
    media = suma / 50;
    System.out.println("La suma de todos los números es " + suma + " y su media es " + media + "\n");
    System.out.println("El número par mayor es " + numeroParMayor + "\n");
    System.out.println("El número impar menor es " + numeroImparMenor);
  }
}