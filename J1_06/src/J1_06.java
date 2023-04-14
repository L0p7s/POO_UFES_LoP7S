import java.util.Scanner;

public class J1_06 {
    public static void main(String[] args) throws Exception {
        double[][] mat1 = new double[5][4];
        double[][] mat2 = new double[4][6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                mat1[i][j] = scanner.nextDouble();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                mat2[i][j] = scanner.nextDouble();
            }
        }
        double result = 0.;
        for (int i = 0; i < 5; i++) {
            if(i>=1){
            System.out.println();
            }
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 4; k++) {
                    result += mat1[i][k] * mat2[k][j];

                }
                System.out.printf("%.2f ", result);
                result=0;
            }
        }
        System.out.println();
    }
}
