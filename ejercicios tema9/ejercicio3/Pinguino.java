/**
 * Pinguino.java
 * Definición de la clase Pinguino
 * @author José Ruiz
 */
package ejercicios.tema9.ejercicio3;

public class Pinguino extends Ave {
      // metodos de instancia ///////////////
  
  // constructor ////////////////////////
  public Pinguino(Sexo s) {
    super(s);
  }

  public Pinguino() {
    super();
  }
  
  /**
   * Hace que el pinguino baile
   */
  public void baila() {
    System.out.println("cla cla cla cla soy happy feet");
  }
  
  /**
   * Hace que el pinguino se ponga triste porque no puede volar
   */
  @Override
  public void vuela() {
    System.out.println("Aunque soy considerada un ave, por desgracia no puedo volar");
  }
  
  /**
   * Hace que el pinguino grazne
   */
  public void grazna() {
    System.out.println("oonk ooonk ooonk ooonk");
  }
}
