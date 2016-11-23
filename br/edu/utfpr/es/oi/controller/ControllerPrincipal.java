/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.es.oi.controller;

import br.edu.utfpr.es.oi.gui.Inicio;
import br.edu.utfpr.es.oi.gui.JDialogAluno;
import br.edu.utfpr.es.oi.gui.JDialogCadastrarUsuario;
import br.edu.utfpr.es.oi.gui.JDialogProfessor;
import br.edu.utfpr.es.oi.model.SolicitanteEnum;
import br.edu.utfpr.es.oi.model.Usuario;
import br.edu.utfpr.es.oi.model.UsuarioBO;
import br.edu.utfpr.es.oi.util.Util;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author JosielFaleiros
 */
public class ControllerPrincipal{
    
    Inicio frameLogin;
    JDialogAluno jdialogAluno;
    JDialogProfessor jdialogProfessor;

    public ControllerPrincipal(Inicio frameLogin, JDialogAluno jdialogAluno, JDialogProfessor jdialogProfessor) {
        this.frameLogin = frameLogin;
        this.jdialogAluno = jdialogAluno;
        this.jdialogProfessor = jdialogProfessor;
        
        this.frameLogin.getjButtonCriarConta().addActionListener(cadastrarUsuarioListener());
        this.frameLogin.getjButtonEntrar().addActionListener(fazerLoginListener());
    }

    public ControllerPrincipal(Inicio frameLogin) {
        this.frameLogin = frameLogin;
        
        this.frameLogin.getjButtonCriarConta().addActionListener(cadastrarUsuarioListener());
        this.frameLogin.getjButtonEntrar().addActionListener(fazerLoginListener());
    }

    public ActionListener fazerLoginListener () {
        return new ActionListener() {
            @Override public void actionPerformed (ActionEvent e) {
                Usuario usuario = new Usuario();
                usuario.setEmail(frameLogin.getjTextFieldUsuario().getText());
                usuario.setSenha(String.valueOf( frameLogin.getjPasswordFieldSenha().getPassword() ));
                UsuarioBO userBo = new UsuarioBO();
                usuario = userBo.realizarLogin(usuario);
                if(usuario != null){
                    if(usuario.getClass().getSimpleName().equals(SolicitanteEnum.PROFESSOR))
                        Util.abrirJDialogCentralizado(new JDialogProfessor(frameLogin, true));
                    else
                        Util.abrirJDialogCentralizado(new JDialogAluno(frameLogin, true));
                    frameLogin.dispose();
                }
             }
         };
    }
    
    
    public ActionListener cadastrarUsuarioListener () {
        return new ActionListener() {
            @Override public void actionPerformed (ActionEvent e) {
                Usuario usuario = new Usuario();
                usuario.setEmail(frameLogin.getjTextFieldUsuario().getText());
                usuario.setSenha(String.valueOf( frameLogin.getjPasswordFieldSenha().getPassword() ));
                UsuarioBO userBo = new UsuarioBO();
                userBo.registrarUsuario(usuario);
                System.out.println("cadastro pelo controller");
                Util.abrirJDialogCentralizado(new JDialogCadastrarUsuario(frameLogin, true));
             }
         };
     }
    
    
    public void stateChanged(ChangeEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
