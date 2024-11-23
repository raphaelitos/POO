public class App {
    public static void main(String[] args) {
        System.out.print("oi, ");
        Pessoa jp = new Pessoa("João Paulo");
        System.out.println(jp.getNome());

        Pessoa poliana = new Pessoa("Poliana");
        jp.setMae(poliana);

        Pessoa jussimar = new Pessoa("Jussimar");
        jp.setPai(jussimar);
        
        Pessoa edu = new Pessoa("Eduardo");
        edu.setPai(jp);

        System.out.println("A mãe de "+jp.getNome()+" é "+jp.getMae().getNome());

        System.out.println(edu.getAvós());
        System.out.println("A avó paterna de "+edu.getNome()+" é "+ edu.getAvóPaterna().getNome());

        System.out.println("A avô paterno de "+edu.getNome()+" é "+ edu.getAvôPaterno().getNome());

        for(Pessoa p : edu.getAvós())
        {
            System.out.println(p);
        }    

    }
}
