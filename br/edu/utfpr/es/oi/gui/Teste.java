/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.es.oi.gui;

import br.edu.utfpr.es.oi.util.Util;

/**
 *
 * @author JoaoPaulo
 */
public class Teste {
    
    public static void main(String[] args) {
        Inicio input = new Inicio();
        input.setVisible(true);
        input.dispose();
        Util.abrirJDialogCentralizado(new JDialogAluno(input, true));
    }
    
}
