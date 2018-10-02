
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AppointmentGUI extends javax.swing.JFrame {
    
    private AppointmentModell am = new AppointmentModell();
    private File file = new File("src\\data.bin");
    
    public AppointmentGUI() throws Exception {
        initComponents();
        liOutput.setModel(am);
       
        try{    
            am.load(file);
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        add = new javax.swing.JMenuItem();
        delete = new javax.swing.JMenuItem();
        change = new javax.swing.JMenuItem();
        sortByName = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        liOutput = new javax.swing.JList<>();

        jMenu1.setText("Termin");

        add.setText("Hinzufügen");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jMenu1.add(add);

        delete.setText("Löschen");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jMenu1.add(delete);

        change.setText("Ändern");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });
        jMenu1.add(change);

        sortByName.setText("Nach Namen sortieren");
        sortByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByNameActionPerformed(evt);
            }
        });
        jMenu1.add(sortByName);

        jPopupMenu1.add(jMenu1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        liOutput.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(liOutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        AppointmentDlg dlg = new AppointmentDlg(this, true);
        
        dlg.setVisible(true);
        
        if(dlg.isOk()){
            am.add(dlg.getApp());
        }
    }//GEN-LAST:event_addActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int[] indices = liOutput.getSelectedIndices();
        
        for(int i = indices.length-1; i >= 0; i--){
            am.delete(indices[i]);
        }
        liOutput.clearSelection();
    }//GEN-LAST:event_deleteActionPerformed

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
        Appointment ap = null;
        boolean firstex = false;
        try{
            ap = (Appointment) am.getElementAt(liOutput.getSelectedIndex());
        }catch(ArrayIndexOutOfBoundsException oube){
            JOptionPane.showMessageDialog(null, "Bitte wähle einen Eintrag aus!");
            firstex = true;
        }
        
        if (liOutput.getSelectedIndices().length == 1){
            AppointmentDlg dlg = new AppointmentDlg(this, true);
        dlg.change(ap.getDt().getDayOfMonth()+"", ap.getDt().getMonthValue()+"", ap.getDt().getYear()+"", 
        ap.getDt().getHour()+"", ap.getDt().getMinute()+"", ap.getText()+"", ap);
        dlg.setVisible(true);
        
        if(dlg.isOk()){
            am.update();
        }
        }else if(!firstex){
            JOptionPane.showMessageDialog(null, "Du kannst nur einen Eintrag bearbeiten!");
        }
        
    }//GEN-LAST:event_changeActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            am.safe(file);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "File error!");
        }
    }//GEN-LAST:event_formWindowClosing

    private void sortByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByNameActionPerformed
        am.sortByName();
    }//GEN-LAST:event_sortByNameActionPerformed

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
            java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AppointmentGUI().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(AppointmentGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem add;
    private javax.swing.JMenuItem change;
    private javax.swing.JMenuItem delete;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> liOutput;
    private javax.swing.JMenuItem sortByName;
    // End of variables declaration//GEN-END:variables
}
