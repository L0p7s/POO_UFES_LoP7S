public class Ponto {
    double x;
    double y;
    double distancia(Ponto p){
        return Math.sqrt(Math.pow(p.x-x,2)+Math.pow(p.y-y,2));
    }
}
