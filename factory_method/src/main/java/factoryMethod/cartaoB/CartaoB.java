package factoryMethod.cartaoB;

import factoryMethod.Boleto;
import factoryMethod.Cartao;

public class CartaoB extends Cartao {

    @Override
    public Boleto criaBoleto(int qtdDiasDeAtraso, double valor) {

        switch (qtdDiasDeAtraso){

            case 10:
                return new BoletoCartaoBDezDias(valor);
            case 30:
                return new BoletoCartaoBTrintaDias(valor);
            case 60:
                return new BoletoCartaoBSessentaDias(valor);
            default:
                throw new IllegalArgumentException("Valor inválido!");
        }
    }
}
