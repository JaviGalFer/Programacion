import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
/*
 * @author Fco Javier Gallego Fernández
 */
public class PruebaInvent {

    static Scanner scanner = new Scanner(System.in);
    static Inventario inventario = new Inventario();

    public static void main(String[] args) {

        int opcion = 10;

        
        do{
            
            System.out.println("------- MENÚ -------");
            System.out.println("1. Mostrar lista de animales");
            System.out.println("2. Mostrar datos de un animal");
            System.out.println("3. Mostrar datos de todos los animales");
            System.out.println("4. Insertar un animal");
            System.out.println("5. Eliminar un animal");
            System.out.println("6. Vaciar el inventario");
            System.out.println("0. Salir");

            /**
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumimos el salto de línea
            
            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("La opción ingresada no es válida. Por favor ingrese una opción válida.");
                scanner.next(); // Limpia el buffer de entrada
            }
            */

            try {
                /**
                opcion = scanner.nextInt();
                scanner.nextLine();
                
                while (!scanner.hasNextLine()); // Espera hasta que haya una entrada válida
                */
                
                opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1:
                    inventario.mostrarListaAnimales();
                    break;
                case 2:
                    System.out.println("Introduce el nombre del animal:");
                    String nombre = scanner.nextLine();
                    inventario.mostrarDatosAnimal(nombre);
                    break;
                case 3:
                    inventario.mostrarDatosAnimales();
                    break;
                case 4:
                    inventario.insertarAnimal();
                    break;
                case 5:
                    System.out.println("Introduce el nombre del animal:");
                    nombre = scanner.nextLine();
                    inventario.eliminarAnimal(nombre);
                    break;
                case 6:
                    inventario.vaciarInventario();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida, por favor ingrese un valor válido.");
            scanner.nextLine(); // descarta la entrada inválida
            opcion = 10;
        }catch (NoSuchElementException e) {
            System.out.println("Entrada inválida, por favor ingrese un valor válido.");
            scanner.nextLine(); // descarta la entrada inválida
            opcion = 10;
        }
        
        }while (opcion != 0);
    }
}
