/**Recibe una respuesta sobre las horas trabajadas durante la semana almacenadola en una variable y después mediante el if 
 * y según las horas calcula el sueldo en base a las horas trabajadas y el sueldo extra
 *@author Fco Javier Gallego Fernández
 */
 
 public class Salario {
  public static void main(String[] args) {
	int sueldoSemanal;
  
  System.out.print ("Por favor, introduzca el numero de horas trabajadas durante la semana: ");
  String horas = System.console().readLine();
  int horasTrabajadas = Integer.parseInt( horas );
	
	if (horasTrabajadas <= 40) {
    sueldoSemanal = 12 * horasTrabajadas;
	} else {
	  sueldoSemanal = (40 * 12) + ((horasTrabajadas - 40) * 16);
	}
  System.out.println ("El sueldo semanal que le corresponde es de " + sueldoSemanal + " euros");
  }
}
