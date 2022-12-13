/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tllr.controle;

import com.tllr.modelos.Categoria;
import java.util.ArrayList;

/**
 *
 * @author Patricia
 */
public interface ICategoriaControle {
    void incluir(Categoria objeto)throws Exception;
    void alterar(Categoria objeto)throws Exception;
    ArrayList<Categoria> listagem()throws Exception;
    Categoria buscar(int id)throws Exception;
    public Categoria buscarPorDesc(String desc) throws Exception;
    void nada (Categoria desc)throws Exception;
    void precoVazio(Categoria preco)throws Exception;
}
