
package com.tllr.modelos;


public class Modelo implements Comparable<Modelo>{
    private int id;
    private String descricao;
    private String url;
    private Marca marca;

    
    public Modelo(int id, String descricao, String url, Marca marca){
        this.id = id;
        this.descricao = descricao;
        this.url = url;
        this.marca = marca;
    }
    public Modelo(){
        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
 
    @Override
    public String toString(){
        return id + ";" + descricao + ";" + url  + ";" + marca.getId();
    }

    @Override
    public int compareTo(Modelo id) {
     if(this.id == id.getId()) return (this.id++);
     else return(this.id - id.getId());
    }
    
}
