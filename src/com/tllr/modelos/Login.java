
package com.tllr.modelos;


public class Login {
    
    private int id;
    private String nome;
    private String senha;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
    
    public Login(int id, String nome, String senha,String email){
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }
    public Login(){
        
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
    public String toString(){
        return id + ";" + nome + ";" + senha + ";" + email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
