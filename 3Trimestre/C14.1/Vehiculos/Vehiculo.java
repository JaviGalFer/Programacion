/**
* Clase vehículo abstract ya que es la principal
* @author Fco Javier Gallego Fernández
*/
public abstract class Vehiculo {
    
    // atributos de clase
    private static int kmTotales = 0;
    private static int vehiculosCreados = 0;

    // atributos de la instancia
    private int kmRecorridos;
    
    //Funciones de la clase
    public Vehiculo() {
        this. kmRecorridos = 0;
    }

    public int getKmRecorridos() {
        return this.kmRecorridos;
    }

    public static int getKmTotales(){
        return Vehiculo.kmTotales;
    }
    
    /**
     * Esta clase hace que un vehículo recorra una distancia determinada.
     * @param k -> kilómetros a recorrer
     */
    public void recorre(int k){
        this.kmRecorridos += k;
        Vehiculo.kmTotales += k;
    }

    // comprueba si la cadena es solo de números
    public static boolean esNumerico(String str){
        return str != null && str.matches("[0-9.]+");
    }
}
