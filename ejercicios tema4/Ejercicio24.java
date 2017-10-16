/**
 * Tema 4, ejercicio 24
 * 
 * Escribe un programa que genere la nómina (bien desglosada) de un empleado
 * según las siguientes condiciones:
 * • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3
 * - Jefe de proyecto), los días que ha estado de viaje visitando clientes
 * durante el mes y su estado civil (1 - Soltero, 2 - Casado).
 * • El sueldo base según el cargo es de 950, 1200 y 1600 euros según
 * si se trata de un prog. junior, un prog. senior o un jefe de proyecto
 * respectivamente.
 * • Por cada día de viaje visitando clientes se pagan 30 euros extra en
 * concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será
 * de un 25% en caso de estar soltero y un 20% en caso de estar casado.
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio24 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Calcula la nómina desglosada de un empleado según ciertos parámetros\n");
    System.out.println("1 - Programador junior");
    System.out.println("2 - Prog. senior");
    System.out.println("3 - Jefe de proyecto");
    System.out.print("Introduzca el cargo del empleado (1 - 3): ");
    int cargo = Integer.parseInt(s.nextLine());
    
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
    int diasVisita = Integer.parseInt(s.nextLine());

    System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
    int estadoCivil = Integer.parseInt(s.nextLine());

    double sueldoBase = 0;

    switch(cargo) {
      case 1:
        sueldoBase = 950;
        break;
      case 2:
        sueldoBase = 1200;
        break;
      case 3:
        sueldoBase = 1600;
        break;
      default:
        System.out.println("No ha elegido correctamente el sueldo base.");
    }

    double sueldoDietas = diasVisita * 30;

    double sueldoBruto = sueldoBase + sueldoDietas;

    double irpf = 0;

    if (estadoCivil == 1) {
      irpf = 25;
    } else if (estadoCivil == 2) {
      irpf = 20;
    } else {
      System.out.println("No ha elegido correctamente el estado civil.");
    }
    
    double cuantiaIrpf = (sueldoBruto * irpf) / 100;

    System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
    System.out.printf("┃ Sueldo base            %7.2f ┃\n", sueldoBase);
    System.out.printf("┃ Dietas (%2d viajes)     %7.2f ┃\n", diasVisita, sueldoDietas);
    System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
    System.out.printf("┃ Sueldo bruto           %7.2f ┃\n", sueldoBruto);
    System.out.printf("┃ Retención IRPF (%.0f%%)   %7.2f ┃\n", irpf, cuantiaIrpf);
    System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
    System.out.printf("┃ Sueldo neto            %7.2f ┃\n", sueldoBruto - cuantiaIrpf);
    System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
  }
}
