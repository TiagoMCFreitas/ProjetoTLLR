
package com.tllr.modelos;


public class Endereco {
    private String logradouro;
    private String complemento;
    private String CEP;
    private String bairro;
    private String cidade;
    private String estado;



    public Endereco(String CEP,String bairro,String cidade,String complemento,String estado,String logradouro) {
        this.CEP = CEP;
        this.bairro = bairro;
        this.cidade = cidade;
        this.complemento = complemento;
        this.estado = estado;
        this.logradouro = logradouro;
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

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
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
        return CEP + ";" + bairro + ";" + cidade + ";" + complemento + ";" + estado + ";" + logradouro;
    }
}
