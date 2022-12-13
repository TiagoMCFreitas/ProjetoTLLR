
package com.tllr.modelos;

import java.util.Date;
import com.tllr.enums.*;

public class Veiculo {
    private int id;
    private String placa;
    private long renavam;
    private float precoCompra;
    private float precoVenda;
    private int anoDeFabricacao;
    private int anoModelo;
    private Combustivel combustivel;
    private int quilometragem;
    private VeiculoTipo tipoVeiculo;
    private Situacao situacao;
    private Categoria categoria;
    private Modelo modelo;

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Veiculo(int id, String placa, long renavam, float precoCompra, float precoVenda, int anoDeFabricacao, int anoModelo, Combustivel combustivel, int quilometragem, VeiculoTipo tipoVeiculo, Situacao situacao, Categoria categoria, Modelo modelo) {
        this.id = id;
        this.placa = placa;
        this.renavam = renavam;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.anoDeFabricacao = anoDeFabricacao;
        this.anoModelo = anoModelo;
        this.combustivel = combustivel;
        this.quilometragem = quilometragem;
        this.tipoVeiculo = tipoVeiculo;
        this.situacao = situacao;
        this.categoria = categoria;
        this.modelo = modelo;
    }
 public Veiculo(){
        
    }
    
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public long getRenavam() {
        return renavam;
    }

    public void setRenavam(long renavam) {
        this.renavam = renavam;
    }

    public float getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public VeiculoTipo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(VeiculoTipo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }
    
    @Override
    public String toString(){
        return id + ";" + placa + ";" + renavam + ";" + precoCompra + ";" 
       + precoVenda + ";" + anoDeFabricacao + ";" + anoModelo + ";" + combustivel + ";" + quilometragem+ ";" + 
        tipoVeiculo+ ";" + situacao + ";" + categoria.getId() +";"+ modelo.getId();
    }
    
}
