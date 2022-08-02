/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author syaif
 */

public class koneksi {

    Connection konek;
    
    
public koneksi() {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        konek = DriverManager.getConnection("jdbc:mysql://localhost/sekolahan", "root", "");
        JOptionPane.showMessageDialog(null, "Berhasil koneksi");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Gagal Koneksi" + e);
    }
}

 
    Connection logon(){
         try {
        Class.forName("com.mysql.jdbc.Driver");
        konek = DriverManager.getConnection("jdbc:mysql://localhost/sekolahan", "root", "");
        JOptionPane.showMessageDialog(null, "Berhasil koneksi");
    } catch (HeadlessException | ClassNotFoundException | SQLException e) {
        JOptionPane.showMessageDialog(null, "Gagal Koneksi" + e);
    }
        return konek;
    }
         

}