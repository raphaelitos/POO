public abstract class Lance
{
    private int minuto;

    public abstract boolean isBonito();

    public Lance(int minuto)
    {
        this.minuto=minuto;
    }

    public int getMinuto()
    {
        return this.minuto;
    }
}
