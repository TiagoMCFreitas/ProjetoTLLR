
package com.tllr.persistencia;

import com.tllr.modelos.Cliente;
import java.util.ArrayList;


public interface IClienteDao {
        
        Cliente buscar(int id)throws Exception;
        void incluir(Cliente objeto)throws Exception;
        void alterar(Cliente objeto)throws Exception;
        ArrayList<Cliente> listagemCliente() throws Exception;
}
