package VIEW;

import DAO.ConexaoDAO;
import DAO.UsuarioDAO;
import DTO.ApiDTO;
import DTO.UsuarioDTO;
import java.sql.ResultSet;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.parser.ParseException;

public class Login extends javax.swing.JFrame {
    ConexaoDAO con = new ConexaoDAO();
    public Login() {
        initComponents();
        
        try {
            con.conectaBD();
        } catch (ClassNotFoundException | IOException | ParseException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        lb_msgEmail.setVisible(false);
        lb_msgSenha.setVisible(false);
        txt_temp.setVisible(false);
        setResizable(false);
        // setExtendedState(MAXIMIZED_BOTH); INICIAR EM TELA CHEIA, MAS CREIO QUE NÃO VAI SER UTIL
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        
        ApiDTO api = new ApiDTO(); // CHAMAR API DE TEMPO
        api.apiResult();
        txt_temp.setText("Temperatura atual: " + api.getTemperatura());
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        btn_cadastro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txt_email = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txt_senha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        lb_msgEmail = new javax.swing.JLabel();
        lb_msgSenha = new javax.swing.JLabel();
        txt_temp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setBackground(new java.awt.Color(242, 53, 189));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel4.setBackground(new java.awt.Color(232, 240, 242));

        btn_cadastro.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btn_cadastro.setText("Login");
        btn_cadastro.setActionCommand("Login");
        btn_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastroActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(232, 240, 242));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11), new java.awt.Color(57, 162, 219))); // NOI18N

        txt_email.setToolTipText("Email");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_email)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBackground(new java.awt.Color(232, 240, 242));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11), new java.awt.Color(57, 162, 219))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_senha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setFont(new java.awt.Font("Corbel Light", 0, 36)); // NOI18N
        jLabel1.setText("Login");

        lb_msgEmail.setForeground(new java.awt.Color(204, 0, 0));
        lb_msgEmail.setText("Email Obrigatório!");

        lb_msgSenha.setBackground(new java.awt.Color(204, 0, 0));
        lb_msgSenha.setForeground(new java.awt.Color(204, 0, 0));
        lb_msgSenha.setText("Senha Obrigatória!");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_msgSenha)
                            .addComponent(lb_msgEmail)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(btn_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_temp, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel1)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(lb_msgEmail)
                        .addGap(47, 47, 47)
                        .addComponent(lb_msgSenha))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(btn_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(txt_temp, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastroActionPerformed
        
            /*String vemail, vsenha;
            vsenha = String.valueOf(txt_senha.getPassword());
            vemail = txt_email.getText();
            
            UsuarioDTO usdto = new UsuarioDTO();
            usdto.setEmail(vemail);
            //TRY AND CATCH PARA CRIPTOGRAFIA DO CAMPOO SENHA
            try {
            usdto.setSenha(vsenha);
            } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            //VOID
            }
            //VERIFICAÇÃO DE CAMPO VAZIO
            if( txt_email.getText().isEmpty() && String.valueOf(txt_senha.getPassword()).isEmpty()){
            lb_msgEmail.setVisible(true);
            lb_msgSenha.setVisible(true);
            }else{ UsuarioDAO usdao = new UsuarioDAO();
            try {
            usdao.cadastroUsuario(usdto);
            JOptionPane.showMessageDialog(null, "tudo ok");
            } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Algo deu errado!");
            }
            }*/
            
       UsuarioDAO dao = new UsuarioDAO();
       UsuarioDTO dto = new UsuarioDTO();
       String email, senha;
       email = txt_email.getText();
       senha = String.valueOf(txt_senha.getPassword());
       dto.setEmail(email);
       //TRY AND CATCH PARA CRIPTOGRAFIA DO CAMPOO SENHA
        try {
            dto.setSenha(senha);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            //VOID
        }    
       if(dao.login(dto)){
           try {
               new testFrame().setVisible(true);
               this.dispose();
           } catch (IOException ex) {
               Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
           }
       }else{
           JOptionPane.showMessageDialog(null, "Erro!");
       }
    }//GEN-LAST:event_btn_cadastroActionPerformed

    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lb_msgEmail;
    private javax.swing.JLabel lb_msgSenha;
    private javax.swing.JTextField txt_email;
    private javax.swing.JPasswordField txt_senha;
    private javax.swing.JLabel txt_temp;
    // End of variables declaration//GEN-END:variables
}
