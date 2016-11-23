/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.es.oi.model;

/**
 *
 * @author JosielFaleiros
 */
public enum SolicitanteEnum {
    PROFESSOR ("Professor"),
    ALUNO("Aluno");
    private String solicitante;

    private SolicitanteEnum(String s) {
        this.solicitante = s;
    }
    
    public String toString() {
       return this.solicitante;
    }
}
