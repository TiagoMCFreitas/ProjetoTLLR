package com.tllr.enums;

public enum Situacao{
    LOCADO(1), DISPONIVEL(2), MANUTENCAO(3), VENDIDO(4);
    
    public int Situacao;
     Situacao(int SituacaoDoVeiculo){
        Situacao = SituacaoDoVeiculo;
}

    public int getValor(){
        return Situacao;
    }
    
}
