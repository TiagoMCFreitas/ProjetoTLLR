/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tllr.persistencia;

import com.tllr.ferramentas.GeradorIdentificador;
import com.tllr.modelos.Acessorio;
import com.tllr.modelos.Categoria;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import jdk.jfr.events.FileWriteEvent;

/**
 *
 * @author Patricia
 */
public class AcessorioDao implements IAcessorioDao{
String nomeDoArquivo;
public AcessorioDao(){
    nomeDoArquivo = "./src/com/tllr/arquivosdedados/Acessorio.txt";
}
    @Override
    public void incluir(Acessorio objeto) throws Exception {
        FileWriter fw = new FileWriter(nomeDoArquivo,true);
        BufferedWriter bw = new BufferedWriter(fw);
        objeto.setId(GeradorIdentificador.getID());
        bw.write( objeto.toString() + "\n"); 
        bw.close();

    }

    @Override
    public void alterar(Acessorio objeto) throws Exception {
        ArrayList<Acessorio> lista = listagem();
        FileWriter fw = new FileWriter(nomeDoArquivo);
        BufferedWriter bw = new BufferedWriter(fw);
        for(int i = 0; i < lista.size(); i++){
            if(objeto.getId() == lista.get(i).getId()){
                bw.write(objeto.toString() + "\n");
            }
            else{
                bw.write(lista.get(i).toString() + "\n");
            }
         }
        bw.close();
    }

    @Override
    public ArrayList<Acessorio> listagem() throws Exception {
      ArrayList<Acessorio> listaDeAcessorios = new ArrayList<Acessorio>();
        FileReader fr = new FileReader(nomeDoArquivo);
        BufferedReader br = new BufferedReader(fr);
        String linha = "";
        while((linha=br.readLine())!=null){
                Acessorio objetoAcessorio = new Acessorio();
                String dados[]= linha.split(";");
                objetoAcessorio .setId(Integer.parseInt(dados[0]));
                objetoAcessorio.setDescricao(dados[1]);
                objetoAcessorio .setValorLocacao(Float.parseFloat(dados[2]));
                listaDeAcessorios.add(objetoAcessorio);
                
        }
        br.close();
        return listaDeAcessorios;
    }

    @Override
    public Acessorio buscar(int id) throws Exception {
        ArrayList<Acessorio> listaDeAcessorios = new ArrayList<Acessorio>();
        FileReader fr = new FileReader(nomeDoArquivo);
        BufferedReader br = new BufferedReader(fr);
        String linha = "";
        while((linha=br.readLine())!=null){
                 Acessorio objetoAcessorio = new Acessorio();
                String dados[]= linha.split(";");
                objetoAcessorio .setId(Integer.parseInt(dados[0]));
                objetoAcessorio.setDescricao(dados[1]);
                objetoAcessorio .setValorLocacao(Float.parseFloat(dados[2]));
                if(id == objetoAcessorio.getId()){
                    return new Acessorio(Integer.parseInt(dados[0]), dados[1], Float.parseFloat(dados[2]));
                }
        }
        return null;
    }
    }
    

