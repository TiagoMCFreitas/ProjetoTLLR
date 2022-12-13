
package com.tllr.modelos;

import com.tllr.enums.Situacao;
import com.tllr.enums.SituacaoLocacao;
import java.time.LocalDate;

public class Locacao {
    private int id;
    private int anoInicio, mesInicio, diaInicio ;
    private int anoFinal , mesFinal , diaFinal ;
    private float valorCalcao;
    SituacaoLocacao situacaoLocacao;
    Cliente cliente;
    Veiculo veiculo;
    Acessorio acessorio;
    Motorista motorista;

    public Locacao(int id,int anoInicio, int mesInicio, int diaInicio, int anoFinal, int mesFinal, int diaFinal, float valorCalcao ,SituacaoLocacao situacaoLocacao, Cliente cliente, Veiculo veiculo, Acessorio acessorio,Motorista motorista) {
        this.id = id;
        this.anoInicio = anoInicio;
        this.mesInicio = mesInicio;
        this.diaInicio = diaInicio;
        this.anoFinal = anoFinal;
        this.mesFinal = mesFinal;
        this.diaFinal = diaFinal;
        this.valorCalcao = valorCalcao;
        this.situacaoLocacao = situacaoLocacao;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.acessorio = acessorio;
        this.motorista = motorista;
    }
    public Locacao(int anoInicio, int mesInicio, int diaInicio, int anoFinal, int mesFinal, int diaFinal){
          this.anoInicio = anoInicio;
        this.mesInicio = mesInicio;
        this.diaInicio = diaInicio;
        this.anoFinal = anoFinal;
        this.mesFinal = mesFinal;
        this.diaFinal = diaFinal;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
    public int getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }

    public int getMesInicio() {
        return mesInicio;
    }

    public void setMesInicio(int mesInicio) {
        this.mesInicio = mesInicio;
    }

    public int getDiaInicio() {
        return diaInicio;
    }

    public void setDiaInicio(int diaInicio) {
        this.diaInicio = diaInicio;
    }

    public int getAnoFinal() {
        return anoFinal;
    }

    public void setAnoFinal(int anoFinal) {
        this.anoFinal = anoFinal;
    }

    public int getMesFinal() {
        return mesFinal;
    }

    public void setMesFinal(int mesFinal) {
        this.mesFinal = mesFinal;
    }

    public int getDiaFinal() {
        return diaFinal;
    }

    public void setDiaFinal(int diaFinal) {
        this.diaFinal = diaFinal;
    }

    
    public Locacao() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Acessorio getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(Acessorio acessorio) {
        this.acessorio = acessorio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValorCalcao() {
        return valorCalcao;
    }

    public void setValorCalcao(float valorCalcao) {
        this.valorCalcao = valorCalcao;
    }

    public SituacaoLocacao getSituacaoLocacao() {
        return situacaoLocacao;
    }

    public void setSituacaoLocacao(SituacaoLocacao situacaoLocacao) {
        this.situacaoLocacao = situacaoLocacao;
    }
         public LocalDate setarInicio( int ano,int dia,int mes){
         LocalDate dataInicial = LocalDate.of(ano, mes, dia);
        return dataInicial;
    }
    public LocalDate setarFim( int ano,int dia,int mes){
         LocalDate dataFinal = LocalDate.of(ano, mes, dia);
        return dataFinal;
    }
    
    
    @Override
    public String toString(){
        return id + ";" + diaInicio +";" + mesInicio + ";" + anoInicio + ";" + diaFinal +";" + mesFinal + ";" + anoFinal  + ";" + valorCalcao + ";" + situacaoLocacao + ";" + cliente.getId() +";"+
                veiculo.getId() + ";" + acessorio.getId()+";" + veiculo.getCategoria().getId()+ ";"+ motorista.getId();
        
    }
    
}
