/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ControladorAtividade;
import control.ControladorAvaliacao;
import control.ControladorGrupo;

/**
 *
 * @author jcmartins81
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        mProfessor = new javax.swing.JMenu();
        miCriarAtividade = new javax.swing.JMenuItem();
        miEditarGrupos = new javax.swing.JMenuItem();
        jmiAvaliarGrupos = new javax.swing.JMenuItem();
        mAluno = new javax.swing.JMenu();
        miCriarGrupo = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        miSolicitarParticipacao = new javax.swing.JMenuItem();
        mGerenciarGrupos = new javax.swing.JMenu();
        miConvidarAluno = new javax.swing.JMenuItem();
        miAceitarPedidos = new javax.swing.JMenuItem();
        miAgendarApresentacao = new javax.swing.JMenuItem();
        mListar = new javax.swing.JMenu();
        jmiListarAtividades = new javax.swing.JMenuItem();
        miAgenda = new javax.swing.JMenuItem();
        milistarAlunos = new javax.swing.JMenuItem();
        jmiListaDeGrupos = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mProfessor.setText("Professor");

        miCriarAtividade.setText("Criar Atividade");
        miCriarAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCriarAtividadeActionPerformed(evt);
            }
        });
        mProfessor.add(miCriarAtividade);

        miEditarGrupos.setText("Editar Grupos");
        miEditarGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEditarGruposActionPerformed(evt);
            }
        });
        mProfessor.add(miEditarGrupos);

        jmiAvaliarGrupos.setText("Avaliar Grupos");
        jmiAvaliarGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAvaliarGruposActionPerformed(evt);
            }
        });
        mProfessor.add(jmiAvaliarGrupos);

        jMenuBar1.add(mProfessor);

        mAluno.setText("Aluno");

        miCriarGrupo.setText("Criar Grupo");
        miCriarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCriarGrupoActionPerformed(evt);
            }
        });
        mAluno.add(miCriarGrupo);

        jMenuItem2.setText("Ver Convites Recebidos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mAluno.add(jMenuItem2);

        miSolicitarParticipacao.setText("Solicitar Participação");
        mAluno.add(miSolicitarParticipacao);

        jMenuBar1.add(mAluno);

        mGerenciarGrupos.setText("Gerenciar Grupo");

        miConvidarAluno.setText("Convidar Aluno");
        miConvidarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConvidarAlunoActionPerformed(evt);
            }
        });
        mGerenciarGrupos.add(miConvidarAluno);

        miAceitarPedidos.setText("Aceitar Pedidos");
        miAceitarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAceitarPedidosActionPerformed(evt);
            }
        });
        mGerenciarGrupos.add(miAceitarPedidos);

        miAgendarApresentacao.setText("Agendar Apresentação");
        mGerenciarGrupos.add(miAgendarApresentacao);

        jMenuBar1.add(mGerenciarGrupos);

        mListar.setText("Listar");

        jmiListarAtividades.setText("Listar Atividades");
        jmiListarAtividades.setActionCommand("ListarAtividades");
        jmiListarAtividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListarAtividadesActionPerformed(evt);
            }
        });
        mListar.add(jmiListarAtividades);

        miAgenda.setText("Agenda da Disciplina");
        mListar.add(miAgenda);

        milistarAlunos.setText("Alunos");
        mListar.add(milistarAlunos);

        jmiListaDeGrupos.setText("Grupos");
        jmiListaDeGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListaDeGruposActionPerformed(evt);
            }
        });
        mListar.add(jmiListaDeGrupos);

        jMenuBar1.add(mListar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miEditarGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEditarGruposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miEditarGruposActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void miAceitarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAceitarPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miAceitarPedidosActionPerformed

    private void miCriarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCriarGrupoActionPerformed
        ControladorGrupo.getInstance().exibeTelaCriarGrupo();
    }//GEN-LAST:event_miCriarGrupoActionPerformed

    private void jmiListaDeGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListaDeGruposActionPerformed
        ControladorGrupo.getInstance().exibeTelaListarGrupos();
    }//GEN-LAST:event_jmiListaDeGruposActionPerformed

    private void miCriarAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCriarAtividadeActionPerformed
        ControladorAtividade.getInstance().exibeTelaCriarAtividade();
    }//GEN-LAST:event_miCriarAtividadeActionPerformed

    private void jmiAvaliarGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAvaliarGruposActionPerformed
        ControladorAvaliacao.getInstance().exibeAvaliarGrupo();
    }//GEN-LAST:event_jmiAvaliarGruposActionPerformed

    private void miConvidarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConvidarAlunoActionPerformed
        ControladorGrupo.getInstance().convidarGrupos();      // TODO add your handling code here:
    }//GEN-LAST:event_miConvidarAlunoActionPerformed

    private void jmiListarAtividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListarAtividadesActionPerformed
        ControladorAtividade.getInstance().exibeTelaListarAtividades();
    }//GEN-LAST:event_jmiListarAtividadesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    public void exibeItensNaTela(String tipo) {
        if (tipo == "aluno") {
            mProfessor.setVisible(false);
        } else {
            mAluno.setVisible(false);
            mGerenciarGrupos.setVisible(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jmiAvaliarGrupos;
    private javax.swing.JMenuItem jmiListaDeGrupos;
    private javax.swing.JMenuItem jmiListarAtividades;
    private javax.swing.JMenu mAluno;
    private javax.swing.JMenu mGerenciarGrupos;
    private javax.swing.JMenu mListar;
    private javax.swing.JMenu mProfessor;
    private javax.swing.JMenuItem miAceitarPedidos;
    private javax.swing.JMenuItem miAgenda;
    private javax.swing.JMenuItem miAgendarApresentacao;
    private javax.swing.JMenuItem miConvidarAluno;
    private javax.swing.JMenuItem miCriarAtividade;
    private javax.swing.JMenuItem miCriarGrupo;
    private javax.swing.JMenuItem miEditarGrupos;
    private javax.swing.JMenuItem miSolicitarParticipacao;
    private javax.swing.JMenuItem milistarAlunos;
    // End of variables declaration//GEN-END:variables
}
