
package swingview;

import steamservermanager.models.ServerGame;

public class EditServerGameFrame extends javax.swing.JFrame {

    private ServerGame serverGame;
    
    public EditServerGameFrame(ServerGame serverGame) {
        initComponents();
        this.serverGame = serverGame;
        setLocationRelativeTo(null);
        populateFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelAppID = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldGame = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldServerName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldStartScript = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setText("AppID:");

        jLabelAppID.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabelAppID.setText("num");

        jTextFieldGame.setEnabled(false);
        jTextFieldGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGameActionPerformed(evt);
            }
        });

        jLabel3.setText("Game");

        jTextFieldServerName.setEnabled(false);
        jTextFieldServerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldServerNameActionPerformed(evt);
            }
        });

        jLabel4.setText("Server Name");

        jTextFieldStartScript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStartScriptActionPerformed(evt);
            }
        });

        jLabel5.setText("Start Script");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(382, 393, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldServerName)
                            .addComponent(jTextFieldGame)
                            .addComponent(jTextFieldStartScript)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelAppID))
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelAppID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldServerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldStartScript, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButtonSave)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGameActionPerformed

    private void jTextFieldServerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldServerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldServerNameActionPerformed

    private void jTextFieldStartScriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStartScriptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldStartScriptActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        
        String serverName = jTextFieldServerName.getText();
        
        if(!serverGame.getServerName().equals(serverName)){
            System.out.println("Atualizar server name");
        }
        
        String startScript = jTextFieldStartScript.getText();
        
        serverGame.setStartScript(startScript);
        
        this.dispose();
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void populateFields(){
        jLabelAppID.setText(serverGame.getAppID()+"");
        jTextFieldStartScript.setText(serverGame.getStartScript());
        jTextFieldServerName.setText(serverGame.getServerName());
        jTextFieldGame.setText(serverGame.getGameName());
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelAppID;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldGame;
    private javax.swing.JTextField jTextFieldServerName;
    private javax.swing.JTextField jTextFieldStartScript;
    // End of variables declaration//GEN-END:variables
}
