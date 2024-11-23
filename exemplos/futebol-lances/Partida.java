import java.util.LinkedList;
import java.util.List;

public class Partida {
    private List<Lance> lances = 
        new LinkedList<Lance>();
        
    public void adicionaLance(Lance l)
    {
        this.lances.add(l);
    }
    public List<Lance> getLances()
    {
        return this.lances;
    }
    public int getNumeroLancesBonitos()
    {
        int i=0;
        for (Lance l : lances)
        {
            if (l.isBonito()) i++;
        }
        return i;
    }
}
