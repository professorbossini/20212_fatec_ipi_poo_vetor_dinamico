public class VetorDinamico{
    private int [] elementos;
    private int qtde;
    private int cap;

    public VetorDinamico(){
        this.qtde = 0;
        this.cap = 4;
        this.elementos = new int[this.cap];       
    }

    public boolean estaCheio (){
        return this.qtde >= this.cap;
        // return this.qtde == this.cap ? true : false;
        // if (this.qtde == this.cap)
        //     return true;
        // return false;
    }

    public void adicionar (int elemento){
        if(!estaCheio()){
            this.elementos[this.qtde] = elemento;
            this.qtde++;        
        }
    }

    public void exibir (){
        System.out.printf ("Qtde: %d, Cap: %d\n", this.qtde, this.cap);
        //enhanced for ou for each (desde o Java 5)
        // for (int elemento : this.elementos){
        //     System.out.printf ("%d ", elemento);
        // }
        //for comum
        for (int i = 0; i < this.qtde; i++){
            System.out.printf ("%d ", this.elementos[i]);
        }    
        System.out.println();
    }
}