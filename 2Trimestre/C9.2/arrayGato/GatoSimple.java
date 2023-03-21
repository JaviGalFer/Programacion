/**
* Creamos la clase Pingüino extendida de la clase Ave
* @author Fco Javier Gallego Fernández
*/
public class GatoSimple {
    //Atributos
    private String nombre, raza;
    private int edad;
    

    //métodos

    //constructor
    
    GatoSimple (String nombre, String raza, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }
    
    GatoSimple(){
        this.nombre ="";
        this.raza = "";
        this.edad = 0;
    }
    
    
    //getter

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getRaza(){
        return this.raza;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    //Hace que el gato maulle

    public void maulla(){
        System.out.println("Miaaauuuu");
    }

    //Hace que el gato ronronee

    public void ronronea(){
        System.out.println("prrrrrrr");
    }

    //Hace que el gato coma

    public void come(String comida){
        if (comida.equals("pescado")){
            System.out.println("Grasia illo");
        }else {
            System.out.println("Eso te lo va a come tu shulo");
        }
    }

    

}
