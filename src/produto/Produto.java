package produto;

public class Produto {
    private int id;
    private String nome;
    private double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public String obterDetalhes(){
        return String.format("ID: %d | Nome: %s | Preço: R$ %.2f", this.id, this.nome, this.preco);
    }
}
