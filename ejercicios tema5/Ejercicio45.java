/**
 * Tema 5, ejercicio 45
 * 
 * Escribe un programa que cambie un dígito dentro de un número dando la
 * posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
 * empezando por el 1. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos. Suponemos que el usuario introduce
 * correctamente los datos.
 * 
 * Ejemplo:
 * Por favor, introduzca un número entero positivo: 406783
 * Introduzca la posición dentro del número: 3
 * Introduzca el nuevo dígito: 1
 * El número resultante es 401783
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio45 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("A continuación se cambiará un dígito por otro en la posición deseada de un número introducido.\n");
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());

    System.out.print("Introduzca la posición dentro del número: ");
    long posicion = Long.parseLong(s.nextLine());

    System.out.print("Introduzca el nuevo dígito: ");
    long digito = Long.parseLong(s.nextLine());

    long numero = numeroIntroducido;

    // calcula la longitud del número
    int longitud = 0;
    
    do {
      numero /= 10;
      longitud++;
    } while (numero > 0);
    
    // parte izquierda con el dígito nuevo
    long parteIzquierda = numeroIntroducido / (long)(Math.pow(10, longitud - posicion + 1));
    parteIzquierda = parteIzquierda * 10 + digito;
    
    // parte derecha
    long parteDerecha = numeroIntroducido % (long)(Math.pow(10, longitud - posicion));

    // resultado
    numero = parteIzquierda * (long)(Math.pow(10, longitud - posicion)) + parteDerecha;
    System.out.print("El número resultante es " + numero);
  }
}
