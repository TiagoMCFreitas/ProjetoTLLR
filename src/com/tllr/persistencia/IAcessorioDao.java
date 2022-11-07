/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tllr.persistencia;

import com.tllr.modelos.Acessorio;
import java.util.ArrayList;

/**
 *
 * @author Patricia
 */
public interface IAcessorioDao {
     void incluir(Acessorio objeto)throws Exception;
    void alterar(Acessorio objeto)throws Exception;
    ArrayList<Acessorio> listagem()throws Exception;
    Acessorio buscar(int id)throws Exception;
}
