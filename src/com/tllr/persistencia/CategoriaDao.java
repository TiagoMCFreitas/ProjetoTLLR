
package com.tllr.persistencia;

import com.tllr.ferramentas.GeradorIdentificador;
import com.tllr.modelos.Categoria;
import com.tllr.modelos.Login;
import com.tllr.modelos.Modelo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import jdk.jfr.events.FileReadEvent;


public class CategoriaDao implements ICategoriaDao{
    
    String nomeDoArquivo;
    public CategoriaDao(){
        nomeDoArquivo = "./src/com/tllr/arquivosdedados/Categoria.txt";
    }
    @Override
    public void incluir(Categoria objeto) throws Exception {
        FileWriter fw = new FileWriter(nomeDoArquivo,true);
        BufferedWriter bw = new BufferedWriter(fw);
         objeto.setId(GeradorIdentificador.getID());
        bw.write(objeto.toString() + "\n");
        bw.close();

    }

    @Override
    public void alterar(Categoria objeto) throws Exception {
        ArrayList<Categoria> lista = listagem();
        FileWriter fw = new FileWriter(nomeDoArquivo);
        BufferedWriter bw = new BufferedWriter(fw);
        
        for(int i = 0; i <lista.size(); i++){
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
    public ArrayList<Categoria> listagem() throws Exception {
        ArrayList<Categoria> listaDeCategorias = new ArrayList<Categoria>();
        FileReader fr = new FileReader(nomeDoArquivo);
        BufferedReader br = new BufferedReader(fr);
        String linha = "";
        while((linha=br.readLine())!=null){
                Categoria objetoCategoria = new Categoria();
                String dados[]= linha.split(";");
                objetoCategoria.setId(Integer.parseInt(dados[0]));
                objetoCategoria.setDescricao(dados[1]);
                objetoCategoria.setValorLocacao(Float.parseFloat(dados[2]));
                listaDeCategorias.add(objetoCategoria);
        }
         br.close();
         return listaDeCategorias; 

    }

    @Override
    public Categoria buscar(int id) throws Exception {
        ArrayList<Categoria> listaDeCategorias = new ArrayList<Categoria>();
        FileReader fr = new FileReader(nomeDoArquivo);
        BufferedReader br = new BufferedReader(fr);
        String linha = "";
        while((linha=br.readLine())!=null){
                Categoria objetoCategoria = new Categoria();
                String dados[]= linha.split(";");
                objetoCategoria.setId(Integer.parseInt(dados[0]));
                objetoCategoria.setDescricao(dados[1]);
                objetoCategoria.setValorLocacao(Float.parseFloat(dados[2]));
                if(id == objetoCategoria.getId()){
                    return new Categoria(Integer.parseInt(dados[0]), dados[1], Float.parseFloat(dados[2]));
                }
        }
        return null;
    }
}
