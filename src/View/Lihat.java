package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import Helper.Connector;
import Main.Main;

/**
 *
 * @author Administrator
 */
public class Lihat extends JFrame {
    
    
    JFrame frame = new JFrame("JDBC");
    public JTable tabel;
    DefaultTableModel model;
    JScrollPane scrollPanel;
    String data[][] = new String[500][4];
    public Object namaKolom[] = {"ID", "Nama", "Usia", "Gaji"};
    
    public JButton btnKembali = new JButton("KEMBALI");
    
    
    public Lihat(){
        setTitle("Data Karyawan");
        setSize(800, 350);
        setLayout(null);
        add(btnKembali);
        model = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(model);
        scrollPanel = new JScrollPane(tabel);
        
        scrollPanel = new JScrollPane(tabel);
        add(scrollPanel);
        
        scrollPanel.setBounds(15, 15, 750, 200);
        scrollPanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        btnKembali.setBounds(15, 270,750, 30);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
