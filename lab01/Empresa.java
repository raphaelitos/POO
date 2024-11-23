import java.util.Set;
import java.util.HashSet;

public class Empresa {
    private String nome;
    private Set<Departamento> departamentos = new HashSet<Departamento>();
   
    public Empresa(String nome) {
      this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void addDepartamento(Departamento departamento) {
        this.departamentos.add(departamento);
        departamento.setEmpresa(this);
    }

    public Set<Departamento> getDepartamentos() {
        return this.departamentos;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}