import java.util.Scanner;

public class J1_05 {
    public static void main(String[] args) throws Exception {
        int[] vetor= new int [10];
        Scanner scanner= new Scanner(System.in);
        for (int i=0;i<vetor.length;i++){
            vetor[i]=scanner.nextInt();
        }
        int inicio=vetor[0],razao=vetor[1]-vetor[0];
        boolean PA=true;
        for(int i=1;i<vetor.length-1;i++){
            if(vetor[i+1]-vetor[i]!=razao){
                System.out.println("Nao");
                PA=false;
                break;
            }
        }
        if(PA){
            System.out.println("Sim "+inicio+" "+razao);
        }

    }
}
