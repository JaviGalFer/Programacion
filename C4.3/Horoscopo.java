import java.util.Scanner;


/**Pide introducir un mes y año en numero y segun dia y mes muestra tu horoscopo
 *@author Fco Javier Gallego Fernández
 */
 

public class Horoscopo {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    
    String horoscopo = "";
    
    //Se declaran variables y se pide el número
    System.out.println ("Este programa muestra su horoscopo es segun el dia y mes");
    System.out.print ("Introduzca el numero del mes del 1 al 12: ");
    int mes = s.nextInt();
    
    System.out.println ("Ahora introduzca el dia: ");
    int dia = s.nextInt();
    
    //Se introduce el switch para el menu y comprobación del dato y muestra de este.
    switch(mes) {
      case 1: //Enero
        if (dia < 21) {
          horoscopo = "Capricornio";
        } else {
          horoscopo = "Acuario";
        }
        break;
        
      case 2: //Febrero
        if (dia < 20) {
          horoscopo = "Acuario";
        } else {
          horoscopo = "Piscis";
        }
        break;
        
      case 3: //Marzo
      //Según el día del mes muestra Piscis o Aries
        if (dia < 21) {
          horoscopo = "Piscis";
        } else {
          horoscopo = "Aries";
        }  
        break;
        
      case 4:
      //Abril
        if (dia <21) {
          horoscopo = "Aries";
        } else {
          horoscopo = "Tauro";
        }
        break;
        
      case 5: //Mayo
        if (dia < 20) {
          horoscopo = "Tauro";
        } else {
          horoscopo = "Geminis";
        }
        break;
        
      case 6: //Junio
      //Según el día del mes muestra Geminis o Cancer
        if (dia < 22) {
          horoscopo = "Geminis";
        } else {
          horoscopo = "Cancer";
        }
        break;
        
      case 7: //Julio
        if (dia < 22) {
          horoscopo = "Cancer";
        } else {
          horoscopo = "Leo";
        }
        break;
        
      case 8: //Agosto
        if (dia < 24) {
          horoscopo = "Leo";
        } else {
          horoscopo = "Virgo";
        }
        break;
        
      case 9: //Septiembre
      //Según el día del mes muestra Virgo o Libra
        if (dia < 23) {
          horoscopo = "Virgo";
        } else {
          horoscopo = "Libra";
        }
        break;
        
      case 10: //Octubre
        if (dia < 23) {
          horoscopo = "Libra";
        } else {
          horoscopo = "Escorpio";
        }
        break;
        
      case 11: //Noviembre
        if (dia < 23) {
          horoscopo = "Escorpio";
        } else {
          horoscopo = "Sagitario";
        }
        break;
        
      case 12: //Diciembre
      //Según el día del mes muestra Sagitario o Capricornio
        if (dia < 21) {
          horoscopo = "Sagitario";
        } else {
          horoscopo = "Capricornio";
        }  
        break;
        
      default:
        horoscopo = "Los valores no son validos";
    }
      //Muestra por pantalla el horoscopo
    System.out.println ("Tu horoscopo es: " + horoscopo);
    
    
    
    
  }
}
