package view;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_painelLogin = new javax.swing.JPanel();
        JL_login = new javax.swing.JLabel();
        JL_senha = new javax.swing.JLabel();
        JTF_login = new javax.swing.JTextField();
        JPF_senha = new javax.swing.JPasswordField();
        JB_entrar = new javax.swing.JButton();
        JB_limpar = new javax.swing.JButton();
        JB_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JP_painelLogin.setBackground(new java.awt.Color(255, 204, 0));
        JP_painelLogin.setBorder(new javax.swing.border.MatteBorder(null));

        JL_login.setText("LOGIN:");

        JL_senha.setText("SENHA:");

        JTF_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_loginActionPerformed(evt);
            }
        });

        JPF_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPF_senhaActionPerformed(evt);
            }
        });

        JB_entrar.setText("Entrar");
        JB_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_entrarActionPerformed(evt);
            }
        });

        JB_limpar.setText("Limpar");
        JB_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_limparActionPerformed(evt);
            }
        });

        JB_cancelar.setText("Cancelar");
        JB_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP_painelLoginLayout = new javax.swing.GroupLayout(JP_painelLogin);
        JP_painelLogin.setLayout(JP_painelLoginLayout);
        JP_painelLoginLayout.setHorizontalGroup(
            JP_painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_painelLoginLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(JP_painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_painelLoginLayout.createSequentialGroup()
                        .addComponent(JB_entrar)
                        .addGap(18, 18, 18)
                        .addComponent(JB_limpar)
                        .addGap(18, 18, 18)
                        .addComponent(JB_cancelar))
                    .addGroup(JP_painelLoginLayout.createSequentialGroup()
                        .addGroup(JP_painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JL_login)
                            .addComponent(JL_senha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JP_painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JPF_senha, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(JTF_login))))
                .addGap(124, 124, 124))
        );

        JP_painelLoginLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {JB_cancelar, JB_entrar, JB_limpar});

        JP_painelLoginLayout.setVerticalGroup(
            JP_painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_painelLoginLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(JP_painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_login)
                    .addComponent(JTF_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JP_painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_senha)
                    .addComponent(JPF_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(JP_painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_entrar)
                    .addComponent(JB_limpar)
                    .addComponent(JB_cancelar))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_painelLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_painelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTF_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_loginActionPerformed

    private void JPF_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPF_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPF_senhaActionPerformed

    private void JB_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_limparActionPerformed
        this.JTF_login.setText(null);
        this.JPF_senha.setText(null);
    }//GEN-LAST:event_JB_limparActionPerformed
        
    private void JB_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_cancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JB_cancelarActionPerformed

    private void JB_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_entrarActionPerformed
        if (JTF_login.getText().equals("admin")
                && "admin".equals(new String(JPF_senha.getPassword())) ) {
            JOptionPane.showMessageDialog(null, "Login efetivado!");
        } else {
            JOptionPane.showMessageDialog(null, "Login ou senha incorreto");
        }
    }//GEN-LAST:event_JB_entrarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_cancelar;
    private javax.swing.JButton JB_entrar;
    private javax.swing.JButton JB_limpar;
    private javax.swing.JLabel JL_login;
    private javax.swing.JLabel JL_senha;
    private javax.swing.JPasswordField JPF_senha;
    private javax.swing.JPanel JP_painelLogin;
    private javax.swing.JTextField JTF_login;
    // End of variables declaration//GEN-END:variables
}
