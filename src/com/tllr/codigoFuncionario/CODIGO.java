/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tllr.codigoFuncionario;

import com.tllr.modelos.Marca;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author tiago
 */
public class CODIGO {
private String codigo;
private String nomeDoArquivo = "./src/com/tllr/arquivosdedados/CodigoGerado.txt";
    public String getCodigo() {
        return codigo;
    }

    public CODIGO(String codigo) {
        this.codigo = codigo;
    }
    public CODIGO(){
        
    }
    public void incluir() throws Exception{
        Random random = new Random();
       int primeiro =  random.nextInt(10);
        int segundo =  random.nextInt(20);
        int terceiro =  random.nextInt(30);
        int quarto =  random.nextInt(40);
        int quinto =  random.nextInt(50);
        int sexto =  random.nextInt(60);
        
        codigo = primeiro+ "" + segundo + "" + terceiro + "" +  quarto + "" +  quinto + "" +  sexto + ";"; 
      
        FileWriter fw = new FileWriter(nomeDoArquivo);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(codigo);
        bw.close();
    }
      public ArrayList<CODIGO> listagem() throws Exception {
        try {
            ArrayList<CODIGO> codigo= new ArrayList<CODIGO>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            while((linha=br.readLine())!=null){
                
                String vetorString[] = linha.split(";");
                setCodigo(vetorString[0]);
            }
         br.close();
         return codigo;
        } catch(Exception erro){
         throw erro;
        }
}

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
