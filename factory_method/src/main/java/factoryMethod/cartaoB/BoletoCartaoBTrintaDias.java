package factoryMethod.cartaoB;

import factoryMethod.Boleto;

public class BoletoCartaoBTrintaDias extends Boleto {

    protected BoletoCartaoBTrintaDias(double valor) {
        super(valor);
        setJuros(0.08);
        setMulta(0.13);
    }
}
