package q1;

import java.util.HashSet;
import java.util.Set;

public class Departamento extends UnidadeOrganizacional {
    private final String nome;
    private Set<Setor> setores = new HashSet<>();

    public Set<Setor> getSetores() {
        return setores;
    }

    public String getNome() {
        return nome;
    }
    
    public Departamento(String nome){
        this.nome = nome;
    }

    public void addSetor(Setor s){
        this.setores.add(s);
    }

    public void TrocaSetorFunc(Setor old, Setor novo, Funcionario f){
        if(!(setores.contains(old) && setores.contains(novo))){
            return;
        }
        old.removeFunc(f);
        novo.addFunc(f);
        f.setSetor(novo);
    }

    @Override
    public String toString(){
        return this.nome + '\n';
    }

}
