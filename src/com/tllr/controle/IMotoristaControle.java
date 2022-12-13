/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tllr.controle;

import com.tllr.modelos.Cliente;
import com.tllr.modelos.Endereco;
import com.tllr.modelos.Motorista;
import com.tllr.modelos.Telefone;
import java.util.ArrayList;

/**
 *
 * @author Patricia
 */
public interface IMotoristaControle {
  void incluir(Motorista objeto)throws Exception;
  void alterar(Motorista objeto)throws Exception;
  ArrayList<Motorista> listagemMotorista()throws Exception;
  Motorista buscar(int id)throws Exception;
  void verificacoes(Motorista objetoMotorista,Telefone objetoTelefone,Endereco objetoEndereco)throws Exception;

}
