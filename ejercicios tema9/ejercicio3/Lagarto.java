/**
 * Lagarto.java
 * Definición de la clase Lagarto
 * @author José Ruiz
 */
package ejercicios.tema9.ejercicio3;

public class Lagarto extends Animal {
  // metodos de instancia ///////////////
  
  // constructor ////////////////////////
  public Lagarto(Sexo s) {
    super(s);
  }

  public Lagarto() {
    super();
  }
  
  /**
   * Hace que el lagarto ponga huevos
   */
  public void poneHuevos() {
    System.out.println("Ohhh, que huevos tan bonitos");
  }
  
  /**
   * Hace que el lagarto tome el sol
   */
  public void tomaSol() {
    System.out.println("uuhmmm que agustito se está tomando el solecito");
  }
  
  /**
   * Hace que el lagarto saque la lengua
   */
  public void sacaLengua() {
    System.out.println("sshsshshssshsssshshsss");
  }
}
