import java.util.Scanner;
/**
* Clase main para probar los diferentes métodos
* @author Fco Javier Gallego Fernández
*/
public class ExpoCochesCampanillas {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            Zona principal = new Zona(1000);
            Zona compraVenta = new Zona(200);   //Se crean las diferentes intancias para cada zona
            Zona vip = new Zona(25);
            
            String opcion = "";
            String opcion2 = "";
            int opcionNum = 0;
            int opcionNum2 = 0;    //Variables para las opciones y cantidad
            int nNum = 0;
            String n = "";

            //Boolean para cada try-catch
            boolean datoValido = false;
            boolean datoValido2 = false;
            boolean datoValido3 = false;
            
            do {                                                        //Bucle do-while para el menú
            System.out.println("\nEXPOCOCHES MÁLAGA");
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");

            do{     //do-while para el try-catch mientras el dato no sea válido
                
                try{
                    System.out.print("Elige una opción (1-3): ");
                    opcion = s.nextLine();
                    opcionNum = Integer.parseInt(opcion);       //con el try intenta hacer lo que se le dice
                    datoValido = true;
                }catch (Exception e){       //Si se obtiene error hace lo siguiente
                    opcionNum = 0;
                    System.out.println (e.getClass());          //Muestra error de la clase
                    System.out.println (e.getMessage());        //Muestra un mensaje más concreto de dónde ha estado el error
                    System.out.println("Opción no válida.");
                    datoValido = false;
                }

            }while (!datoValido);

            if (opcionNum == 1) {
                System.out.println("\nEn la zona principal hay " + principal.getEntradasPorVender());
                System.out.println("En la zona de compra venta hay " + compraVenta.getEntradasPorVender());    //Se llama a los métodos
                System.out.println("En la zona vip hay " + vip.getEntradasPorVender());                       //para obtener entradas disponibles
            }
            
            if (opcionNum == 2) {
                System.out.println("\n1. Principal");
                System.out.println("2. Compra-venta");
                System.out.println("3. Vip");

                do{             //do-while para el try-catch mientras el dato no sea válido
    
                    try{
                        System.out.print("Elige la zona para la que quieres comprar las entradas (1-3): ");
                        opcion2 = s.nextLine();
                        opcionNum2 = Integer.parseInt(opcion2);
                        datoValido2 = true;
                    }catch (Exception e){
                        opcionNum2 = 0;
                        System.out.println (e.getClass());          //Muestra error de la clase
                        System.out.println (e.getMessage());        //Muestra un mensaje más concreto de dónde ha estado el error
                        System.out.println("El dato no es válido.");
                    }
    
                }while (!datoValido2);
                
                do{
                                    //do-while para el try-catch mientras el dato no sea válido
    
                    try{
                        System.out.print("¿Cuántas entradas quieres? ");
                        n = s.nextLine();
                        nNum = Integer.parseInt(n);
                        datoValido3 = true;
                    }catch (Exception e){
                        nNum = 0;
                        System.out.println (e.getClass());          //Muestra error de la clase
                        System.out.println (e.getMessage());        //Muestra un mensaje más concreto de dónde ha estado el error
                        System.out.println("El dato no es válido.");
                    }
    
                }while (!datoValido3);
                
                switch (opcionNum2) {
                case 1:
                    principal.vender(nNum);
                    break;
                case 2:
                    compraVenta.vender(nNum);      //Se llaman a los métodos "vender" introduciendole la variable "n"
                    break;                      //Que le dice la cantidad que se venden
                case 3:
                    vip.vender(nNum);
                    break;
                default:
                    System.out.println("Opción no válida.");
                }
            }
            } while (opcionNum != 3); // Mientras no se introduzca 3 no se sale del menú.
            
            s.close();
        }
}
