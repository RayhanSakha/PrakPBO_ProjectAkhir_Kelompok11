/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAOdataksr.dataksrDAO;
import DAOimplements.kasirimplements;
import java.util.List;
import model.dataksr;
import model.datapembelian;
import model.modeltabel;
import model.modeltabelpembelian;
import view.Pembelian;

/**
 *
 * @author hp
 */
public class datacontrollpenjualan {
    Pembelian frame;
    kasirimplements impldataksr;
    List<datapembelian> ks;
    
    public datacontrollpenjualan(Pembelian frame){
        this.frame = frame;
        impldataksr = new dataksrDAO();
        ks = impldataksr.getData();
    }

    public void isitabel(){
        ks = impldataksr.getData();
        modeltabelpembelian mp = new modeltabelpembelian(ks);
        frame.getThetabels().setModel(mp);
    }
    
   
}
