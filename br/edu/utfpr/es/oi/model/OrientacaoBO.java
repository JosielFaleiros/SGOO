/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.es.oi.model;

import br.edu.utfpr.es.oi.model.dao.OrientacaoDAO;
import br.edu.utfpr.es.oi.model.dao.UsuarioDAO;
import java.util.List;

/**
 *
 * @author JosielFaleiros
 */
public class OrientacaoBO {

    //aluno solicitando
    public void solicitarOrientacaoAluno(Aluno aluno, Professor professor){
        OrientacaoDAO orientdao = new OrientacaoDAO();
        Orientacao orientacao = new Orientacao();
        orientacao.setSolicitante(SolicitanteEnum.ALUNO);
        orientacao.addAluno(aluno);
        orientacao.addProfessor(professor);
        orientacao.setStatus(StatusEnum.SOLICITADA);
        orientdao.adicionarOrientacao(orientacao);
    }

    // profesor solicitando;
    public void solicitarOrientacaoProfessor(Aluno aluno, Professor professor){
        OrientacaoDAO orientdao = new OrientacaoDAO();
        Orientacao orientacao = new Orientacao();
        orientacao.setSolicitante(SolicitanteEnum.PROFESSOR);
        orientacao.setAluno(aluno);
        orientacao.setProfessor(professor);
        orientacao.setStatus(StatusEnum.SOLICITADA);
        orientdao.adicionarOrientacao(orientacao);
    }
    
    public void aceitarOrientacao(Usuario usuario, Orientacao orientacao){
        OrientacaoDAO orientdao = new OrientacaoDAO();
        if(usuario.getClass().getSimpleName().equals(SolicitanteEnum.PROFESSOR)){
            if(orientacao.getSolicitante().equals(SolicitanteEnum.ALUNO)){
                orientacao.setStatus(StatusEnum.ACEITA);
            }
        }else
        if(usuario.getClass().getSimpleName().equals(SolicitanteEnum.ALUNO)){
            if(orientacao.getSolicitante().equals(SolicitanteEnum.PROFESSOR)){
                orientacao.setStatus(StatusEnum.ACEITA);
            }
        }
        orientdao.editarOrientacao(orientacao);
    }
    
    public void solicitarReuniao(Usuario usuario, Orientacao orientacao, Reuniao reuniao){
        OrientacaoDAO orientdao = new OrientacaoDAO();
        reuniao.setStatus(StatusEnum.SOLICITADA);
        if(usuario.getClass().getSimpleName().equals(SolicitanteEnum.PROFESSOR)){
            reuniao.setSolicitante(SolicitanteEnum.PROFESSOR);
        }else{
            reuniao.setSolicitante(SolicitanteEnum.ALUNO);
        }
        orientacao.addReuniao(reuniao);
        orientdao.adicionarReuniao(orientacao, reuniao);
    }
    
    public void aceitarReuniao(Usuario usuario, Reuniao reuniao){
        OrientacaoDAO orientdao = new OrientacaoDAO();
        if(usuario.getClass().getSimpleName().equals(SolicitanteEnum.PROFESSOR)){
            if(reuniao.getSolicitante().equals(SolicitanteEnum.ALUNO)){
                reuniao.setStatus(StatusEnum.ACEITA);
            }
        }else
        if(usuario.getClass().getSimpleName().equals(SolicitanteEnum.ALUNO)){
            if(reuniao.getSolicitante().equals(SolicitanteEnum.PROFESSOR)){
                reuniao.setStatus(StatusEnum.ACEITA);
            }
        }
        orientdao.editarReuniao(reuniao);
    }
    
}
