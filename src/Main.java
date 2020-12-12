import java.util.ArrayList;
import java.util.List;

import exercicio_2.*;

public class Main {
    public static void main(String[] args) {
        Produto produto0 = new Produto("chocolate", 7.99);
        Produto produto1 = new Produto("café", 6.99);
        Produto produto2 = new Produto("chá preto", 1.50);

        List<Produto> produtoList = new ArrayList<>();

        produtoList.add(produto0);
        produtoList.add(produto1);
        produtoList.add(produto2);

        printProdutos(produtoList);     // teste de lista de produtos (print)

        Item item0 = new Item(produto0, 2);
        Item item1 = new Item(produto1, 1);
        Item item2 = new Item(produto2, 10);
        Item item2_unidade = new Item(produto2, 1);

        List<Item> ItemList = new ArrayList<>();

        ItemList.add(item0);
        ItemList.add(item1);
        ItemList.add(item2);
        ItemList.add(item2_unidade);
        
        printItens(ItemList);           // teste de lista de itens (print)

        Venda venda1 = new Venda(1);

        venda1.adicionarItem(item0);
        venda1.adicionarItem(item2);

        Venda venda2 = new Venda(2);

        venda2.adicionarItem(item1);
        venda2.adicionarItem(item2_unidade);

        printVenda(venda1);             // teste de lista de itens (print)
        printVenda(venda2);             // teste de lista de itens (print)
    }
    public static void printProdutos(List<Produto> produtos){
        System.out.printf("\n\n");
        System.out.println("Lista de produtos: ");
        for (Produto produto : produtos){
            System.out.printf("%s - %.2f\n", produto.getDescricao(), produto.getValor());
        }
    }
    public static void printItens(List<Item> itens){
        System.out.printf("\n\n");
        System.out.println("Lista de Itens: ");
        for (Item item : itens) {
            System.out.printf("%s - quantidade: %d\n", item.getProduto().getDescricao(), item.getQuantidade());
        }
    }
    public static void printVenda(Venda venda){
        System.out.printf("\n\n");
        System.out.printf("data: %s\n=============\n", venda.getData());
        for (Item itens : venda.getItens()){
            System.out.printf("%s - quantidade: %d valor:%.2f\n", itens.getProduto().getDescricao(), itens.getQuantidade(), itens.getPrecoTotal());
        }
       System.out.println("total: "+venda.getTotalValor());
    }
}
