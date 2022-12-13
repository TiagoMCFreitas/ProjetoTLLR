
package com.tllr.persistencia;

import com.tllr.ferramentas.GeradorIdentificador;
import com.tllr.modelos.Cliente;
import com.tllr.modelos.Endereco;
import com.tllr.modelos.Motorista;
import com.tllr.modelos.Telefone;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Patricia
 */
public class MotoristaDao implements IMotoristaDao{
    String nomeDoArquivo;
    public MotoristaDao(){
        nomeDoArquivo = "./src/com/tllr/arquivosdedados/Motorista.txt";
    }
    @Override
    public void incluir(Motorista objeto) throws Exception {
        FileWriter fw =new FileWriter(nomeDoArquivo,true);
        BufferedWriter bw = new BufferedWriter(fw);
        objeto.setId(GeradorIdentificador .getID());
        bw.write(objeto.toString() + "\n");
        bw.close();
    }

    @Override
    public void alterar(Motorista objeto) throws Exception {
          ArrayList<Motorista> lista = listagemMotorista();
        FileWriter fw = new FileWriter(nomeDoArquivo);
        BufferedWriter bw = new BufferedWriter(fw);
        
        for(int i = 0; i < lista.size();i++){
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
    public ArrayList<Motorista> listagemMotorista() throws Exception {
          ArrayList<Motorista> listaDeMotoristas= new ArrayList<Motorista>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
               
            while((linha=br.readLine())!=null){
                Motorista objetoMotorista = new Motorista();
                Endereco objetoEndereco = new Endereco();
                Telefone objetoTelefone = new Telefone();
                IClienteDao objetoCliente = new ClienteDao();
                String vetorString[] = linha.split(";");
                objetoMotorista.setId(Integer.parseInt(vetorString[0]));
                objetoMotorista.setNome(vetorString[1]);
                objetoMotorista.setNumeroCnh(Integer.parseInt(vetorString[2]));
                objetoMotorista.setDataValidade(vetorString[3]);
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
                objetoMotorista.setEndereco(objetoEndereco);
                objetoMotorista.getEndereco().setCEP(vetorString[4]);
                objetoMotorista.getEndereco().setBairro(vetorString[5]);
                objetoMotorista.getEndereco().setCidade(vetorString[6]);
                objetoMotorista.getEndereco().setComplemento(vetorString[7]);
                objetoMotorista.getEndereco().setEstado(vetorString[8]);
                objetoMotorista.getEndereco().setLogradouro(vetorString[9]);
                int a = 0,b = 0,c = 0;
                objetoTelefone.setDDI(a);
                objetoTelefone.setDDD(b);
                objetoTelefone.setNumero(c);
                objetoMotorista.setTelefone(objetoTelefone);
                objetoMotorista.getTelefone().setDDI(Integer.parseInt(vetorString[10]));
                objetoMotorista.getTelefone().setDDD(Integer.parseInt(vetorString[11]));
                objetoMotorista.getTelefone().setNumero(Integer.parseInt(vetorString[12]));
                int idCliente = Integer.parseInt(vetorString[13]);
                objetoMotorista.setCliente(objetoCliente.buscar(idCliente));
                listaDeMotoristas.add(objetoMotorista);
            }
         br.close();
         return listaDeMotoristas;
    }

    @Override
    public Motorista buscar(int id) throws Exception {
        ArrayList<Motorista> listaDeMotoristas= new ArrayList<Motorista>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
               
            while((linha=br.readLine())!=null){
                Motorista objetoMotorista = new Motorista();
                Endereco objetoEndereco = new Endereco();
                Telefone objetoTelefone = new Telefone();
                IClienteDao objetoCliente = new ClienteDao();
                String vetorString[] = linha.split(";");
                objetoMotorista.setId(Integer.parseInt(vetorString[0]));
                objetoMotorista.setNome(vetorString[1]);
                objetoMotorista.setNumeroCnh(Integer.parseInt(vetorString[2]));
                objetoMotorista.setDataValidade(vetorString[3]);
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
                objetoMotorista.setEndereco(objetoEndereco);
                objetoMotorista.getEndereco().setCEP(vetorString[4]);
                objetoMotorista.getEndereco().setBairro(vetorString[5]);
                objetoMotorista.getEndereco().setCidade(vetorString[6]);
                objetoMotorista.getEndereco().setComplemento(vetorString[7]);
                objetoMotorista.getEndereco().setEstado(vetorString[8]);
                objetoMotorista.getEndereco().setLogradouro(vetorString[9]);
                int a = 0,b = 0,c = 0;
                objetoTelefone.setDDI(a);
                objetoTelefone.setDDD(b);
                objetoTelefone.setNumero(c);
                objetoMotorista.setTelefone(objetoTelefone);
                objetoMotorista.getTelefone().setDDI(Integer.parseInt(vetorString[10]));
                objetoMotorista.getTelefone().setDDD(Integer.parseInt(vetorString[11]));
                objetoMotorista.getTelefone().setNumero(Integer.parseInt(vetorString[12]));
                int idCliente = Integer.parseInt(vetorString[13]);
                objetoMotorista.setCliente(objetoCliente.buscar(idCliente));
                listaDeMotoristas.add(objetoMotorista);
                if(id == objetoMotorista.getId()){
                    br.close();
                    return new Motorista(Integer.parseInt(vetorString[0]), vetorString[1], Integer.parseInt(vetorString[2]), vetorString[3], objetoMotorista.getEndereco(), objetoMotorista.getTelefone(), objetoMotorista.getCliente());
                }
            }
            return null;
        }
}