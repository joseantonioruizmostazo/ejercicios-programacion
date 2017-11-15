/**
 * Tema 6, ejercicio 5
 * 
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media
 * de esos números.
 * 
 * @author José Ruiz
 */

public class Ejercicio5 {
  public static void main(String[] args) {
    
    int numeros;
    int numeroMayor = 0;
    int numeroMenor = 199;
    int suma = 0;
    int media;
    System.out.println("A continuación se mostrarán 50 números enteros aleatorios entre 100 y 199\n(ambos incluidos)\n");
    
    //Muestra 50 numeros enteros aleatorios entre 100 y 199 (ambos incluídos)
    for (int i = 1; i <= 50; i++) {
      numeros = ((int)(Math.random() * 100) + 100);
      System.out.print(numeros + " ");
      
      //Suma todos los números
      suma += numeros;
      
      //Cálculo del número mayor
      if (numeros > numeroMayor) {
        numeroMayor = numeros;
      }
      
      //Cálculo del número menor  
      if (numeros < numeroMenor) {
        numeroMenor = numeros;
      }
    }
    
    System.out.println("\n");
    media = suma / 50;
    System.out.println("La suma de todos los números es " + suma + " y su media es " + media + "\n");
    System.out.println("El mayor número es " + numeroMayor + "\n");
    System.out.println("El menor número es " + numeroMenor);
  }
}
