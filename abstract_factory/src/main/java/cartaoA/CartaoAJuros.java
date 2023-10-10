package cartaoA;

import interfaces.Juros;

public class CartaoAJuros implements Juros {
    @Override
    public double getJuros() {
        return 0.02;
    }
}
