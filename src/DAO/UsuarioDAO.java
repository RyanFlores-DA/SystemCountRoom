
package DAO;

import DTO.ContagemDTO;
import DTO.UsuarioDTO;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.parser.ParseException;

public class UsuarioDAO {
    Connection con;
    PreparedStatement pst; 
    ResultSet rs;
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
            
        }
}
    public boolean login(UsuarioDTO dto){
        
        
        boolean check = false;
        try {
            con = new ConexaoDAO().conectaBD();
        } catch (ClassNotFoundException | IOException | ParseException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pst = con.prepareStatement("SELECT * FROM usuario WHERE email = ? AND senha = ?");
            pst.setString(1, dto.getEmail());
            pst.setString(2, dto.getSenha());
            rs = pst.executeQuery();
            
            if(rs.next()){
                check = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }
    
    public void cadContagem(ContagemDTO cont) throws ClassNotFoundException{
        String sql = "INSERT INTO contreuniao (presidente, dataReuniao, contagem, orador, congregacao) "
                        + "VALUES(?, ?, ?,?,?)"; // QUERY SQL DE INSERÇÃO DE DADOS
        
        try {
            con = new ConexaoDAO().conectaBD();
        } catch (IOException | ParseException ex) {
            //VOID
        }
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1,cont.getPresidente());
            pst.setString(2,cont.getDataReuniao());
            pst.setInt(3,cont.getContagem());
            pst.setString(4,cont.getOrador());
            pst.setString(5,cont.getCongregacao());

            
            pst.execute();
            pst.close();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
