/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tllr.controle;

import com.tllr.modelos.Cliente;
import com.tllr.modelos.Endereco;
import com.tllr.modelos.Telefone;
import com.tllr.persistencia.ClienteDao;
import com.tllr.persistencia.IClienteDao;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Patricia
 */
public class ClienteControle implements  IClienteControle{
    IClienteDao clientePersistencia = new ClienteDao();
     private boolean buscarCliente(String cpf)throws Exception{
        try {
            ArrayList<Cliente> listagem = clientePersistencia.listagemCliente();
            Iterator<Cliente> lista = listagem.iterator();
            while(lista.hasNext()){
                 Cliente aux = lista.next();
                if(aux.getCpf_cnpj().equalsIgnoreCase(cpf)){
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }
    
    
    
    @Override
    public void incluir(Cliente objeto)throws Exception{
        if(buscarCliente(objeto.getCpf_cnpj())){
            throw new Exception("Cliente já existe");
        }
        clientePersistencia.incluir(objeto);
    }

    @Override
    public Cliente buscar(int id) throws Exception {
        return clientePersistencia.buscar(id);
    }

    @Override
    public void alterar(Cliente objeto) throws Exception {
        clientePersistencia.alterar(objeto);
    }

    @Override
    public ArrayList<Cliente> listagemCliente() throws Exception {
        return clientePersistencia.listagemCliente();
    }

    @Override
    public void verificacoes(Cliente objeto, Telefone objetoTelefone, Endereco objetoEndereco) throws Exception {
        if(objeto.getNome().equals("")){
            throw new Exception("Não é possivel cadastrar cliente sem o nome");
        }
        else if(objeto.getCpf_cnpj().equals("")){
            throw new Exception("Não é possivel cadastrar cliente sem o CPF ou CNPJ");
        }
        else if(objeto.getEmail().equals("")){
            throw new Exception("Não é possivel cadastrar cliente sem o email");
        }
       else if(objeto.getIdentidade().equals("")){
            throw new Exception("Não é possivel cadastrar cliente sem a identidade");
        }
        else if(objeto.getRazaoSocial().equals("")){
            throw new Exception("Não é possivel cadastrar cliente sem Razão Social");
        }
        else if(objetoEndereco.getBairro().equals("")||objetoEndereco.getCEP().equals("")||objetoEndereco.getCidade().equals("")||objetoEndereco.getComplemento().equals("")||objetoEndereco.getEstado().equals("")||objetoEndereco.getLogradouro().equals("")){
            throw new Exception("Não é possível cadastrar o cliente sem endereco");
        }
        else if(objetoTelefone.getDDI() == 0 || objetoTelefone.getDDD() == 0 || objetoTelefone.getNumero() == 0){
            throw new Exception("Não é possivel cadastrar cliente sem o telefone");
        }
    }

    @Override
    public void verificarCliente(Endereco objeto) throws Exception {
     if(objeto.getBairro().equals("")||objeto.getCEP().equals("")||objeto.getCidade().equals("")||objeto.getComplemento().equals("")||objeto.getEstado().equals("")||objeto.getLogradouro().equals("")){
            throw new Exception("Não é possível cadastrar o endereco, verifique o cadastramento");
        }
    }

  
    
}
