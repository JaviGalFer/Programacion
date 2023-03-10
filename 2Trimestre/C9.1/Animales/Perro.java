/**
* Clase Perro extendida de la clase Mamífero
* @author Fco Javier Gallego Fernández
*/
public class Perro extends Mamifero {
    //Creamos el atributo raza dedicado a la clase Perro
    private String raza;
    //Creamos el objeto perro con sus atributos
    public Perro(String nombre, int edad, Sexo sexo, String raza){
        super(nombre, edad, sexo);      //Super para los atributos heredados
        this.raza = raza;               //Le decimos la variable
    }

    public String getRaza(){
        return this.raza;
    }
                                        //Aplicamos get y set
    public void setRaza(String raza){
        this.raza = raza;
    }

    public String getNombre(){
        return super.getNombre();
    }

    //Aplicamos diferentes métodos
    public void ladra(){
        System.out.println("guuau guauu");
    }
    
    public void dameLaPata(){
        System.out.println("Primero dame la chuche shulo");
    }

    public void caza() {
        System.out.println("ji ome con lo agustito que estoy");
    }

    public void moverCola(){
        System.out.println(this.getNombre() + " dice: miraa cómo muevo la colaa de lo feli que toy ompae");
    }

    //@Override para modificar métodos heredados
    @Override
    public void come(String comida) {
        if (comida.equals("Pienso")) {
            System.out.println("Que weno dame ma no sea rata");
        } else {
            System.out.println("Esta mierda me vas a dar?");
        }
    }

    @Override
    public void emitirSonido(){
        System.out.println("Guaaau guauu");
    }

    @Override
    public void mover(){
        System.out.println("Miira como corroooo a ve si me pilla");
    }

    @Override
    public void pelear(Animal otroAnimal){
        if (otroAnimal instanceof Gato){
            System.out.println("Mira er gato te voy a mete un bocao");
        } else {
            super.pelear(otroAnimal);
        }
    }



}
