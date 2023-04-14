import java.util.Scanner;

public class J1_04 {
    public static void main(String[] args) throws Exception {
        int[] vetor = new int[10];
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }
        num=scanner.nextInt();
        int maior = -1, temp = 0;
        int ant = 0, pos = 0;
        for (int i = 0; i < vetor.length - 1; i++) {
            temp = vetor[i] - vetor[i + 1];
            if (temp < 0) {
                temp = temp * -1;
            }
            if (temp > maior) {
                maior = temp;
                ant = i;
                pos = i + 1;
            }
        }
        System.out.print(ant + " " + pos);
        int contCres = 0;
        int contDec = 0;

        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i + 1] > vetor[i]) {
                contCres++;
            }
            if (vetor[i] > vetor[i + 1]) {
                contDec++;
            }
        }
        if (contCres == vetor.length - 1) {
            System.out.print(" Crescente ");
        } else if (contDec == vetor.length - 1) {
            System.out.print(" Decrescente ");
        } else
            System.out.print(" Nao ordenado ");

        int maiores = 0, menores = 0, iguais = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > num) {
                maiores++;
            } else if (vetor[i] < num) {
                menores++;
            } else
                iguais++;
        }
        System.out.println(maiores + " " + menores + " " + iguais);
    }
}
