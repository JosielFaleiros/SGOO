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
public enum StatusEnum {
    SOLICITADA ("solicitada"),    ACEITA ("aceita"),    FINALIZADA ("finalizada");
    private String status;

    private StatusEnum(String s) {
        this.status = s;
    }
    
    public String toString() {
       return this.status;
    }
}
