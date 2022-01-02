package gui;

/**
 *
 * @author audy
 */
public class Pelanggan {
    private String id, nama, kategori;
    private int tahunLahir;

    public Pelanggan(String id, String nama, String kategori, int tahunLahir){
        this.id = id;
        this.nama = nama;
        this.kategori = kategori;
        this.tahunLahir = tahunLahir;
    }
    
    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getKategori() {
        return kategori;
    }

    public int getTahunLahir() {
        return tahunLahir;
    }
}
