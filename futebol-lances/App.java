public class App {
    public static void main(String[] args) {
        Partida p = new Partida();
        Lance l = new Gol("Fulano",10);
        p.adicionaLance(l);
        p.adicionaLance(new GolContra("Sicrano",20));
        p.adicionaLance(new Falta(40));
        for (Lance l2 : p.getLances())
        {
            System.out.println(l2);
            System.out.println(l2.getMinuto());
        }
        System.out.println(p.getNumeroLancesBonitos());
    }
}
