public class J1_01 {
    public static void main(String[] args) throws Exception {
        int num1 = 1;
        int num2 = 1;
        double S1 = 0;
        while (num1 < 100) {
            S1 += (double) num1 / num2;
            num1 = num1 + 2;
            num2++;
        }
        double S2 = 0;
        double temp = 0;
        num1 = 1;
        num2 = 50;
        while (num1 < 51) {
            temp = Math.pow(2, num1);
            S2 += (double) (temp / num2);
            num1++;
            num2--;
        }
        double S3 = 0;
        num1 = 1;
        num2 = 1;
        int num3 = 3;
        while (num1 < 11) {
            if ((num1 % 2) != 0) {
                S3 += (double) num1 / num2;
            } else {
                S3 -= (double) num1 / num2;
            }
            num1++;
            num2 = num2 + num3;
            num3 = num3 + 2;
        }
        System.out.println("S1 = " + S1);
        System.out.println("S2 = " + S2);
        System.out.println("S3 = " + S3);
    }
}
