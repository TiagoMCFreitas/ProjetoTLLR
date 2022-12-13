/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tllr.enums;

/**
 *
 * @author Patricia
 */
public enum SituacaoLocacao {
     EM_ABERTO(1), FINALIZADA(2), CANCELADA(3);
    
    public int SituacaoLocacao;
     SituacaoLocacao(int SituacaoDaLocacao){
        SituacaoLocacao = SituacaoDaLocacao;
}

    public int getValor(){
        return SituacaoLocacao;
    }
    
}
