/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tllr.enums;

/**
 *
 * @author tiago
 */
public enum TipoDoVeiculo {
    HATCH(1),SEDAN(2),SUV(3),PICKUP(4);
    
    public int valor;
    private TipoDoVeiculo(int valorVeiculo){
        valor = valorVeiculo;
    }

    public int getValor() {
        return valor;
    }
}
