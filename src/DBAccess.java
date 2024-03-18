/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author marco
 */
public class DBAccess {

    private Connection con;
    private Statement stmt;

    public DBAccess() {
        try {
            SqlConnection mycon = new SqlConnection();
            con = mycon.getConnection();
            stmt = con.createStatement();
        } catch (SQLException e) {
            
        }
    }
     
    public int Update(String str) {
        try {
            int i = stmt.executeUpdate(str);
            return i;
        } catch (SQLException e) {
            return -1;
        }
    }
    
    public ResultSet Query(String srt) {
        try {
            ResultSet rs = stmt.executeQuery(srt);
            return rs;
        } catch (SQLException e) {
            return null;
        }
    }
}
