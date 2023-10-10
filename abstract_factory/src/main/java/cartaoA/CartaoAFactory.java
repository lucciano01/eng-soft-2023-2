package cartaoA;

import interfaces.CalculoFactory;
import interfaces.Desconto;
import interfaces.Juros;
import interfaces.Multa;

public class CartaoAFactory implements CalculoFactory {
    @Override
    public Juros gerarJuros() {
        return new CartaoAJuros();
    }

    @Override
    public Desconto gerarDesconto() {
        return new CartaoADesconto();
    }

    @Override
    public Multa gerarMulta() {
        return new CartaoAMulta();
    }
}
