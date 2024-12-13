package simulado_q2;

import java.util.Random;

public class Pokemon implements PersonagemDeLuta<Pokemon> {
    int vitalidade, hDano, lDano, atual;
    
    public Pokemon(int vitalidade, int lDano, int hDano){
        this.vitalidade = vitalidade;
        this.lDano = lDano;
        this.hDano = hDano;
        atual = vitalidade;
    }

    public boolean atacar(Pokemon personagemAtacado){
        Random r = new Random();
        int dano;
        if(r.nextBoolean()){
            dano = this.hDano;
        }
        else{
            dano = this.lDano;
        }
        
        personagemAtacado.atual -= dano;

        return (personagemAtacado.atual <= 0);
    }
	
    public void regenera(){
        this.atual = vitalidade;
    }
	
    public int getPontosVitalidade(){
        return this.atual;
    }
}
