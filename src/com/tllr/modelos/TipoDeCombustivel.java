
package com.tllr.modelos;

public enum TipoDeCombustivel {
    GASOLINA(1),DIESEL(2),FLEX(3),ELETRICO(4),GNV(5);
    
    public int valor;
    private TipoDeCombustivel(int valorCombustivel){
        valor = valorCombustivel;
    }

    public int getValor() {
        return valor;
    }
    
}
