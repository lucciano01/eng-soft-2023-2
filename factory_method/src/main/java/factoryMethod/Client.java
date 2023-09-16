package factoryMethod;

import factoryMethod.cartaoA.CartaoA;
import factoryMethod.cartaoB.CartaoB;

public class Client {

    public static void main(String[] args) {

        var cartaoA = new CartaoA();
        System.out.println("-------- CARTÃO A ---------");
        cartaoA.gerarBoleto(10, 100.0);
        cartaoA.gerarBoleto(30, 100.0);
        cartaoA.gerarBoleto(60, 100.0);

        System.out.println("-------- CARTÃO B ---------");

        var cartaoB = new CartaoB();
        cartaoB.gerarBoleto(10, 100.0);
        cartaoB.gerarBoleto(30, 100.0);
        cartaoB.gerarBoleto(60, 100.0);
    }
}
