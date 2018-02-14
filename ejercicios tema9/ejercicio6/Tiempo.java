/**
 * Tiempo.java
 * Definición de la clase Tiempo
 * @author Jose Ruiz
 */
package ejercicios.tema9.ejercicio6;

public class Tiempo {
  
  // atributos de instancia /////////////////////////////
  private int horas;
  private int minutos;
  private int segundos;
  
  // metodos de instancia //////////////////////////////

  public int getHoras() {
    return this.horas;
  }

  public int getMinutos() {
    return this.minutos;
  }

  public int getSegundos() {
    return this.segundos;
  }
  
  // constructor ///////////////////////////////////////
  
  public Tiempo(int h, int m, int s) {
    this.horas = h;
    this.minutos = m;
    this.segundos = s;
  }

  @Override
  public String toString() {
    return horas + "h " + minutos + "m " + segundos + "s";
  }
  
  /**
   * Hace que dos tiempos se sumen
   */
  public Tiempo suma(Tiempo t) {
    int seg = this.segundos;
    int min = this.minutos;
    int hor = this.horas;
    
    if (seg + t.getSegundos() >= 60) {
      min++;
      seg = (seg + t.getSegundos() - 60);
    } else {
      seg = seg + t.getSegundos();
    }
    
    if(min + t.getMinutos() >= 60) {
      hor++;
      min = (min + t.getMinutos() -60);
    } else {
      min = min + t.getMinutos();
    }
    hor = hor + t.getHoras();
    return new Tiempo (hor, min, seg);
  }
  
  /**
   * Hace que dos tiempos se sumen
   */
  public Tiempo suma(int h, int m, int s) {
    return this.suma(new Tiempo(h, m, s));
  }
  
  /**
   * Hace que dos tiempos se resten
   */
  public Tiempo resta(Tiempo t) {
    
    int segun = (this.horas * 3600) + (this.minutos * 60) + this.segundos;
    int segunT = (t.getHoras() * 3600) + (t.getMinutos() * 60) + t.getSegundos();
    
    segun = segun - segunT;
    
    if (segun < 0) {
      int seg = segun;
      int hor = segun / 3600;
      segun -= hor * 3600;
      int min = segun / 60;
      segun -= min * 60;
      seg = segun;
      seg = (seg * -1);
      min = (min * -1);
      return new Tiempo (hor, min, seg);
    } else {
      int seg = segun;
      int hor = segun / 3600;
      segun -= hor * 3600;
      int min = segun / 60;
      segun -= min * 60;
      seg = segun;
      return new Tiempo (hor, min, seg);
    }
  }
  
  /**
   * Hace que dos tiempos se resten
   */
  public Tiempo resta(int h, int m, int s) {
    return this.resta(new Tiempo(h, m, s));
  }
}
