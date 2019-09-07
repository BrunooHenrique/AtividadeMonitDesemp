import java.util.Random;

public class EventDrivenSimulation {


    static void preenchendoFila() throws InterruptedException {
        Random fila = new Random();
        int qtd = fila.nextInt(10); //se eu utilizasse novamente em outro ponto o trecho do código "fila.nextInt(10)" iria calcular outro numero aleatório entre 0 e 10, por isso, atribuí o valor
        // aleatório calculado à variável qtd.
        System.out.println("A quantidade de pessoas na fila é: " + qtd);
        int [] arrayFila = new int[qtd];
        for (int i = 0; i < arrayFila.length; i++){
            arrayFila[i] = 1;
            System.out.println(arrayFila[i]);
        }
        atendimentoFila(arrayFila);
    }

    static void atendimentoFila(int [] arrayFila) throws InterruptedException {

        System.out.println("Tempo de espera para atendimento de no máximo 10 segundos. ");
        Random r = new Random();


        for (int i = 0; i < arrayFila.length; i++){
            int tempoAleatório = r.nextInt(10000); /*Caso o tempo de atendimento seja aleatório para CADA cliente!!*/
            System.out.println("Tempo calculado: " + (tempoAleatório + 1000) / 1000);
            Thread.sleep(tempoAleatório);
            arrayFila[i] = 0;
            System.out.println(arrayFila[i]);
        }
        System.out.println("Clientes atendidos.");
        preenchendoFila();

    }

    public static void main(String[] args) throws InterruptedException {
        preenchendoFila();
    }


}
