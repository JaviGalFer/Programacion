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
            
            int opcion = 0;
            int opcion2 = 0;    //Variables para las opciones y cantidad
            int n = 0;
            
            do {                                                        //Bucle do-while para el menú
            System.out.println("\nEXPOCOCHES MÁLAGA");
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción (1-3): ");
            
            opcion = s.nextInt();
            
            if (opcion == 1) {
                System.out.println("\nEn la zona principal hay " + principal.getEntradasPorVender());
                System.out.println("En la zona de compra venta hay " + compraVenta.getEntradasPorVender());    //Se llama a los métodos
                System.out.println("En la zona vip hay " + vip.getEntradasPorVender());                       //para obtener entradas disponibles
            }
            
            if (opcion == 2) {
                System.out.println("\n1. Principal");
                System.out.println("2. Compra-venta");
                System.out.println("3. Vip");
                System.out.print("Elige la zona para la que quieres comprar las entradas (1-3): ");
                
                opcion2 = s.nextInt();
                
                System.out.print("¿Cuántas entradas quieres? ");
                n = s.nextInt();
                
                switch (opcion2) {
                case 1:
                    principal.vender(n);
                    break;
                case 2:
                    compraVenta.vender(n);      //Se llaman a los métodos "vender" introduciendole la variable "n"
                    break;                      //Que le dice la cantidad que se venden
                case 3:
                    vip.vender(n);
                    break;
                default:
                }
            }
            } while (opcion < 3); // Mientras no se introduzca 3 no se sale del menú.
        
            s.close();
        }
}
