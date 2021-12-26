package tugas13;

/**
 *
 * @author audy
 */
public class Makanan {
    private int id;
    private String nama;
    private String jenis;
    private String rating;
    private int kalori;

    public Makanan (int id, String nama, String jenis, String rating, int kalori) {
        this.id = id;
        this.nama = nama;
        this.jenis = jenis;
        this.rating = rating;
        this.kalori = kalori;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public String getRating() {
        return rating;
    }

    public int getKalori() {
        return kalori;
    }
}
