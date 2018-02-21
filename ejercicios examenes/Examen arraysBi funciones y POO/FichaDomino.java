/**
 * Definición de la clase Zona
 *
 * @author José Ruiz
 */
package ex12jarm;

public class FichaDomino {
// atributos ////////////////////////////
  
  private int ladoIzquierdo;
  private int ladoDerecho;
  
  // metodos ////////////////////////////
  
  // constructor /////////////////////////
  
  public FichaDomino(int ladoIzquierdo, int ladoDerecho) {
    this.ladoIzquierdo = ladoIzquierdo;
    this.ladoDerecho = ladoDerecho;
  }

  public int getLadoIzquierdo() {
    return ladoIzquierdo;
  }

  public int getLadoDerecho() {
    return ladoDerecho;
  }

  public void setLadoIzquierdo(int ladoIzquierdo) {
    this.ladoIzquierdo = ladoIzquierdo;
  }

  public void setLadoDerecho(int ladoDerecho) {
    this.ladoDerecho = ladoDerecho;
  }

  @Override
  public String toString() {
    if ((this.ladoIzquierdo == 0) && (this.ladoDerecho != 0)) {
      return "[ |" + ladoDerecho + "]";  
    } else if ((this.ladoIzquierdo != 0) && (this.ladoDerecho == 0)) {
      return "[" + ladoIzquierdo + "| ]"; 
    } else if ((this.ladoIzquierdo == 0) && (this.ladoDerecho == 0)) {
      return "[ | ]"; 
    } else {
    return "[" + ladoIzquierdo + "|" + ladoDerecho + "]";
  }
}
  
  /**
   * Hace que la ficha se voltee
   */
  public FichaDomino voltea() {
    int izq = ladoDerecho;
    int der = ladoIzquierdo;
    
    FichaDomino f = new FichaDomino(izq, der);
    System.out.println(f);
    return null;
  }
  
  /**
   * Hace que dos fichas encajen
   */
  public boolean encaja(FichaDomino f2) {
    boolean encaja = false;
    
    int ladoIzquierdoF1 = this. ladoIzquierdo;
    int ladoDerechoF1 = this.ladoDerecho;
    int ladoIzquierdoF2 = f2.ladoIzquierdo;
    int ladoDerechoF2 = f2.ladoDerecho;
    
    if ((ladoDerechoF1 == ladoIzquierdoF2) || (ladoDerechoF1 == ladoDerechoF2) || (ladoIzquierdoF1 == ladoIzquierdoF2)
          || (ladoIzquierdoF1 == ladoDerechoF2)){
      return encaja = true;
    }
    return encaja = false;
  }
}
