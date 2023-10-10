package cartaoB;

import interfaces.Multa;

public class CartaoBMulta implements Multa {
    @Override
    public double getMulta() {
        return 0.09;
    }
}
