import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
* Clase main para probar los diferentes métodos
* @author Fco Javier Gallego Fernández
*/
public class PruebaExcepciones {
    /**
     * Función leerTeclado. Lee por teclado un número comprobando que sea númerico.
     * Además comprueba que este dentro de los límites del menú
     * @param NumOpciones   Número de opciones existentes
     * @param Salir         Número para salir del menú
     * @return              Devuelve el número introducido
     */
    private static int leerTeclado(int NumOpciones, int Salir){
        // if opcion<=numopcion return systemOut No valido
        //throws aritmetic Exception{}
        Scanner s = new Scanner(System.in);
        String opcion = "";
        int opcionNum = 0;
        boolean datoValido = false;

        do {
            try{
                System.out.println("Introduzca un número del 1 al "+NumOpciones+" o introduzca "+Salir+" para salir: ");
                opcion = s.nextLine();
                opcionNum = Integer.parseInt(opcion);
                datoValido = true;
                while (opcionNum > NumOpciones){
                    System.out.println("Número fuera de rango.");
                    System.out.print("Introduzca un número del 1 al "+NumOpciones+" o introduzca "+Salir+" para salir: ");
                    opcion = s.nextLine();
                    opcionNum = Integer.parseInt(opcion);
                }
            }catch(Exception e){
                opcionNum = 0;
                System.out.println (e.getClass());          //Muestra error de la clase
                System.out.println (e.getMessage());        //Muestra un mensaje más concreto de dónde ha estado el error
                System.out.println("Opción no válida.");
            }
        }while (!datoValido);
        return opcionNum;
    }

    // Función que provoca un StackOverFlowError
    public static void funcionStackOverFlowError() throws StackOverflowError {
        funcionStackOverFlowError();
    }

    // Función que provoca una NumberFormatException
    /**
     * Muestra error al intentar pasar un String a integer con no numericos
     * @throws NumberFormatException
     */
    public static void funcionNumberFormatException() throws NumberFormatException {
        String num = "no es un número";
        int numero = Integer.parseInt(num);
    }
    
    // Función que provoca una ArrayIndexOutOfBoundsException
    /*
     * Muestra error al intentar acceder a una posición fuera de rango
     */
    public static void funcionArrayIndexOutofBoundsException() throws ArrayIndexOutOfBoundsException {
        int[] arreglo = new int[3];
        System.out.println(arreglo[3]);
    }
    
    // Función que provoca una FileNotFoundException
    /**
     *  Muestra error al intentar buscar el archivo
     */ 
    public static void funcionFileNotFoundException() throws FileNotFoundException {
        File archivo = new java.io.File("archivo.txt");
        Scanner s = new java.util.Scanner(archivo);
    }
    
    // Función que provoca una ArithmeticException
    /**
     * Muestra error al dividir 1/0
     * @throws ArithmeticException
     */
    public static void funcionArithmeticException() throws ArithmeticException {
        int division = 1/0;
    }

    /////////////////////////////////////
    //////////////CLASE MAIN//////////////
    /////////////////////////////////////
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcion = 0;                 //Variable para el menú


        do{
            System.out.println("--Prueba de Excepciones--");
            System.out.println("1. Provocar StackOverFlowError");
            System.out.println("2. Provocar NumberFormatException");
            System.out.println("3. Provocar ArrayIndexOutOfBoundsException");   //Creamos el menú
            System.out.println("4. Provocar FileNotFoundException");
            System.out.println("5. Provocar ArithmeticException");
            System.out.println("6. Salir");

            opcion = leerTeclado(6, 6); //Llamamos a la función introduciendo el número de opciones y el número para salir

            try {
                switch(opcion) {
                    case 1:
                        funcionStackOverFlowError();
                        break;
                    case 2:
                        funcionNumberFormatException();
                        break;
                    case 3:
                        funcionArrayIndexOutofBoundsException();
                        break;
                    case 4:
                        funcionFileNotFoundException();
                        break;
                    case 5:                                     //Switch para las diferentes opciones
                        funcionArithmeticException();
                        break;
                    case 6:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
            } catch (StackOverflowError e) {
                System.out.println("Excepción: " + e.getClass() + " - " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Excepción: " + e.getClass() + " - " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {                                        //Mensaje para cada uno de los errores
                System.out.println("Excepción: " + e.getClass() + " - " + e.getMessage());
            } catch (FileNotFoundException e) {
                System.out.println("Excepción: " + e.getClass() + " - " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("Excepción: " + e.getClass() + " - " + e.getMessage());
            }

        }while (opcion != 6);   //Mientras sea diferente a 6 no se sale del bucle

    s.close();
    }
}