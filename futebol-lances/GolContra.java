public class GolContra extends Gol{
    public GolContra(String autor, int minuto)
    {
        super(autor, minuto);
    }

    public String toString()
    {
        return "Gol contra :-( de "+this.getAutor();
    }

    @Override
    public boolean isBonito()
    {
        return false;
    }
}
