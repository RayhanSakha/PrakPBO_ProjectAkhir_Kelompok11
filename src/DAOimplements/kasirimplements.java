package DAOimplements;
import java.util.List;
import model.*;

public interface kasirimplements {
    public void insert(dataksr k);
    public void update(dataksr k);
    public void delete(int id);
    public List<dataksr> getAll();
    public List<datapembelian> getData();
    public void pengembalian(dataksr k);
    public void penjualan(datapembelian dbeli);
}
