/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ryanc
 */
public class ConexaoDAO {
    public Connection conectaBD() throws ClassNotFoundException{
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/contagem","root","123");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"ConexaoDAO" +e.getMessage());
        }
        return con;
    }
}
