public class Ponto{
    private final double x;
    private final double y;

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getCordX(){
        return this.x;
    }

    public double getCordY(){
        return this.y;
    }

    public double distancia(Ponto b){
        double d = Math.pow((this.x - b.getCordX()), 2);
        double r = Math.pow((this.y - b.getCordY()), 2);
        return Math.sqrt(d + r);
    }
}
