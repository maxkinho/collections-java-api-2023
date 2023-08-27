package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String item) {
        itemList.add(new Item(item));
    }

    public void removerItem(String item) {
        List<Item> itemsParaRemover = new ArrayList<>();
        for (Item i: itemList) {
            if(i.getItem().equalsIgnoreCase(item)) {
                itemsParaRemover.add(i);
            }
        }
        itemList.removeAll(itemsParaRemover);
    }

    public int numeroTotalDeItems() {
        return itemList.size();
    }

    public void obterItems() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println("Os itens no carrinho são: " +
                carrinhoDeCompras.numeroTotalDeItems());

        carrinhoDeCompras.adicionarItem("cebola");
        carrinhoDeCompras.adicionarItem("alho");
        carrinhoDeCompras.adicionarItem("tomate");
        carrinhoDeCompras.adicionarItem("arroz");

        System.out.println("Os itens no carrinho são: " +
                carrinhoDeCompras.numeroTotalDeItems());

        carrinhoDeCompras.removerItem("cebola");
        System.out.println("Os itens no carrinho são: " +
                carrinhoDeCompras.numeroTotalDeItems());

        carrinhoDeCompras.obterItems();
    }
}
