package factoryMethod;

public abstract class Cartao {

    public Boleto gerarBoleto(int qtdeDiasDeAtraso, double valor){

        var boleto = criaBoleto(qtdeDiasDeAtraso, valor);

        System.out.println("Valor Boleto R$ :" +boleto.getValor()+ " - Dias de atraso : " +qtdeDiasDeAtraso);
        System.out.println("Juros R$ :" +boleto.calcularJuros());
        System.out.println("Multa R$ :" +boleto.calcularMulta());
        return boleto;
    }

    public abstract Boleto criaBoleto(int qtdDiasDeAtraso, double valor);
}
