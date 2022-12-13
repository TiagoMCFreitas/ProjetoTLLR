
package com.tllr.persistencia;

import com.tllr.enums.Combustivel;
import com.tllr.enums.Situacao;
import com.tllr.enums.VeiculoTipo;
import com.tllr.ferramentas.GeradorIdentificador;
import com.tllr.modelos.Veiculo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;

public class VeiculoDao implements IVeiculoDao{
    String nomeDoArquivo;
public VeiculoDao(){
    nomeDoArquivo = "./src/com/tllr/arquivosdedados/Veiculo.txt";
}
    @Override
    public void incluir(Veiculo objeto) throws Exception {
        FileWriter fw = new FileWriter(nomeDoArquivo,true);
        BufferedWriter bw = new BufferedWriter(fw);
        objeto.setId(GeradorIdentificador.getID());
        bw.write(objeto.toString()+"\n");
        bw.close();
    }
    
    @Override
    public void alterar(Veiculo objeto) throws Exception {
         ArrayList<Veiculo> lista = listagemVeiculo();
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
    public Veiculo buscar(int id) throws Exception {
          FileReader fr = new FileReader(nomeDoArquivo);
       BufferedReader br = new BufferedReader(fr);
       String linha = "";
       while((linha = br.readLine())!= null){
           Veiculo objetoVeiculo = new Veiculo();
           ICategoriaDao objetoCategoria = new CategoriaDao();
           IModelosDao objetoModelos = new ModelosDao();
            String dados[]= linha.split(";");
            objetoVeiculo.setId(Integer.parseInt((String) dados[0]));
            objetoVeiculo.setPlaca((String) dados[1]);
            objetoVeiculo.setRenavam(Long.parseLong((String)dados[2]));
            objetoVeiculo.setPrecoCompra(Float.parseFloat((String) dados[3]));
            objetoVeiculo.setPrecoVenda(Float.parseFloat((String) dados[4]));
            objetoVeiculo.setAnoDeFabricacao(Integer.parseInt((String) dados[5]));
            objetoVeiculo.setAnoModelo(Integer.parseInt((String) dados[6]));
            String combutivel = (String) dados[7];
            objetoVeiculo.setCombustivel(Combustivel.valueOf(combutivel));
            objetoVeiculo.setQuilometragem(Integer.parseInt((String) dados[8]));
            String veiculoTipo = (String) dados[9];
            objetoVeiculo.setTipoVeiculo(VeiculoTipo.valueOf(veiculoTipo));
            String situ = (String) dados[10];
            objetoVeiculo.setSituacao(Situacao.valueOf(situ));
            int idCategoria = Integer.parseInt((String) dados[11]);
            objetoVeiculo.setCategoria(objetoCategoria.buscar(idCategoria));
            int idModelo = Integer.parseInt((String) dados[12]);
            objetoVeiculo.setModelo(objetoModelos.buscar(idModelo));
            if(objetoVeiculo.getId() == id){
            br.close();
               return new Veiculo(Integer.parseInt(dados[0]),dados[1],
               Long.parseLong(dados[2]),Float.parseFloat(dados[3]),Float.parseFloat(dados[4]),
               Integer.parseInt(dados[5]),Integer.parseInt(dados[6]), Combustivel.valueOf(combutivel),Integer.parseInt(dados[8]),
                       VeiculoTipo.valueOf(veiculoTipo),Situacao.valueOf(situ),objetoVeiculo.getCategoria(),objetoVeiculo.getModelo());
                }
        }
        return null;
    }

    @Override
    public ArrayList<Veiculo> listagemVeiculo() throws Exception {

ArrayList<Veiculo> listaVeiculo = new ArrayList<Veiculo>();
        FileReader fr = new FileReader(nomeDoArquivo);
       BufferedReader br = new BufferedReader(fr);
       String linha = "";
       while((linha = br.readLine())!= null){
           Veiculo objetoVeiculo = new Veiculo();
           ICategoriaDao objetoCategoria = new CategoriaDao();
           IModelosDao objetoModelos = new ModelosDao();
            Object dados[]= linha.split(";");
            objetoVeiculo.setId(Integer.parseInt((String) dados[0]));
            objetoVeiculo.setPlaca((String) dados[1]);
            objetoVeiculo.setRenavam(Long.parseLong((String)dados[2]));
            objetoVeiculo.setPrecoCompra(Float.parseFloat((String) dados[3]));
            objetoVeiculo.setPrecoVenda(Float.parseFloat((String) dados[4]));
            objetoVeiculo.setAnoDeFabricacao(Integer.parseInt((String) dados[5]));
            objetoVeiculo.setAnoModelo(Integer.parseInt((String) dados[6]));
            String combutivel = (String) dados[7];
            objetoVeiculo.setCombustivel(Combustivel.valueOf(combutivel));
            objetoVeiculo.setQuilometragem(Integer.parseInt((String) dados[8]));
            String veiculoTipo = (String) dados[9];
            objetoVeiculo.setTipoVeiculo(VeiculoTipo.valueOf(veiculoTipo));
            String situ = (String) dados[10];
            objetoVeiculo.setSituacao(Situacao.valueOf(situ));
            int id = Integer.parseInt((String) dados[11]);
            objetoVeiculo.setCategoria(objetoCategoria.buscar(id));
            int idModelo = Integer.parseInt((String) dados[12]);
            objetoVeiculo.setModelo(objetoModelos.buscar(idModelo));
            listaVeiculo.add(objetoVeiculo);
       }
        br.close();
        return listaVeiculo;

    }
    
}
