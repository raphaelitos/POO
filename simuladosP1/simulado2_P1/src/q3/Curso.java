package q3;

import java.util.HashMap;

public class Curso {

    private final String nome;
    private HashMap<String, Disciplina> disciplinas = new HashMap<>();
    
    public String getNome() {
        return nome;
    }

    public Curso(String nome){
        this.nome = nome;
    }

    public Disciplina criaDisciplina(String idDisciplina, String nomeDisciplina) {
        Disciplina d = new Disciplina(idDisciplina, nomeDisciplina);
        this.disciplinas.put(idDisciplina, d);
        return d;
    }

    public void estabelecePreReq(Disciplina disciplina, String trim) {
        disciplina.setPreRequisito(trim);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Curso: " + this.nome + "\nDisciplinas:\n");
        for (Disciplina d : disciplinas.values()) {
            sb.append(d.toString()).append("\n");
        }
        return sb.toString();
    }

}
