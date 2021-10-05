package audy.bagian1;

public class buku {
    private String isbn;
    private String judul;
    private String pengarang;
    private String TahunTerbit;
    private int harga;
    private float rating;

    public buku (String isbn, String judul, String pengarang, String TahunTerbit, int harga, float rating) {
        this.isbn = isbn;
        this.judul = judul;
        this.pengarang = pengarang;
        this.TahunTerbit = TahunTerbit;
        this.harga = harga;
        this.rating = rating;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getTahunTerbit() {
        return TahunTerbit;
    }

    public void setTahunTerbit(String TahunTerbit) {
        this.TahunTerbit = TahunTerbit;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
