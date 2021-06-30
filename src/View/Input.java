package View;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Input extends JFrame {
     JLabel labelJudul = new JLabel("Input Karyawan");
    
    JLabel labelNama = new JLabel("Nama");
    public final JTextField fieldNama = new JTextField(10);
    
    JLabel labelUsia = new JLabel("Usia");
    public final JTextField fieldUsia= new JTextField(10);
    
    JLabel labelGaji = new JLabel("Gaji");
    public final JTextField fieldGaji = new JTextField(10);
    
    public JButton btnSubmit = new JButton("Submit");
    public JButton btnReset = new JButton("Reset");
    public JButton btnKembali = new JButton("Kembali");
    
     public Input(){
        setTitle("Input Karyawan");
        setSize(300,230);
        setLayout(null);
        add(labelJudul);
        add(labelNama);
        add(fieldNama);
        add(labelUsia);
        add(fieldUsia);
        add(labelGaji);
        add(fieldGaji);  
        add(btnSubmit);
        add(btnReset); 
        add(btnKembali);
        
        labelJudul.setBounds(15,5,200,20);
        labelNama.setBounds(15,30,120,20);
        fieldNama.setBounds(55,30,200,20);
        
        labelUsia.setBounds(15,60,120,20);
        fieldUsia.setBounds(55,60,200,20);
        
        labelGaji.setBounds(15,90,120,20);
        fieldGaji.setBounds(55,90,200,20);
        
        btnSubmit.setBounds(55,130,90,20);
	btnSubmit.setBackground(Color.blue);
	btnSubmit.setForeground(Color.white);
        btnReset.setBounds(155,130,90,20);
	btnReset.setBackground(Color.red);
	btnReset.setForeground(Color.white);
        btnKembali.setBounds(15,165,250,20);
        
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);
    }


    public String getNama(){
        return fieldNama.getText();
    }
    
    public String getUsia(){
        return fieldUsia.getText();
    }
    
    public String getGaji(){
        return fieldGaji.getText();
    }
}
    
