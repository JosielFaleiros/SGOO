/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.es.oi.gui;

import br.edu.utfpr.es.oi.util.Util;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author JoaoPaulo
 */
public class Inicio extends javax.swing.JFrame {

    private javax.swing.JButton jButtonCriarConta;

    public JButton getjButtonCriarConta() {
        return jButtonCriarConta;
    }

    public JButton getjButtonEntrar() {
        return jButtonEntrar;
    }

    public JPasswordField getjPasswordFieldSenha() {
        return jPasswordFieldSenha;
    }

    public JTextField getjTextFieldUsuario() {
        return jTextFieldUsuario;
    }
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelRecupararSenha;
    private javax.swing.JLabel jLabelSgoo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelCadastroLogin;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;

    /**
     * Creates new form Inicio
     */
    public Inicio() {
                /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        setVisible(true);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanelCadastroLogin = new javax.swing.JPanel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonEntrar = new javax.swing.JButton();
        jLabelSgoo = new javax.swing.JLabel();
        jButtonCriarConta = new javax.swing.JButton();
        jLabelRecupararSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entre ou Cadastre-se");
        setFocusCycleRoot(false);
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelCadastroLogin.setBackground(new java.awt.Color(204, 255, 204));
        jPanelCadastroLogin.setForeground(new java.awt.Color(153, 255, 153));
        jPanelCadastroLogin.setMaximumSize(new java.awt.Dimension(400, 300));
        jPanelCadastroLogin.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanelCadastroLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPasswordFieldSenha.setToolTipText("Entre Com Sua Senha");
        jPasswordFieldSenha.setMaximumSize(new java.awt.Dimension(25, 210));
        jPasswordFieldSenha.setMinimumSize(new java.awt.Dimension(25, 210));
        jPasswordFieldSenha.setPreferredSize(new java.awt.Dimension(25, 210));
        jPanelCadastroLogin.add(jPasswordFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 240, 30));

        jTextFieldUsuario.setToolTipText("Entre Com Nome de Usuário");
        jTextFieldUsuario.setMaximumSize(new java.awt.Dimension(25, 210));
        jTextFieldUsuario.setMinimumSize(new java.awt.Dimension(25, 210));
        jTextFieldUsuario.setPreferredSize(new java.awt.Dimension(25, 210));
        jPanelCadastroLogin.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 240, 30));

        jLabelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUsuario.setText("Usuário:");
        jPanelCadastroLogin.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, 25));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Senha:");
        jPanelCadastroLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 60, 25));

        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        jPanelCadastroLogin.add(jButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 100, 40));

        jLabelSgoo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSgoo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/es/oi/icons/sgoo.png"))); // NOI18N
        jPanelCadastroLogin.add(jLabelSgoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jButtonCriarConta.setText("Criar Conta");
        jButtonCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarContaActionPerformed(evt);
            }
        });
        jPanelCadastroLogin.add(jButtonCriarConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 100, 40));

        jLabelRecupararSenha.setForeground(new java.awt.Color(0, 0, 255));
        jLabelRecupararSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRecupararSenha.setText("Recuperar Senha?");
        jLabelRecupararSenha.setMaximumSize(new java.awt.Dimension(100, 14));
        jLabelRecupararSenha.setMinimumSize(new java.awt.Dimension(100, 14));
        jLabelRecupararSenha.setPreferredSize(new java.awt.Dimension(100, 14));
        jPanelCadastroLogin.add(jLabelRecupararSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 110, -1));

        getContentPane().add(jPanelCadastroLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));
        jPanelCadastroLogin.getAccessibleContext().setAccessibleName("jPanelCadastroLogin");
        jPanelCadastroLogin.getAccessibleContext().setAccessibleDescription("jPanelCadastroLogin");

        getAccessibleContext().setAccessibleParent(this);

        setSize(new java.awt.Dimension(416, 338));
        setLocationRelativeTo(null);
    }

    private void jButtonCriarContaActionPerformed(java.awt.event.ActionEvent evt) {
        Util.abrirJDialogCentralizado(new JDialogCadastrarUsuario(this, true));

        //this.dispose();

    }

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }


    private static void criaBanco() throws SQLException {

//        HibernateUtil.setUser("root");
//        HibernateUtil.setPass("root");
//
//        Connection conexao = Conexao.getConnection();
//
//        try {
//            conexao.createStatement().execute("create database if not EXISTS sgoo");
//            conexao.createStatement().execute("use sgoo");
//            HibernateUtil.criarSchema();
//
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Problema ao criar Banco");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Erro inesperado ao tentar iniciar");
//        }

    }
}
