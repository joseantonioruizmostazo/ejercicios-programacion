/**
 * Tema 4, ejercicio 22
 * 
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
 * hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
 * Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
 * por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
 * a las 15:00h.
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio22 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Cálculo de los minutos que quedan para llegar al fin de semana\n");
    System.out.print("A continuación, introduzca el día en el que se encuentra (lunes-viernes)\n");
    String dia = (s.nextLine());

    int diaNumerico = 0;

    switch(dia) {
      case "lunes":
        diaNumerico = 0;
        break;
      case "martes":
        diaNumerico = 1;
        break;
      case "miércoles":
        diaNumerico = 2;
        break;
      case "jueves":
        diaNumerico = 3;
        break;
      case "viernes":
        diaNumerico = 4;
        break;
      default:
        System.out.print("El día introducido no es correcto.");
    }
    
    System.out.println("A continuación, introducirás la hora y los minutos por separado");
    System.out.print("Por favor, introduce hora: ");
    int horas = Integer.parseInt(s.nextLine());
    
    System.out.print("Ahora los minutos: ");
    int minutos = Integer.parseInt(s.nextLine());
    
    int minutosTotales = (4 * 24 * 60) + (15 * 60);
    int minutosActuales = (diaNumerico * 24 * 60) + (horas * 60) + minutos;
    
    System.out.print("Faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana.");
  }
}
