/**
 * Caballo.java
 * Definición de la clase Caballo
 * @author José Ruiz
 */
package ejercicios.tema9.ejercicio1;

public class Caballo {
  
  // atributos /////////////////////////////
  
  private String nombre;
  private String raza;
  private String sexo;
  private String color;
  private String uso;
  private int edad;
  private double peso;
  
  // métodos ///////////////////////////////
  
  // constructor
  
  //nombre, raza, sexo, color, uso, edad, peso
  Caballo (String nom, String raz, String sex, String col, String  us, int eda, double pes) {
    this.nombre = nom;
    this.raza = raz;
    this.sexo = sex;
    this.color = col;
    this.uso = us;
    this.edad = eda;
    this.peso = pes;
  }
  Caballo () {
    this.sexo = "sin sexo definido";
  }
   Caballo (String sex, String nom, String raz, String col, double pes) {
    this.sexo = sex;
    this.nombre = nom;
    this.raza = raz;
    this.color = col;
    this.peso = pes;
    this.edad = 0;
    this.uso = "Sin uso definido";
  }
  
  //getter
  
  public String getSexo() {
    return this.sexo;
  }

  public String getNombre() {
    return this.nombre;
  }

  public String getRaza() {
    return this.raza;
  }

  public String getColor() {
    return this.color;
  }

  public String getUso() {
    return this.uso;
  }

  public int getEdad() {
    return this.edad;
  }

  @Override
  public String toString() {
    return "Caballo{" + "nombre=" + nombre + ", raza=" + raza + ", sexo=" + sexo + ", color=" + color + ", uso=" + uso + ", edad=" + edad + ", peso=" + peso + '}';
  }
  
  /**
   * Hace que el caballo relinche
   */
  public void relincha() {
    System.out.println("hhiiijjjij");
  }
  
  /**
   * Hace que el caballo cabalgue
   */
  public void cabalga() {
    System.out.println("tucu tu tucu tu tucu tu");
  }
  
  /**
   * Hace que el caballo corra
   */
  public void corre() {
    System.out.println("tocotó tocotó tocotó tocotó");
  }
  
  /**
   * Hace que el caballo coma.
   * A los caballos les gustan las manzanas, si le damos otra comida
   * la rechazará.
   * 
   * @param comida la comida que se le ofrece al caballo
   */
  public void come(String comida) {
    if (comida.equals("hamburguesa")) {
      System.out.println("Hmmmm, gracias, con bacon y cebolla caramelizada, mis favoritas! :D");
    } else {
      System.out.println("Lo siento, yo solo como hamburguesas, el lunes ya me pongo a dieta");
    }
  }
  
  /**
   * Hace que dos caballos tengan hijos.
   * Se aparean si los caballos son de distintos sexos, en caso contrario devuelve null.
   */
  Caballo seApareaCon(Caballo pareja, String nombreSiHembra, String nombreSiMacho) {
    
    if ((this.sexo.equals("hembra")) && (pareja.getSexo().equals("macho"))
       || (this.sexo.equals("macho")) && (pareja.getSexo().equals("hembra"))) {
      String nuevoSexo = "";
      String nuevoNombre = "";
      String nuevaRaza = "";
      String nuevoColor = "";
      double nuevoPeso = 0;
      
      //random para el sexo y el nombre
      if ((int)(Math.random()* 2) == 0) {
        nuevoSexo = "macho";
        nuevoNombre = nombreSiMacho;
      } else {
        nuevoSexo = "hembra";
        nuevoNombre = nombreSiHembra;
      }
      
      //random para la raza
      if ((int)(Math.random()* 2) == 0) {
        nuevaRaza = this.raza;
      } else {
        nuevaRaza = pareja.raza;
      }
      
      //random para el color
      if ((int)(Math.random()* 2) == 0) {
        nuevoColor = this.color;
      } else {
        nuevoColor = pareja.color;
      }
      
      //random para el peso
      nuevoPeso = ((int)(Math.random()* 100) + 50);
      
      Caballo potrillo = new Caballo(nuevoSexo, nuevoNombre, nuevaRaza, nuevoColor, nuevoPeso);
      
      return potrillo;
    } else {
      System.out.println("Lo siento, no podemos aparearnos porque somos del mismo sexo.");
      return null;
    }
  } 
}
