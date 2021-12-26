package tugas13;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author audy
 */
public class MainService {
    public ArrayList<Makanan> getAll(){
        try {
        ArrayList<Makanan> daftarMkn = new ArrayList<>();
        ResultSet result = DbService.get("SELECT * FROM `makanan`");
            while (result.next()) {
                daftarMkn.add(new Makanan(
                    result.getInt("id"),
                    result.getString("nama"),
                    result.getString("jenis"),
                    result.getString("rating"),
                    result.getInt("kalori")
                ));
            }
            return daftarMkn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Internal error", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            DbService.closeConnection();
        }

        return null;
    }
    
    public ArrayList<Makanan> getAll(String kataCari) {
        try {
            ArrayList<Makanan> daftarMkn = new ArrayList<>();
            ResultSet result = DbService.get("SELECT * FROM `makanan` WHERE nama LIKE '%"+kataCari+"%'");
            while (result.next()) {
                daftarMkn.add(new Makanan(
                    result.getInt("id"),
                    result.getString("nama"),
                    result.getString("jenis"),
                    result.getString("rating"),
                    result.getInt("kalori")
                ));
            }
            return daftarMkn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Internal error", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            DbService.closeConnection();
        }

        return null;
    }
    
    public void insert(Makanan food) {
        try {
            String query = "INSERT INTO `makanan` (`nama`, `jenis`, `rating`, `kalori`)"
                    + " VALUES ('%s', '%s', %s, %d)";
            query = String.format(
                query,
                food.getNama(),
                food.getJenis(),
                food.getRating(),
                food.getKalori()
            );
            boolean isError = DbService.query(query);
            if (isError) {
                JOptionPane.showMessageDialog(null, "Error database", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Sukses tambah makanan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Internal error", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            DbService.closeConnection();
        }
    }
    
}
