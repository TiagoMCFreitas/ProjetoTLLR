/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tllr.controle;

import com.tllr.modelos.Categoria;
import com.tllr.modelos.Login;
import com.tllr.persistencia.CategoriaDao;
import com.tllr.persistencia.ICategoriaDao;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Patricia
 */
public class CategoriaControle implements ICategoriaControle{
    ICategoriaDao categoriaPersistencia = new CategoriaDao();
    private boolean buscarCategoria(String descricao)throws Exception{
        try {
            ArrayList<Categoria> listagem = categoriaPersistencia.listagem();
            Iterator<Categoria> lista = listagem.iterator();
            while(lista.hasNext()){
                 Categoria aux = lista.next();
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
    public void incluir(Categoria objeto) throws Exception {
         if(buscarCategoria(objeto.getDescricao())){
        throw new Exception("Categoria Ja existente");
        }
        categoriaPersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Categoria objeto) throws Exception {
        if(buscarCategoria(objeto.getDescricao())){
            throw new Exception("Marca ja cadastrada");
        }
        categoriaPersistencia.alterar(objeto);

    }

    

    @Override
    public ArrayList<Categoria> listagem() throws Exception {
        return categoriaPersistencia.listagem();
    }

    @Override
    public Categoria buscar(int id) throws Exception {
        return categoriaPersistencia.buscar(id);
    }

    @Override
    public Categoria buscarPorDesc(String desc) throws Exception {
        return categoriaPersistencia.buscarPorDesc(desc);
    }

    @Override
    public void nada(Categoria desc) throws Exception {
        if(desc.getDescricao().equals("")){
            throw new Exception("Nenhuma categoria sendo cadastrada");
        }
    }

    @Override
    public void precoVazio(Categoria preco) throws Exception {
        if(preco.getValorLocacao()<=0){
            throw new Exception("Preco invalido");
        }
    }
    
    
}
