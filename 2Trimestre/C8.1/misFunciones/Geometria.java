package misFunciones;
import java.util.Scanner;

////BIBLIOTECA DE FUNCIONES DE GEOMETRIA/////////
public class Geometria {
    //////FUNCIÓN MENU GEOMETRÍA//////////
    /**
     * Muestra un menú con diferentes opciones
     * @return opcion -> Devuelve la opción elegida
     */
    public static int menuGeo(){
        Scanner s = new Scanner(System.in);
        int opcion;
        System.out.println ("1. Circunferencia");
        System.out.println ("2. Área");
        System.out.println ("3. Volumen");
        System.out.println ("4. Todas");
        System.out.println ("5. Salir");
        System.out.print ("Elija una opción (1 al 5): ");
        opcion =s.nextInt();
        return opcion;
    }
//////////FUNCION PEDIR RADIO////////
    /**
     * Pide por pantalla el radio
     * @param radio -> variable del radio introducido
     * @return radio -> Devuelve el radio introducido
     */
    public static double pideRadio() {
        Scanner s = new Scanner(System.in);
        double radio;
        System.out.print ("Introduce el radio: ");
        radio = s.nextInt();
        return radio;
    }

////////////FUNCIÓN CALCULAR CIRCUNFERENCIA//////////
    /**
     * Hace el calculo de la circunferencia mediante el radio
     * @param radio -> variable que entra con el radio
     * @return -> Devuelve el resultado en base al radio
     */
    public static double circunferencia(double radio){
        return 2 * Math.PI * radio;
    }

//////////FUNCIÓN CALCULAR AREA///////////
    /**
     * Hace el calculo del area mediante el radio
     * @param radio -> variable que entra con el radio
     * @return -> Devuelve el resultado en base al radio
     */
    public static double area(double radio){
        return Math.PI * radio * radio;
    }

///////////FUNCIÓN CALCULAR VOLUMEN//////////
    /**
     * Hace el calculo del volumen mediante el radio
     * @param radio -> variable que entra con el radio
     * @return -> Devuelve el resultado en base al radio
     */
    public static double volumen(double radio){
        return 4 / 3 * Math.PI * radio * radio * radio;
    }
}
