public class Ficha {
    private int lado1, lado2;
    private static int numFichasCreadas;

    //Constructor
    public Ficha(int lado1, int lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
        Ficha.numFichasCreadas++;
    }

    public Ficha(){
        this.lado1 = (int)(Math.random()*7);
        this.lado2 = (int)(Math.random()*7);
        Ficha.numFichasCreadas++; 
    }

    public Ficha voltea(){
        return new Ficha(this.lado2, this.lado1);
    }

    public boolean encaja (Ficha ficha2){
        return (this.lado1==ficha2.lado1) || (this.lado2==ficha2.lado2 ) ||
                (this.lado1==ficha2.lado2) || (this.lado2==ficha2.lado1);
    }

}
