package br.edu.utfpr.es.oi.model;
import br.edu.utfpr.es.oi.model.Aluno;
import br.edu.utfpr.es.oi.model.Reuniao;
import java.util.ArrayList;
import java.util.Date;
import java.util.Collection;
import java.util.List;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String senha;
    private String areainteresse;
    private String departamento;
    private List<TempoLivre> tempoLivre;
    
    public Usuario(){
        tempoLivre = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getAreainteresse() {
        return areainteresse;
    }

    public void setAreainteresse(String areainteresse) {
        this.areainteresse = areainteresse;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public List<TempoLivre> getTempoLivre() {
        return tempoLivre;
    }

    public void setTempoLivre(List<TempoLivre> tempoLivre) {
        this.tempoLivre = tempoLivre;
    }

}