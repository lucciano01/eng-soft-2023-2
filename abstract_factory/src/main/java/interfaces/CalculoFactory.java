package interfaces;

public interface CalculoFactory {

    Juros gerarJuros();

    Desconto gerarDesconto();

    Multa gerarMulta();
}
