package principal;

public interface Builder <K, T>{
    public K cpf(String cpf);
    public K rg(String rg);
    public K idade(int idade);
    public K peso (float peso);
    public K altura(float altura);
    public T create();

}
