//ATIVIDADE 6 DA FICHA DE VETORES

import java.util.Scanner;

public class atv03 {
    public static void main(String[] args) {

        int[] vetor = new int[10];
        Scanner input = new Scanner(System.in);

        System.out.println("DIGITE 10 NUMEROS");
        System.out.println("");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "°:");
            vetor[i] = input.nextInt();
        }

        int numeroMaior = vetor[0];
        for (int numero : vetor) {
            if (numero > numeroMaior) {
                numeroMaior = numero;
            }

        }
        int numeroMenor = vetor[0];
        for (int numero : vetor) {
            if (numero < numeroMenor) {
                numeroMenor = numero;
            }
        }
        System.out.println("O maior numero do seu vetor é: " + numeroMaior);
        System.out.println("O menor numero do seu vetor é: " + numeroMenor);

        input.close();
    }
}
