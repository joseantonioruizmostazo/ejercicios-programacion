/**
 * Tema 6, ejercicio 10
 * 
 * Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
 * El carácter con el que se pinta cada línea se elige de forma aleatoria
 * entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
 * aleatoria entre 1 y 40 caracteres.
 * 
 * @author José Ruiz
 */

public class Ejercicio10 {
  public static void main(String[] args) {
    
    System.out.print("A continuación se mostrarán 10 líneas pintadas con carácteres\n");
    System.out.println("aleatorios y de longitud también aleatoria entre 1 y 40 caractéres\n");
    
    //Bucle para las 10 líneas.
    for (int i = 1; i <= 10; i++) {
      
      //Genera un número del 1 al 6 para darle valor a cada caracter.
      int numeroCaracter = ((int)(Math.random() * 6) + 1);
      
      //Cada valor toma un caracter.
      String caracter = "";
      switch(numeroCaracter) {
        case 1:
          caracter = "*";
          break;
        case 2:
          caracter = "-";
          break;
        case 3:
          caracter = "=";
          break;
        case 4:
          caracter = ".";
          break;
        case 5:
          caracter = "|";
          break;
        case 6:
          caracter = "@";
          break;
        default:
      }
      //Se genera un número aleatorio entre 1 y 40 para medir la longitud de la fila.
      int longitud = ((int)(Math.random() * 40) + 1);
      
      //Bucle para pintar tantos caracteres como indique la longitud de la fila.
      for (int j = 1; j < longitud; j++) {
      System.out.print(caracter);
      }
      //Añade salto de línea para cada línea.
      System.out.println();
    }
  }
}
