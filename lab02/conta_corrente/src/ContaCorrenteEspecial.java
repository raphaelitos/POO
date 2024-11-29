public class ContaCorrenteEspecial extends ContaCorrente {
    
    public ContaCorrenteEspecial(String nome, double saldo){
        super(nome, saldo);
    }
    
    public ContaCorrenteEspecial(String nome){
        super(nome);
    }

    @Override
    public double getTaxa(){
        return .001;
    }   
}