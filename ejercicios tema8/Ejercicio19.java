/*
 * Tema 8, ejercicio 19
 * 
 * Une y amplía los dos programas anteriores de tal forma que se permita
 * convertir un número entre cualquiera de las siguientes bases: decimal, binario,
 * hexadecimal y octal.
 * 
 * @author José Ruiz
 */

package ejercicios.tema8;
import java.util.Scanner;
import ejercicios.tema8.matematicas.Varios;

public class Ejercicio19 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    String resultado = "";
    
    System.out.println("Introduce la base inicial del número: ");
    System.out.println("1.- Decimal.");
    System.out.println("2.- Binario.");
    System.out.println("3.- Hexadecimal.");
    System.out.println("4.- Octal.");
    int tipoOrigen = Integer.parseInt(s.nextLine());
    System.out.println("Ahora escriba el tipo de base a la que quiere cambiar: ");
    System.out.println("1.- Decimal.");
    System.out.println("2.- Binario.");
    System.out.println("3.- Hexadecimal.");
    System.out.println("4.- Octal.");
    int tipoFinal = Integer.parseInt(s.nextLine());
    
    if (tipoOrigen == 1) {
      System.out.print("Introduce el número en base decimal(0-9): ");
      long numeroUno = Long.parseLong(s.nextLine());
      switch (tipoFinal) {
        case 1:
          System.out.println("Su número ya está en decimal.");
          break;
        case 2:
          System.out.println("Su número en binario es: " + Varios.dec2Bin(numeroUno));
          break;
        case 3:
          numeroUno = Varios.dec2Bin(numeroUno);
          System.out.println("Su número en hexadecimal es: " + Varios.bin2Hex(numeroUno));
          break;
        case 4:
          numeroUno = Varios.dec2Bin(numeroUno);
          System.out.println("Su número en octal es: " + Varios.bin2Oct(numeroUno));
          break;
        default:
          System.out.println("Dato incorrecto.");
          break;
      }
    }
    
    if (tipoOrigen == 2) {
      System.out.print("Introduce el número en base binaria(0-1): ");
      long numeroDos = Long.parseLong(s.nextLine());
      switch (tipoFinal) {
        case 1:
          System.out.println("Su número en decimal es: " + Varios.bin2Dec(numeroDos));
          break;
        case 2:
          System.out.println("Su número ya está en binario.");
          break;
        case 3:
          System.out.println("Su número en hexadecimal es: " + Varios.bin2Hex(numeroDos));
          break;
        case 4:
          System.out.println("Su número en octal es: " + Varios.bin2Oct(numeroDos));
          break;
        default:
          System.out.println("Dato incorrecto.");
          break;
      }
    }
    
    if (tipoOrigen == 3) {
      System.out.print("Introduce el número en base hexadecimal(0-F): ");
      String numeroString = (s.nextLine());
      switch (tipoFinal) {
        case 1:
          resultado = Long.toString(Varios.bin2Dec(Varios.hex2Bin(numeroString)));
          System.out.println("Su número en decimal es: " + resultado);
          break;
        case 2:
          System.out.println("Su número en binario es: " + Varios.hex2Bin(numeroString));
          break;
        case 3:
          System.out.println("Su número ya está en hexadecimal.");
          break;
        case 4:
          resultado = Long.toString(Varios.bin2Oct(Varios.hex2Bin(numeroString)));
          System.out.println("Su número en octal es: " + resultado);
          break;
        default:
          System.out.println("Dato incorrecto.");
          break;
      }
    }
    
    if (tipoOrigen == 4) {
      System.out.print("Introduce el número en base octal(0-7): ");
      long numeroCuatro = Long.parseLong(s.nextLine());
      switch (tipoFinal) {
        case 1:
          numeroCuatro = Varios.oct2Bin(numeroCuatro);
          System.out.println("Su número en decimal es: " + Varios.bin2Dec(numeroCuatro));
          break;
        case 2:
          System.out.println("Su número en binario es: " + Varios.oct2Bin(numeroCuatro));
          break;
        case 3:
          numeroCuatro = Varios.oct2Bin(numeroCuatro);
          System.out.println("Su número en hexadecimal es: " + Varios.bin2Hex(numeroCuatro));
          break;
        case 4:
          System.out.println("Su número ya está en octal.");
          break;
        default:
          System.out.println("Dato incorrecto.");
          break;
      }
    }  
  }
}