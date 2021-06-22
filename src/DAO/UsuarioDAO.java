
package DAO;

import DTO.UsuarioDTO;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.json.simple.parser.ParseException;

public class UsuarioDAO {
    Connection con;
    PreparedStatement pst;  
    public void cadastroUsuario(UsuarioDTO usdt) throws ClassNotFoundException{
        String sql = "INSERT INTO usuario (nome, email, senha) VALUES(?, ?, ?)"; // QUERY SQL DE INSERÇÃO DE DADOS
        
        try {
            con = new ConexaoDAO().conectaBD();
        } catch (IOException | ParseException ex) {
            //VOID
        }
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1,usdt.getNome());
            pst.setString(2,usdt.getEmail());
            pst.setString(3,usdt.getSenha());
            
            pst.execute();
            pst.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"FuncionarioDAO"+ e);
        }
}

}
