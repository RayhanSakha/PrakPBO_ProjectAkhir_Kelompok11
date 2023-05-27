package DAOdataksr;
import java.sql.*;
import java.util.*;
import koneksi.connector;
import model.*;
import DAOimplements.kasirimplements;
import java.util.logging.Level;
import java.util.logging.Logger;

public class dataksrDAO implements kasirimplements{
    Connection connection;
    final String select = "SELECT * FROM barang ORDER BY nama ASC";
    final String databeli = "SELECT * FROM pembelian";
    final String insert = "INSERT INTO barang (nama, harga, jumlah) VALUES (?, ?, ?);";
    final String update = "update barang set nama=?, harga=?, jumlah=? where id=?";
    final String delete = "delete from barang where id=?";
    final String pengembalian = "update barang set jumlah=? where id=?";
    final String pembelian ="INSERT INTO pembelian (id_barang, barang, jumlah, harga, total, waktu_pembelian) VALUES (?,?,?,?,?,NOW())";
    
    public dataksrDAO(){
        connection = connector.connection();
    }

    @Override
    public void insert(dataksr k) {
       PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, k.getNama());
            statement.setString(2, k.getHarga());
            statement.setInt(3, k.getJumlah());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while(rs.next()){
                k.setId(rs.getInt(1));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void update(dataksr k) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(update);
            statement.setString(1, k.getNama());
            statement.setString(2, k.getHarga());
            statement.setInt(3, k.getJumlah());
            statement.setInt(4, k.getId());
            statement.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void delete(int id) {
       PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(delete);
            statement.setInt(1, id);
            statement.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<dataksr> getAll() {
        List<dataksr> ks = null;
        try{
            ks = new ArrayList<dataksr>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                dataksr kas = new dataksr();
                kas.setId(rs.getInt("id"));
                kas.setNama(rs.getString("nama"));
                kas.setHarga(rs.getString("harga"));
                kas.setJumlah(rs.getInt("jumlah"));
                ks.add(kas);
            }
        }catch(SQLException ex){
            Logger.getLogger(dataksrDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ks;
    }

    @Override
    public void pengembalian(dataksr k) {
       PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(pengembalian);
            statement.setInt(1, k.getJumlah());
            statement.setInt(2, k.getId());
            statement.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void penjualan(datapembelian dbeli) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(pembelian);
            statement.setInt(1, dbeli.getId());
            statement.setString(2, dbeli.getNama());
            statement.setInt(3, dbeli.getJumlah());
            statement.setString(4, dbeli.getHarga());
            statement.setInt(5, dbeli.getTotal());
            statement.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<datapembelian> getData() {
        List<datapembelian> dp = null;
        try{
            dp = new ArrayList<datapembelian>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(databeli);
            while(rs.next()){
                datapembelian dapem = new datapembelian();
                dapem.setId_barang(rs.getInt("id_barang"));
                dapem.setNama(rs.getString("barang"));
                dapem.setHarga(rs.getString("harga"));
                dapem.setJumlah(rs.getInt("jumlah"));
                dapem.setTotal(rs.getInt("total"));
                dapem.setWaktu(rs.getString("waktu_pembelian"));
                dp.add(dapem);
            }
        }catch(SQLException ex){
            Logger.getLogger(dataksrDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dp;
    }
    
    
}
