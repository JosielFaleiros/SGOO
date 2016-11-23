/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.es.oi.model;

import java.util.List;

/**
 *
 * @author JosielFaleiros
 */
public class UsuarioBO {
    
    public void registrarUsuario(Usuario usuario){
        if(!verificarUsuarioExiste(usuario)){
            UsuarioDAO userdao = new UsuarioDAO();
            userdao.inserirUsuario(usuario);
        }
    }
    //return true se o usuário já existir, false, caso contrário.
    public boolean verificarUsuarioExiste(Usuario usuario){
        UsuarioDAO userdao = new UsuarioDAO();
        if(userdao.buscarUsuario(usuario) != null) return false;
        return true;
    }
    
    public boolean realizarLogin(Usuario usuario){
        UsuarioDAO userdao = new UsuarioDAO();
        Usuario temp = userdao.buscarUsuario(usuario);
        if(temp != null){
            if(temp.getEmail().equals(usuario.getEmail()) && temp.getSenha().equals(usuario.getSenha())) return true;
        }
        return false;
    }
    
    public List<Usuario> buscarAlunosByQuery(String query){
        UsuarioDAO userdao = new UsuarioDAO();
        return userdao.buscarUsuarioByQuery(query);
    }

}
