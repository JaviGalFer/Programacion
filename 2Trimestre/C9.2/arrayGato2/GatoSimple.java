/**
* Creamos la clase Pingüino extendida de la clase Ave
* @author Fco Javier Gallego Fernández
*/
public class GatoSimple {
    //Atributos
    private String nombre, raza;
    private int edad;
    static int sardinas = 10; //Atributo de clase

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

    //Hace que el gato coma sardinas


    void come(int s){
    if (sardinas <= 0) {
        System.out.println("Ya no hay sardinas");
        return;
    }
    if (s > sardinas) {
        s = sardinas;
    }
    sardinas -= s;
    System.out.print(nombre + ": ");
    for (int i = 0; i < s; i++) {
        System.out.print("Ñam... ");
    }
    System.out.println();
}

}
