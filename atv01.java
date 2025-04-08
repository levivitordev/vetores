//ATIVIDADE 2 DA FICHA DE VETORES 
import java.util.Scanner;

public class atv01 {
    public static void main(String[] args) {
        int[] vetor = new int[6];
        Scanner input = new Scanner(System.in);


        System.out.println("DIGITE 6 NUMEROS INTEIROS");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %d°: ", i + 1);
            vetor[i] = input.nextInt();
        }
        System.out.println("Esses são os numeros escolhidos: ");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        input.close();
    }
}