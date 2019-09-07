public class TimeDrivenSimulation {


    static void preenchendoFila() throws InterruptedException {
        int [] array = new int[10];
        for (int i = 0; i < array.length; i ++){
            if (array[i] == 0){
                array[i] = 1;
                System.out.println("Roda gigante com o lugar " + (i + 1) + " sendo ocupado por: " + array[i] + " pessoa");
            }
        }

        System.out.println("\n##############################\n  RODA GIGANTE CHEIA CHEIA!!\n##############################\n");
        esvaziandoFila(array);


    }

    static void esvaziandoFila(int [] array) throws InterruptedException {

        System.out.println("Tempo de espera para o esvaziamento é de 5 segundos. \n");

        Thread.sleep(5000);

        for (int i = 0; i < array.length; i++){
            array[i] = 0;
            System.out.println("Roda gigante com o lugar " + (i + 1) + " sendo ocupado por: " + array[i] + " pessoa");

        }
        System.out.println("\n########################################################\nRoda gigante esvaziada, pronta para receber mais pessoas!!\n########################################################\n");
        System.out.println("PREENCHENDO RODA GIGANTE...");
        Thread.sleep(5000);
        preenchendoFila();
    }

    public static void main(String[] args) throws InterruptedException {
        preenchendoFila();
    }
}


