
package com.tllr.persistencia;

import com.tllr.enums.TipoCliente;
import com.tllr.ferramentas.GeradorIdentificador;
import com.tllr.modelos.Cliente;
import com.tllr.modelos.Endereco;
import com.tllr.modelos.Telefone;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;


public class ClienteDao implements IClienteDao{
        String nomeDoArquivo;
    public ClienteDao(){
        nomeDoArquivo = "./src/com/tllr/arquivosdedados/Cliente.txt";
    }

    @Override
    public Cliente buscar(int id) throws Exception {
    
       FileReader fr = new FileReader(nomeDoArquivo);
       BufferedReader br = new BufferedReader(fr);
       String linha = "";
       while((linha = br.readLine())!= null){
                Cliente objetoCliente = new Cliente();
                Object dados[]= linha.split(";");
                Telefone objetoTelefone  = new Telefone();
                Endereco objetoEndereco = new Endereco();
                objetoCliente.setId(Integer.parseInt((String) dados[0]));
                objetoCliente.setCpf_cnpj((String) dados[1]);
                objetoCliente.setNome((String)dados[2]);
                objetoCliente.setRazaoSocial((String) dados[3]);
                objetoCliente.setIdentidade((String) dados[4]);
                int a = 0,b = 0,c = 0;
                objetoTelefone.setDDI(a);
                objetoTelefone.setDDD(b);
                objetoTelefone.setNumero(c);
                objetoCliente.setTelefone(objetoTelefone);
                objetoCliente.getTelefone().setDDI(Integer.parseInt((String) dados[5]));
                objetoCliente.getTelefone().setDDD(Integer.parseInt((String) dados[6]));
                objetoCliente.getTelefone().setNumero(Integer.parseInt((String) dados[7]));
                objetoCliente.setEmail((String) dados[8]);
                String cep = "";
                String bairro ="";
                String cidade = "";
                String complemento = "";
                String estado =""; 
                String logradouro = "";
                objetoEndereco.setCEP(cep);
                objetoEndereco.setBairro(bairro);
                objetoEndereco.setCidade(cidade);
                objetoEndereco.setComplemento(complemento);
                objetoEndereco.setEstado(estado);
                objetoEndereco.setLogradouro(logradouro);
                objetoCliente.setEndereco(objetoEndereco);
                objetoCliente.getEndereco().setCEP((String)dados[9]);
                objetoCliente.getEndereco().setBairro((String) dados[10]);
                objetoCliente.getEndereco().setCidade((String) dados[11]);
                objetoCliente.getEndereco().setComplemento((String) dados[12]);
                objetoCliente.getEndereco().setEstado((String) dados[13]);
                objetoCliente.getEndereco().setLogradouro((String)dados[14]);
                String cliente = (String) dados[15];
                objetoCliente.setTipoCliente(TipoCliente.valueOf(cliente));
       if(objetoCliente.getId() == id){
           br.close();

           return new Cliente(Integer.parseInt((String) dados[0]),(String) dados[1] , (String)dados[2], (String)dados[3],(String) dados[4], objetoTelefone, (String)dados[6], objetoEndereco, TipoCliente.valueOf(cliente));
        }         
       }
        return null;
        
    
    }

    @Override
    public void incluir(Cliente objeto) throws Exception {
          FileWriter fw = new FileWriter(nomeDoArquivo,true);
          BufferedWriter bw = new BufferedWriter(fw);
          objeto.setId(GeradorIdentificador.getID());
          bw.write(objeto.toString() + "\n");
          bw.close();

    }

    @Override
    public void alterar(Cliente objeto) throws Exception {
         ArrayList<Cliente> lista = listagemCliente();
        FileWriter fw = new FileWriter(nomeDoArquivo);
        BufferedWriter bw = new BufferedWriter(fw);
        
        for(int i = 0; i < lista.size();i++){
            if(objeto.getId() == lista.get(i).getId()){
                bw.write(objeto.toString()+"\n");
            }
            else{
                bw.write(lista.get(i).toString()+ "\n");
            }
        }
        bw.close();
        
    
    }

    @Override
    public ArrayList<Cliente> listagemCliente() throws Exception {
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        FileReader fr = new FileReader(nomeDoArquivo);
       BufferedReader br = new BufferedReader(fr);
       String linha = "";
       while((linha = br.readLine())!= null){
                Cliente objetoCliente = new Cliente();
                Telefone objetoTelefone  = new Telefone();
                Endereco objetoEndereco = new Endereco();
                Object dados[]= linha.split(";");
                objetoCliente.setId(Integer.parseInt((String) dados[0]));
                objetoCliente.setCpf_cnpj((String) dados[1]);
                objetoCliente.setNome((String)dados[2]);
                objetoCliente.setRazaoSocial((String) dados[3]);
                objetoCliente.setIdentidade((String) dados[4]);
                int a = 0,b = 0,c = 0;
                objetoTelefone.setDDI(a);
                objetoTelefone.setDDD(b);
                objetoTelefone.setNumero(c);
                objetoCliente.setTelefone(objetoTelefone);
                objetoCliente.getTelefone().setDDI(Integer.parseInt((String) dados[5]));
                objetoCliente.getTelefone().setDDD(Integer.parseInt((String) dados[6]));
                objetoCliente.getTelefone().setNumero(Integer.parseInt((String) dados[7]));
                objetoCliente.setEmail((String) dados[8]);
                String cep = "";
                String bairro ="";
                String cidade = "";
                String complemento = "";
                String estado =""; 
                String logradouro = "";
                objetoEndereco.setCEP(cep);
                objetoEndereco.setBairro(bairro);
                objetoEndereco.setCidade(cidade);
                objetoEndereco.setComplemento(complemento);
                objetoEndereco.setEstado(estado);
                objetoEndereco.setLogradouro(logradouro);
                objetoCliente.setEndereco(objetoEndereco);
                objetoCliente.getEndereco().setCEP((String)dados[9]);
                objetoCliente.getEndereco().setBairro((String) dados[10]);
                objetoCliente.getEndereco().setCidade((String) dados[11]);
                objetoCliente.getEndereco().setComplemento((String) dados[12]);
                objetoCliente.getEndereco().setEstado((String) dados[13]);
                objetoCliente.getEndereco().setLogradouro((String)dados[14]);
                String cliente = (String) dados[15];
                objetoCliente.setTipoCliente(TipoCliente.valueOf(cliente));
                listaCliente.add(objetoCliente);
       }
       br.close();
       return listaCliente;
   }
    
}
