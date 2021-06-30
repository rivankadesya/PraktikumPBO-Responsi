/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Helper.Connector;

/**
 *
 * @author Administrator
 */
public class Karyawan {

    Connector connector = new Connector();
    
    public String[][] readKaryawan(){
        try{
            int jumlah = 0;
            
            String data[][] = new String[getBanyakData()][4]; 
            
            String query = "Select * from karyawan"; 
            ResultSet resultSet = connector.statement.executeQuery(query);
            while (resultSet.next()){
                data[jumlah][0] = resultSet.getString("id"); 
                data[jumlah][1] = resultSet.getString("nama");                
                data[jumlah][2] = resultSet.getString("usia");
                data[jumlah][3] = resultSet.getString("gaji");
                jumlah++;
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
     public int getBanyakData(){
        int jmlData = 0;
        try{
            connector.statement = connector.koneksi.createStatement();
            String query = "Select * from karyawan";
            ResultSet resultSet = connector.statement.executeQuery(query);
            while (resultSet.next()){ 
                jmlData++;
            }
            return jmlData;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
     
    public void insert(String nama, String umur, String gaji){
      
        try {
           String query = "Select * from karyawan"; 
           ResultSet resultSet = connector.statement.executeQuery(query);
           
           while (resultSet.next()){ 
           
            }
                query = "INSERT INTO karyawan(nama,usia,gaji) VALUES('"+nama+"','"+umur+"','"+gaji+"')";
                
                connector.statement =connector.koneksi.createStatement();
                connector.statement.executeUpdate(query); 
                JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
            }
         catch (Exception e) {
            System.out.println(e.getMessage());   
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
       public void update(String nama,String cari, String usia, String gaji){
        int check=0;
         try {
           String query = "Select * from karyawan WHERE id=" + cari; 
           ResultSet resultSet = connector.statement.executeQuery(query);
           
           while (resultSet.next()){ 
                check=1;
            }
           
             if (check==1) {
                query = "UPDATE karyawan SET id='" + cari + "', nama='" + nama + "', usia='" + usia + "', gaji='" + gaji + "' WHERE id=" + cari;
                connector.statement =connector.koneksi.createStatement();
                connector.statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil diupdate");
                JOptionPane.showMessageDialog(null, "Data Berhasil diupdate");
             }
             else {
                 JOptionPane.showMessageDialog(null, "Data Tidak Ada");
             }
           
        } catch (Exception e) {
            System.out.println(e.getMessage());   
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void delete (String cek) {
        try{
            String query = "DELETE FROM karyawan WHERE id = '"+cek+"'";
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
            
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
