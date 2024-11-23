public class FuncionarioTempoIntegral extends Funcionario{
    private float horasSemanais;
    
    public FuncionarioTempoIntegral(String nome, float salario) {
        super(nome, salario);
        this.horasSemanais = 40;
    }
    
    public float getHorasSemanais() {
        return horasSemanais;
    }
    
    public void setHorasSemanais(float horasSemanais) {
        this.horasSemanais = horasSemanais;
    }
}