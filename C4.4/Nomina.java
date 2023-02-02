import java.util.Scanner;


/**Este programa genera una nómina desglosada de un empleado programador.
 *@author Fco Javier Gallego Fernández
 */
 

public class Nomina {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    
    //Declaramos todas las variables
    int cargo;
    int dias;
    int estadoCivil;
    double sueldoBase;
    sueldoBase = 0;
    double irpf;
    irpf = 0;
    double dietas;
    double sueldoBruto;
    double totalIrpf;
    double sueldoNeto;
    
    //Preguntamos por el puesto del empleado
    System.out.println ("Este programa genera una nomina desglosada de un empleado programador");
    System.out.println ("Tipo de cargo:");
    System.out.println ("_____________________________________________________________________");
    System.out.println ("1- Programador junior");
    System.out.println ("2- Programador senior");
    System.out.println ("3- Jefe de proyecto");
    System.out.println ("_____________________________________________________________________");
    System.out.print ("Por favor, introduzca un cargo (1-3): ");
    cargo = s.nextInt();
    
    //En base al puesto le indicamos un sueldo mediante el switch
    switch(cargo) {
      case 1:
        sueldoBase = 950;
        break;
      case 2:
        sueldoBase = 1200;
        break;
      case 3: 
        sueldoBase = 1600;
        break;
      default:
        System.out.println ("El numero introducido no es valido.");
    }
    
    //Preguntamos los días de viaje por trabajo
    System.out.println ("_____________________________________________________________________");
    System.out.print ("Cuantos dias ha estado de viaje visitando clientes?: ");
    dias = s.nextInt();
    
    //Calculamos las dietas por días viajados y hacemos el calculo del sueldo bruto
    dietas = dias * 30;
    sueldoBruto = sueldoBase + dietas;
    
    //Preguntamos el estado civil para saber que tipo de IRPF pertenece
    System.out.println ("_____________________________________________________________________");
    System.out.print ("Introduce su estado civil (Siendo 1- Soltero y 2- Casado): ");
    estadoCivil = s.nextInt();
    
    //Mediante un if le indicamos cuanto % le pertenece en base al número introducido
    if (estadoCivil == 1) {
      irpf = 25;
    } else if (estadoCivil == 2) {
      irpf = 20;
    } else {
      System.out.println ("No ha elegido correctamente el estado civil.");
    }
    
    //Calculamos el IRPF que le pertenece 
    totalIrpf = ( sueldoBruto * irpf) / 100;
    
    //calculamos el sueldo neto restandole el IRPF
    sueldoNeto = sueldoBruto - totalIrpf;
    
    //Se muestra por pantalla la nomina desglosada
    System.out.println ("_____________________________________________________________________");
    System.out.printf ("Sueldo base             %7.2f\n", sueldoBase);
    System.out.printf ("Dietas %2d viajes)      %7.2f\n", dias, dietas);
    System.out.println ("________________________________");
    System.out.printf ("Sueldo Bruto            %7.2f\n", sueldoBruto);
    System.out.printf ("Retencion IRPF(%.0f%%)     %7.2f\n", irpf, totalIrpf);
    System.out.println ("________________________________");
    System.out.printf ("Sueldo Neto             %7.2f\n", sueldoNeto);
    System.out.println ("________________________________");
    
  }
}
