package factoryMethod;

import lombok.Data;

@Data
public abstract class Boleto {

    private final double valor;
    private double juros;
    private double multa;

    protected Boleto(double valor) {
        this.valor = valor;
    }

    public double calcularJuros(){
        return this.valor * this.juros;
    }

    public double calcularMulta(){
        return this.valor * this.multa;
    }

}
