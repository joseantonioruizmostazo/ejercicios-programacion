/*
 * Tema 9, Ejercicio 1
 * 
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 * 
 * @author José Ruiz
 */

package ejercicios.tema9.ejercicio1;

public class Ejercicio1 {

  public static void main(String[] args) {
    
  Caballo perdigon = new Caballo("Perdigón", "andaluza", "macho", "negro", "pasear", 5, 150);
  Caballo rocinante = new Caballo("Rocinante", "percherón", "macho", "blanco", "carreras", 7, 145.5);
  Caballo bella = new Caballo("Bella", "purasangre", "hembra", "marrón", "concursos", 4, 120.5);
  Caballo rapida = new Caballo("rapida", "shire", "hembra", "gris", "carreras", 6, 125.5);
  
    System.out.println("Hola caballitos");
    perdigon.relincha();
    rocinante.relincha();
    bella.relincha();
    rapida.relincha();
    
    System.out.println("Tomad algo de comida");
    perdigon.come("paja");
    rocinante.come("lechuga");
    bella.come("hamburguesa");
    rapida.come("pienso");
    
    System.out.println("¡¡Ahora a cabalgar y a correr!!");
    perdigon.cabalga();
    rocinante.corre();
    bella.cabalga();
    rapida.corre();
    
    System.out.println("¡Van a nacer nuevos potrillos!");
    Caballo caballo1 = perdigon.seApareaCon(rocinante, "lola", "pepe");
    Caballo caballo2 = rocinante.seApareaCon(bella, "flora", "speedy");
    Caballo caballo3 = bella.seApareaCon(perdigon, "lolita", "veloz");
    Caballo caballo4 = rapida.seApareaCon(bella, "josefa", "juan");
    
    System.out.println(caballo1);
    System.out.println(caballo2);
    System.out.println(caballo3);
    System.out.println(caballo4);
  }
}
