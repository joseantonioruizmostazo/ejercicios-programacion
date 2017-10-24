/**
 * Tema 5, ejercicio 21
 * 
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el cómputo.
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio21 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int numeroIntroducido = 0;
    int totalNumeros = 0;
    int sumaTotal = 0;
    int maximoPares = 0;
    int cantidadImpares = 0;
    int cantidadPares = 0;
    int sumaImpares = 0;
    
    System.out.print("Por favor, introduzca todos los números positivos que desee y se mostrará el número total de números introducidos\nla media de los números ");
    System.out.println("impares y se dirá cual es el número mayor de los pares.\n");
    System.out.println("cuando introduzca un número negativo se dará por finalizada\nla petición de números.\n");
    
    while (numeroIntroducido >= 0) {
      numeroIntroducido = Integer.parseInt(s.nextLine());
      totalNumeros++;
        
        if (numeroIntroducido % 2 != 0) {
        sumaImpares += numeroIntroducido;
        cantidadImpares++;
        } else {
        cantidadPares++;
        }
        
        if ((numeroIntroducido % 2 == 0) && (numeroIntroducido > maximoPares)) {
        maximoPares = numeroIntroducido;
        }
      
    }
    System.out.println("Ha introducido un total de " + (totalNumeros -1) + " números.");
    System.out.println("La media de los números impares introducidos es " + (sumaImpares / cantidadImpares));
    System.out.println("El mayor número par introducido ha sido el " + maximoPares);

  }
}
