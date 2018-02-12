/**
 * Vehiculo.java
 * Definición de la clase Vehiculo
 * @author José Ruiz
 */
package ejercicios.tema9.ejercicio2;


public abstract class Vehiculo {
  
  // atributos de clase /////////////////////////////
  private static int vehiculosCreados;
  private static int kilometrosTotales;

  // métodos de clase //////////////////////////////////
  public static int getKilometrosTotales() {
    return Vehiculo.kilometrosTotales;
  }
  public static int getVehiculosCreados() {
    return Vehiculo.vehiculosCreados;
  }

  // atributos de instancia /////////////////////////////
  private int kilometrosRecorridos;

  // metodos de instancia //////////////////////////////
  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }
  // constructor ///////////////////////////////////////
  Vehiculo () {
    this.kilometrosRecorridos = 0;
    Vehiculo.vehiculosCreados++;
  }

  /**
   * Hace que el vehículo recorra una distancia en km
   */
  public void anda(int km) {
    System.out.println("El vehículo ha recorrido: " + km + " km");
    this.kilometrosRecorridos += km;
    Vehiculo.kilometrosTotales += km;
  }

}

