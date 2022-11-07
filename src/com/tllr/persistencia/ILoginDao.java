/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tllr.persistencia;

import com.tllr.modelos.Login;
import com.tllr.modelos.Login;
import java.util.ArrayList;

public interface ILoginDao {
    void cadastrar(Login objeto)throws Exception;
    boolean achar(Login objeto)throws Exception;
    ArrayList<Login> verificar()throws Exception;
    String liberar(Login objeto)throws Exception;
    void seNaoExistirId()throws Exception;
    void manterConectado(Login objeto)throws Exception;
}
