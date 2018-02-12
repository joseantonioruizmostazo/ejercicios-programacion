/**
 * Animal.java
 * Definición de la clase Animal
 * @author José Ruiz
 */
package ejercicios.tema9.ejercicio3;

public abstract class Animal {
  
  //atributos de instancia ////////////////////////////////
  private double peso;
  private Sexo sexo;
  private int edad;
  
  // métodos de instancia //////////////////////////////////
  
  // constructor //////////////////////////////////////////
  public Animal() {
    sexo = sexo.MACHO;
  }
  
   public Animal(Sexo x) {
    sexo = x;
  }

  //getter
  public Sexo getSexo() {
    return sexo;
  }
  
  public double getPeso() {
    return this.peso;
  }
  
  public int getEdad() {
    return this.edad;
  }
  
  /**
   * Hace que el animal coma
   */
  public void come() {
    System.out.println("mmmm gracias, que rico tenía mucha hambre");
  }
  
  /**
   * Hace que el animal duerma
   */
  public void duerme() {
    System.out.println("ZzZZzZZZZzzZZzzZZzZ...");
  }
  
  /**
   * Hace que el animal beba
   */
  public void bebe() {
    System.out.println("mmmmm gracias, tenía mucha sed");
  }
}
