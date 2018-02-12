/*
 * Tema 9, Ejercicio 2
 * 
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
 * la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
 * kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
 * también algún método específico para cada una de las subclases. Prueba las
 * clases creadas mediante un programa con un menú como el que se muestra
 * a continuación:
 * VEHÍCULOS
 * =========
 * 1. Anda con la bicicleta
 * 2. Haz el caballito con la bicicleta
 * 3. Anda con el coche
 * 4. Quema rueda con el coche
 * 5. Ver kilometraje de la bicicleta
 * 6. Ver kilometraje del coche
 * 7. Ver kilometraje total
 * 8. Salir
 * Elige una opción (1-8):
 * 
 * @author José Ruiz
 */
package ejercicios.tema9.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    Bicicleta bicicleta1 = new Bicicleta();
    Coche coche1 = new Coche();
    int opcion = 0;
    while (opcion != 9) {
      System.out.println();
      System.out.println("VEHÍCULOS");
      System.out.println("=========");
      System.out.println("1 - Anda con la bicicleta");
      System.out.println("2 - Haz el caballito con la bicicleta");
      System.out.println("3 - Anda con el coche");
      System.out.println("4 - Quema rueda con el coche");
      System.out.println("5 - Ver kilometraje de la bicicleta");
      System.out.println("6 - Ver kilometraje del coche");
      System.out.println("7 - Ver kilometraje total");
      System.out.println("8 - Ver vehículos totales creados");
      System.out.println("9 - Salir");
      System.out.print("Elija una opcion (1 - 9): ");
      System.out.println();
      
      opcion = Integer.parseInt(s.nextLine());

      switch (opcion) {
        case 1:
          System.out.println("Introduzca los kilometros que desee recorrer: ");
          bicicleta1.anda(Integer.parseInt(s.nextLine()));
          break;
        case 2:
          System.out.println("La bicicleta hará el caballito: ");
          bicicleta1.haceCaballito();
          break;
        case 3:
          System.out.println("Introduzca los kilometros que desee recorrer: ");
          coche1.anda(Integer.parseInt(s.nextLine()));;
          break;
        case 4:
          System.out.println("El coche quemará rueda: ");
          coche1.quemaRueda();
          break;
        case 5:
          System.out.println("El kilometraje de la bicicleta es: " + bicicleta1.getKilometrosRecorridos() + " km");
          break;
        case 6:
          System.out.println("El kilometraje del coche es: " + coche1.getKilometrosRecorridos() + " km");
          break;
        case 7:
          System.out.println("El kilometraje total es: " + Vehiculo.getKilometrosTotales() + " km");
          break;
        case 8:
          System.out.println("Se han creado en total " + Vehiculo.getVehiculosCreados() + " vehículos");
          break;
        case 9:
          opcion = 9;
        default:
          if ((opcion < 0) && (opcion > 9)) {
            System.out.println("Lo siento, debe elegir una opción válida.");
          }
        System.out.println();
      }
    }
  }
}
