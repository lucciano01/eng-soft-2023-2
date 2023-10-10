import interfaces.CalculoFactory;

public class Cartao {

    public Boleto gerarBoleto(double valor, CalculoFactory factory){
        var boleto = new Boleto(valor, factory);
        System.out.println("Valor do Boleto R$ :" +valor);
        System.out.println("Juros R$ :" +boleto.calcularJuros());
        System.out.println("Multa R$ :" +boleto.calcularMulta());
        System.out.println("Desconto R$ :" +boleto.calcularDesconto());

        return boleto;
    }
}
