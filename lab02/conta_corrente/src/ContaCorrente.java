public class ContaCorrente {
    private double saldo = 0;
    private final String nome;

    public String getNome() {
        return nome;
    }

    public ContaCorrente(String nome, double saldo){
        this.saldo = saldo;
        this.nome = nome;
    }

    public ContaCorrente(String nome){
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxa(){
        return .005;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        double desconto = valor * (1 + this.getTaxa());
        if(this.saldo < desconto){
            System.out.println("saldo insuficiente para saque");
            return;
        }
        this.saldo -= desconto;
    }

    @Override
    public String toString(){
        return "NOME: " + this.nome + "\nSALDO: " + this.saldo;
    }
}

/* Crie uma classe para representar uma conta corrente, com métodos para depositar uma quantia, sacar uma quantia e 
obter o saldo. Para cada saque será debitada também uma taxa de operação equivalente à 0,5% do valor sacado. Crie, 
em seguida, uma subclasse desta classe anterior para representar uma conta corrente de um cliente especial. Clientes 
especiais pagam taxas de operação de apenas 0,1% do valor sacado.   */