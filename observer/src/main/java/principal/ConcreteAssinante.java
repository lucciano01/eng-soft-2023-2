package principal;

import interfaces.Assinante;

public class ConcreteAssinante implements Assinante {

    private String nome;
    private Canal canal;

    public ConcreteAssinante(String nome){
        this.nome = nome;
    }

    public void assinarCanal(Canal canal){
        this.canal = canal;
    }

    @Override
    public void update() {
        System.out.println(nome +
                ", um novo vídeo foi adicionado" +
                "ao canal!! :" +canal.getTitulo() );
        //TODO - ADICIONAR O TITULO DO VIDEO

    }
}
