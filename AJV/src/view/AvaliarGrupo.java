/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import control.ControladorAvaliacao;
import dao.GrupoDao;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Grupo;

/**
 *
 * @author Augusto Pamplona
 */
public class AvaliarGrupo extends javax.swing.JFrame {

    /** Creates new form AvaliarGrupo */
    public AvaliarGrupo() {
        initComponents();
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtComentarioAv = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jtNotaAvaliacao = new javax.swing.JTextField();
        jbOkAvaliacao = new javax.swing.JButton();
        jbCancelarAvaliacao = new javax.swing.JButton();
        listGrupos = new java.awt.List();
        jLabel3 = new javax.swing.JLabel();
        jlIdGrupo = new javax.swing.JLabel();
        jtfIdGrupo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Grupos Disponíveis:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jtComentarioAv.setColumns(20);
        jtComentarioAv.setRows(5);
        jScrollPane1.setViewportView(jtComentarioAv);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 430, 190));

        jLabel2.setText("Nota:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, -1, -1));

        jtNotaAvaliacao.setToolTipText("");
        jtNotaAvaliacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNotaAvaliacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jtNotaAvaliacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 50, -1));

        jbOkAvaliacao.setText("Ok");
        jbOkAvaliacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOkAvaliacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jbOkAvaliacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 73, -1));

        jbCancelarAvaliacao.setText("Cancelar");
        jbCancelarAvaliacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarAvaliacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jbCancelarAvaliacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, -1, -1));
        getContentPane().add(listGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 430, 160));

        jLabel3.setText("Descrição da Avaliação:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jlIdGrupo.setText("ID Grupo escolhido:");
        getContentPane().add(jlIdGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jtfIdGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdGrupoActionPerformed(evt);
            }
        });
        getContentPane().add(jtfIdGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbOkAvaliacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOkAvaliacaoActionPerformed
        try {
            ControladorAvaliacao.getInstance().criarAvaliacao();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(AvaliarGrupo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbOkAvaliacaoActionPerformed

    private void jtNotaAvaliacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNotaAvaliacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNotaAvaliacaoActionPerformed

    private void jbCancelarAvaliacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarAvaliacaoActionPerformed
        ControladorAvaliacao.getInstance().fechaTelaAvaliarGrupo();
    }//GEN-LAST:event_jbCancelarAvaliacaoActionPerformed

    private void jtfIdGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdGrupoActionPerformed

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
            java.util.logging.Logger.getLogger(AvaliarGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AvaliarGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AvaliarGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AvaliarGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AvaliarGrupo().setVisible(true);
            }
        });
    }
    public String comentarioAvaliacao() {
        String avaliacao = new String();
        avaliacao = jtComentarioAv.getText();
        return avaliacao;
    }
    public int idGrupo(){
        String id = new String();
        id = jtfIdGrupo.getText();
        
        if (!id.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "ID é um número!");
        }
        return Integer.parseInt(id);
    }
    
    public double nota(){
        String regexDecimal = "^-?\\d*\\.\\d+$";
        String regexInteger = "^-?\\d+$";
        String regexDouble = regexDecimal + "|" + regexInteger;

        String nota = new String();
        nota = jtNotaAvaliacao.getText();
        
        if (!nota.matches(regexDouble)) {
            JOptionPane.showMessageDialog(null, "Nota é um número!");
        }
        return Double.parseDouble(nota);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelarAvaliacao;
    private javax.swing.JButton jbOkAvaliacao;
    private javax.swing.JLabel jlIdGrupo;
    private javax.swing.JTextArea jtComentarioAv;
    private javax.swing.JTextField jtNotaAvaliacao;
    private javax.swing.JTextField jtfIdGrupo;
    private java.awt.List listGrupos;
    // End of variables declaration//GEN-END:variables

    public void setListaGrupos(){
        listGrupos.removeAll();
        Collection colecao = GrupoDao.getInstance().list();
        ArrayList<Grupo> grupos = new ArrayList<>();
        
        for(Object c : colecao){
            grupos.add((Grupo) c);
        }
        int i;
        int n = grupos.size();
        for(i = 0; i < n; i++){
            listGrupos.add("ID: "+grupos.get(i).getGrupoId()+" - Titulo: "+grupos.get(i).getTitulo()+" - Aluno Lider: "+grupos.get(i).getAlunoLider().getNome());
        }

    }
   
}
