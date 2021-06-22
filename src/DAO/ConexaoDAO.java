
package DAO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ConexaoDAO {
        static JSONObject jsonObject;
        static JSONParser parser = new JSONParser();
        
    public Connection conectaBD() throws ClassNotFoundException, IOException, ParseException{
        Connection con = null;
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
