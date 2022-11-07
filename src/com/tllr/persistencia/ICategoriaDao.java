/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tllr.persistencia;

import com.tllr.modelos.Categoria;
import com.tllr.modelos.Login;
import java.util.ArrayList;

/**
 *
 * @author Patricia
 */
public interface ICategoriaDao {
    void incluir(Categoria objeto)throws Exception;
    void alterar(Categoria objeto)throws Exception;
    ArrayList<Categoria> listagem()throws Exception;
    Categoria buscar(int id)throws Exception;
}
