/**
 * Tema 5, ejercicio 26
 * 
 * Realiza un programa que pida primero un número y a continuación un dígito.
 * El programa nos debe dar la posición (o posiciones) contando de izquierda a
 * derecha que ocupa ese dígito en el número introducido.
 * 
 * @author José Ruiz
 */
 
 import java.util.Scanner;

public class Ejercicio26 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int volteado = 0;
    int longitud = 0;
    int posicion = 1;
    
    
    System.out.print("Por favor, introduzca un número: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    System.out.print("Ahora introduzca el dígito que quieras contando de izquierda a derecha del número: ");
    int digito = Integer.parseInt(s.nextLine());
    
    System.out.print("El digito " + digito + " del número " + numeroIntroducido + " se encuentra en la/s posición/es ");
    
    //Para guardar el número original introducido.
    int numero = numeroIntroducido;
    
    //Si el numero es igual a 0, la longitud será de 1.
    if (numero == 0) {
      longitud = 1;
    }
    
    //Para voltear el número y además averiguar su longitud.
    while (numero > 0) {
      volteado = (numero % 10) + (volteado * 10);
      numero /= 10;
      longitud++;
    }
    //Comprueba la posición
    while (volteado > 0) {
      if ((volteado % 10) == digito) {
        System.out.print(posicion + ", ");
      }
      volteado /= 10;
      posicion++;
    }
  }
}
