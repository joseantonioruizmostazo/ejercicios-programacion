/**
 * Fraccion.java
 * Definición de la clase Fraccion
 * @author Jose Ruiz
 */
package ejercicios.tema9.ejercicio4;

public class Fraccion {
  
  // atributos ////////////////////////////
  
  private int numerador;
  private int denominador;
  
  // metodos ////////////////////////////
  
  // constructor /////////////////////////
  public Fraccion(int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
  }

  public int getNumerador() {
    return numerador;
  }

  public int getDenominador() {
    return denominador;
  }
  
  @Override
  public String toString() {
    return numerador + "/" + denominador;
  }
  
  /**
   * Hace que la fracion se invierta
   */
  public Fraccion seInvierte() {
    int num = denominador;
    int den = numerador;
    
    Fraccion f = new Fraccion(num, den);
    System.out.println(f);
    return null;
  }
  
  /**
   * Hace que dos fracciones se multipliquen
   */
  public Fraccion seMultiplica(int num, int den) {
    int nume = this.numerador * num;
    int deno = this.denominador * den;
    return new Fraccion (nume, deno);
  }
  
  /**
   * Hace que dos fracciones se dividan
   */
  public Fraccion seDivide(int num, int den) {
    int nume = this.numerador * den;
    int deno = this.denominador * num;
    return new Fraccion (nume, deno);
  }
  
  /**
   * Hace que la fracción se simplifique
   */
  public Fraccion seSimplifica(int num, int den) {
    for (int i = 2; i < Math.min(this.numerador, this.denominador); i++) {
      while (((num % i) == 0) && ((den % i) == 0)) {
        num /= i;
        den /= i;
      }
    }
    return new Fraccion(num, den);
  }
  
  /**
   * Hace que la fracción se simplifique
   */
  public Fraccion seSimplifica(Fraccion f) {
    int num = f.numerador;
    int den = f.denominador;
    for (int i = 2; i < Math.min(this.numerador, this.denominador); i++) {
      while (((num % i) == 0) && ((den % i) == 0)) {
        num /= i;
        den /= i;
      }
    }
    return new Fraccion(num, den);
  }
  
  
}