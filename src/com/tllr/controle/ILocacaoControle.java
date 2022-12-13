/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tllr.controle;

import com.tllr.modelos.Acessorio;
import com.tllr.modelos.Locacao;
import com.tllr.modelos.Veiculo;
import java.util.ArrayList;

/**
 *
 * @author Patricia
 */
public interface ILocacaoControle {
    void locar(Locacao objeto)throws Exception;
    void devolver(Locacao objeto)throws Exception;
    void cancelar(Locacao objeto)throws Exception;
    ArrayList<Locacao> listagemLocacao() throws Exception;
    float calcularValorLocacao(Locacao objeto, Veiculo objetoVeiculo, Acessorio objetoAcessorio)throws Exception;
}
