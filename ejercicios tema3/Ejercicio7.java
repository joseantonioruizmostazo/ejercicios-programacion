/**
* Tema 3, ejercicio 7
*
* @author José Ruiz
*/

import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
  
    System.out.print("Por favor, introduzca la base imponible de la factura para calcular el total: ");
    double baseImponible = Double.parseDouble(s.nextLine());
    System.out.printf("Base imponible %9.2f\n", baseImponible);
    System.out.printf("IVA            %9.2f\n", (baseImponible * 0.21));
    System.out.println("--------------------------");
    System.out.printf("Total          %9.2f\n", (baseImponible * 1.21));
  }
}
