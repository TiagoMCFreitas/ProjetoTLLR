/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tllr.controle;

import com.tllr.modelos.Veiculo;
import java.util.ArrayList;

/**
 *
 * @author Patricia
 */
public interface IVeiculoControle {
    void incluir(Veiculo objeto) throws Exception;
    void alterar(Veiculo objeto) throws Exception;
    Veiculo buscar(int id)throws Exception;
    ArrayList<Veiculo>listagemVeiculo() throws Exception;
    void verificar(Veiculo objeto)throws Exception;
}
