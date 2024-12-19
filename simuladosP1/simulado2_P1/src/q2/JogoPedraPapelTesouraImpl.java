package q2;

import java.util.Random;

public class JogoPedraPapelTesouraImpl implements  JogoPedraPapelTesoura {
	private Jogada j1;
	private Jogada j2;
    
	public JogoPedraPapelTesouraImpl(){
		j1 = jogadaJogador1();
		j2 = jogadaJogador2();
	}

    /**
	 * Indica se houve vencedor.
	 * 
	 * @return retorna true se há vencedor e false se houve empate
	 */
	public boolean haVencedor(){
		if(j1 == Jogada.PEDRA){
			if(j2 == Jogada.PAPEL || j2 == Jogada.TESOURA){
				return true;
			}
			return false;
		}
		else if(j1 == Jogada.PAPEL){
			if(j2 == Jogada.PEDRA || j2 == Jogada.TESOURA){
				return true;
			}
			return false;
		}
		else{
			if(j2 == Jogada.PAPEL || j2 == Jogada.PEDRA){
				return true;
			}
			return false;
		}
	}

	private Jogada converteJogada(int n){
		if(n == 0){
			return Jogada.PEDRA;
		}
		else if(n == 1){
			return Jogada.PAPEL;
		}
		else{
			return Jogada.TESOURA;
		}
	}

	/**
	 * Retorna a jogada do primeiro jogador.
	 * 
	 * @return jogada escolhida aleatoriamente na construção do objeto
	 */
	public Jogada jogadaJogador1(){
        Random r = new Random();
        int n = r.nextInt(3); // 0, 1 ou 2
        return converteJogada(n);
    }

	/**
	 * Retorna a jogada do segundo jogador.
	 * 
	 * @return jogada escolhida aleatoriamente na construção do objeto
	 */
	public Jogada jogadaJogador2(){
        Random r = new Random();
        int n = r.nextInt(3); // 0, 1 ou 2
        return converteJogada(n);
    }

	/**
	 * 
	 * @return 1 ou 2 dependendo do jogador vitorioso.
	 */
	public int getJogadorVencedor(){
		if(j1 == Jogada.PEDRA){
			if(j2 == Jogada.PAPEL){
				return 2;
			}
			else if(j2 == Jogada.TESOURA){
				return 1;
			}
			else{
				return 0;
			}
		}
		if(j1 == Jogada.PAPEL){
			if(j2 == Jogada.PEDRA){
				return 1;
			}
			else if(j2 == Jogada.TESOURA){
				return 2;
			}
			else{
				return 0;
			}
		}
		if(j1 == Jogada.TESOURA){
			if(j2 == Jogada.PEDRA){
				return 2;
			}
			else if(j2 == Jogada.PAPEL){
				return 1;
			}
			else{
				return 0;
			}
		}
		else{
			System.out.println("Jogada invalida");
			return 0;
		}
	}
}