//ATIVIDADE 7 DA FICHA DE VETORES

import java.util.Random;

public class atv04 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Random random = new Random();

        System.out.println("ESSES SÃO OS NUMEROS DO VETOR:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(10) + 1;
            System.out.print(vetor[i] + " ");
        }
        int posicao = 0;
        int maiorNumero = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiorNumero) {
                maiorNumero = vetor[i];
                posicao = i;
            }
        }

        System.out.println("");
        System.out.println("O maior numero é o: " + maiorNumero);
        System.out.println("Ele se encontra na posição : " + posicao);
    }
}