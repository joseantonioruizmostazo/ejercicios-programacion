/**
 * Examen recuperación DAM 1ª parte
 * 
 * Ejercicio 1
 * 
 * La pastelería El Dulcero nos ha encargado un programa para configurar y vender su roscón de reyes.
 * El programa debe calcular el precio del roscón en función de una serie opciones. El roscón puede ser
 * pequeño, mediano o grande; y los precios base son 8, 10 y 14 euros respectivamente si se trata de un
 * roscón normal y 10, 13 y 16 respectivamente si se trata de un roscón de chocolate. El roscón por
 * defecto no lleva nata; si la lleva, se debe sumar un 10% al precio base. Se puede disfrutar del roscón
 * sin engordar, gracias a la versión “light” pero habrá que rascarse el bolsillo ya que el precio se
 * multiplica por dos si se elige esta opción.
 * 
 * @author José Ruiz
 * 
 */

package examen.recuperacion;
import java.util.Scanner;

public class ex12jarm1 {

    public static void main(String[] args) {
    
Scanner s = new Scanner(System.in);

    System.out.println("Calculo del precio de un roscón de reyes.\n");
    
    System.out.println("Seleccione el tamaño del roscón - 1.Pequeño 2.Mediano 3.Grande: ");
    int tamano = Integer.parseInt(s.nextLine());
    System.out.println();
    
    System.out.println("Elija el tipo - 1.Normal 2.De chocolate: ");
    int tipo = Integer.parseInt(s.nextLine());
    System.out.println();
            
    System.out.println("¿Quiere nata? (s/n): ");
    String nata = s.nextLine();
    System.out.println();
            
    System.out.println("¿Quiere la versión light? (s/n): ");
    String versionLight = s.nextLine();
    System.out.println();
    
    double precioTamano = 0;
    double precioChoco = 0;
    double precioTamanoSabor = 0;
    double precioNata = 0;
    double precioLight = 0;
    double total = 0;
    
    switch(tamano){
      case 1:
      precioTamano = 8;
      if(tipo == 2){
        precioChoco = precioTamano + 2;
        precioTamanoSabor = precioChoco;
      } else {
      precioTamanoSabor = precioTamano;
      }
      break;
      case 2:
      precioTamano = 10;
      if(tipo == 2){
        precioChoco = precioTamano + 3;
        precioTamanoSabor = precioChoco;
      } else {
      precioTamanoSabor = precioTamano;
      }
      break;
      case 3:
      precioTamano = 14;
      if(tipo == 2){
        precioChoco = precioTamano + 2;
        precioTamanoSabor = precioChoco;
      } else {
      precioTamanoSabor = precioTamano;
      }
      break;
      default:
    }
    
    switch(nata) {
      case "s":
        precioNata = precioTamanoSabor * 0.10;
        break;
      case "n":
        break;
      default:
    }
    
    switch(versionLight) {
      case "s":
        
        precioLight = precioTamanoSabor + precioNata;
        break;
      case "n":
        break;
      default:
    }
    
    total = precioTamanoSabor + precioNata + precioLight;
    
    System.out.println("Gracias. Aquí tiene su ticket.\n");
    
    if((tamano == 1) && (tipo == 1)){
    System.out.printf("Roscón pequeño normal: %.2f €\n", precioTamanoSabor);
    }
    if((tamano == 1) && (tipo == 2)){
    System.out.printf("Roscón pequeño de chocolate: %.2f €\n", precioTamanoSabor);
    }
    
    if((tamano == 2) && (tipo == 1)){
    System.out.printf("Roscón mediano normal: %.2f €\n", precioTamanoSabor);
    }
    if((tamano == 2) && (tipo == 2)){
    System.out.printf("Roscón mediano de chocolate: %.2f €\n", precioTamanoSabor);
    }
    
    if((tamano == 3) && (tipo == 1)){
    System.out.printf("Roscón grande normal: %.2f €\n", precioTamanoSabor);
    }
    if((tamano == 3) && (tipo == 2)){
    System.out.printf("Roscón grande de chocolate: %.2f €\n", precioTamanoSabor);
    }
    
    if(precioNata != 0){
    System.out.printf("Con nata: %.2f €\n", precioNata);
    }
    if(precioLight == precioTamanoSabor + precioNata){
    System.out.printf("Versión Light: %.2f €\n", precioLight);
    } 
    System.out.printf("Total: %.2f €\n", total);
  }
}