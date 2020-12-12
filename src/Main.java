import exercicio_2.*;

public class Main {
    public static void main(String[] args) {
        Produto produto0 = new Produto("chocolate", 7.99);
        Produto produto1 = new Produto("café", 6.99);
        Produto produto2 = new Produto("chá preto", 1.50);

        Item item0 = new Item(produto0, 2);
        Item item1 = new Item(produto1, 1);
        Item item2 = new Item(produto2, 10);
        Item item2_unidade = new Item(produto2, 1);
        
        Venda venda1 = new Venda(1);

        venda1.adicionarItem(item0);
        venda1.adicionarItem(item2);

        Venda venda2 = new Venda(2);

        venda2.adicionarItem(item1);
        venda2.adicionarItem(item2_unidade);



    }
}
