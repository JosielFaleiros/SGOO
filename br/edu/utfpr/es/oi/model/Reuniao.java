package br.edu.utfpr.es.oi.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reuniao {

    private String assunto;
    private List<Historico> historico;
    private Date data;
    private StatusEnum status;
    private SolicitanteEnum solicitante;
    
    public Reuniao(){
        historico = new ArrayList<>();
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public List<Historico> getHistorico() {
        return historico;
    }

    public void setHistorico(List<Historico> historico) {
        this.historico = historico;
    }

    public void setStatus(StatusEnum statusEnum) {
        this.status = statusEnum;
    }
    
    public StatusEnum getStatus() {
        return status;
    }

    void setSolicitante(SolicitanteEnum solicitanteEnum) {
        this.solicitante = solicitanteEnum;
    }

    public SolicitanteEnum getSolicitante() {
        return solicitante;
    }

}