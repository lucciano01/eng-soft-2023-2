package cartaoB;

import interfaces.Juros;

public class CartaoBJuros implements Juros {
    @Override
    public double getJuros() {
        return 0.08;
    }
}
