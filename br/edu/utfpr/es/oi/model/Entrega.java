package br.edu.utfpr.es.oi.model;
import java.util.Date;

public class Entrega {

    private Date dataLimite;
    private String descricao;

    public Date getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(Date dataLimite) {
        this.dataLimite = dataLimite;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}