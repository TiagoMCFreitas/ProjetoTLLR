
package com.tllr.controle;
import com.tllr.modelos.Login;
import com.tllr.persistencia.ILoginDao;
import com.tllr.persistencia.LoginDao;
import java.util.ArrayList;
import java.util.Iterator;


public class LoginControle implements ILoginControle{
    ILoginDao modeloLogin = new LoginDao();

    private boolean buscarNome(String descricao)throws Exception{
        try {
            ArrayList<Login> listagem = modeloLogin.verificar();
            Iterator<Login> lista = listagem.iterator();
            while(lista.hasNext()){
                 Login aux = lista.next();
                if(aux.getNome().equalsIgnoreCase(descricao)){
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
}

    @Override
    public void cadastrar(Login objeto) throws Exception {
        if(buscarNome(objeto.getNome())){
        throw new Exception("Nome Ja existente");
        }
        modeloLogin.cadastrar(objeto);
    }

    @Override
    public boolean achar(Login objeto) throws Exception {
        return modeloLogin.achar(objeto);
    }

    @Override
    public ArrayList<Login> verificar() throws Exception {
        return modeloLogin.verificar();
    }

    @Override
    public String liberar(Login objeto) throws Exception {
        return modeloLogin.liberar(objeto);
    }

    @Override
    public void seNaoExistirId() throws Exception {
        modeloLogin.seNaoExistirId();
    }

    @Override
    public void manterConectado(String nome) throws Exception {
        modeloLogin.manterConectado(nome);
    
    }

    @Override
    public void alterar(Login objeto) throws Exception {
        modeloLogin.alterarSenha(objeto);
    }

    @Override
    public Login buscar(int id) throws Exception {
        return modeloLogin.buscar(id);
    }
    
}
