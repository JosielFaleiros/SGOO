/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.es.oi.model.dao;

import br.edu.utfpr.es.oi.model.SolicitanteEnum;
import br.edu.utfpr.es.oi.model.Usuario;
import java.util.List;

/**
 *
 * @author JosielFaleiros
 */
public class UsuarioDAO {

    public Usuario buscarUsuario(Usuario usuario) {
        return null;
    }

    public void inserirUsuario(Usuario usuario) {
        // inserir novo usuário no banco
    }

    public List<Usuario> buscarUsuarioByQuery(SolicitanteEnum solicitanteEnum, String query) {
        //realizar a busca por usuários do @SolicitanteEnum.name() pela @query;
        return null;
    }
    
}
