/*
 * Tema 8, ejercicio 18
 * 
 * Escribe un programa que pase de decimal a binario.
 * 
 * @author José Ruiz
 */

package ejercicios.tema8;
import java.util.Scanner;
import ejercicios.tema8.matematicas.Varios;

public class Ejercicio18 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("Por favor introduzca un número para pasar de decimal a binario: \n");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    
    System.out.println("El número introducido (en formato decimal) es: " + numeroIntroducido + " y convertido a binario es: " + Varios.dec2Bin(numeroIntroducido));
  }
}