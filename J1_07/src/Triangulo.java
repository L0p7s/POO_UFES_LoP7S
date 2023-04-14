public class Triangulo {
    Ponto p1;
    Ponto p2;
    Ponto p3;

    double perimetro(){
        double result=0;
       result= this.p1.distancia(p2)+this.p2.distancia(p3)+this.p3.distancia(p1);
       return result;
    }
    
}
