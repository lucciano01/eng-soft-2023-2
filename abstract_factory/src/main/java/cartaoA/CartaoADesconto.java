package cartaoA;

import interfaces.Desconto;

public class CartaoADesconto implements Desconto {
    @Override
    public double getDesconto() {
        return 0.03;
    }
}
