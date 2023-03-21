import java.util.Scanner;
/**
 * @Author Fco Javier Gallego Fernández
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creamos el array
        Gestisimal gestisimal = new Gestisimal();
        //Variables necesarias
        int opcion = 0;
        int cantidad;
        String codigo;

        //Creamos el menú mediante un do-while
        do {
            System.out.println("=============================");
            System.out.println("         GESTISIMAL");
            System.out.println("=============================");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Salida de mercancía");
            System.out.println("7. Salir");
            System.out.println("Selecciona una opción:");
            opcion = Integer.parseInt(System.console().readLine());
            //Hacemos un switch para el menú
            switch (opcion) {

            //OPCIÓN LISTAR LISTAR
            case 1:
                System.out.println("\nListado");
                gestisimal.listar();
                break;

            //OPCIÓN AltaArticulo
            case 2:
                gestisimal.altaArticulo();
                break;

            //OPCIÓN BAJA
            case 3:
                System.out.println("Introduzca el código del artículo a dar de baja:");
                codigo = sc.nextLine();
                gestisimal.baja(codigo);
                break;

            //OPCIÓN MODIFICACIÓN
            case 4:
                System.out.println("Introduzca el código del artículo a modificar:");
                codigo = sc.nextLine();

                System.out.println("Introduzca la nueva descripción del artículo:");
                String descripcion = sc.nextLine();
                
                System.out.println("Introduzca el nuevo precio de compra:");
                double precioCompra = sc.nextDouble();
                
                System.out.println("Introduzca el nuevo precio de venta:");
                double precioVenta = sc.nextDouble();
                
                System.out.println("Introduzca el nuevo stock:");
                int stock = sc.nextInt();
                sc.nextLine(); // Consumir la nueva línea
                
                gestisimal.modificacion(codigo, descripcion, precioCompra, precioVenta, stock);
                break;

            //OPCIÓN ENTRADA STOCK
            case 5:
                System.out.println("Introduzca el código del artículo a recibir:");
                codigo = sc.nextLine();
                
                System.out.println("Introduzca la cantidad de stock a recibir:");
                cantidad = sc.nextInt();
                sc.nextLine(); // Consumir la nueva línea
                
                gestisimal.entradaMercancia(codigo, cantidad);
                break;

            //OPCIÓN SALIDA STOCK
            case 6:
                System.out.println("Introduzca el código del artículo a vender:");
                codigo = sc.nextLine();
                
                System.out.println("Introduzca la cantidad de stock a vender:");
                cantidad = sc.nextInt();
                sc.nextLine(); // Consumir la nueva línea
                
                gestisimal.salidaMercancia(codigo, cantidad);
                break;

            //SALIR DEL PROGRAMA
            case 7:
                System.out.println("==========================================================================================");
                System.out.println("Saliendo del programa...");
                System.out.println("==========================================================================================");
                break;
                
            //OPCIÓN FALLIDA
            default:
                System.out.println("==========================================================================================");
                System.out.println("Opción incorrecta.");
                System.out.println("==========================================================================================");
                break;
        }
        } while (opcion != 7); //para el DO-WHILE MIENTRAS LA OPCIÓN SEA DIFERENTE A 7
        sc.close();
    }


}

