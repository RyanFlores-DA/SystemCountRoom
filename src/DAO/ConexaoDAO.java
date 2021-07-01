
package DAO;

import DTO.UsuarioDTO;
import com.mysql.cj.xdevapi.Statement;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ConexaoDAO {
    static PreparedStatement pst;
    static ResultSet rs;
    static Connection con;
        static JSONObject jsonObject;
        static JSONParser parser = new JSONParser();
        
    public Connection conectaBD() throws ClassNotFoundException, IOException, ParseException{
        
        String user;
        String pass;
        String url; // CONFIGURAÇÕES ARMAZENADAS EM UM ÚNICO ARQUIVO DE CONFIGURAÇÃO JSON
        try { // TRATAMENTO PARA JSON OBJECT
            jsonObject = (JSONObject) parser.parse(new FileReader(
                        "src/config/configs.json"));
            user = (String) jsonObject.get("user");
            pass = (String) jsonObject.get("pass");
            url = (String) jsonObject.get("dbUrl");
        
        
        try{ // TRY CATCH DE CONEXAO COM BANCO DE DADOS
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url,user,pass);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"ConexaoDAO" +e.getMessage());
        }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: " + ex);
        }
        return con;
    }
    
}
