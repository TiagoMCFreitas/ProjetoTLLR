
package com.tllr.modelos;

import java.util.Date;
import com.tllr.enums.*;

public class Veiculo {
    private int id;
    private String placa;
    private int renavam;
    private float precoCompra;
    private float precoVenda;
    private Date anoDeFabricacao;
    private Date anoModelo;
    private TipoDeCombustivel combustivel;
    private int quilometragem;
    private TipoDoVeiculo tipoVeiculo;
    private Situacao situacao;

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

    public int getRenavam() {
        return renavam;
    }

    public void setRenavam(int renavam) {
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

    public Date getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(Date anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public Date getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Date anoModelo) {
        this.anoModelo = anoModelo;
    }

    public TipoDeCombustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(TipoDeCombustivel combustivel) {
        this.combustivel = combustivel;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public TipoDoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoDoVeiculo tipoVeiculo) {
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
        tipoVeiculo+ ";" + situacao;
    }
    
}
