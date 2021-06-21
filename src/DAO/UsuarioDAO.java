
package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    Connection con;
    PreparedStatement pst;  
    public void cadastroUsuario(UsuarioDTO usdt){
        String sql = "INSERT INTO usuario (nome, email, senha) VALUES(?, ?, ?)";
        
        con = new ConexaoDAO().conectaBD();
        
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1,usdt.getNome());
            pst.setString(2,usdt.getEmail());
            pst.setString(3,usdt.getSenha());
            
            pst.execute();
            pst.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"FuncionarioDAO"+ e);
        }
}
}
