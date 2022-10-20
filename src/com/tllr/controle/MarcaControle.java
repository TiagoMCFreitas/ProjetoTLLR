/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tllr.controle;

import com.tllr.modelos.Marca;
import com.tllr.persistencia.IMarcaDao;
import com.tllr.persistencia.MarcaDao;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ejmcc
 */
public class MarcaControle implements IMarcaControle{
    IMarcaDao marcaPersistencia = null;
    public MarcaControle(){
        this.marcaPersistencia = new MarcaDao();
    }
    private boolean buscarMarca(String descricao)throws Exception{
        try {
            ArrayList<Marca> listagem = marcaPersistencia.listagem();
            Iterator<Marca> lista = listagem.iterator();
            while(lista.hasNext()){
                 Marca aux = lista.next();
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
    public void incluir(Marca objeto) throws Exception {
        if(buscarMarca(objeto.getDescricao())){
            throw new Exception("Marca já foi cadastrada");
        }
        marcaPersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Marca objeto) throws Exception {
        if(buscarMarca(objeto.getDescricao())){
            throw new Exception("Marca ja cadastrada");
        }
        marcaPersistencia.alterar(objeto);

    }

    @Override
    public ArrayList<Marca> listagem() throws Exception {
        return marcaPersistencia.listagem(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void nada(Marca desc)throws Exception{
        if(desc.getDescricao().equals("")){
            throw new Exception("Nenhuma marca sendo cadastrada");
        }
    }
    public void semFoto(Marca url)throws Exception{
        if(url.getUrl().equals("")){
            throw new Exception("Selecione a logo para continuar");
        }
    }
    
    @Override
    public void mesmaFoto(Marca url)throws Exception{
        ArrayList<Marca> lista = listagem();
        
        for(int i = 0; i < lista.size();i++){
            if(url.getUrl().equals(lista.get(i).getUrl())){
                throw new Exception("Foto já adicionada");
            }
            
         }
        
    }
   public Marca buscar (int id) throws Exception{
       
       return marcaPersistencia.buscar(id);
    }
}
        