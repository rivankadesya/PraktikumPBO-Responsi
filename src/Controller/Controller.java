/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Input;
import View.Lihat;
import View.Edit;
import View.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import Main.Main;
import Model.Karyawan;

/**
 *
 * @author Administrator
 */

public class Controller {
    Karyawan model;
    Lihat view;
    Input input;
    Edit edit;
    
    public Controller(Lihat view, Karyawan model,Input inputkaryawan, Edit edit){
        this.model = model;
        this.view = view;
        this.input = inputkaryawan;
        this.edit = edit;
        
        if(model.getBanyakData()!=0){
            String dataKaryawan[][] = model.readKaryawan();
            this.view.tabel.setModel((new JTable(dataKaryawan, this.view.namaKolom)).getModel());
        }else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        input.btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String nama = input.getNama();
                String usia = input.getUsia();
                String gaji =input.getGaji();
                model.insert(nama, usia, gaji);
         
                String dataKaryawan[][] = model.readKaryawan();
                view.tabel.setModel((new JTable(dataKaryawan, view.namaKolom)).getModel());
            }
        });
         input.btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.dispose();
                Menu m = new Menu();
                   
            }
        });
         
        input.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.fieldNama.setText(null);
                input.fieldUsia.setText(null);  
                input.fieldGaji.setText(null);
            }
        });
        edit.btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                edit.dispose();
                

            }
        });
        this.view.btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();

            }
        });
        edit.btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nama = edit.getNama();
                String cek = edit.getCek();
                String usia = edit.getUsia();
                String gaji =edit.getGaji();
                model.update(nama,cek, usia, gaji);
                edit.dispose();
            }
        });
        edit.btnHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String cek = edit.getCek();
                model.delete(cek);
                edit.dispose();
            }
        });
              this.view.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = view.tabel.getSelectedRow();
                
                String id = view.tabel.getValueAt(baris, 0).toString();
                String nama = view.tabel.getValueAt(baris, 1).toString();
                String usia = view.tabel.getValueAt(baris, 2).toString();
                String gaji = view.tabel.getValueAt(baris, 3).toString();
                
                view.dispose();
                Edit edit = new Edit();
                edit.fieldNama.setText(nama);
                edit.fieldCek.setText(id);
                edit.fieldUsia.setText(usia);
                edit.fieldGaji.setText(gaji);
                Lihat lihat = new Lihat();
                lihat.dispose();
                Input input = new Input();
                input.dispose();
                Karyawan karyawan = new Karyawan();
                Controller ct = new Controller(lihat,karyawan,input,edit);
                System.out.println("");
                        
            }
        }
        );
    }
    
}


 

