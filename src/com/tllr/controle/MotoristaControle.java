/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tllr.controle;

import com.tllr.modelos.Cliente;
import com.tllr.modelos.Endereco;
import com.tllr.modelos.Motorista;
import com.tllr.modelos.Telefone;
import com.tllr.persistencia.IMotoristaDao;
import com.tllr.persistencia.MotoristaDao;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Patricia
 */
public class MotoristaControle implements IMotoristaControle{
IMotoristaDao objetoMotorista = new MotoristaDao();
     private boolean buscarMotorista(int cnh)throws Exception{
        try {
            ArrayList<Motorista> listagem = objetoMotorista.listagemMotorista();
            Iterator<Motorista> lista = listagem.iterator();
            while(lista.hasNext()){
                 Motorista aux = lista.next();
                if(aux.getNumeroCnh() == cnh){
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }
    @Override
    public void incluir(Motorista objeto) throws Exception {
        if(buscarMotorista(objeto.getNumeroCnh())){
            throw new Exception("Motorista já adicionado");
        }
        objetoMotorista.incluir(objeto);
    }

    @Override
    public void alterar(Motorista objeto) throws Exception {
         if(buscarMotorista(objeto.getNumeroCnh())){
            throw new Exception("Motorista já adicionado");
        }
        objetoMotorista.alterar(objeto);
    }

    @Override
    public ArrayList<Motorista> listagemMotorista() throws Exception {
        return objetoMotorista.listagemMotorista();
        }

    @Override
    public Motorista buscar(int id) throws Exception {
        return objetoMotorista.buscar(id);
    }

    @Override
    public void verificacoes(Motorista objetoMotorista, Telefone objetoTelefone, Endereco objetoEndereco) throws Exception {
       if(objetoMotorista.getNome().equals("")){
           throw new Exception("Não é possível cadastrar sem nome");
       }
       
         else if(objetoEndereco.getBairro().equals("")||objetoEndereco.getCEP().equals("")||objetoEndereco.getCidade().equals("")||objetoEndereco.getComplemento().equals("")||objetoEndereco.getEstado().equals("")||objetoEndereco.getLogradouro().equals("")){
            throw new Exception("Não é possível cadastrar o cliente sem endereco");
        }
        else if(objetoTelefone.getDDI() == 0 || objetoTelefone.getDDD() == 0 || objetoTelefone.getNumero() == 0){
            throw new Exception("Não é possivel cadastrar cliente sem o telefone");
        }
    }
    }
    
   

  
    

