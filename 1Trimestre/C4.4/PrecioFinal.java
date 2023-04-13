import java.util.Scanner;


/**Este programa realiza una facturación. Pregunta por pantalla la base imponible, el tipo de IVA y si hay código de descuento
 * y en base a ello realiza una factura.
 *@author Fco Javier Gallego Fernández
 */
 

public class PrecioFinal {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    
    double baseImponible;
    int tipIva;
    tipIva = 0;
    int ivaNum;
    int codigo;
    double iva;
    double sinDescuento;
    double descuento;
    descuento = 0;
    double total;
    //Se declaran todas las variables
    
    System.out.println("Este programa realiza una facturacion en base a los datos introducidos");
    System.out.print ("Introduce la base imponible: ");
    baseImponible = s.nextDouble();
    System.out.println ("--------------------------");
    
    System.out.println ("Introduce el tipo de IVA.");
    System.out.println ("--------------------------");
    System.out.println ("1. General        -> 21%");
    System.out.println ("2. Reducido       -> 10%");
    System.out.println ("3. Superreducido  -> 04%");
    System.out.println ("--------------------------");
    System.out.print ("Introduce 1, 2 o 3 para seleccionar el tipo de IVA: ");
    ivaNum = s.nextInt();
    System.out.println ("--------------------------------");
    //Se declara el tipo de IVA y es convertido mediante un switch
    switch(ivaNum) {
      
      case 1:
        tipIva = 21;
        break;
      case 2:
        tipIva = 10;
        break;
      case 3:
        tipIva = 4;
        break;
      default:
        System.out.println ("El numero introducido no es correcto.");
      }
    
    //Se hacen los calculos de la cantidad de IVA y el tipo de IVA y después se calcula el precio del producto con IVA
    iva = baseImponible * tipIva / 100;
    sinDescuento = baseImponible + iva;
    
    //Preguntamos si tiene descuento y que sea seleccionado
    System.out.println ("Introduce el codigo promocional.");
    System.out.println ("--------------------------------");
    System.out.println ("1. nopro");
    System.out.println ("2. mitad");
    System.out.println ("3. meno5");
    System.out.println ("4. 5porc");
    System.out.println ("--------------------------------");
    System.out.print ("Introduce un numero para seleccionar: ");
    codigo = s.nextInt();
    
    //Convertimos el codigo introducido en el tipo de descuento
    switch(codigo) {
      case 1:
        break;
      case 2: //mitad => El precio es a la mitad
        descuento = sinDescuento / 2;
        break;
      case 3:
        descuento = 5;
        break;
      case 4:
        descuento = sinDescuento * 0.05;
        break;
      default:
        System.out.println ("El numero de descuento introducido no es correcto.");
      }
    
    //Calculamos el total, haciendo descuento si lo hay y habiendo declarado la variable descuento a 0 por si no lo hubiera
    total = sinDescuento - descuento;
  
    
    //Mostramos por pantalla la facturación de manera formateada
    System.out.println("-----------------------------");
    System.out.println("---------FACTURACION---------");
    System.out.printf ("Base imponible      %6.2f\n", baseImponible);
    System.out.printf ("IVA (%2d%%)          %6.2f\n", tipIva, iva);
    System.out.printf ("Precio con IVA      %6.2f\n", sinDescuento);
    System.out.printf ("Cod. promo. (%1s)   -%6.2f\n", codigo, descuento);
    System.out.println("-----------------------------");
    System.out.printf ("TOTAL              %6.2f\n", total);
    
    
    
    
    
    
    
  }
}
