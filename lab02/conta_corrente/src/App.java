public class App {
    public static void main(String[] args) throws Exception {
        ContaCorrente ze = new ContaCorrente("Ze ngm", 200);
        ContaCorrente vip = new ContaCorrenteEspecial("premium", 2000);

        ze.depositar(50);
        ze.sacar(500);
        vip.sacar(150);

        System.out.println(ze);
        System.out.println(vip);

    }
}
