/**
 * Tema 6, ejercicio 3
 * 
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
 * de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 * 
 * @author José Ruiz
 */

public class Ejercicio3 {
  public static void main(String[] args) {
    
    String palo = "";
    
    System.out.println("A continuación se mostrará al azar el nombre de una carta de la baraja de 40 cartas española.\n");
    
    //Genera un número al azar de 1 a 4 sin decimales.
    int tipo = (int)(Math.random() * 4) + 1;
    
    switch(tipo) {
        case 1:
          palo = "bastos";
          break;
        case 2:
          palo = "espadas";
          break;
        case 3:
          palo = "copas";
          break;
        case 4:
          palo = "oro";
          break;
        
    }
    //Genera un número al azar de 1 a 10 sin decimales.
    int numeroCarta = (int)(Math.random() * 10) + 1;
    String carta = "";
    switch(numeroCarta) {
        case 1:
          carta = "As";
          break;
        case 8:
          carta = "sota";
          break;
        case 9:
          carta = "caballo";
          break;
        case 10:
          carta = "rey";
          break;
        default:
          carta = String.valueOf(numeroCarta);
        
    }
    System.out.print("Soy un/a " + carta + " de " + palo);
  }
}
