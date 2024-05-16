/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package contact;

/**
 *
 * @author ASUS
 */
public class ChatContainer extends javax.swing.JFrame {

    /**
     * Creates new form ChatContainer
     */
    public ChatContainer() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGPChatContainer = new com.k33ptoo.components.KGradientPanel();
        kbtnAdmin = new com.k33ptoo.components.KButton();
        kbtnReceptionist = new com.k33ptoo.components.KButton();
        lbChatCon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGPChatContainer.setkBorderRadius(0);
        kGPChatContainer.setkEndColor(new java.awt.Color(0, 102, 255));
        kGPChatContainer.setkStartColor(new java.awt.Color(255, 255, 255));

        kbtnAdmin.setText("Admin");
        kbtnAdmin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kbtnAdmin.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kbtnAdmin.setkHoverStartColor(new java.awt.Color(0, 102, 255));
        kbtnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnAdminActionPerformed(evt);
            }
        });

        kbtnReceptionist.setText("Receptionist");
        kbtnReceptionist.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kbtnReceptionist.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kbtnReceptionist.setkHoverStartColor(new java.awt.Color(0, 102, 255));
        kbtnReceptionist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnReceptionistActionPerformed(evt);
            }
        });

        lbChatCon.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbChatCon.setForeground(new java.awt.Color(255, 255, 255));
        lbChatCon.setText("You are....");

        javax.swing.GroupLayout kGPChatContainerLayout = new javax.swing.GroupLayout(kGPChatContainer);
        kGPChatContainer.setLayout(kGPChatContainerLayout);
        kGPChatContainerLayout.setHorizontalGroup(
            kGPChatContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGPChatContainerLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(kbtnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(kbtnReceptionist, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(kGPChatContainerLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(lbChatCon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGPChatContainerLayout.setVerticalGroup(
            kGPChatContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGPChatContainerLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(lbChatCon)
                .addGap(75, 75, 75)
                .addGroup(kGPChatContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kbtnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kbtnReceptionist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGPChatContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGPChatContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kbtnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnAdminActionPerformed
        // TODO add your handling code here:
        new ChatServer().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_kbtnAdminActionPerformed

    private void kbtnReceptionistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnReceptionistActionPerformed
        // TODO add your handling code here:
        new ChatClient("").setVisible(true);
    }//GEN-LAST:event_kbtnReceptionistActionPerformed

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
            java.util.logging.Logger.getLogger(ChatContainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatContainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatContainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatContainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatContainer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KGradientPanel kGPChatContainer;
    private com.k33ptoo.components.KButton kbtnAdmin;
    private com.k33ptoo.components.KButton kbtnReceptionist;
    private javax.swing.JLabel lbChatCon;
    // End of variables declaration//GEN-END:variables
}