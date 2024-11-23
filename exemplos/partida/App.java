import java.util.LinkedList;

public class App
{
    public static void main(String[] args) {

        LinkedList<Partida> partidas = new LinkedList<>();
        Time flamengo = new Time("Flamengo");
        Time vasco = new Time("Vasco");
        Time fluminense = new Time("Fluminense");
        Partida p1 = new Partida(flamengo, vasco);
        partidas.add(p1);
        Partida p2 = new Partida(flamengo, fluminense);
        partidas.add(p2);
        System.out.println(partidas.get(1).getTimeB().getNumeroMundiais());
        for(Partida p : partidas)
        {
            System.out.print(p.getTimeA().getNome());
            System.out.print(" x ");
            System.out.println(p.getTimeB().getNome());
        }
    }
}