package q1;

public class Setor extends UnidadeOrganizacional{
    private final String nome;
    public String getNome() {
        return nome;
    }
    
    public Setor(String nome){
        this.nome = nome;
    }

    @Override
    public String toString(){
        return this.nome;
    }
}
