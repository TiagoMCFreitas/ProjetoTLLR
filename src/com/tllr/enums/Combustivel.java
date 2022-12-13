
package com.tllr.enums;

public enum Combustivel {
    GASOLINA(1),DIESEL(2),FLEX(3),ELETRICO(4),GNV(5);
    
    public int valor;
    private Combustivel(int valorCombustivel){
        valor = valorCombustivel;
    }

    public int getValor() {
        return valor;
    }
    
}
