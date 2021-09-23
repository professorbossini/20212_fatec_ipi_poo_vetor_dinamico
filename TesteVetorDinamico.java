import java.util.Random;

public class TesteVetorDinamico {
    public static void main(String[] args) {
        Random gerador = new Random();
        VetorDinamico vetorDinamico = new VetorDinamico();
        for (int i = 0; i < 10; i++){
            vetorDinamico.exibir();
            int aleatorio = gerador.nextInt(20) + 1;
            vetorDinamico.adicionar(aleatorio);
        }

    }
}
