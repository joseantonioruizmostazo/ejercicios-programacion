/**
 * Mamifero.java
 * Definición de la clase Mamifero
 * @author José Ruiz
 */
package ejercicios.tema9.ejercicio3;

public abstract class Mamifero extends Animal {
  
  // metodos de instancia ///////////////
  
  // constructor ////////////////////////
  
  public Mamifero(Sexo s) {
    super(s);
  }

  public Mamifero() {
    super();
  }
  
  /**
   * Hace que el mamifero de a luz
   */
  public void daALuz() {
    System.out.println("Ohhh, que bonitas crias");
  }
  
  /**
   * Hace que el mamifero amamante
   */
  public void amamanta() {
    System.out.println("Comed mis pequeños, que teneis que crecer");
    System.out.println("Glu glu,glu glu");
  }
  
  /**
   * Hace que el mamifero proteja a sus crías
   */
  public void protegeCrias() {
    System.out.println("¡Alejaos carroñeros, estas son mis crías!");
  }
}
