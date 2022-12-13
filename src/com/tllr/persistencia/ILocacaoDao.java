
package com.tllr.persistencia;

import com.tllr.modelos.Acessorio;
import com.tllr.modelos.Locacao;
import com.tllr.modelos.Veiculo;
import java.util.ArrayList;


public interface ILocacaoDao {
    void locar(Locacao objeto)throws Exception;
    void devolver(Locacao objeto)throws Exception;
    void cancelar(Locacao objeto)throws Exception;
    ArrayList<Locacao> listagemLocacao() throws Exception;
    float calcularValorLocacao(Locacao objeto, Veiculo objetoVeiculo, Acessorio objetoAcessorio)throws Exception;
    
}
