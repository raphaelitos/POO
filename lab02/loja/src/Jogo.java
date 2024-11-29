public class Jogo extends Produto{
    private int idadeMin;

    public Jogo(String nome, float preco, int idade){
        super(nome, preco);
        this.idadeMin = idade;
    }

    public int getIdadeMin() {
        return idadeMin;
    }

    @Override
    public String toString(){
        return super.toString() + "\nIdade Mínima: " + 
        this.idadeMin + "\n\n";
    }
}
