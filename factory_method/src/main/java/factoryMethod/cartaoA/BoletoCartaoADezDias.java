package factoryMethod.cartaoA;

import factoryMethod.Boleto;

public class BoletoCartaoADezDias extends Boleto {

    protected BoletoCartaoADezDias(double valor) {
        super(valor);
        setJuros(0.02);
        setMulta(0.05);
    }
}
