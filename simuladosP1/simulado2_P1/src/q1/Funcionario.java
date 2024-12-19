package q1;

public class Funcionario {
    private final String nome;
    private Setor setor;
    private double salario;

    public Funcionario(String nome, double salario, Setor s){
        this.nome = nome;
        this.salario = salario;
        this.setor = s;
        s.addFunc(this);
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString(){
        return this.nome + '|' +
        this.salario + '|' + this.setor;
    }
}
