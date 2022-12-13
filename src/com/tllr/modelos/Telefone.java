package com.tllr.modelos;

public class Telefone {
    private int DDI;
    private int DDD;
    private int numero;

    public Telefone(int DDI, int DDD, int numero) {
        this.DDI = DDI;
        this.DDD = DDD;
        this.numero = numero;
    }
    public Telefone(){
    }
    public int getDDI() {
        return DDI;
    }

    public void setDDI(int DDI) {
        this.DDI = DDI;
    }

    public int getDDD() {
        return DDD;
    }

    public void setDDD(int DDD) {
        this.DDD = DDD;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String toString(){
        return DDI + ";" + DDD + ";" + numero;
    }
   }
