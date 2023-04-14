import java.util.Scanner;

public class J1_10 {
    public static void main(String[] args) throws Exception {
        int atual = 1, ant = 0, soma = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n != 0) {
            if (n == 1) {
                System.out.print("0 ");
            } else {

                System.out.print(ant + " " + atual + " ");
                for (int i = 0; i < n - 2; i++) {
                    soma = ant + atual;
                    System.out.print(soma + " ");
                    ant = atual;
                    atual = soma;
                }
            }
        }
        System.out.println();
        
    }
}
