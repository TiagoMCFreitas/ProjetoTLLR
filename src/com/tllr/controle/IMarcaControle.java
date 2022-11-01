/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tllr.controle;

import com.tllr.modelos.Marca;
import com.tllr.persistencia.MarcaDao;
import java.util.ArrayList;

/**
 *
 * @author ejmcc
 */
public interface IMarcaControle {
    void incluir(Marca objeto)throws Exception;
    void alterar(Marca objeto)throws Exception;
    void nada (Marca desc)throws Exception;
    void semFoto(Marca url)throws Exception;
    void mesmaFoto(Marca url) throws Exception;
    ArrayList<Marca> listagem()throws Exception;
    Marca  buscar(int obj)throws Exception;
    void seNaoExistirArquivo()throws Exception;
        void seNaoExistirId()throws Exception;

}
