package q1;

import java.util.Set;

/**
 * Questão 1 (4 pontos).
 * 
 * Crie classes para representar dados sobre uma empresa com suas unidades organizacionais 
 * (departamentos estruturados em setores) e seus funcionários (lotados em setores). 
 * 
 * Siga o diagrama UML fornecido (diagrama-q1.png). (O diagrama mostra alguns atributos e 
 * algumas operações, mas não é exaustivo quanto aos atributos e operações. 
 * Adicione aqueles que foram necessários.)
 * 
 * Implemente funcionalidade nas suas classes para calcular o salário médio de uma 
 * unidade organizacional, assim como para consultar os funcionários nela lotados 
 * (direta ou indiretamente).
 * 
 * Atenção às indicações de navegabilidade e às cardinalidades.
 * 
 * Sua implementação deve permitir a transferência de um funcionário para outro setor.
 * 
 * Crie um testador para suas classes. 
 * 
 */


public class TestadorQ1 {

	public static void main(String[] args) {
		
		Setor embalagens = new Setor("embalagens");
		Setor impressao = new Setor("impressao");
		
		Funcionario rap = new Funcionario("raphael", 700.0f, embalagens);
		Funcionario vic = new Funcionario("vitanque", 850.0f, embalagens);
		Funcionario con = new Funcionario("conrado", 1920.0f, impressao);

		Departamento of = new Departamento("oficial");
		Departamento outro = new Departamento("terceirizado");

		of.addSetor(impressao);
		of.addSetor(embalagens);

		of.TrocaSetorFunc(embalagens, impressao, rap);

		Empresa ufes = new Empresa("ufes");

		ufes.addDepartamento(outro);
		ufes.addDepartamento(of);

		System.out.println(ufes);
		System.out.println("Departamentos:\n");
		Set<Departamento> departamentos = ufes.getDepartamentos();
		for(Departamento d : departamentos){
			System.out.println(d);
			Set<Setor> setores = d.getSetores();
			for(Setor s : setores){
				System.out.println(s);
				Set<Funcionario> funcionarios = s.getFuncionarios();
				for(Funcionario f : funcionarios){
					System.out.println(f);
				}
				System.out.println(s.getSalarioMedio());
			}
		}
	}
}
