/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tllr.controle;

import com.tllr.modelos.Acessorio;
import com.tllr.modelos.Categoria;
import com.tllr.persistencia.AcessorioDao;
import com.tllr.persistencia.CategoriaDao;
import com.tllr.persistencia.IAcessorioDao;
import com.tllr.persistencia.ICategoriaDao;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Patricia
 */
public class AcessorioControle implements IAcessorioControle{
    IAcessorioDao acessorioPersistencia = new AcessorioDao();
    private boolean buscarAcessorio(String descricao)throws Exception{
        try {
            ArrayList<Acessorio> listagem = acessorioPersistencia.listagem();
            Iterator<Acessorio> lista = listagem.iterator();
            while(lista.hasNext()){
                 Acessorio aux = lista.next();
                if(aux.getDescricao().equalsIgnoreCase(descricao)){
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
}
   
    @Override
    public void incluir(Acessorio objeto) throws Exception {
        if(buscarAcessorio(objeto.getDescricao())){
            throw  new Exception("Acessorio ja cadastrado");
        }
        acessorioPersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Acessorio objeto) throws Exception {
          if(buscarAcessorio(objeto.getDescricao())){
            throw  new Exception("Acessorio ja cadastrado");
        }
        acessorioPersistencia.alterar(objeto);
    }

    @Override
    public ArrayList<Acessorio> listagem() throws Exception {
        return acessorioPersistencia.listagem();
    }

    @Override
    public Acessorio buscar(int id) throws Exception {
        return acessorioPersistencia.buscar(id);
    }

    @Override
    public void nada(Acessorio desc) throws Exception {
        if(desc.getDescricao().equals("")){
            throw new Exception("Nenhum acessorio sendo cadastrado");
        }
    }

    @Override
    public void precoVazio(Acessorio preco) throws Exception {
        if(preco.getValorLocacao()<= 0){
            throw new Exception("Preco Inválido");
        }
    }
    
}
