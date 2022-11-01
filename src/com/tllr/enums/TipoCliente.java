package com.tllr.enums;

public enum TipoCliente{
    FISICA(1), JURIDICA(2);

    public int Cliente;
     TipoCliente(int TipoCliente){
        Cliente = TipoCliente;
    }
        
         public int getValor(){
             return Cliente;
         }
        
}
   


