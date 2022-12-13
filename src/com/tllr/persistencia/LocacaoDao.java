
package com.tllr.persistencia;

import com.tllr.enums.SituacaoLocacao;
import com.tllr.ferramentas.GeradorIdentificador;
import com.tllr.modelos.Acessorio;
import com.tllr.modelos.Cliente;
import com.tllr.modelos.Locacao;
import com.tllr.modelos.Marca;
import com.tllr.modelos.Veiculo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;


public class LocacaoDao implements ILocacaoDao{
String nomeDoArquivo;
    public LocacaoDao(){
    nomeDoArquivo = "./src/com/tllr/arquivosdedados/Locacao.txt";
}
    @Override
    public void locar(Locacao objeto) throws Exception {
        FileWriter fw  = new FileWriter(nomeDoArquivo,true);
        BufferedWriter bw = new BufferedWriter(fw);
        objeto.setId(GeradorIdentificador.getID());
        bw.write(objeto.toString()  +"\n");
        bw.close();
    }

    @Override
    public void devolver(Locacao objeto) throws Exception {

        ArrayList<Locacao> lista = listagemLocacao();
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
    public void cancelar(Locacao objeto) throws Exception {
ArrayList<Locacao> lista = listagemLocacao();
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
    public ArrayList<Locacao> listagemLocacao() throws Exception {
            ArrayList<Locacao> listaDeLocacoes = new ArrayList<Locacao>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            while((linha=br.readLine())!=null){
               Locacao objetoLocacao = new Locacao();
               IClienteDao objetoCliente = new ClienteDao();
               IVeiculoDao objetoVeiculo = new VeiculoDao();
               IAcessorioDao objetoAcessorio = new AcessorioDao();
               ICategoriaDao objetoCategoria = new CategoriaDao();
               IMotoristaDao objetoMotorista = new MotoristaDao();
               String vetorString[] = linha.split(";");
                objetoLocacao.setId(Integer.parseInt(vetorString[0]));
                objetoLocacao.setDiaInicio(Integer.parseInt(vetorString[1]));
                objetoLocacao.setMesInicio(Integer.parseInt(vetorString[2]));
                objetoLocacao.setAnoInicio(Integer.parseInt(vetorString[3]));
                objetoLocacao.setDiaFinal(Integer.parseInt(vetorString[4]));
                objetoLocacao.setMesFinal(Integer.parseInt(vetorString[5]));
                objetoLocacao.setAnoFinal(Integer.parseInt(vetorString[6]));
                objetoLocacao.setValorCalcao(Float.parseFloat(vetorString[7]));
                String situacao = vetorString[8];
                //cliente.getId() +";"+
                //veiculo.getId() + ";" + acessorio.getId()+";" + veiculo.getCategoria().getId()+ ";"+ motorista.getId();
                objetoLocacao.setSituacaoLocacao(SituacaoLocacao.valueOf(situacao));
                int idCliente = Integer.parseInt(vetorString[9]);
                objetoLocacao.setCliente(objetoCliente.buscar(idCliente));
                int idVeiculo = Integer.parseInt(vetorString[10]);
                objetoLocacao.setVeiculo(objetoVeiculo.buscar(idVeiculo));
                int idAcessorio = Integer.parseInt(vetorString[11]);
                objetoLocacao.setAcessorio(objetoAcessorio.buscar(idAcessorio));
                objetoLocacao.getVeiculo().getCategoria().setId(Integer.parseInt(vetorString[12]));
                int idMotorista = Integer.parseInt(vetorString[13]);
                objetoLocacao.setMotorista(objetoMotorista.buscar(idMotorista));
                listaDeLocacoes.add(objetoLocacao);
            }
            br.close();
            return listaDeLocacoes;
          }

    @Override
    public float calcularValorLocacao(Locacao objeto, Veiculo objetoVeiculo, Acessorio objetoAcessorio) throws Exception {
        long diferenca = ChronoUnit.DAYS.between(objeto.setarInicio(objeto.getAnoInicio(), objeto.getDiaInicio(), objeto.getMesInicio()), objeto.setarFim(objeto.getAnoFinal(), objeto.getDiaFinal(), objeto.getMesFinal()));
        float total = (objetoVeiculo.getCategoria().getValorLocacao()+ objetoAcessorio.getValorLocacao()) * diferenca;
        
        double calcao = total * 0.5;
        return (float) (total + calcao);
    }
    
    
    
}
