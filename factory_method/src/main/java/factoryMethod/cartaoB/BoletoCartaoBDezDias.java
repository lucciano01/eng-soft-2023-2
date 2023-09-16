package factoryMethod.cartaoB;

import factoryMethod.Boleto;

public class BoletoCartaoBDezDias extends Boleto {

    protected BoletoCartaoBDezDias(double valor) {
        super(valor);
        setJuros(0.04);
        setMulta(0.08);
    }
}
