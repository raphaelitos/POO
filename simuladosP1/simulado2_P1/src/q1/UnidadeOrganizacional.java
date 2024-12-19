package q1;

import java.util.HashSet;
import java.util.Set;

public abstract class UnidadeOrganizacional {
    private Set<Funcionario> funcionarios = new HashSet<Funcionario>();

    public double getSalarioMedio(){
        double count = 0.0f;
        for(Funcionario f : funcionarios){
            count += f.getSalario();
        }
        return (count/funcionarios.size());
    }

    public Set<Funcionario> getFuncionarios(){
        Set<Funcionario> f = new HashSet<>(this.funcionarios);
        
        return f;
    }

    public void addFunc(Funcionario f){
        funcionarios.add(f);
    }

    public void removeFunc(Funcionario f){
        funcionarios.remove(f);
        f.setSetor(null);
    }
}
