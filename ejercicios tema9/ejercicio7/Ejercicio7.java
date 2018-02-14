/*
 * Tema 9, Ejercicio 6
 * 
 * Queremos gestionar la venta de entradas (no numeradas) de Expocoches
 * Campanillas que tiene 3 zonas, la sala principal con 1000 entradas disponibles,
 * la zona de compra-venta con 200 entradas disponibles y la zona vip
 * con 25 entradas disponibles. Hay que controlar que existen entradas antes de
 * venderlas.
 * El menú del programa debe ser el que se muestra a continuación. Cuando
 * elegimos la opción 2, se nos debe preguntar para qué zona queremos las
 * entradas y cuántas queremos. Lógicamente, el programa debe controlar que
 * no se puedan vender más entradas de la cuenta.
 * 1. Mostrar número de entradas libres
 * 2. Vender entradas
 * 3. Salir
 * 
 * @author José Ruiz
 */
package ejercicios.tema9.ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    Zona salaPrincipal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);

    int opcion = 0;
    while (opcion != 3) {
      System.out.println();
      System.out.println("1 - Mostrar número de entradas libres");
      System.out.println("2 - Vender entradas");
      System.out.println("3 - Salir");
      System.out.print("Elija una opcion (1 - 3): ");
      System.out.println();

      opcion = Integer.parseInt(s.nextLine());

      switch (opcion) {
        case 1:
          System.out.println("Las entradas que quedan en cada zona son: ");
          System.out.println("Zona sala principal: " + salaPrincipal.getEntradasPorVender());
          System.out.println("Zona compra-venta: " + compraVenta.getEntradasPorVender());
          System.out.println("Zona sala VIP: " + vip.getEntradasPorVender());
          break;
        case 2:
          int sala = 0;
          System.out.println("¿Para qué zona quieres las entradas?");
          System.out.println();
          System.out.println("1 - Sala principal");
          System.out.println("2 - Sala compra-venta");
          System.out.println("3 - Sala VIP");
          System.out.print("Elija una opcion (1 - 3): ");
          System.out.println();
          sala = Integer.parseInt(s.nextLine());
          int entradas = 0;
          switch (sala) {
            case 1:
              System.out.println("¿Cuántas entradas quiere?");
              entradas = Integer.parseInt(s.nextLine());
                salaPrincipal.vender(entradas);
              break;
            case 2:
              System.out.println("¿Cuántas entradas quiere?");
              entradas = Integer.parseInt(s.nextLine());
                compraVenta.vender(entradas);
              break;
            case 3:
              System.out.println("¿Cuántas entradas quiere?");
              entradas = Integer.parseInt(s.nextLine());
                vip.vender(entradas);
            default:
              if ((opcion < 0) && (opcion > 3)) {
                System.out.println("Lo siento, debe elegir una opción válida.");
              }
              System.out.println();
          }
          break;
        case 3:
          opcion = 3;
        default:
          if ((opcion < 0) && (opcion > 3)) {
            System.out.println("Lo siento, debe elegir una opción válida.");
          }
          System.out.println();
      }
    }
  }
}
