package q1;

import java.util.HashSet;
import java.util.Set;

public class Empresa {
    private final String nome;
    public String getNome() {
        return nome;
    }

    private Set<Departamento> departamentos = new HashSet<>();

    public Set<Departamento> getDepartamentos() {
        return departamentos;
    }

    public Empresa(String nome){
        this.nome = nome;
    }

    public void addDepartamento(Departamento d){
        this.departamentos.add(d);
    }

    @Override
    public String toString(){
        return this.nome;
    }
}
