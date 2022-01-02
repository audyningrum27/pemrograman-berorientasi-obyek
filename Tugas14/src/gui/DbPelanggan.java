package gui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author audy
 */
public class DbPelanggan {
    private Connection conn;
    private final ConnectionDB k = new ConnectionDB();
    
    
    public ArrayList<Pelanggan> getPelanggan() throws SQLException{
        ArrayList<Pelanggan> daftar = new ArrayList<>();      
        
        conn = k.getConnection();
        
        String kueri = "SELECT * FROM pelanggan";
        PreparedStatement ps = conn.prepareStatement(kueri);
        
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            String id = rs.getString("id_member");
            String nama = rs.getString("nama");
            String tahun = rs.getString("tahun_lahir");
            String kategori = rs.getString("kategori");
            
            Pelanggan p = new Pelanggan(id, nama, kategori, Integer.parseInt(tahun));
            daftar.add(p);
        }
        rs.close(); ps.close();conn.close();
        return daftar;
    }
    
     public boolean insertPelanggan(Pelanggan p) throws SQLException{
        
        conn = k.getConnection();
        
        String kueri = "INSERT INTO pelanggan(id_member,nama,kategori,tahun_lahir) VALUES (?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(kueri);
        ps.setString(1, p.getId()); ps.setString(2, p.getNama());
        ps.setString(3, p.getKategori()); ps.setInt(4, p.getTahunLahir());
        int rowAffected = ps.executeUpdate();
        ps.close(); conn.close();
        return rowAffected == 1;
        
    }
    
    public boolean updatePelanggan(Pelanggan p) throws SQLException{
        conn = k.getConnection();
        
        String kueri = "UPDATE pelanggan SET nama=?, kategori=?, tahun_lahir=? WHERE id_member=?";
        PreparedStatement ps = conn.prepareStatement(kueri);
        ps.setString(1, p.getNama()); ps.setString(2, p.getKategori());
        ps.setInt(3, p.getTahunLahir()); ps.setString(4, p.getId());
        
        int rowAffected = ps.executeUpdate();
        
        ps.close(); conn.close();
        return rowAffected == 1;
    }
    public boolean deletePelanggan(String id) throws SQLException{
        
        conn = k.getConnection();
        
        String kueri = "DELETE FROM pelanggan WHERE id_member = ?";
        PreparedStatement ps = conn.prepareStatement(kueri);
        ps.setString(1, id); 
        
        int rowAffected = ps.executeUpdate();
        ps.close(); conn.close();
        return rowAffected == 1;
    }
    
    public ArrayList<Pelanggan> cariPelanggan(String keyword) throws SQLException{
        ArrayList<Pelanggan> daftar = new ArrayList<>();
        
        conn = k.getConnection();
        
        String kueri = "SELECT * FROM pelanggan WHERE nama LIKE ? OR tahun_lahir=? OR kategori=?";
        PreparedStatement ps = conn.prepareStatement(kueri);
        ps.setString(1, "%"+keyword+"%"); ps.setString(2, keyword);
        ps.setString(3, keyword);  
        
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            String id = rs.getString("id_member");
            String nama = rs.getString("nama");
            String tahun = rs.getString("tahun_lahir");
            String kategori = rs.getString("kategori");
            
            Pelanggan p = new Pelanggan(id, nama, kategori, Integer.parseInt(tahun));
            daftar.add(p);
        }
        rs.close(); ps.close();conn.close();
        return daftar;
        
    }
}