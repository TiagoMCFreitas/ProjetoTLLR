
package com.tllr.persistencia;

import com.tllr.modelos.Modelo;
import java.util.ArrayList;

public interface IModelosDao {
    void incluir(Modelo objeto) throws Exception;
    void alterar(Modelo objeto)throws Exception;
    ArrayList<Modelo>listagemModelo()throws Exception;
    public Modelo buscar(int id)throws Exception;
    void seNaoExistirArquivo()throws Exception;
    void seNaoExistirId()throws Exception;

    
}