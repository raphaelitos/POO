public class Pessoa
{
    private String nome;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome)
    {
        this.nome=nome;
    }
    public Pessoa(String nome, Pessoa pai, Pessoa mae)
    {
        this.nome=nome;
        this.pai=pai;
        this.mae=mae;
    }

    public String getNome()
    {
        return this.nome;
    }
    public void setNome(String nome)
    {
        this.nome=nome;
    }
    public Pessoa getPai() {
        return pai;
    }
    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }
    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public java.util.Set<Pessoa> getAvós()
    {
        java.util.Set<Pessoa> avós = new java.util.HashSet<Pessoa>();
        if (this.mae!=null && this.getAvóMaterna()!=null) avós.add(this.getAvóMaterna());
        if (this.pai!=null && this.getAvóPaterna()!=null) avós.add(this.getAvóPaterna());
        if (this.pai!=null && this.getAvôPaterno()!=null) avós.add(this.getAvôPaterno());
        if (this.mae!=null && this.getAvôMaterno()!=null) avós.add(this.getAvôMaterno());
        return avós;
    }

    public Pessoa getAvóPaterna()
    {
       return this.getPai().getMae();
    }
    public Pessoa getAvôPaterno()
    {
       return this.getPai().getPai();
    }
    public Pessoa getAvóMaterna()
    {
       return this.getMae().getMae();
    }
    public Pessoa getAvôMaterno()
    {
       return this.getMae().getPai();
    }

    public String toString()
    {
        return this.getNome();
    }
    
    private void adicionarAntepassados(Pessoa pessoa, java.util.Set<Pessoa> antepassados) {
        if (pessoa == null) return;
    
        Pessoa pai = pessoa.getPai();
        Pessoa mae = pessoa.getMae();
    
        if (pai != null && antepassados.add(pai)) {
            adicionarAntepassados(pai, antepassados); 
        }
        if (mae != null && antepassados.add(mae)) {
            adicionarAntepassados(mae, antepassados);
        }
    }

    public java.util.Set<Pessoa> getAntepassados() {
        java.util.Set<Pessoa> antepassados = new java.util.HashSet<>();
        adicionarAntepassados(this, antepassados);
        return antepassados;
    }
}