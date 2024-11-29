public class Triangulo {
    private final Ponto a, b, c;

    public Triangulo(Ponto a, Ponto b, Ponto c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Ponto getA() {
        return a;
    }

    public Ponto getB() {
        return b;
    }

    public Ponto getC() {
        return c;
    }

    public double getPerimetro(){
        double m = this.a.distancia(b);
        double n = this.a.distancia(c);
        double o = this.c.distancia(b);
        return m + n + o;
    }

}
