package factoryMethod.cartaoA;

import factoryMethod.Boleto;

public class BoletoCartaoASessentaDias extends Boleto {

    protected BoletoCartaoASessentaDias(double valor) {
        super(valor);
        setJuros(0.1);
        setMulta(0.2);
    }
}
