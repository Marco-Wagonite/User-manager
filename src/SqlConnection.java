/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author marco
 */
public class SqlConnection {

  public Connection getConnection() {
    try {
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      String URL = "jdbc:sqlserver://localhost:1433;Database=quanlytaikhoan;user=duc;password=1234;trustServerCertificate=true";
      return DriverManager.getConnection(URL);
      
    } catch (ClassNotFoundException | SQLException ex) {
      JOptionPane.showMessageDialog(null, ex.toString(), "Error", JOptionPane.ERROR_MESSAGE);
      return null;
    }
  }
}
