/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tllr.persistencia;
import com.tllr.modelos.Marca;
import java.util.ArrayList;
/**
 *
 * @author ejmcc
 */
public interface IMarcaDao {
    void incluir(Marca objeto)throws Exception;
    void alterar(Marca objeto)throws Exception;
    ArrayList<Marca> listagem()throws Exception;
    Marca buscar(int id)throws Exception;
    
}
