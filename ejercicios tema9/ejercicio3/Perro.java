/**
 * Perro.java
 * Definición de la clase Perro
 * @author José Ruiz
 */
package ejercicios.tema9.ejercicio3;

public class Perro extends Mamifero {
  // metodos de instancia ///////////////
  
  // constructor ////////////////////////
  public Perro(Sexo s) {
    super(s);
  }

  public Perro() {
    super();
  }
  
  /**
   * Hace que el perro ladre
   */
  public void ladra() {
    System.out.println("Guauuu, guauuuu");
  }
  
  /**
   * Hace que el perro aulle
   */
  public void aulla() {
    System.out.println("aauuuuuuuuuuuuuuuu");
  }
  
  /**
   * Hace que el perro atrape frisbi
   */
  public void atrapaFrisbi() {
    System.out.println("aaaalehop, ya es mio lo atrapé");
  }
}
