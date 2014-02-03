/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meteoinfo.forms;

import com.l2fprod.common.swing.JFontChooser;
import java.awt.Font;
import javax.swing.JFrame;
import meteoinfo.classes.Options;

/**
 *
 * @author yaqiang
 */
public class FrmOptions extends javax.swing.JDialog {

    private FrmMain _parent;
    private Font _legendFont;
    private Font _textFont;
    
    /**
     * Creates new form FrmOptions
     */
    public FrmOptions(JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        _parent = (FrmMain)parent;
        Options options = _parent.getOptions();
        _legendFont = options.getLegendFont();
        _textFont = options.getTextFont();
        this.jLabel_LegendFont.setText(_legendFont.getFontName() + " " + _legendFont.getSize());
        this.jLabel_TextFont.setText(_textFont.getFontName() + " " + _textFont.getSize());
        if (options.getScriptLanguage().equals("Groovy")){
            this.jRadioButton_Groovy.setSelected(true);
        } else {
            this.jRadioButton_Jython.setSelected(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane_Option = new javax.swing.JTabbedPane();
        jPanel_General = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton_Groovy = new javax.swing.JRadioButton();
        jRadioButton_Jython = new javax.swing.JRadioButton();
        jPanel_Font = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_LegendFont = new javax.swing.JLabel();
        jButton_LegendFont = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel_TextFont = new javax.swing.JLabel();
        jButton_TextFont = new javax.swing.JButton();
        jButton_OK = new javax.swing.JButton();
        jButton_Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Options");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Script Language"));
        jPanel1.setName("Script Language"); // NOI18N

        buttonGroup1.add(jRadioButton_Groovy);
        jRadioButton_Groovy.setText("Groovy");
        jRadioButton_Groovy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_GroovyActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton_Jython);
        jRadioButton_Jython.setText("Jython");
        jRadioButton_Jython.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_JythonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jRadioButton_Groovy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jRadioButton_Jython)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_Groovy)
                    .addComponent(jRadioButton_Jython))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_GeneralLayout = new javax.swing.GroupLayout(jPanel_General);
        jPanel_General.setLayout(jPanel_GeneralLayout);
        jPanel_GeneralLayout.setHorizontalGroup(
            jPanel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_GeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_GeneralLayout.setVerticalGroup(
            jPanel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_GeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jTabbedPane_Option.addTab("General", jPanel_General);

        jLabel1.setText("Legend Font:");

        jLabel_LegendFont.setText("jLabel2");
        jLabel_LegendFont.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton_LegendFont.setText("...");
        jButton_LegendFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LegendFontActionPerformed(evt);
            }
        });

        jLabel2.setText("Text Font:");

        jLabel_TextFont.setText("jLabel2");
        jLabel_TextFont.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton_TextFont.setText("...");
        jButton_TextFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TextFontActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_FontLayout = new javax.swing.GroupLayout(jPanel_Font);
        jPanel_Font.setLayout(jPanel_FontLayout);
        jPanel_FontLayout.setHorizontalGroup(
            jPanel_FontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FontLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_FontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_FontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_LegendFont, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_TextFont, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_FontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_LegendFont, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_TextFont, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        jPanel_FontLayout.setVerticalGroup(
            jPanel_FontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FontLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel_FontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel_LegendFont)
                    .addComponent(jButton_LegendFont))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_FontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel_TextFont)
                    .addComponent(jButton_TextFont))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jTabbedPane_Option.addTab("Font", jPanel_Font);

        jButton_OK.setText("OK");
        jButton_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OKActionPerformed(evt);
            }
        });

        jButton_Cancel.setText("Cancel");
        jButton_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane_Option, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jButton_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton_Cancel)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane_Option)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_OK)
                    .addComponent(jButton_Cancel))
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_LegendFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LegendFontActionPerformed
        // TODO add your handling code here:
        Font lFont = JFontChooser.showDialog(this, null, _legendFont);
        _legendFont = lFont;
        this.jLabel_LegendFont.setText(_legendFont.getFontName() + " " + _legendFont.getSize());
    }//GEN-LAST:event_jButton_LegendFontActionPerformed

    private void jButton_TextFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TextFontActionPerformed
        // TODO add your handling code here:
        Font tFont = JFontChooser.showDialog(this, null, _textFont);
        _textFont = tFont;
        this.jLabel_TextFont.setText(_textFont.getFontName() + " " + _textFont.getSize());
    }//GEN-LAST:event_jButton_TextFontActionPerformed

    private void jButton_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OKActionPerformed
        // TODO add your handling code here:
        if (_legendFont != null)
            _parent.setLegendFont(_legendFont);
        if (_textFont != null)
            _parent.getOptions().setTextFont(_textFont);
        
        if (this.jRadioButton_Groovy.isSelected()){
            _parent.getOptions().setScriptLanguage("Groovy");
        } else {
            _parent.getOptions().setScriptLanguage("Jython");
        }
        this.dispose();
    }//GEN-LAST:event_jButton_OKActionPerformed

    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_CancelActionPerformed

    private void jRadioButton_GroovyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_GroovyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_GroovyActionPerformed

    private void jRadioButton_JythonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_JythonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_JythonActionPerformed

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
            java.util.logging.Logger.getLogger(FrmOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmOptions dialog = new FrmOptions(new FrmMainOld(), true);
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JButton jButton_LegendFont;
    private javax.swing.JButton jButton_OK;
    private javax.swing.JButton jButton_TextFont;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_LegendFont;
    private javax.swing.JLabel jLabel_TextFont;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Font;
    private javax.swing.JPanel jPanel_General;
    private javax.swing.JRadioButton jRadioButton_Groovy;
    private javax.swing.JRadioButton jRadioButton_Jython;
    private javax.swing.JTabbedPane jTabbedPane_Option;
    // End of variables declaration//GEN-END:variables
}
