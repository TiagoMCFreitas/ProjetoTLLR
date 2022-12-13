
package com.tllr.modelos;

import java.util.Date;


public class Motorista {

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    private int id;
    private String nome;
    private int numeroCnh;
    private String dataValidade;
    private Endereco endereco;
    private Telefone telefone;
    private Cliente cliente;

    public Motorista(int id, String nome, int numeroCnh, String dataValidade, Endereco endereco, Telefone telefone,Cliente cliente) {
        this.id = id;
        this.nome = nome;
        this.numeroCnh = numeroCnh;
        this.dataValidade = dataValidade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cliente = cliente;
    }
    public Motorista(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroCnh() {
        return numeroCnh;
    }

    public void setNumeroCnh(int numeroCnh) {
        this.numeroCnh = numeroCnh;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
    
    public String toString(){
        return id + ";" + nome + ";" + numeroCnh + ";" + dataValidade + ";" + endereco + ";" + telefone + ";" + cliente.getId() ;
    }
    
}
