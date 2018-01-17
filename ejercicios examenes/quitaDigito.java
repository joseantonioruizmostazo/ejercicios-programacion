/**
 * Examen recuperación DAM 1ª y 2ª parte
 * José Antonio Ruiz Mostazo
 * 17/01/18
 * 
 * Ejercicio 2
 * 
 * Realiza un programa, que dado un número entero introducido por el usuario, se le quiten todas las
 * ocurrencias de un dígito que también introduce el usuario.
 * 
 * Ejemplo 1:
 * 
 * Introduzca un número: 57802785
 * Introduzca el dígito que quiere quitar: 8
 * 
 * 570275
 * 
 * @author José Ruiz
 * 
 */

import java.util.Scanner;

public class quitaDigito {

    public static void main(String[] args) {
    
Scanner s = new Scanner(System.in);
    
    System.out.println("Por favor introduzca un número entero: \n");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    System.out.println();
    System.out.println("Ahora introduzca la ocurrencia que desea eliminar: \n");
    int ocurrencia = Integer.parseInt(s.nextLine());
    
    int numeroPrincipio = numeroIntroducido;
    int vuelta = 0;
    int otro = 0;
    
    while (numeroPrincipio > 0) {
      
      vuelta = numeroPrincipio % 10;
      //damos la vuelta y quitamos la ocurrencia
      if(vuelta == ocurrencia){
        numeroPrincipio /= 10;
      } else{
          otro = (otro * 10) + (numeroPrincipio % 10);
          numeroPrincipio /= 10;
        }
    }
    //damos la vuelta al numero volteado sin la ocurrencia
    int volteado = otro;
    int pruebaVuelta = volteado;
    int derecho = 0;
      
    while (pruebaVuelta > 0) {
      derecho = (derecho * 10) + (pruebaVuelta % 10);
      pruebaVuelta /= 10;
    }
    System.out.println();
    System.out.print("El número sin la ocurrencia elegida es: " + derecho);
    System.out.println();
  }
}
