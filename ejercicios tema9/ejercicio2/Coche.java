/**
 * Coche.java
 * Definición de la subclase Coche
 * @author José Ruiz
 */
package ejercicios.tema9.ejercicio2;

public class Coche extends Vehiculo {
  
// atributos de instancia ///////////////////////////
  
// constructor ///////////////////////////////////

  public Coche() {
    super();
  }
  
  /**
   * Hace que el coche queme rueda
   */
  public void quemaRueda() {
    System.out.println("¡Huele a plástico quemado de tanto quemar ruedas!");
  }
}