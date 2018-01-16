/*
 * Tema 8, ejercicio 17
 * 
 * Escribe un programa que pase de binario a decimal.
 * 
 * @author José Ruiz
 */

package ejercicios.tema8;
import java.util.Scanner;
import ejercicios.tema8.matematicas.Varios;

public class Ejercicio17 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("Por favor introduzca un número para pasar de binario a decimal: \n");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    
    System.out.println("El número introducido (en formato binario) es: " + numeroIntroducido + " y convertido a decimal es: " + Varios.bin2Dec(numeroIntroducido));
  }
}