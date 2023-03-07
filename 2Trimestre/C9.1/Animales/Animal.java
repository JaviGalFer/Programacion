/**
* clase Animal creada como abstract ya que es la principal
* @author Fco Javier Gallego Fernández
*/
public abstract class Animal {
    private Sexo sexo;          //Creamos los atributos
    private String nombre;
    private int edad;

    public Animal(String nombre,int edad, Sexo sexo){
        this.nombre = nombre;
        this.edad = edad;               //Aplicamos los atributos a las variables
        this.sexo = sexo;
    }

    //Aplicamos el get para devolver el Nombre 
    public String getNombre(){
        return nombre;
    }
    //Aplicamos el set para atribuir el nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    //Aplicamos el get para devolver la edad
    public int getEdad(){
        return edad;
    }
    //Aplicamos el set para atribuir la edad
    public void setEdad(int edad){
        this.edad = edad;
    }
    //Aplicamos la clase sexo
    public Animal() {
        this.sexo = Sexo.MACHO;
    }

    public Animal (Sexo s){
        this.sexo = s;
    }

    public Sexo getSexo(){
        return this.sexo;
    }
    //Creamos diferentes funciones que se van a heredar
    public void duerme(){
        System.out.println("ZZzzz");
    }

    public void come (String comida) {
        System.out.println("Estoy comiendo " + comida);
    }

    public void mover(){
        System.out.println("Me estoy moviento");
    }

    public void emitirSonido(){
        System.out.println("*Emite un sonido*");
    }

    public void pelear(Animal otroAnimal){
        System.out.println("No quiero pelear con " + otroAnimal.getClass().getSimpleName() + "." );
    }


}
