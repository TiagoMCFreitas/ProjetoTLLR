
package com.tllr.controle;

import com.tllr.modelos.Veiculo;
import com.tllr.persistencia.IVeiculoDao;
import com.tllr.persistencia.VeiculoDao;
import java.util.ArrayList;
import java.util.Iterator;


public class VeiculoControle implements IVeiculoControle{
    IVeiculoDao objetoVeiculo = new VeiculoDao();
    
    private boolean buscarVeiculo(String placa)throws Exception{
        try {
            ArrayList<Veiculo> listagem = objetoVeiculo.listagemVeiculo();
            Iterator<Veiculo> lista = listagem.iterator();
            while(lista.hasNext()){
                 Veiculo aux = lista.next();
                if(aux.getPlaca().equalsIgnoreCase(placa)){
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }
    @Override
    public void incluir(Veiculo objeto) throws Exception {
        if(buscarVeiculo(objeto.getPlaca())){
            throw new Exception("Carro já adicionado");
        }
        objetoVeiculo.incluir(objeto);
    }

    @Override
    public void alterar(Veiculo objeto) throws Exception {
        objetoVeiculo.alterar(objeto);
    }

    @Override
    public Veiculo buscar(int id) throws Exception {
        return objetoVeiculo.buscar(id);
    }

    @Override
    public ArrayList<Veiculo> listagemVeiculo() throws Exception {
        return objetoVeiculo.listagemVeiculo();
    }

    @Override
    public void verificar(Veiculo objeto) throws Exception {
        if(objeto.getPlaca().equals("")){
            throw new Exception("Placa vazia, adicione a placa do Veículo");
        }
    }
}
