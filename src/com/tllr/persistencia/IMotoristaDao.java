
package com.tllr.persistencia;

import com.tllr.modelos.Motorista;
import java.util.ArrayList;


public interface IMotoristaDao {
    void incluir(Motorista objeto)throws Exception;
    void alterar(Motorista objeto)throws Exception;
    ArrayList<Motorista> listagemMotorista()throws Exception;
    Motorista buscar(int id)throws Exception;
}
