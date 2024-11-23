public class FuncionarioTempoParcial extends Funcionario{
  private int horasSemanais;
  
  public FuncionarioTempoParcial(String nome, float salario){
    super(nome, salario);
  }
  public int getHorasSemanais(){
    return horasSemanais;
  }
  
  public void setNumeroHorasSemanais(int horasSemanais){
    this.horasSemanais = horasSemanais;
  }
}