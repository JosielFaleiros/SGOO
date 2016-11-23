package br.edu.utfpr.es.oi.gui;

import br.edu.utfpr.es.oi.util.Util;

/**
 *
 * @author JoaoPaulo
 */
public class JDialogProfessor extends javax.swing.JDialog {

    public JDialogProfessor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelFoto = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButtonReuniao = new javax.swing.JButton();
        jButtonReuniao1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtonOrientador = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldBuscarOrientando = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonOrientador1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Professor");
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(550, 640));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(550, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(550, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelFoto.setBackground(new java.awt.Color(0, 0, 0));
        jLabelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/es/oi/icons/icon_student_48.png"))); 
        jLabelFoto.setToolTipText("Selecionar Foto");
        jLabelFoto.setAlignmentX(0.5F);
        jLabelFoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelFoto.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabelFoto.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabelFoto.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(jLabelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jFormattedTextField1.setEditable(false);
        jFormattedTextField1.setEnabled(false);
        jPanel1.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 120, 25));

        jTextField1.setEditable(false);
        jTextField1.setEnabled(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 168, 25));

        jTextField4.setEditable(false);
        jTextField4.setEnabled(false);
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 168, 25));

        jTextField3.setEditable(false);
        jTextField3.setEnabled(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 168, 25));

        jTextField5.setEditable(false);
        jTextField5.setEnabled(false);
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 168, 25));

        jButtonReuniao.setFont(new java.awt.Font("Arial Black", 1, 12));
        jButtonReuniao.setText("+");
        jButtonReuniao.setToolTipText("Visualizar Professor");
        jButtonReuniao.setMaximumSize(new java.awt.Dimension(41, 25));
        jButtonReuniao.setMinimumSize(new java.awt.Dimension(41, 25));
        jButtonReuniao.setPreferredSize(new java.awt.Dimension(41, 25));
        jButtonReuniao.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReuniaoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonReuniao, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 41, 25));

        jButtonReuniao1.setFont(new java.awt.Font("Arial Black", 1, 12)); 
        jButtonReuniao1.setText("+");
        jButtonReuniao1.setToolTipText("Visualizar Professor");
        jButtonReuniao1.setMaximumSize(new java.awt.Dimension(41, 25));
        jButtonReuniao1.setMinimumSize(new java.awt.Dimension(41, 25));
        jButtonReuniao1.setPreferredSize(new java.awt.Dimension(41, 25));
        jPanel1.add(jButtonReuniao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 41, 25));

        jLabel9.setText("Buscar Usuários:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        jLabel7.setText("Tempo Livre:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        jLabel4.setText("Area de Interesse:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        jButton1.setText("Salvar");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 100, 20));

        jButton2.setText("Editar");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, 20));

        jButtonOrientador.setFont(new java.awt.Font("Arial Black", 1, 12)); 
        jButtonOrientador.setText("+ Aluno");
        jButtonOrientador.setToolTipText("Solicitar Reunião");
        jButtonOrientador.setMaximumSize(new java.awt.Dimension(41, 25));
        jButtonOrientador.setMinimumSize(new java.awt.Dimension(41, 25));
        jButtonOrientador.setPreferredSize(new java.awt.Dimension(41, 25));
        jButtonOrientador.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrientadorActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonOrientador, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, 100, 25));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 550, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 550, 10));

        jLabel3.setText("E-mail:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        jLabel6.setText("Departamento:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        jLabel1.setText("Nome:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        jLabel10.setText("SIAPE:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        jLabel11.setText("Nome:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));
        jPanel1.add(jTextFieldBuscarOrientando, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 150, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 400, 130));

        jButtonOrientador1.setFont(new java.awt.Font("Arial Black", 1, 12)); 
        jButtonOrientador1.setText("+ Reunião");
        jButtonOrientador1.setToolTipText("Solicitar Reunião");
        jButtonOrientador1.setMaximumSize(new java.awt.Dimension(41, 25));
        jButtonOrientador1.setMinimumSize(new java.awt.Dimension(41, 25));
        jButtonOrientador1.setPreferredSize(new java.awt.Dimension(41, 25));
        jButtonOrientador1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrientador1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonOrientador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 110, 25));

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); 
        jLabel2.setText("Lista de Orientandos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 600));

        setSize(new java.awt.Dimension(566, 638));
        setLocationRelativeTo(null);
    }

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jButtonReuniaoActionPerformed(java.awt.event.ActionEvent evt) {
        Util.abrirJDialogCentralizado(new JDialogTempoLivre(null, true));
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jButtonOrientadorActionPerformed(java.awt.event.ActionEvent evt) {
        Util.abrirJDialogCentralizado(new JDialogReuniao( null, true));
    }

    private void jButtonOrientador1ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonOrientador;
    private javax.swing.JButton jButtonOrientador1;
    private javax.swing.JButton jButtonReuniao;
    private javax.swing.JButton jButtonReuniao1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextFieldBuscarOrientando;
    
}
