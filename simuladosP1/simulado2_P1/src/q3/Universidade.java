package q3;

import java.util.HashSet;
import java.util.Set;

public class Universidade {
    private final String nome;
    public String getNome() {
        return nome;
    }

    private Set<Curso> cursos = new HashSet<>();

    public Universidade(String nomeUniversidade) {
        this.nome = nomeUniversidade;
    }

    public Curso criaCurso(String nomeCurso) {
        Curso c = new Curso(nomeCurso);
        this.cursos.add(c);
        return c;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Universidade: " + this.nome + "\nCursos:\n");
        for (Curso c : this.cursos) {
            sb.append(c.toString()).append("\n");
        }
        return sb.toString();
    }
    
}
