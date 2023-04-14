public class J1_02 {
    public static void main(String[] args) throws Exception {
        int ab=0, cd=0, ef=0;
        for(int i=1000; i<=9999;i++){   
            ab=i/100;
            cd=i-(ab*100);
            ef=ab+cd;
            if(Math.pow(ef,2)==i){
            System.out.println(i);
            }

        }
    }
}