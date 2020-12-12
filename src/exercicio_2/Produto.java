package exercicio_2;

import java.lang.Exception;

public class Produto {
    private String descricao;
    private Double valor;

    public Produto(String descricao, Double valor){
        setDescricao(descricao);
        setValor(valor);
    }

    public String getDescricao(){
        return this.descricao;
    }
    public Double getValor(){
        return this.valor;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setValor(Double valor){
        if (valor > 0){
            this.valor = valor;
        } else {       
            throw new Exception("vaor invalido");
        }
    }
    
}
