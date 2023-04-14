import java.util.Scanner;

public class J1_07 {
    public static void main(String[] args) throws Exception {
        double p=0;
        Ponto p1= new Ponto();
        Ponto p2= new Ponto();
        Ponto p3= new Ponto();
        Scanner scanner= new Scanner(System.in);
        p1.x=scanner.nextDouble();
        p1.y=scanner.nextDouble();
        p2.x=scanner.nextDouble();
        p2.y=scanner.nextDouble();
        p3.x=scanner.nextDouble();
        p3.y=scanner.nextDouble();
        Triangulo t= new Triangulo();
        t.p1=p1;
        t.p2=p2;
        t.p3=p3;
        p=t.perimetro();

        System.out.println(String.format("%.5f", p));
        

    }
}
