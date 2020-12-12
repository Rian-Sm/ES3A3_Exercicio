package exercicio_2;

public class Item {
    private Produto produto;
    private Integer quantidade;

    public Item(Produto produto, Integer quantidade) {
        setProduto(produto);
        setQuantidade(quantidade);
    }

    public void setProduto(Produto produto){
        this.produto = produto;
    }
    public void setQuantidade(Integer quantidade){
        this.quantidade = quantidade;
    }
    public Produto getProduto() {
        return produto;
    }
    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getPrecoTotal(){
        return produto.getValor() * getQuantidade();
    }
}
