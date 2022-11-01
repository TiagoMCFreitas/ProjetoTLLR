package com.tllr.controle;
import com.tllr.modelos.Marca;
import com.tllr.modelos.Modelo;
import com.tllr.persistencia.MarcaDao;
import java.util.ArrayList;
import com.tllr.persistencia.ModelosDao;
import java.util.Iterator;
import com.tllr.persistencia.IModelosDao;
public class ModeloControle implements IModeloControle{
        IModelosDao modeloPersistencia = null;
    
        public ModeloControle(){
        this.modeloPersistencia = new ModelosDao();
    }
        private boolean buscarModelo (String descricao)throws Exception{
            try {
            ArrayList<Modelo> listagem = modeloPersistencia.listagemModelo();
            Iterator<Modelo> lista = listagem.iterator();
            while(lista.hasNext()){
                 Modelo aux = lista.next();
                if(aux.getDescricao().equalsIgnoreCase(descricao)){
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
        }
        @Override
    public void incluir(Modelo objeto) throws Exception {
        if(buscarModelo(objeto.getDescricao())){
            throw new Exception("Marca já foi cadastrada");
        }
        modeloPersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Modelo objeto) throws Exception {
        if(buscarModelo(objeto.getDescricao())){
            throw new Exception("Modelo já cadastrado");
        }
        modeloPersistencia.alterar(objeto);
    }

    @Override
    public void nada(Modelo desc) throws Exception {
        if(desc.getDescricao().equals("")){
             throw new Exception("Nenhum modelo sendo cadastrado");
        }
        
    }
        @Override
    public void semFoto(Modelo url)throws Exception{
            if(url.getUrl().equals("")){
                throw new Exception("Selecione a imagem do modelo para continuar");
        }

    }
        @Override
    public void mesmaFoto(Modelo url)throws Exception{
        ArrayList<Modelo> lista = listagemModelo();
        
        for(int i = 0; i < lista.size(); i++){
            if(url.getUrl().equals(lista.get(i).getUrl())){
            throw new Exception("Foto ja adicionada");
        }
            
        }
    }
    @Override
    public ArrayList<Modelo> listagemModelo() throws Exception {
        return modeloPersistencia.listagemModelo();
    }
       public void seNaoExistirArquivo() throws Exception {
        modeloPersistencia.seNaoExistirArquivo();
    }
        @Override
    public void seNaoExistirId() throws Exception {
        modeloPersistencia.seNaoExistirId();
    } 
}
