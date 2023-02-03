import java.util.Scanner;           //Se importan las bibliotecas
import misFunciones.Geometria;
/**
* Programa con menú que realiza operaciones geométricas
* @author Fco Javier Gallego Fernández
*/
public class Ejercicio21 {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        
        int opcion = Geometria.menuGeo(); ///Llamada a la función menú para elegir opción
        
        while (opcion != 5){             ///El nº5 en el menú es para salir de ahí el while
            switch (opcion){
                case 1:
                    double radio = Geometria.pideRadio();
                    System.out.println ("La cinrcunferencia es: " +Geometria.circunferencia(radio));
                    break;
                case 2:
                    radio = Geometria.pideRadio();
                    System.out.println ("El área es: " + Geometria.area(radio));
                    break;
                case 3:                                                                              ///Según la opción que se elija
                    radio = Geometria.pideRadio();                                                   ///Se muestra un resultado
                    System.out.println ("El volumen es: " + Geometria.volumen(radio));
                    break;
                case 4:
                    radio = Geometria.pideRadio();
                    System.out.println ("La cinrcunferencia es: " +Geometria.circunferencia(radio));
                    System.out.println ("El área es: " + Geometria.area(radio));
                    System.out.println ("El volumen es: " + Geometria.volumen(radio));
                    break;
                default:
            }
            System.out.println ("\u001B[31m/////////////////////////////////////////////////////////\u001B[37m");
            opcion = Geometria.menuGeo(); /////Se vuelve a ejecutar el menú mientras no se elija la opción 5
        }


    s.close();
    }
}

