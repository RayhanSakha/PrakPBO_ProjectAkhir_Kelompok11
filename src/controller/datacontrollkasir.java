/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import DAOdataksr.dataksrDAO;
import DAOimplements.kasirimplements;
import model.*;
import view.Kasir;

public class datacontrollkasir {
    Kasir frame;
    kasirimplements impldataksr;
    List<dataksr> ks;
    
    public datacontrollkasir(Kasir frame){
        this.frame = frame;
        impldataksr = new dataksrDAO();
        ks = impldataksr.getAll();
    }

    public void isitabel(){
        ks = impldataksr.getAll();
        modeltabel mp = new modeltabel(ks);
        frame.getTabelDataBarang().setModel(mp);
    }
    
    public void addtabel(){
        dataksr ks = new dataksr();
        ks.setNama(frame.getJformbarang().getText());
        ks.setHarga(frame.getJformharga().getText());
        ks.setJumlah(Integer.parseInt(frame.getJformkuantitas().getText()));
        ks.setId(Integer.parseInt(frame.getJformid().getText()));
        
    }
   public void updatestock(){
        dataksr ks = new dataksr();
        ks.setId(Integer.parseInt(frame.getJformid().getText()));
        ks.setJumlah(Integer.parseInt(frame.getJformstock().getText()));
        impldataksr.pengembalian(ks);
    }
   
   public void penjualan(){
       datapembelian ks = new datapembelian();
       ks.setId(Integer.parseInt(frame.getJformid().getText()));
       ks.setJumlah(Integer.parseInt(frame.getJformkuantitas().getText()));
       ks.setNama(frame.getJformbarang().getText());
       ks.setHarga(frame.getJformharga().getText());
       ks.setTotal(Integer.parseInt(frame.getStt().getText()));
       impldataksr.penjualan(ks);
   }
    
}
