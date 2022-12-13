
package com.tllr.controle;

import com.tllr.modelos.Cliente;
import com.tllr.modelos.Endereco;
import com.tllr.modelos.Telefone;
import java.util.ArrayList;


public interface IClienteControle  {
    void incluir(Cliente objeto)throws Exception;
    Cliente buscar(int id)throws Exception;
    void alterar(Cliente objeto)throws Exception;
    ArrayList<Cliente> listagemCliente() throws Exception;
    void verificacoes(Cliente objetoCliente,Telefone objetoTelefone,Endereco objetoEndereco)throws Exception;
    void verificarCliente(Endereco objeto)throws Exception;
}
