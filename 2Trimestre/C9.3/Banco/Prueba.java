import java.util.Scanner;
import java.util.ArrayList;
/**
 * @author Fco Javier Gallego Fernández
 */
public class Prueba {
    static ArrayList<CuentaBancaria> cuenta = new ArrayList<>();
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        int opcion = 0; //Variable para el menú

        do{ //Creamos menú con do-while
            System.out.println("\u001B[36m///////////////////////\u001B[37m");
            System.out.println("\u001B[35mBienvenido al banco\u001B[37m");
            System.out.println("\u001B[36m///////////////////////\u001B[37m");
            System.out.println("1. Crear una cuenta corriente");
            System.out.println("2. Crear una cuenta de ahorro");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Ingresar dinero");
            System.out.println("5. Retirar dinero");
            System.out.println("6. Transferir dinero");
            System.out.println("7. Calcular el interés");
            System.out.println("8. Listar cuentas");
            System.out.println("9. Salir");
            System.out.println("\u001B[31mPara saber la cuenta debe entrar en la opción 8 del menú\u001B[37m");
            System.out.print("Selecciona una opción: ");
            try{ //Comprobamos que el valor sea correcto
                opcion=Integer.parseInt(s.next());

            }catch(NumberFormatException e){// si el valor introducido no coincide con int, se muestra un mensaje de error
            
                System.out.println("\nOpción no válida. Elija del 1 al 9.");
            }

            switch(opcion){
                case 1://Crear cuenta corriente
                    System.out.println("\u001B[36m///////////////////////\u001B[37m");
                    System.out.println("\u001B[34mMenú Crear cuenta corriente\u001B[37m");
                    System.out.println("\u001B[36m///////////////////////\u001B[37m");
                    System.out.print("Ingrese el IBAN de la cuenta corriente: ");
                    String ibanCC = "ES";
                    ibanCC += System.console().readLine();
                    cuenta.add(new CuentaCorriente(ibanCC, 0));
                    System.out.println("\u001B[32mCuenta corriente creada con exito.\u001B[37m");
                    break;
                
                case 2://Crear cuenta de ahorro
                    System.out.println("\u001B[36m///////////////////////\u001B[37m");
                    System.out.println("\u001B[34mMenú Crear cuenta de ahorro\u001B[37m");
                    System.out.println("\u001B[36m///////////////////////\u001B[37m");
                    System.out.print("Ingrese el IBAN de la cuenta de ahorro: ");
                    String ibanCA = "ES";
                    ibanCA += System.console().readLine();
                    cuenta.add(new CuentaAhorro(ibanCA, 0));
                    System.out.println("\u001B[32mCuenta de ahorro creada con exito.\u001B[37m");
                    break;

            
                case 3://Mostrar saldo
                    System.out.println("\u001B[36m///////////////////////\u001B[37m");
                    System.out.println("\u001B[34mMenú mostrar saldo de cuenta\u001B[37m");
                    System.out.println("\u001B[31mPara saber la cuenta debe entrar en la opción 8 \"\u001B[36mListar cuentas\" \u001B[31mdel menú\u001B[37m");
                    System.out.println("\u001B[36m///////////////////////\u001B[37m");
                    System.out.print("Ingrese el IBAN de la cuenta: ");
                    String ibanConsulta = System.console().readLine();
                    boolean encontrado = false;
                    for (CuentaBancaria cuenta : cuenta) {
                        if (cuenta.getIban().equals(ibanConsulta)) {
                            //System.out.println("El saldo de la cuenta "+ibanConsulta+ " es: " + cuenta.getSaldo());
                            cuenta.mostrarDatos();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("\u001B[31mNo se encontró ninguna cuenta con el IBAN ingresado.\u001B[37m");
                    }
                    break;

                case 4://Ingresar dinero
                    System.out.println("\u001B[36m///////////////////////\u001B[37m");
                    System.out.println("\u001B[34mMenú ingresar dinero\u001B[37m");
                    System.out.println("\u001B[31mPara saber la cuenta debe entrar en la opción 8 \"\u001B[36mListar cuentas\" \u001B[31mdel menú\u001B[37m");
                    System.out.println("\u001B[36m///////////////////////\u001B[37m");
                    System.out.print("Ingrese el IBAN de la cuenta: ");
                    String ibanIngreso = s.next();
                    encontrado = false;
                    for (CuentaBancaria cuenta : cuenta) {
                        if (cuenta.getIban().equals(ibanIngreso)) {
                            System.out.print("Ingrese la cantidad a ingresar: ");
                            double cantidad = s.nextDouble();
                            cuenta.ingresar(cantidad);
                            System.out.println("\u001B[32mIngreso realizado con exito\u001B[37m");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("\u001B[31mNo se encontró ninguna cuenta con el IBAN ingresado.\u001B[37m");
                    }
                    break;
                
                case 5://Retirar dinero
                    System.out.println("\u001B[36m///////////////////////\u001B[37m");
                    System.out.println("\u001B[34mMenú retirar dinero\u001B[37m");
                    System.out.println("\u001B[31mPara saber la cuenta debe entrar en la opción 8 \"\u001B[36mListar cuentas\" \u001B[31mdel menú\u001B[37m");
                    System.out.println("\u001B[36m///////////////////////\u001B[37m");
                    System.out.print("Ingrese el IBAN de la cuenta: ");
                    String ibanRetiro = s.next();
                    encontrado = false;
                    for (CuentaBancaria cuenta : cuenta) {
                        if (cuenta.getIban().equals(ibanRetiro)) {
                            System.out.print("Ingrese la cantidad a retirar: ");
                            double cantidad = s.nextDouble();
                            cuenta.retirar(cantidad);
                            System.out.println("\u001B[32mRetiro realizado con exito");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("\u001B[31mNo se encontró ninguna cuenta con el IBAN ingresado.\u001B[37m");
                    }
                    break;
                
                case 6://Transferencia de dinero
                    System.out.println("\u001B[36m///////////////////////\u001B[37m");
                    System.out.println("\u001B[34mMenú transferencia bancaria\u001B[37m");
                    System.out.println("\u001B[31mPara saber la cuenta debe entrar en la opción 8 \"\u001B[36mListar cuentas\" \u001B[31mdel menú\u001B[37m");
                    System.out.println("\u001B[36m///////////////////////\u001B[37m");
                    System.out.println("Ingrese el número de cuenta origen:");
                    String numCuentaOrigen = System.console().readLine();
                    System.out.println("Ingrese el número de cuenta destino:");
                    String numCuentaDestino = System.console().readLine();
                    System.out.println("Ingrese la cantidad a transferir:");
                    double cantidad = s.nextDouble();
                    s.nextLine();
                
                    CuentaBancaria cuentaOrigen = null;
                    CuentaBancaria cuentaDestino = null;
                
                    for (CuentaBancaria cuenta : cuenta) {
                        if (cuenta.getIban().equals(numCuentaOrigen)) {
                            cuentaOrigen = cuenta;
                        }
                        if (cuenta.getIban().equals(numCuentaDestino)) {
                            cuentaDestino = cuenta;
                        }
                    }
                
                    if (cuentaOrigen == null || cuentaDestino == null) {
                        System.out.println("\u001B[31mNo se encontró alguna de las cuentas ingresadas.\u001B[37m");
                    } else {
                        cuentaOrigen.retirar(cantidad);
                        cuentaDestino.ingresar(cantidad);
                        System.out.println("\u001B[32mTransferencia realizada con éxito.\u001B[37m");
                    }
                    break;
            
                
                case 7://Calcular interés
                    System.out.println("\u001B[36m///////////////////////\u001B[37m");
                    System.out.println("\u001B[34mMenú Calcular intereses\u001B[37m");
                    System.out.println("\u001B[31mPara saber la cuenta debe entrar en la opción 8 \"\u001B[36mListar cuentas\" \u001B[31mdel menú\u001B[37m");
                    System.out.println("\u001B[36m///////////////////////\u001B[37m");
                    System.out.print("Introduce el número de cuenta: ");
                    String numeroCuentaIntereses = System.console().readLine();
                    CuentaBancaria cuentaIntereses = null;
                    for (CuentaBancaria cuenta : cuenta) {
                        if (cuenta.getIban().equals(numeroCuentaIntereses)) {
                            cuentaIntereses = cuenta;
                            break;
                        }
                    }
                    if (cuentaIntereses == null) {
                        System.out.println("\u001B[31mNo se encontró la cuenta ingresada.\u001B[37m");
                    } else {
                        
                        System.out.println("Intereses de la cuenta: " + cuentaIntereses.getIban());
                        cuentaIntereses.calcularIntereses();
                    }
                    break;
                    case 8://Listado de cuentas
                        System.out.println("\u001B[36m///////////////////////\u001B[37m");
                        System.out.println("\u001B[34mMenú listado de cuentas\u001B[37m");
                        System.out.println("\u001B[36m///////////////////////\u001B[37m");
                        System.out.println("Listado de cuentas:");
                        for (CuentaBancaria cuenta : cuenta) {
                            System.out.println("Número de cuenta: " + cuenta.getIban() + ", saldo: " + cuenta.getSaldo());
                        }
                        break;

                    case 9://Salir del programa
                        System.out.println("\u001B[36m///////////////////////\u001B[37m");
                        System.out.println("\u001B[34mSaliento del programa...\u001B[37m");
                        System.out.println("\u001B[36m///////////////////////\u001B[37m");
                        break;
                    
                    default://Opción errónea
                        System.out.println("\u001B[36m///////////////////////\u001B[37m");
                        System.out.println("u001B[31mEsa opción no es correcta.\u001B[37m");
                        System.out.println("\u001B[36m///////////////////////\u001B[37m");
                        break;
                }
            }while(opcion!=9); //Mientras no sé introduzca el número 9
    s.close();
    }

}
