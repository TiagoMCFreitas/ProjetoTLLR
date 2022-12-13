/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tllr.controle;

import com.tllr.modelos.Acessorio;
import com.tllr.modelos.Locacao;
import com.tllr.modelos.Veiculo;
import com.tllr.persistencia.ILocacaoDao;
import com.tllr.persistencia.LocacaoDao;
import java.util.ArrayList;

/**
 *
 * @author Patricia
 */
public class LocacaoControle implements ILocacaoControle{
    ILocacaoDao locacaoPersistencia = new LocacaoDao();
    @Override
    public void locar(Locacao objeto) throws Exception {
        locacaoPersistencia.locar(objeto);
    }
    
    @Override
    public void devolver(Locacao objeto) throws Exception {
        locacaoPersistencia.devolver(objeto);
    }

    @Override
    public void cancelar(Locacao objeto) throws Exception {
        locacaoPersistencia.cancelar(objeto);
    }
    
    @Override
    public ArrayList<Locacao> listagemLocacao() throws Exception {
        return locacaoPersistencia.listagemLocacao();
    }

    @Override
    public float calcularValorLocacao(Locacao objeto, Veiculo objetoVeiculo, Acessorio objetoAcessorio) throws Exception {
        return locacaoPersistencia.calcularValorLocacao(objeto, objetoVeiculo, objetoAcessorio);
    }
    
}
