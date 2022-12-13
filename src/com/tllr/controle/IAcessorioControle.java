/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tllr.controle;

import com.tllr.modelos.Acessorio;
import java.util.ArrayList;

/**
 *
 * @author Patricia
 */
public interface IAcessorioControle {
      void incluir(Acessorio objeto)throws Exception;
    void alterar(Acessorio objeto)throws Exception;
    ArrayList<Acessorio> listagem()throws Exception;
    Acessorio buscar(int id)throws Exception;
    void nada (Acessorio desc)throws Exception;
    void precoVazio(Acessorio preco)throws Exception;
}
