/**
 * Tema 5, ejercicio 10
 * 
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    double numeroIntroducido = 0;
    double suma = 0;
    double totalNumeros = 0;
    
    System.out.print("Por favor, introduzca todos los números positivos que desee y se calculará\nsu media, ");
    System.out.println("cuando introduzca un número negativo se dará por finalizada\nla petición de números.\n");
    
    while (numeroIntroducido >= 0) {
      numeroIntroducido = Double.parseDouble(System.console().readLine());
      totalNumeros++;
      suma += numeroIntroducido;
    }
    
    System.out.println("La media de los números positivos introducidos es " + (suma - numeroIntroducido)/ (totalNumeros - 1));

  }
}
