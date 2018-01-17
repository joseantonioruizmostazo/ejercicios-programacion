/**
 * Examen recuperación DAM 1ª y 2ª parte
 * 
 * Ejercicio 2
 * 
 * Realiza un programa, que dado un número entero, nos diga cuál es el dígito más alto y cuántas veces
 * aparece en el número.
 * 
 * @author José Ruiz
 * 
 */

package examen.recuperacion;
import java.util.Scanner;

public class ex12jarm2 {

    public static void main(String[] args) {
    
Scanner s = new Scanner(System.in);
    
    System.out.println("Por favor introduzca un número entero y se mostrará cuál es su dígito más alto y cuantas veces aparece: \n");
    
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    int numero = numeroIntroducido;
    int digito = -1;
    int veces = 0;
    
    while (numero > 0) {
    int modulo = numero % 10;
      if (modulo > digito) {
        digito = modulo;
      }
      numero /= 10;
    }
    
    int num = numeroIntroducido;
    
    while (num > 0) {
    int modulo = num % 10;
      if (modulo == digito) {
        veces++;
      }
      num /= 10;
    }
    System.out.print("El digito mas alto del numero introducido " + numeroIntroducido + " es: " + digito);
    System.out.print(" y aparece " + veces + " veces.");
  }
}