/**
* Clase Gato extendida de la clase Mamífero
* @author Fco Javier Gallego Fernández
*/
public class Gato extends Mamifero {
    //Se crea un atributo específico para esta clase
    private String raza;
    public Gato(String nombre, int edad, Sexo sexo, String raza){       //Creamos el objeto con atributos heredados
        super(nombre, edad, sexo);                                      //Utilizamos super para las heredadas
        this.raza = raza;                                               //this.raza para el atributo creado y decirle el dato que le entra
    }

    public String getRaza(){
        return this.raza;
    }                                   //Aplicamos el get y set

    public void setRaza(String raza){
        this.raza = raza;
    }

    //Aplicamos los diferentes métodos para la clase

    public void afilarGarras(){
        System.out.println(this.getNombre() + " se afila sus garras en el sofá.");
    }

    public void ronronea(){
        System.out.println("Prrrrrrrr");
    }
    
    public void arañar(){
        System.out.println("Ven que te araño con mis peaso uñas");
    }

    public void peleaCon(Gato contrincante){
        if (this.getSexo() == Sexo.HEMBRA) {
            System.out.println("Que me zuerte que no quiero pelea");
        }else {
            if (contrincante.getSexo() == Sexo.HEMBRA){
                System.out.println("Zeñora suerteme el braso");
            }else {
                System.out.println("Ven aquí que te va a entera ompare");
            }
        }
    }

    public void limpiate(){
        System.out.println("ira como me limpio a lametaso");
    }

    public void caza(){
        System.out.println("IRAAA UNA MOSCAAA UNA MOOSCAAAAAAAA");
    }
    // @Override para métodos que se heredan pero se le aplican cambios específicos
    @Override
    public void come(String comida) {
        if (comida.equals("pienso")) {
            System.out.println("Que weno dame ma no sea rata");
        } else if (comida.equals("latita")) {
            System.out.println("La lata te la va a come tú");
        } else {
            System.out.println("Esta mierda me vas a dar?");
        }
    }

    @Override
    public void emitirSonido(){
        System.out.println("Meeewwwww");
    }

    @Override
    public void mover(){
        System.out.println("Mira como me muevo con agilidad ompae");
    }

    @Override
    public void pelear(Animal otroAnimal){
        if (otroAnimal instanceof Perro){
            System.out.println("Ven aquí perro que te rajo");
        } else{
            super.pelear(otroAnimal);
        }
        
    }

}
