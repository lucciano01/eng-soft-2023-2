package principal;

public class App {

    public static void main(String[] args) {
        var pessoa1 = new PessoaBuilder("Jose").altura(1.75f).rg("12345").idade(20).create();
        var pessoa2 = new PessoaBuilder("Maria").cpf("909090").peso(60.0f).altura(1.60f).create();

        System.out.println("Pessoa 1:" +pessoa1);
        System.out.println("Pessoa 2:" +pessoa2);
    }
}
