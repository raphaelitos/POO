public abstract class Produto{
    private float preco;
    private String nome;

    public Produto(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + 
        "\nPreco: " + this.preco;
    }
}