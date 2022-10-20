
package com.tllr.persistencia;

import com.tllr.modelos.Marca;
import com.tllr.modelos.Modelo;
import java.util.ArrayList;

public interface IModelosDao {
    void incluir(Modelo objeto) throws Exception;
    void alterar(Modelo objeto)throws Exception;
    ArrayList<Modelo>listagemModelo()throws Exception;
    
    
    
}