package main;

import produto.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produtoA = new Produto(1, "Smartphone Android", 1200);
        System.out.println(produtoA.obterDetalhes());

        produtoA.aplicarDesconto(10);
        System.out.println(produtoA.obterDetalhes());
    }
}
