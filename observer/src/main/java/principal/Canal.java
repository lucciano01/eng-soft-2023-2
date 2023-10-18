package principal;

import java.util.ArrayList;
import java.util.List;

public class Canal {

    private List<ConcreteAssinante> assinantes;
    private String titulo;

    public Canal() {
        this.assinantes = new ArrayList<>();
    }

    public void adicionarAssinantes(List<ConcreteAssinante> assinantes){
        this.assinantes = assinantes;
    }

    public void removerAssinantes(ConcreteAssinante concreteAssinante){
        this.assinantes.remove(concreteAssinante);
    }

    public void notificarAssinantes(){
        this.assinantes.forEach(concreteAssinante -> {
            concreteAssinante.update();
        });
    }

    public void upload(String titulo){
        this.titulo = titulo;
        notificarAssinantes();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
