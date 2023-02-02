import java.util.Scanner;


/**Pide introducir número según el mes y un día y muestra por pantalla la estación del año según día y mes
 *@author Fco Javier Gallego Fernández
 */
 

public class Estacion {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    
    String estacion = "";
    
    //Se declaran variables y se pide el número
    System.out.println ("Este programa le dira la estacion del año segun el dia y mes");
    System.out.print ("Introduzca el numero del mes del 1 al 12: ");
    int mes = s.nextInt();
    
    System.out.println ("Ahora introduzca el dia: ");
    int dia = s.nextInt();
    
    //Se introduce el switch para el menu y comprobación del dato y muestra de este.
    switch(mes) {
      case 1: //Enero
        estacion = "Invierno";
        break;
        
      case 2: //Febrero
        estacion = "Invierno";
        break;
        
      case 3: //Marzo
      //Según el día del mes muestra Invierno o Primavera mediante el if
        if (dia < 20) {
          estacion = "Invierno";
        } else {
          estacion = "Primavera";
        }  
        break;
        
      case 4:
      //Abril
        estacion = "Primavera";
        break;
        
      case 5: //Mayo
        estacion = "Primavera";
        break;
        
      case 6: //Junio
      //Según el día del mes muestra Primavera o Verano mediante el if
        if (dia < 21) {
          estacion = "Primavera";
        } else {
          estacion = "Verano";
        }
        break;
        
      case 7: //Julio
        estacion = "Verano";
        break;
        
      case 8: //Agosto
        estacion = "Verano";
        break;
        
      case 9: //Septiembre
      //Según el día del mes muestra Verano u Otoño mediante el if
        if (dia < 23) {
          estacion = "Verano";
        } else {
          estacion = "Otoño";
        }
        break;
        
      case 10: //Octubre
        estacion = "Otoño";
        break;
        
      case 11: //Noviembre
        estacion = "Otoño";
        break;
        
      case 12: //Diciembre
      //Según el día del mes muestra Otoño o Invierno mediante el if
        if (dia < 21) {
          estacion = "Otoño";
        } else {
          estacion = "Invierno";
        }  
        break;
        
      default:
        estacion = "Debe introducir un numero del 1 al 12";
    }
      //Muestra por pantalla la estación del año
    System.out.println ("En este mes la estación del año es: " + estacion);
    
    
    
    
  }
}
