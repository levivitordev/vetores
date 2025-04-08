//ATIVIDADE 5 DA FICHA DE VETORES

import java.util.Random;

public class atv02 {
    public static void main(String[] args) {

        int[] vetor = new int[10];
        Random random = new Random();

        System.out.println("VALORES DO VETOR:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(50) + 1;
            System.out.print(vetor[i] + " ");
        }
        int qntdPares = 0;
        for (int numeroPar : vetor) {

            if (numeroPar % 2 == 0) {
                qntdPares++;
            }
        }
        System.out.printf("\nO vetor possui %d valores pares.%n" , qntdPares);
    }
}
