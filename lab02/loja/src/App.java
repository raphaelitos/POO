public class App {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[5];

        produtos[0] = new Jogo("God of War", 199.99f, 18);
        produtos[1] = new Livro("J.K. Rowling", "Harry Potter e a Pedra Filosofal", 49.90f);
        produtos[2] = new Jogo("The Legend of Zelda: Breath of the Wild", 299.99f, 12);
        produtos[3] = new Livro("George Orwell", "1984", 39.90f);
        produtos[4] = new Jogo("Minecraft", 99.99f, 10);

        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}