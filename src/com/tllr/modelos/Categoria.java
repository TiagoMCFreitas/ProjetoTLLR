
package com.tllr.modelos;


public class Categoria {
    private int id;
    private String descricao;
    private float valorLocacao;

    public Categoria(int id, String descricao, float valorLocacao){
        this.id = id;
        this.descricao = descricao;
        this.valorLocacao = valorLocacao;
    }
    public Categoria(){
        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }
    
    @Override
    public String toString(){
        return id + ";" + descricao + ";" + valorLocacao;
    }
}
