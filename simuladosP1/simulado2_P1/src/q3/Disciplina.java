package q3;

import java.util.HashSet;
import java.util.Set;

public class Disciplina {

    private String nome, id;
    private Set<String> preReq = new HashSet<>();


    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Disciplina(String idDisciplina, String nomeDisciplina) {
        this.nome = nomeDisciplina;
        this.id = idDisciplina;
    }

    public void setPreRequisito(String trim) {
        this.preReq.add(trim);
    }

    @Override
    public String toString() {
        return "NOME: " + this.nome +
               " ID: " + this.id +
               " Pre-Requisitos: " + (preReq.isEmpty() ? "Nao ha" : String.join(", ", preReq));
    }
}