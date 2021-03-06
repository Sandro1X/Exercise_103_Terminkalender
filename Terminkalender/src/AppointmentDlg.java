
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;


public class AppointmentDlg extends javax.swing.JDialog {
    
    private Appointment app;
    private boolean ok = false;
    private boolean change = false;
    private Appointment ap;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy - HH.mm");
    public AppointmentDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public Appointment getApp() {
        return app;
    }
    
    public Appointment getAp(){
        return ap;
    }

    public boolean isOk() {
        return ok;
    }
    
    public void change(String day, String month, String year, String hour, String minute, String text, Appointment ap){
        tfDay.setText(day);
        tfMonth.setText(month);
        tfYear.setText(year);
        tfHour.setText(hour);
        tfMinute.setText(minute);
        tfText.setText(text);
        
        this.ap = ap;
        this.change = true;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfDay = new javax.swing.JTextField();
        tfMonth = new javax.swing.JTextField();
        tfYear = new javax.swing.JTextField();
        tfMinute = new javax.swing.JTextField();
        tfHour = new javax.swing.JTextField();
        tfText = new javax.swing.JTextField();
        btAdd = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Tag:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setText("Monat:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setText("Jahr:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setText("Stunde:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setText("Minute:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(jLabel5, gridBagConstraints);

        jLabel6.setText("Text:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(jLabel6, gridBagConstraints);

        tfDay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfDay.setText("11");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(tfDay, gridBagConstraints);

        tfMonth.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfMonth.setText("07");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(tfMonth, gridBagConstraints);

        tfYear.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfYear.setText("2002");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(tfYear, gridBagConstraints);

        tfMinute.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfMinute.setText("30");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(tfMinute, gridBagConstraints);

        tfHour.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfHour.setText("10");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(tfHour, gridBagConstraints);

        tfText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfText.setText("Test");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(tfText, gridBagConstraints);

        btAdd.setText("übernehmen");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(btAdd, gridBagConstraints);

        btCancel.setText("abbrechen");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(btCancel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        if (!change){
           String day = tfDay.getText();
        if(tfDay.getText().length() == 1){
            day = "0"+tfDay.getText();
        }
        String month = tfMonth.getText();
        if(tfMonth.getText().length() == 1){
            month = "0"+tfMonth.getText();
        }
        String year = tfYear.getText();
        
        String hour = tfHour.getText();
        if(tfHour.getText().length() == 1){
            hour = "0"+tfHour.getText();
        }
        String minute = tfMinute.getText();
        if(tfMinute.getText().length() == 1){
            minute = "0"+tfMinute.getText();
        }
        String text = tfText.getText();
        
        String date = day+"."+month+"."+year+" - "+hour+"."+minute;
        try{
            LocalDateTime dt = LocalDateTime.parse(date, dtf);
        }catch(DateTimeParseException dtpe){
            JOptionPane.showMessageDialog(null, "Bitte gib ein gültiges Datum ein");
        }
        
        app = new Appointment(date, text); 
        }else{
            String day1 = tfDay.getText();
        if(tfDay.getText().length() == 1){
            day1 = "0"+tfDay.getText();
        }
        String month1 = tfMonth.getText();
        if(tfMonth.getText().length() == 1){
            month1 = "0"+tfMonth.getText();
        }
        String year1 = tfYear.getText();
        
        String hour1 = tfHour.getText();
        if(tfHour.getText().length() == 1){
            hour1 = "0"+tfHour.getText();
        }
        String minute1 = tfMinute.getText();
        if(tfMinute.getText().length() == 1){
            minute1 = "0"+tfMinute.getText();
        }
        String text1 = tfText.getText();
        
        String date = day1+"."+month1+"."+year1+" - "+hour1+"."+minute1;
        try{
            LocalDateTime dt = LocalDateTime.parse(date, dtf);
            ap.setDt(dt);
        }catch(DateTimeParseException dtpe){
            JOptionPane.showMessageDialog(null, "Bitte gib ein gültiges Datum ein");
        }
        
        ap.setText(text1);
        }
        ok = true;
        this.dispose();
    }//GEN-LAST:event_btAddActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        ok = false;
        this.dispose();
    }//GEN-LAST:event_btCancelActionPerformed

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
            java.util.logging.Logger.getLogger(AppointmentDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AppointmentDlg dialog = new AppointmentDlg(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tfDay;
    private javax.swing.JTextField tfHour;
    private javax.swing.JTextField tfMinute;
    private javax.swing.JTextField tfMonth;
    private javax.swing.JTextField tfText;
    private javax.swing.JTextField tfYear;
    // End of variables declaration//GEN-END:variables
}
