
package com.tllr.persistencia;

import com.tllr.ferramentas.GeradorIdentificador;
import com.tllr.modelos.Marca;
import com.tllr.modelos.Modelo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;
import java.util.ArrayList;

   
public class ModelosDao implements IModelosDao{
    private String nomeDoArquivoNoDisco;
public ModelosDao(){
      nomeDoArquivoNoDisco = "./src/com/tllr/arquivosdedados/Modelo.txt";
}
   
 @Override
    public void seNaoExistirArquivo(){

        File file = new File(nomeDoArquivoNoDisco);
        if(file.exists() == false){
        
        try{
        FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("");
        bw.close();
    }catch(Exception ex){
        
    }
    }
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
    public Modelo buscar(int id)throws Exception{
       FileReader fr = new FileReader(nomeDoArquivoNoDisco);
       BufferedReader br = new BufferedReader(fr);
       String linha = "";
       while((linha = br.readLine())!= null){
                Modelo objetoModelo = new Modelo();
                MarcaDao objeto  = new MarcaDao();
                Object dados[]= linha.split(";");
                objetoModelo.setId(Integer.parseInt((String) dados[0]));
                objetoModelo.setDescricao((String) dados[1]);
                objetoModelo.setUrl((String) dados[2]);
                int idMarca = Integer.parseInt((String)dados[3]);
                objetoModelo.setMarca(objeto.buscar(idMarca));
                
       if(objetoModelo.getId() == id){
           br.close();
           return new Modelo(Integer.parseInt((String) dados[0]), (String)dados[1], (String)dados[2], objetoModelo.getMarca());
        }         
       }
        return null;
        
    }
@Override
    public void incluir(Modelo objeto) throws Exception {
        FileWriter fw = new FileWriter(nomeDoArquivoNoDisco,true);
        BufferedWriter bw = new BufferedWriter(fw);
        objeto.setId(GeradorIdentificador.getID());
        bw.write(objeto.toString() + "\n");
        bw.close();
    }

    @Override
    public void alterar(Modelo objeto) throws Exception {
        ArrayList<Modelo> lista = listagemModelo();
        FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
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
    public ArrayList<Modelo> listagemModelo() throws Exception {
        ArrayList<Modelo> listaModelos = new ArrayList<Modelo>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br  = new BufferedReader(fr);
            String linha = " ";
             while((linha=br.readLine())!=null){
                Modelo objetoModelo = new Modelo();
                MarcaDao objeto  = new MarcaDao();
                Object dados[]= linha.split(";");
                objetoModelo.setId(Integer.parseInt((String) dados[0]));
                objetoModelo.setDescricao((String) dados[1]);
                objetoModelo.setUrl((String) dados[2]);
                int idMarca = Integer.parseInt((String)dados[3]);
                // chamar o metodo busca da marca
                objetoModelo.setMarca(objeto.buscar(idMarca));
                listaModelos.add(objetoModelo);
            }
         br.close();
         return listaModelos; 
    }
    
}
