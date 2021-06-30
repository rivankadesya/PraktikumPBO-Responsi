
package View;

import Controller.Controller;
import Model.Karyawan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


/**
 *
 * @author Administrator
 */
public class Menu extends JFrame implements ActionListener{
    
    JLabel labelJudul = new JLabel("Main Menu");
    JButton btnTambah = new JButton("Tambah Karyawan");
    JButton btnLihat = new JButton("Lihat Karyawan");
    
    public Menu(){
        setSize(180,150);
        setLayout(null);
        add(labelJudul);
        add(btnLihat);
        add(btnTambah);
        
        labelJudul.setBounds(50,5,200,20);

        btnTambah.setBounds(0,35,180,30);
        btnLihat.setBounds(0,65,180,30);
        
        
        btnTambah.addActionListener(this);
        btnLihat.addActionListener(this);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);
    }

    public void actionPerformed (ActionEvent e){
        if(e.getSource() == btnTambah){
           Lihat lh = new Lihat();
           lh.dispose();
           dispose();
           Input ik = new Input();
           Edit ed = new Edit();
           ed.dispose();
           Karyawan md = new Karyawan();
           Controller ct = new Controller(lh, md,ik,ed);
           
        }
        if(e.getSource() == btnLihat){
           Lihat lh = new Lihat();
           Input ik = new Input();
           ik.dispose();
           Edit ed = new Edit();
           ed.dispose();
           Karyawan md = new Karyawan();
           Controller ct = new Controller(lh, md,ik,ed);
        }
    }
}  
