/**
 * Examen recuperación DAM 1ª y 2ª parte
 * José Antonio Ruiz Mostazo
 * 17/01/18
 * 
 * Ejercicio 1
 * 
 * La cadena de pizzerías Pizza Jat nos ha encargado un programa para cobrar a los clientes en caja
 * cuando encargan una pizza. El programa debe calcular el precio de la pizza en función de una serie
 * opciones. Los tamaños de pizza disponibles son pequeña, mediana y familiar y tienen como precios
 * base 8, 11 y 14 euros respectivamente. Con el precio base se incluyen de 1 a 3 ingredientes. Si el
 * cliente quiere más de 3 ingredientes, cada ingrediente extra se paga a 2 euros. Se da la opción de
 * pedir extra de queso, que se cobra a 3 euros. Hay una promoción especial que consiste en aplicar un
 * descuento de un 10% si el pedido supera los 25 euros. No hay que considerar el IVA, ya está incluido
 * en todas las tarifas.
 * 
 * @author José Ruiz
 * 
 */
 
import java.util.Scanner;

public class presupuestoPizza {

    public static void main(String[] args) {
    
Scanner s = new Scanner(System.in);
    
    System.out.println("Nuevo pedido de pizza.\n");
    
    System.out.println("Seleccione el tamaño - 1.Pequeña 2.Mediana 3.Familiar: ");
    int tamano = Integer.parseInt(s.nextLine());
    System.out.println();
    
    System.out.println("¿Cuántos ingredientes quiere? ");
    int ingredientes = Integer.parseInt(s.nextLine());
    System.out.println();
            
    System.out.println("¿Quiere extra de queso? (s/n): ");
    String queso = s.nextLine();
    System.out.println();
    
    double precioBase = 0;
    double precioIngredientes = 0;
    double precioQueso = 0;
    double total = 0;
    double descuento = 0;
    double totalConDescuento = 0;
    
    switch(tamano){
      case 1:
      precioBase = 8;
      if(ingredientes > 3){
        precioIngredientes = (ingredientes) -3 * 2;
      }
      break;
      case 2:
      precioBase = 11;
      if(ingredientes > 3){
        precioIngredientes = (ingredientes -3) * 2;
      }
      break;
      case 3:
      precioBase = 14;
      if(ingredientes > 3){
        precioIngredientes = (ingredientes -3) * 2;
      }
      break;
      default:
    }
    
    switch(queso) {
      case "s":
        precioQueso = 3;
        break;
      case "n":
        break;
      default:
    }
    
    total = precioBase + precioIngredientes + precioQueso;
    
    System.out.println("Gracias. Aquí tiene su ticket.");
    System.out.println("Pizza Jat.");
    System.out.printf("Precio Base:       %.2f €\n", precioBase);
    System.out.printf("Ingrecientes (" + ingredientes + ")" + "   %.2f €\n", precioIngredientes);
    if (precioQueso == 3) {
      System.out.printf("Extra de queso      %.2f €\n", precioQueso);
    }
    if(total > 25){
      descuento = total * 0.10;
      System.out.printf("Descuento          -%.2f €\n", descuento);
      totalConDescuento = total - descuento;
      System.out.printf("Total              %.2f €\n", totalConDescuento);
    } else {
      System.out.printf("Total              %.2f €\n", total);
    }
  }
}
