/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Administrator
 */

    public class Edit extends JFrame {
    JLabel labelJudul = new JLabel("Update Karyawan");

    JLabel labelNama = new JLabel("Nama");
    public final JTextField fieldNama = new JTextField(10);
    
    public final JTextField fieldCek = new JTextField(10);
    
    JLabel labelUsia = new JLabel("Usia");
    public final JTextField fieldUsia= new JTextField(10);
    
    JLabel labelGaji = new JLabel("Gaji");
    public final JTextField fieldGaji = new JTextField(10);
    
    public JButton btnUpdate = new JButton("Update");
    public JButton btnHapus = new JButton("Hapus");
    public JButton btnKembali = new JButton("Kembali");
    public JButton btnGaji = new JButton("Hitung gaji");
    
     public Edit(){
        setTitle("Update Karyawan");
        setSize(300,350);
        setLayout(null);
        add(labelJudul);
        add(labelNama);
        add(fieldNama);
        add(labelUsia);
        add(fieldUsia);
        add(labelGaji);
        add(fieldGaji);  
        add(btnUpdate);
        add(btnHapus); 
	add(btnGaji); 
        add(btnKembali);
        
        labelJudul.setBounds(15,5,200,20);
        labelNama.setBounds(15,30,120,20);
        fieldNama.setBounds(55,30,200,20);
       
        labelUsia.setBounds(15,60,120,20);
        fieldUsia.setBounds(55,60,200,20);
        
        labelGaji.setBounds(15,90,120,20);
        fieldGaji.setBounds(55,90,200,20);
        btnGaji.setBounds(75,165,150,20);
        btnUpdate.setBounds(55,230,90,20);
	btnUpdate.setBackground(Color.blue);
	btnUpdate.setForeground(Color.white);
        btnHapus.setBounds(155,230,90,20);
	btnHapus.setBackground(Color.red);
	btnHapus.setForeground(Color.white);
        btnKembali.setBounds(15,265,250,20);
        
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);
    }
    public String getNama(){
        return fieldNama.getText();
    }
    public String getCek(){
        return fieldCek.getText();
    }
    
    public String getUsia(){
        return fieldUsia.getText();
    }
    
    public String getGaji(){
        return fieldGaji.getText();
    }
}
