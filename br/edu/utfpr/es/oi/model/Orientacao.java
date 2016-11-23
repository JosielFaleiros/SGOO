package br.edu.utfpr.es.oi.model;
import br.edu.utfpr.es.oi.model.Reuniao;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Orientacao {

    private int dataInicio;
    private int dataFim;
    private List<Reuniao> reuniao;
    private List<Entrega> entrega;
    private Aluno aluno;
    private Professor professor;
    private StatusEnum status;
    private SolicitanteEnum solicitante;

    public Orientacao() {
        reuniao = new ArrayList<>();
        entrega = new ArrayList<>();
    }

    public int getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(int dataInicio) {
        this.dataInicio = dataInicio;
    }

    public int getDataFim() {
        return dataFim;
    }

    public void setDataFim(int dataFim) {
        this.dataFim = dataFim;
    }

    public List<Reuniao> getReuniao() {
        return reuniao;
    }

    public void setReuniao(List<Reuniao> reuniao) {
        this.reuniao = reuniao;
    }

    public List<Entrega> getEntrega() {
        return entrega;
    }

    public void setEntrega(List<Entrega> entrega) {
        this.entrega = entrega;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public SolicitanteEnum getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(SolicitanteEnum solicitante) {
        this.solicitante = solicitante;
    }

    void addReuniao(Reuniao reuniao) {
        this.reuniao.add(reuniao);
    }

}
