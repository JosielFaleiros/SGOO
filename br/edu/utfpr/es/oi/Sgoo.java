/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.es.oi;

import br.edu.utfpr.es.oi.controller.ControllerPrincipal;
import br.edu.utfpr.es.oi.gui.Inicio;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JosielFaleiros
 */
public class Sgoo {
        /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Inicio inicio = new Inicio();
        new ControllerPrincipal(inicio);
        inicio.setVisible(true);
        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> {
//            try {
//                criaBanco();
//            } catch (SQLException ex) {
//                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            new Inicio().setVisible(true);
//
//        });
    }
}
