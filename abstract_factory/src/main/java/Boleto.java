import interfaces.CalculoFactory;
import interfaces.Desconto;
import interfaces.Juros;
import interfaces.Multa;
import lombok.Data;

@Data
public class Boleto {

    private double valor;
    private Juros juros;
    private Desconto desconto;
    private Multa multa;

    public Boleto(double valor, CalculoFactory factory){
        this.valor = valor;
        this.juros = factory.gerarJuros();
        this.desconto = factory.gerarDesconto();
        this.multa = factory.gerarMulta();
    }

    public double calcularJuros(){
        return this.valor * this.juros.getJuros();
    }
    public double calcularMulta(){
        return this.valor * this.multa.getMulta();
    }
    public double calcularDesconto(){
        return this.valor * this.desconto.getDesconto();
    }
}
