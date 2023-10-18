import principal.Canal;
import principal.ConcreteAssinante;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        var canal = new Canal();

        var listaAssinantes = new ArrayList<ConcreteAssinante>();
        listaAssinantes.add(new ConcreteAssinante("Maria"));
        listaAssinantes.add(new ConcreteAssinante("Jose"));
        listaAssinantes.add(new ConcreteAssinante("Pedro"));
        listaAssinantes.add(new ConcreteAssinante("Josefa"));

        canal.adicionarAssinantes(listaAssinantes);

        canal.removerAssinantes(listaAssinantes.get(2));

        listaAssinantes.forEach(concreteAssinante -> {
            concreteAssinante.assinarCanal(canal);
        });
        canal.upload("Padrão Observer");

    }
}
