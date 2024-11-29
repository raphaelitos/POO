public class Livro extends Produto{
    String autor;

    public Livro(String autor, String nome, float preco){
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public String toString(){
        return super.toString() + "\nAutor: " + 
        this.autor + "\n\n";
    }
}