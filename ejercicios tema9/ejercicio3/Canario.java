/**
 * Canario.java
 * Definición de la clase Canario
 * @author José Ruiz
 */
package ejercicios.tema9.ejercicio3;

public class Canario extends Ave {
  // metodos de instancia ///////////////
  
  // constructor ////////////////////////
  public Canario(Sexo s) {
    super(s);
  }

  public Canario() {
    super();
  }
  
  /**
   * Hace que el canario se moje la cara
   */
  public void seMojaCara() {
    System.out.println("brbrbrbrb que fresquitaa el aguaa cuando me mojo la cara");
  }
  
  /**
   * Hace que el canario cante
   */
  public void canta() {
    System.out.println("piiiiii pipipipipi piiiii pipipipipiipiiiiii");
  }
  
  /**
   * Hace que el canario se columpie
   */
  public void seColumpia() {
    System.out.println("yupiiiii que divertidoooo");
  }
}
