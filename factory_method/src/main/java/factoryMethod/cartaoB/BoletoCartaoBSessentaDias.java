package factoryMethod.cartaoB;

import factoryMethod.Boleto;

public class BoletoCartaoBSessentaDias extends Boleto {

    protected BoletoCartaoBSessentaDias(double valor) {
        super(valor);
        setJuros(0.12);
        setMulta(0.18);
    }
}
