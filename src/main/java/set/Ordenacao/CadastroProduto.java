package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    //atributos
    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new Produto.ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto(1L, "Produto 1", 25.20, 3);
        cadastroProduto.adicionarProduto(2L, "Produto 2", 16.20, 3);
        cadastroProduto.adicionarProduto(3L, "Produto 3", 17.20, 3);
        cadastroProduto.adicionarProduto(1L, "Produto 4", 18.20, 3);

        System.out.println(cadastroProduto.produtoSet);

        System.out.println(cadastroProduto.exibirProdutosPorNome());

        System.out.println(cadastroProduto.exibirProdutoPorPreco());

    }
}