import java.util.Scanner;
/*
 * @author Fco Javier Gallego Fernández
 */
public class PruebaInvent {
    static Scanner s = new Scanner(System.in);
    static Inventario inventario = new Inventario();
    public static void main(String[] args) {
        int opcion = 0;
        
        do{
            System.out.println("------- MENÚ -------");
            System.out.println("1. Mostrar lista de animales");
            System.out.println("2. Mostrar datos de un animal");
            System.out.println("3. Mostrar datos de todos los animales");
            System.out.println("4. Insertar un animal");
            System.out.println("5. Eliminar un animal");
            System.out.println("6. Vaciar el inventario");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opción: ");
            try {//Comprobamos que el valor sea correcto
                opcion=Integer.parseInt(s.next());

            }catch(NumberFormatException e){// si el valor introducido no coincide con int, se muestra un mensaje de error
            
                System.out.println("\nOpción no válida. Elija del 1 al 7.");
            }

            //Menú principal
            switch (opcion) {
                case 1://Listado de animales
                    System.out.println("Listado de animales:");
                    inventario.mostrarListaAnimales();
                    break;
                case 2://Mostrar datos de un animal
                    System.out.println("Introduce el nombre del animal:");
                    String nombre = s.nextLine();
                    inventario.mostrarDatosAnimal(nombre);
                    break;
                case 3://Mostrar datos de animales
                    inventario.mostrarDatosAnimales();
                    break;
                case 4://Insertar animal
                    System.out.println("Seleccione el tipo de animal a agregar:");
                    System.out.println("1. Perro");
                    System.out.println("2. Gato");
                    System.out.println("3. Canario");
                    System.out.println("4. Loro");
                    int tipo = Integer.parseInt(System.console().readLine());
                    
                    System.out.print("Ingrese el nombre del animal: ");
                    String nombreNuevo = System.console().readLine();
                    
                    System.out.print("Ingrese la edad del animal: ");
                    int edadNuevo = Integer.parseInt(System.console().readLine());
                    
                    System.out.print("Ingrese el estado del animal (true/false): ");
                    boolean estadoNuevo = Boolean.parseBoolean(System.console().readLine());
                    
                    System.out.print("Ingrese la fecha de nacimiento del animal: ");
                    String fechaNuevo = System.console().readLine();
                    //Tipo de animal
                    switch (tipo) {
                        case 1://Perro
                            System.out.print("Ingrese la raza del perro: ");
                            String raza = System.console().readLine();
                            System.out.print("¿Tiene pulgas el perro? (true/false): ");
                            boolean pulgas = Boolean.parseBoolean(System.console().readLine());
                            inventario.insertarAnimal(new Perro(nombreNuevo, edadNuevo, estadoNuevo, fechaNuevo, raza, pulgas));
                            System.out.println("Perro insertado correctamente.");
                            break;
                            
                        case 2://Gato
                            System.out.print("Ingrese el color del gato: ");
                            String color = s.next();
                            System.out.print("¿Tiene pelo largo el gato? (true/false): ");
                            boolean peloLargo = Boolean.parseBoolean(System.console().readLine());
                            Gato gatoNuevo = new Gato(nombreNuevo, edadNuevo, estadoNuevo, fechaNuevo, color, peloLargo);
                            inventario.insertarAnimal(gatoNuevo);
                            System.out.println("Gato insertado correctamente.");
                            break;
                            
                        case 3://Canario
                            System.out.print("Ingrese el color del canario: ");
                            String colorCanario = System.console().readLine();
                            System.out.print("¿Canta el canario? (true/false): ");
                            boolean canta = Boolean.parseBoolean(System.console().readLine());
                            Canario canarioNuevo = new Canario(nombreNuevo, edadNuevo, estadoNuevo, fechaNuevo, 0.0, false, colorCanario, canta);
                            inventario.insertarAnimal(canarioNuevo);
                            System.out.println("Canario insertado correctamente.");
                            break;
                            
                        case 4://Loro
                            System.out.print("Ingrese el origen del loro: ");
                            String origen = System.console().readLine();
                            System.out.print("¿Habla?");
                            boolean habla = Boolean.parseBoolean(System.console().readLine());
                            Loro loroNuevo = new Loro(nombreNuevo, edadNuevo, estadoNuevo, fechaNuevo, edadNuevo, habla, origen, habla);
                            inventario.insertarAnimal(loroNuevo);
                            System.out.println("Loro insertado correctamente.");
                            break;
                        default:
                    }
                    break;
                case 5://Eliminar animal
                    System.out.println("Introduce el nombre del animal:");
                    nombre = s.nextLine();
                    inventario.eliminarAnimal(nombre);
                    break;
                case 6://Vaciar inventario
                    inventario.vaciarInventario();
                    break;
                case 7://Salir del programa
                    System.out.println("Saliendo del programa...");
                    break;
                default://Error
                    System.out.println("Opción no válida.");
                    break;
            }
        }while(opcion!=7);//Mientras no se elija la opción 7
    }
}
