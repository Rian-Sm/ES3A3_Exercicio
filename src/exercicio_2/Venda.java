package exercicio_2;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Venda {

    private Integer codigo;
    private LocalDate data;
    private List<Item> itens;

    public Venda(Integer codigo){
        setCodigo(codigo);
        this.data = LocalDate.now();
        this.itens = new ArrayList();
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public Integer getCodigo(){
        return codigo;  
    }
    public LocalDate getData() {
        return data;
    }
    public List<Item> getItens() {
        return itens;
    }
    public void adicionarItem(Item item){
        this.itens.add(item);
    }
    public Integer getTotalItens(){
        return this.itens.size();
    }
    public double getTotalValor(){
        double total = 0.0;
        for (Item item : itens){
            total += item.getPrecoTotal();
        }
        return total;
    }

}
