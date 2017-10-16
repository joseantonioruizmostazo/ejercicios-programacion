/**
 * Tema 4, ejercicio 11
 * 
 * Escribe un programa que dada una hora determinada (horas y minutos),
 * calcule los segundos que faltan para llegar a la medianoche.
 * 
 * @author José Ruiz
 */
 
import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    
    System.out.println("Cálculo de segundos que quedan hasta la media noche\n");
    System.out.print("A continuación, introducirá una hora del día, primero introducirá la hora\n");
    System.out.println("y luego los minutos");
    System.out.print("Por favor, introduce hora: ");
    int hora = Integer.parseInt(s.nextLine());
    System.out.print("Ahora los minutos: ");
    int minutos = Integer.parseInt(s.nextLine());
    
    int segundosTranscurridos = (hora * 3600) + (minutos * 60);
    int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;
    
    System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos", hora, minutos, segundosHastaMedianoche);
  }
}
