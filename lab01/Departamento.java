import java.util.List;
import java.util.LinkedList;

public class Departamento{
    private String nome;
    private List<Funcionario> funcionarios = new LinkedList<Funcionario>();
    private Empresa empresa;

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void addFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
        funcionario.setDepartamento(this);
    }

    public List<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }

    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    public float getMediaSalarial(){
        if(funcionarios.size() == 0) return 0;
        float soma = 0;
        for (Funcionario f : funcionarios) {
            soma += f.getSalario();
        }
        return soma / funcionarios.size();
    }

    @Override
    public String toString() {
        return this.nome + " - " + this.empresa;
    }
}