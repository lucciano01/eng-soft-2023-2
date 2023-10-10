import cartaoA.CartaoAFactory;
import cartaoB.CartaoBFactory;

public class App {
    public static void main(String[] args) {

        var cartao = new Cartao();

        System.out.println("------Boleto Cartão A-------");
        cartao.gerarBoleto(100.0, new CartaoAFactory());

        System.out.println("------Boleto Cartão B-------");
        cartao.gerarBoleto(100.0, new CartaoBFactory());
    }
}
