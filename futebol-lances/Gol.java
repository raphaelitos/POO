public class Gol extends Lance {
    
    private String autor;

    public Gol(String autor, int minuto)
    {
        super(minuto);
        this.autor=autor;
    }

    public String getAutor()
    {
        return this.autor;
    }

    @Override
    public String toString()
    {
        return "Goal by "+getAutor()+"!!!!!!";
    }

    @Override
    public boolean isBonito() {
        return true;
    }
}
