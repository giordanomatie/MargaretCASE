/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes_UML.Inicio;
import Classes_UML.Serializador;
import Classes_UML.Sistema;
import Classes_UML.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Giordano Mattiello
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private Usuario usuario = Inicio.usuario;
    private ArrayList<java.awt.Label> labels;
    private ArrayList<java.awt.Button> buttons;
    private ArrayList<javax.swing.JProgressBar> bars;
    private Sistema sistema;
    private Usuario user;
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal(Sistema sistema, Usuario user) {
        initComponents();
        labels = new ArrayList<>();
        labels.add(lblTarefa1);
        labels.add(lblTarefa2);
        labels.add(lblTarefa3);
        labels.add(lblTarefa4);
        buttons = new ArrayList<>();
        buttons.add(btnTarefa1);
        buttons.add(btnTarefa2);
        buttons.add(btnTarefa3);
        buttons.add(btnTarefa4);
        bars = new ArrayList<>();
        bars.add(barTarefa1);
        bars.add(barTarefa2);
        bars.add(barTarefa3);
        bars.add(barTarefa4);
        this.sistema = sistema;
        
        this.user = user;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTarefas = new java.awt.Panel();
        lblProgressoTarefa1 = new javax.swing.JLabel();
        barTarefa1 = new javax.swing.JProgressBar();
        lblTarefa1 = new java.awt.Label();
        btnTarefa1 = new java.awt.Button();
        lblTarefa2 = new java.awt.Label();
        barTarefa2 = new javax.swing.JProgressBar();
        btnTarefa2 = new java.awt.Button();
        lblTarefa3 = new java.awt.Label();
        barTarefa3 = new javax.swing.JProgressBar();
        btnTarefa3 = new java.awt.Button();
        lblTarefa4 = new java.awt.Label();
        barTarefa4 = new javax.swing.JProgressBar();
        btnTarefa4 = new java.awt.Button();
        btnNovaTarefa = new java.awt.Button();
        panel1 = new java.awt.Panel();
        lblParceiros = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        chatUsers = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        chatBoard = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        chatMSG = new javax.swing.JTextArea();
        btnEnviar = new java.awt.Button();
        btnAddUserCanal = new java.awt.Button();
        btnLogOut = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MargaretCASE");
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlTarefas.setMaximumSize(new java.awt.Dimension(590, 317));

        lblProgressoTarefa1.setFont(new java.awt.Font("Cantarell", 0, 32)); // NOI18N
        lblProgressoTarefa1.setText("Progresso das Tarefas");

        barTarefa1.setValue(50);

        lblTarefa1.setText("Tarefa 01");

        btnTarefa1.setLabel("Editar");
        btnTarefa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTarefa1MouseClicked(evt);
            }
        });

        lblTarefa2.setText("Tarefa 01");

        barTarefa2.setValue(50);

        btnTarefa2.setLabel("Editar");
        btnTarefa2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTarefa2MouseClicked(evt);
            }
        });

        lblTarefa3.setText("Tarefa 01");

        barTarefa3.setValue(50);

        btnTarefa3.setLabel("Editar");
        btnTarefa3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTarefa3MouseClicked(evt);
            }
        });

        lblTarefa4.setText("Tarefa 01");

        barTarefa4.setValue(50);

        btnTarefa4.setLabel("Editar");
        btnTarefa4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTarefa4MouseClicked(evt);
            }
        });

        btnNovaTarefa.setLabel("+");
        btnNovaTarefa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovaTarefaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlTarefasLayout = new javax.swing.GroupLayout(pnlTarefas);
        pnlTarefas.setLayout(pnlTarefasLayout);
        pnlTarefasLayout.setHorizontalGroup(
            pnlTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTarefasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTarefasLayout.createSequentialGroup()
                        .addGroup(pnlTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTarefasLayout.createSequentialGroup()
                                .addComponent(barTarefa1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTarefa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTarefasLayout.createSequentialGroup()
                                .addGroup(pnlTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(barTarefa2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTarefa2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTarefa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTarefasLayout.createSequentialGroup()
                                .addGroup(pnlTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(barTarefa3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTarefa3, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTarefa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTarefasLayout.createSequentialGroup()
                                .addGroup(pnlTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(barTarefa4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTarefa4, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTarefa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTarefa1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(pnlTarefasLayout.createSequentialGroup()
                        .addComponent(lblProgressoTarefa1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNovaTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        pnlTarefasLayout.setVerticalGroup(
            pnlTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTarefasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProgressoTarefa1)
                    .addGroup(pnlTarefasLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnNovaTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(lblTarefa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(pnlTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTarefa1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barTarefa1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTarefa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTarefasLayout.createSequentialGroup()
                        .addComponent(lblTarefa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barTarefa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTarefa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTarefasLayout.createSequentialGroup()
                        .addComponent(lblTarefa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barTarefa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTarefa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTarefasLayout.createSequentialGroup()
                        .addComponent(lblTarefa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barTarefa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblParceiros.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblParceiros.setText("Parceiros da Equipe");

        jScrollPane1.setHorizontalScrollBar(null);

        chatUsers.setEditable(false);
        chatUsers.setColumns(20);
        chatUsers.setRows(5);
        jScrollPane1.setViewportView(chatUsers);

        jScrollPane2.setHorizontalScrollBar(null);

        chatBoard.setEditable(false);
        chatBoard.setColumns(20);
        chatBoard.setLineWrap(true);
        chatBoard.setRows(5);
        jScrollPane2.setViewportView(chatBoard);

        chatMSG.setColumns(20);
        chatMSG.setLineWrap(true);
        chatMSG.setRows(5);
        jScrollPane3.setViewportView(chatMSG);

        btnEnviar.setLabel("Enviar");
        btnEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarMouseClicked(evt);
            }
        });
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnAddUserCanal.setLabel("+");
        btnAddUserCanal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddUserCanalMouseClicked(evt);
            }
        });
        btnAddUserCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserCanalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                            .addComponent(lblParceiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddUserCanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblParceiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddUserCanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEnviar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnLogOut.setActionCommand("btnLogout");
        btnLogOut.setLabel("LogOut");
        btnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOutMouseClicked(evt);
            }
        });
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(243, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTarefa1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTarefa1MouseClicked
        // TODO add your handling code here:
        NovaTarefaGUI tarefaGUI = new NovaTarefaGUI(0,sistema);
        tarefaGUI.setVisible(true);
    }//GEN-LAST:event_btnTarefa1MouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void btnTarefa2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTarefa2MouseClicked
        // TODO add your handling code here:
        NovaTarefaGUI tarefaGUI = new NovaTarefaGUI(1,sistema);
        tarefaGUI.setVisible(true);
    }//GEN-LAST:event_btnTarefa2MouseClicked

    private void btnTarefa3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTarefa3MouseClicked
        // TODO add your handling code here:
        NovaTarefaGUI tarefaGUI = new NovaTarefaGUI(2,sistema);
        tarefaGUI.setVisible(true);
    }//GEN-LAST:event_btnTarefa3MouseClicked

    private void btnTarefa4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTarefa4MouseClicked
        // TODO add your handling code here:
        NovaTarefaGUI tarefaGUI = new NovaTarefaGUI(3,sistema);
        tarefaGUI.setVisible(true);
    }//GEN-LAST:event_btnTarefa4MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        for(int i = 0; i < labels.size(); i++){
            labels.get(i).setVisible(false);
            bars.get(i).setVisible(false);
            buttons.get(i).setVisible(false);
        }
        
        if(usuario.getTarefas().isEmpty()){
            lblTarefa1.setText("Você ainda não tem tarefas.");
            lblTarefa1.setVisible(true);
        }
        else {
            for (int i = 0; i < usuario.getTarefas().size(); i++){
                labels.get(i).setText(usuario.getTarefas().get(i).getNome());
                labels.get(i).setVisible(true);
                bars.get(i).setVisible(true);
                buttons.get(i).setVisible(true);
            }
        }
        ArrayList<Usuario> users = sistema.getUsuarios();
        for(Usuario amigos: users) {
            chatUsers.setText(chatUsers.getText() + amigos.getNome() +"\n");
        }
    }//GEN-LAST:event_formWindowActivated

    private void btnNovaTarefaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovaTarefaMouseClicked
        // TODO add your handling code here:
        NovaTarefaGUI tarefaGUI = new NovaTarefaGUI(-1,sistema);
        tarefaGUI.setVisible(true);
    }//GEN-LAST:event_btnNovaTarefaMouseClicked

    private void btnLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseClicked
        Login tela = new Login(sistema);
        this.setVisible(false);
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogOutMouseClicked

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseClicked
        String texto = chatMSG.getText();
        if (!texto.isEmpty()) {
            chatBoard.setText(chatBoard.getText()+user.getNome()+":\n  "+chatMSG.getText()+"\n");
            chatMSG.setText("");
        }
    }//GEN-LAST:event_btnEnviarMouseClicked

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnAddUserCanalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddUserCanalMouseClicked
        NovoCanalGUI guiC = new NovoCanalGUI(user, sistema);
        guiC.setVisible(true);
    }//GEN-LAST:event_btnAddUserCanalMouseClicked

    private void btnAddUserCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserCanalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddUserCanalActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Serializador.gravaSistema(sistema);
    }//GEN-LAST:event_formWindowClosing

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barTarefa1;
    private javax.swing.JProgressBar barTarefa2;
    private javax.swing.JProgressBar barTarefa3;
    private javax.swing.JProgressBar barTarefa4;
    private java.awt.Button btnAddUserCanal;
    private java.awt.Button btnEnviar;
    private java.awt.Button btnLogOut;
    private java.awt.Button btnNovaTarefa;
    private java.awt.Button btnTarefa1;
    private java.awt.Button btnTarefa2;
    private java.awt.Button btnTarefa3;
    private java.awt.Button btnTarefa4;
    private javax.swing.JTextArea chatBoard;
    private javax.swing.JTextArea chatMSG;
    private javax.swing.JTextArea chatUsers;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label lblParceiros;
    private javax.swing.JLabel lblProgressoTarefa1;
    private java.awt.Label lblTarefa1;
    private java.awt.Label lblTarefa2;
    private java.awt.Label lblTarefa3;
    private java.awt.Label lblTarefa4;
    private java.awt.Panel panel1;
    private java.awt.Panel pnlTarefas;
    // End of variables declaration//GEN-END:variables
}
