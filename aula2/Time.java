public class Time
{
    private String nome;
    private int nMundiais;

    public Time(String nome)
    {
        this.nome=nome;
    }
    public Time(String nome, int nMundiais)
    {
        this.nome=nome;
        this.nMundiais=nMundiais;
    }

    public void incNumeroMundiais()
    {
        this.nMundiais++;
    }
    public int getNumeroMundiais()
    {
        return this.nMundiais;
    }
    public String getNome()   // getter
    {
        return this.nome;
    }
}
