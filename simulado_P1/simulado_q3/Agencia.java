package simulado_q3;

import java.util.HashMap;

public class Agencia {
    private String nome;
    public String getNome() {
        return nome;
    }

    HashMap<String, Conta> contas = new HashMap<>();
    
    public Agencia(String nome){
        this.nome = nome;
    }

    public void adicionaConta(Conta c){
        this.contas.put(c.getNome(), c);
    }

    public double getSaldoMedio(){
        double cont = 0;
        for (Conta c : contas.values()) {
            cont += c.getSaldo();
        }
        return cont / contas.values().size();
    }

    @Override
    public String toString(){
        return ("Agência: " + this.nome + ", saldo médio: " + getSaldoMedio());
    }
}
