package simulado_q3;

import java.util.HashMap;

public class Banco {
    private final String nome;
    public String getNome() {
        return nome;
    }

    private HashMap<String, Agencia> agencias = new HashMap<>();


    public Banco(String nome){
        this.nome = nome;
    }

    public Agencia criaAgencia(String nomeAgencia){
        Agencia a = new Agencia(nomeAgencia);
        this.agencias.put(nomeAgencia, a);
        return a;
    }
}
