 /**
 * Tema 1, ejercicio 5
 * 
 * Modifica el programa anterior añadiendo colores. Puedes mostrar cada asig-
 * natura de un color diferente.
 * 
 * @author José Ruiz
 */


public class Ejercicio5 {
  public static void main(String[] args) {
  
  String rojo = "\033[31m";
  String verde = "\033[32m";
  String naranja = "\033[33m";
  String azul = "\033[34m";
  String morado = "\033[35m";
  String blanco = "\033[37m";
  
  
    System.out.println("  Hora        |  Lunes | Martes | Miércoles | Jueves | Viernes |");
    System.out.println("----------------------------------------------------------------");
    System.out.printf("  %-15s%-9s%-9s%-9s%-9s%-9s","8:15-9:15   |",(rojo + "Progr |"),(naranja + "Siste   |"),(rojo + " Progr     |"),(morado + " Entor  |"),(naranja + "  Siste  |"));
    System.out.println(" ");
    System.out.printf("  %-15s%-9s%-9s%-9s%-9s%-9s",(blanco + "9:15-10:15  |"),(rojo + "  Progr |"),(naranja + "Siste   |"),(rojo + " Progr     |"),(morado + " Entor  |"),(naranja + "  Siste  |"));
    System.out.println(" ");
    System.out.printf("  %-15s%-9s%-9s%-9s%-9s%-9s",(blanco + "10:15-11:15 |"),(rojo + "  Progr |"),(naranja + "Siste   |"),(rojo + " Progr     |"),(morado + " Entor  |"),(naranja + "  Siste  |"));
    System.out.println(" ");
    System.out.printf("  %-15s%-9s%-9s%-9s%-9s%-9s",(blanco + "11:15-11:45 |"),"  Recreo|","Recreo  |"," Recreo    |"," Recreo |","  Recreo |");
    System.out.println(" ");
    System.out.printf("  %-15s%-9s%-9s%-9s%-9s%-9s",(blanco + "11:45-12:40 |"),(verde + "  Bases |"),(azul + "Lengu   |"),(verde + " Bases     |"),(azul + " Lengu  |"),(blanco + "  Forma  |"));
    System.out.println(" ");
    System.out.printf("  %-15s%-9s%-9s%-9s%-9s%-9s",(blanco + "12:40-13:35 |"),(verde + "  Bases |"),(rojo + "Progr   |"),(verde + " Bases     |"),(azul + " Lengu  |"),(blanco + "  Forma  |"));
    System.out.println(" ");
    System.out.printf("  %-15s%-9s%-9s%-9s%-9s%-9s",(blanco + "13:35-14:30 |"),(verde + "  Bases |"),(rojo + "Progr   |"),(verde + " Bases     |"),(azul + " Lengu  |"),(blanco + "  Forma  |"));
    }
}
