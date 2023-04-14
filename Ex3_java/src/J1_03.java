import java.util.Scanner;

public class J1_03 {
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(System.in);
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        int maior=0;
        if(num1>num2){
            for(int i=1;i<=num2;i++){
                if((num1%i==0)&&(num2%i==0)){
                    maior=i;
                }
            }


        }
        else{
            for(int i=1;i<=num1;i++){
                if((num1%i==0)&&(num2%i==0)){
                    maior=i;
            }
        }
    }
    System.out.println(maior);
    }
}