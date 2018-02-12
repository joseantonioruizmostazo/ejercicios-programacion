/**
 * Ave.java
 * Definición de la clase Ave
 * @author José Ruiz
 */
package ejercicios.tema9.ejercicio3;

public abstract class Ave extends Animal {
  
  // metodos de instancia ///////////////
  
  // constructor ////////////////////////
  public Ave(Sexo s) {
    super(s);
  }
  
  public Ave() {
    super();
  }
  
  /**
   * Hace que el ave ponga huevos
   */
  public void poneHuevos() {
    System.out.println("Ohhh, que huevos tan bonitos");
  }
  
  /**
   * Hace que el ave vuele
   */
  public void vuela() {
    System.out.println("Que bieeen, estoy volandoo");
  }
  
  /**
   * Hace que el mamifero proteja a sus crías
   */
  public void alimentaCrias() {
    System.out.println("Tomad mis pequeños, comed esto para que crezcais fuertes");
  }
}