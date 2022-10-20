/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tllr.controle;


import com.tllr.modelos.Modelo;
import java.util.ArrayList;

/**
 *
 * @author Patricia
 */
public interface IModeloControle {
    void incluir(Modelo objeto)throws Exception;
    void alterar(Modelo objeto)throws Exception;
    void nada (Modelo desc)throws Exception;
    void semFoto(Modelo url)throws Exception;
    void mesmaFoto(Modelo url)throws Exception;
    ArrayList<Modelo> listagemModelo()throws Exception;
}
