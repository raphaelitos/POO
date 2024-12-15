package simulado_q3;

import java.util.HashMap;

public class Banco {
    private final String nome;
    private HashMap<String, Agencia> agencias = new HashMap<>();

    public String getNome() {
        return nome;
    }

    public Banco(String nome){
        this.nome = nome;
    }

    public Agencia criaAgencia(String nomeAgencia){
        Agencia a = new Agencia(nomeAgencia);
        this.agencias.put(nomeAgencia, a);
        return a;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome do banco: ").append(this.nome).append("\n");
    
        for (Agencia a : agencias.values()) {
            sb.append("Agência: ").append(a.toString()).append("\n");
        }
    
        return sb.toString();
    }
}
