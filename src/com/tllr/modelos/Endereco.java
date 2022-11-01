
package com.tllr.modelos;


public class Endereco {
  
    private String logradouro;
    private String complemento;
    private int CEP;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(String logradouro, String complemento, int CEP, String bairro, String cidade, String estado) {
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.CEP = CEP;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }
    
   public Endereco(){
       
   } 

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        return logradouro + ";" + complemento + ";" + CEP + ";" + bairro + ";" + cidade + ";" + estado;
    }
}
