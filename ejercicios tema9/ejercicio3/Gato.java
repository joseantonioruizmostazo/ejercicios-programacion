/**
 * Gato.java
 * Definición de la clase Gato
 * @author José Ruiz
 */
package ejercicios.tema9.ejercicio3;

public class Gato extends Mamifero {
  //atributos de instancia //////////////
  private String raza;
  // metodos de instancia ///////////////
  
  // constructor ////////////////////////
  public Gato(Sexo s) {
    super(s);
  }

  public Gato() {
    super();
  }
  
  public Gato(Sexo s, String raza) {
    super(s);
    this.raza = raza;
    
    
  }
  
  /**
   * Hace que el gato se lave
   */
  public void seLava() {
    System.out.println("mmmm me encanta lavarme, que limpito estoy");
  }
  
  /**
   * Hace que el gato maulle
   */
  public void maulla() {
    System.out.println("miauuu, miaauuu");
  }
  
  /**
   * Hace que el gato juegue
   */
  public void juega() {
    System.out.println("Ven aquiii ovillo de lana, no te escaparás");
  }
}
