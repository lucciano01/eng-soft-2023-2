package cartaoB;

import interfaces.CalculoFactory;
import interfaces.Desconto;
import interfaces.Juros;
import interfaces.Multa;

public class CartaoBFactory implements CalculoFactory {
    @Override
    public Juros gerarJuros() {
        return new CartaoBJuros();
    }

    @Override
    public Desconto gerarDesconto() {
        return new CartaoBDesconto();
    }

    @Override
    public Multa gerarMulta() {
        return new CartaoBMulta();
    }
}
