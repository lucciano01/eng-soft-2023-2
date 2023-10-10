package cartaoA;

import interfaces.Multa;

public class CartaoAMulta implements Multa {
    @Override
    public double getMulta() {
        return 0.04;
    }
}
