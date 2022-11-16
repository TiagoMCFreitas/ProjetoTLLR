
package com.tllr.persistencia;

import com.tllr.ferramentas.GeradorIdentificador;
import com.tllr.modelos.Login;
import com.tllr.modelos.Marca;
import com.tllr.visao.Telas;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;


import java.io.FileReader;
import java.util.ArrayList;
public class LoginDao implements ILoginDao{
        String nomeDoArquivo;
          
        

public LoginDao(){
 nomeDoArquivo = "./src/com/tllr/arquivosdedados/Login.txt"; 
 
}
@Override
    public void seNaoExistirId()throws Exception{
        File id = new File("./src/com/tllr/arquivosdedados/idGerado.txt");
        if(id.exists() == false){
            int idSubstituir = 0;
        try{
        FileWriter fw = new FileWriter(id);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("" + idSubstituir);
        bw.close();
        }catch(Exception e){
        }
        }
    }
    @Override
    public void cadastrar(Login objeto) throws Exception {
        FileWriter fw = new FileWriter(nomeDoArquivo,true);
        BufferedWriter bw = new BufferedWriter(fw);
        objeto.setId(GeradorIdentificador.getID());
        bw.write(objeto.toString() + "\n");
        bw.close();
    }
        @Override
    public void manterConectado(String nome)throws Exception{
        String arquivoTemp = "./src/com/tllr/arquivosdedados/LoginTemporario.txt";
        ArrayList<Login> lista = verificar();
        FileWriter fw = new FileWriter(arquivoTemp);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("");
        for(int i = 0; i < lista.size();i++){
            if(nome.equals(lista.get(i).getNome())){
                bw.write(lista.get(i).toString());
            }
        }
        bw.close();
    }
    @Override
    public boolean achar(Login objeto) throws Exception {
       ArrayList<Login> lista = verificar();
       for(int i = 0; i < lista.size();i++){
           
           if(lista.get(i).getSenha().equals(objeto.getSenha())&& lista.get(i).getNome().equals(objeto.getNome())){
               return true;
           }
      
        }
       return false;
    }
       
    
        @Override
    public ArrayList<Login> verificar()throws Exception{
  try {
            ArrayList<Login> listaDeNomes = new ArrayList<Login>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            while((linha=br.readLine())!=null){
                Login objetoLogin = new Login();
                String vetorString[] = linha.split(";");
                objetoLogin.setId(Integer.parseInt(vetorString[0]));
                objetoLogin.setNome(vetorString[1]);
                objetoLogin.setSenha(vetorString[2]);
                objetoLogin.setEmail(vetorString[3]);
                listaDeNomes.add(objetoLogin);
            }
         br.close();
         return listaDeNomes;
        } catch(Exception erro){
         throw erro;
            
        }
    }
        @Override
    public String liberar(Login objeto) throws Exception{
            Telas achou = new Telas();
        if(achar(objeto) == true){
            achou.setVisible(true);
            return"Liberado";
        }
        else return "Nao Autorizado";
    }

    @Override
    public void alterarSenha(Login objeto) throws Exception {
        ArrayList<Login> lista = verificar();
        FileWriter fw = new FileWriter(nomeDoArquivo);
        BufferedWriter bw = new BufferedWriter(fw);
        for(int i = 0; i < lista.size();i++){
            if(objeto.getId() == lista.get(i).getId()){
                bw.write(objeto.toString() + "\n");
            }else{
                bw.write(lista.get(i).toString() + "\n");
            }
        }
        bw.close();
    }

    @Override
    public Login buscar(int id) throws Exception {
        String arquivoTemp = "./src/com/tllr/arquivosdedados/LoginTemporario.txt";
        FileReader fr = new FileReader(arquivoTemp);
        BufferedReader br = new BufferedReader(fr);
           String linha = "";
            while((linha = br.readLine()) !=null ){
                Login objetoLogin = new Login();
                String vetorString[] = linha.split(";");
                objetoLogin.setId(Integer.parseInt(vetorString[0]));
                objetoLogin.setNome(vetorString[1]);
                objetoLogin.setSenha(vetorString[2]);
                objetoLogin.setEmail(vetorString[3]);
                if(objetoLogin.getId() == id){
                br.close();
                return new Login(Integer.parseInt(vetorString[0]), vetorString[1], vetorString[2], vetorString[3]);
                }
                
            }
            return null;
            
    }
    
}