package factoryMethod.cartaoA;

import factoryMethod.Boleto;
import factoryMethod.Cartao;

public class CartaoA extends Cartao {


    @Override
    public Boleto criaBoleto(int qtdDiasDeAtraso, double valor) {
       
        switch (qtdDiasDeAtraso){

            case 10:
                return new BoletoCartaoADezDias(valor);
               
            case 30:
                return new BoletoCartaoATrintaDias(valor);
               
            case 60:
                return new BoletoCartaoASessentaDias(valor);
               
            default:
                throw new IllegalArgumentException("Valor inválido!");
        }
    }
}
