/**
 * Pizza.java
 * Definición de la clase Pizza
 * @author Jose Ruiz
 */
package ejercicios.tema9.ejercicio5;

public class Pizza {
 
  // atributos de clase /////////////////////////////
  private static int pizzasPedidas;
  private static int pizzasServidas;

  // métodos de clase //////////////////////////////////
  public static int getTotalPedidas() {
    return Pizza.pizzasPedidas;
  }
  public static int getTotalServidas() {
    return Pizza.pizzasServidas;
  }

  // atributos de instancia /////////////////////////////
  private String tamano;
  private String tipo;
  private String estado = "pedida";


  // metodos de instancia //////////////////////////////
  public String getTipo() {  
    return tipo;
  }
  public String getTamano() {  
    return tamano;
  }

  // constructor ///////////////////////////////////////
  public Pizza(String tipo, String tamano) {
    pizzasPedidas++;
    this.tamano = tamano;
    this.tipo = tipo;
  }

  @Override
  public String toString() {
    return "Pizza " + tipo + " " + tamano + ", " + estado;
  }
  
  /**
   * Hace que la pizza se sirva
   */
  public String sirve() {
    if (estado.equals("servida")) {
      System.out.println("Esa pizza ya se ha servido");
    } else {
    pizzasServidas++;
    }
  return estado = "servida";
  }
}
