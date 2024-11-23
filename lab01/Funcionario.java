public abstract class Funcionario{
    private String nome;
    private float salario;
    private Departamento departamento;

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento){
        this.departamento = departamento;
    }
    
    @Override
    public String toString() {
        return "Funcionario{ " +
                "nome=' " + nome + "'" +
                ", salario=" + salario +
                " }\n" + "pertence ao departamento: " + this.departamento;
    }
} 