package VIEW;

import DAO.ConexaoDAO;
import DAO.UsuarioDAO;
import DTO.ApiDTO;
import DTO.ContagemDTO;
import DTO.UsuarioDTO;
import config.SoNumeros;
import java.sql.ResultSet;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane; 
import org.json.simple.parser.ParseException;

public class CadRegistros extends javax.swing.JFrame {
    ConexaoDAO con = new ConexaoDAO();
    public CadRegistros() {
        initComponents();
        tf_contagem.setDocument(new SoNumeros());   //  PERMITIR APENAS NÚMEROS NO CAMPO DE CONTAGEMsele
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyy");
        lb_data.setText("Data atual: "+ formatador.format( data ));
        img.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pedro.png")).getImage()));
        try {
            con.conectaBD();
        } catch (ClassNotFoundException | IOException | ParseException ex) {
            Logger.getLogger(CadRegistros.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
        btn_salvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_temp = new javax.swing.JLabel();
        lb_data = new javax.swing.JLabel();
        tf_orador = new javax.swing.JTextField();
        tf_congrega = new javax.swing.JTextField();
        img2 = new javax.swing.JPanel();
        img = new javax.swing.JLabel();
        box_presidente = new javax.swing.JComboBox<>();
        tf_contagem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setBackground(new java.awt.Color(242, 53, 189));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel4.setBackground(new java.awt.Color(232, 240, 242));

        btn_salvar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Corbel Light", 0, 36)); // NOI18N
        jLabel1.setText("Registros");

        lb_data.setFont(new java.awt.Font("Corbel Light", 0, 18)); // NOI18N
        lb_data.setText("Data da reunião: ");

        tf_orador.setBackground(new java.awt.Color(232, 240, 242));
        tf_orador.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_orador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Orador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        tf_congrega.setBackground(new java.awt.Color(232, 240, 242));
        tf_congrega.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tf_congrega.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Congregação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        img2.setBackground(new java.awt.Color(232, 240, 242));
        img2.setBorder(javax.swing.BorderFactory.createTitledBorder("Presidente"));

        javax.swing.GroupLayout img2Layout = new javax.swing.GroupLayout(img2);
        img2.setLayout(img2Layout);
        img2Layout.setHorizontalGroup(
            img2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        img2Layout.setVerticalGroup(
            img2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        box_presidente.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        box_presidente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pedro", "Harrison", "Luiz", "Antônio", "Gonzaga", "David" }));
        box_presidente.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        box_presidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_presidenteActionPerformed(evt);
            }
        });

        tf_contagem.setBackground(new java.awt.Color(232, 240, 242));
        tf_contagem.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tf_contagem.setBorder(javax.swing.BorderFactory.createTitledBorder("Contagem"));
        tf_contagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_contagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tf_orador, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_congrega, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_temp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb_data, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(box_presidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_contagem, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(lb_data)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(box_presidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_contagem))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(tf_orador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tf_congrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(txt_temp, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
            
        String presidente, dataReuniao,orador, congregacao;
        int contagem;
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("yyy/MM/dd");        
        
        presidente = (String) box_presidente.getSelectedItem();
        dataReuniao = formatador.format(data);
        orador = tf_orador.getText();
        congregacao = tf_congrega.getText();
        contagem = Integer.parseInt(tf_contagem.getText());
        
        ContagemDTO cont = new ContagemDTO();
        UsuarioDAO dao = new UsuarioDAO();
        
        cont.setPresidente(presidente);
        cont.setDataReuniao(dataReuniao);
        cont.setContagem(contagem);
        cont.setOrador(orador);
        cont.setCongregacao(congregacao);
        
        
        
        if(tf_orador.getText().equals("")&& tf_congrega.getText().equals("") && tf_contagem.getText().equals("")){
            tf_orador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite o nome de um orador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(255, 51, 0)));
            tf_congrega.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite um nome de Congregação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(255, 51, 0)));
            tf_contagem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite um valor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(255, 51, 0)));
        }else{
            try {
                dao.cadContagem(cont);
                System.out.println("Cadastro realizado com sucesso");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CadRegistros.class.getName()).log(Level.SEVERE, "Erro!", ex);
            }
        }
        
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void tf_contagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_contagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_contagemActionPerformed

    private void box_presidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_presidenteActionPerformed
        
        
        if(box_presidente.getSelectedItem().equals("Pedro")){
            img.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pedro.png")).getImage()));
        }else if(box_presidente.getSelectedItem().equals("Harrison")){
            img.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/harri.png")).getImage()));
        }else if(box_presidente.getSelectedItem().equals("David")){
            img.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/david.png")).getImage()));
        }else if(box_presidente.getSelectedItem().equals("Gonzaga")){
            img.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gonzaga.png")).getImage()));
        }else if(box_presidente.getSelectedItem().equals("Antônio")){
            img.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/antonio.png")).getImage()));
        }else if(box_presidente.getSelectedItem().equals("Luiz")){
            img.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Luiz.png")).getImage()));
        }
        
        
    }//GEN-LAST:event_box_presidenteActionPerformed

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
            java.util.logging.Logger.getLogger(CadRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadRegistros().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_presidente;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JLabel img;
    private javax.swing.JPanel img2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lb_data;
    private javax.swing.JTextField tf_congrega;
    private javax.swing.JTextField tf_contagem;
    private javax.swing.JTextField tf_orador;
    private javax.swing.JLabel txt_temp;
    // End of variables declaration//GEN-END:variables
}
