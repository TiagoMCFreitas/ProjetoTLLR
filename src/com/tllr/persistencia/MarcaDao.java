/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tllr.persistencia;

import com.tllr.ferramentas.GeradorIdentificador;
import com.tllr.modelos.Marca;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ejmcc
 */
public class MarcaDao implements IMarcaDao{
    private String nomeDoArquivoNoDisco;
    public MarcaDao() {
        nomeDoArquivoNoDisco = "./src/com/tllr/arquivosdedados/Marca.txt";
    }
    
    @Override
    public void incluir(Marca objeto) throws Exception {
        try{
            //cria o arquivo
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco,true);
            //Criar o buffer do arquivo
            BufferedWriter bw =new BufferedWriter(fw);
            // Incluindo o id no objeto ******
            objeto.setId(GeradorIdentificador.getID());
            //Escreve no arquivo
            bw.write(objeto.toString()+"\n");
            //fecha o arquivo
            bw.close();		
      }catch(Exception erro){
         throw erro;
      }
    }
    
    
    @Override
    public void alterar(Marca objeto) throws Exception {
        FileReader fr = new FileReader(nomeDoArquivoNoDisco);
        BufferedReader br  = new BufferedReader(fr);
        String banco="";
        String linha ="";
        while((linha = br.readLine())!= null){
            if(linha.contains(objeto.getId()+"")){
               banco+=objeto.getId() + ";" + objeto.getDescricao()+ ";" + objeto.getUrl() + "\n";
               
            }
            else{
            banco += linha + "\n";
            }
        }
        br.close();
        FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
        BufferedWriter bw =  new BufferedWriter(fw);
        bw.write(banco);
        bw.close();

    }

    @Override
    public ArrayList<Marca> listagem() throws Exception {
        try {
            ArrayList<Marca> listaDeMarcas = new ArrayList<Marca>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            while((linha=br.readLine())!=null){
                Marca objetoMarca = new Marca();
                String vetorString[] = linha.split(";");
                objetoMarca.setId(Integer.parseInt(vetorString[0]));
                objetoMarca.setDescricao(vetorString[1]);
                objetoMarca.setUrl(vetorString[2]);
                listaDeMarcas.add(objetoMarca);
            }
         br.close();
         return listaDeMarcas;
        } catch(Exception erro){
         throw erro;
        }
    }
    
}
