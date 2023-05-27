package controller;
import java.util.List;
import DAOdataksr.dataksrDAO;
import DAOimplements.kasirimplements;
import javax.swing.JOptionPane;
import model.*;
import view.MainView;

public class dataksrcontroller {
    MainView frame;
    kasirimplements impldataksr;
    List<dataksr> ks;
    
    public dataksrcontroller(MainView frame){
        this.frame = frame;
        impldataksr = new dataksrDAO();
        ks = impldataksr.getAll();
    }

    public void isitabel(){
        ks = impldataksr.getAll();
        modeltabel mp = new modeltabel(ks);
        frame.getTabelDataksr().setModel(mp);
    }
    
    public void insert(){
        dataksr ks = new dataksr();
        ks.setNama(frame.getJTxtnama().getText());
        ks.setHarga(frame.getJTxtharga().getText());
        ks.setJumlah(Integer.parseInt(frame.getJTxtjumlah().getText()));
        impldataksr.insert(ks);
        
    }
    
    public void update(){
        dataksr ks = new dataksr();
        ks.setNama(frame.getJTxtnama().getText());
        ks.setHarga(frame.getJTxtharga().getText());
        ks.setJumlah(Integer.parseInt(frame.getJTxtjumlah().getText()));
        ks.setId(Integer.parseInt(frame.getJTxtid().getText()));
        impldataksr.update(ks);
    }
    
    public void delete(){
        int id = Integer.parseInt(frame.getJTxtid().getText());
        impldataksr.delete(id);
    }
    
}
