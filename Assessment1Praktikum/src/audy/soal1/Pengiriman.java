package audy.soal1;

public class Pengiriman {
    private String noTransaksi;
    private String noResi;
    private String namaEkspedisi;
    private double ongkir;
    private String namaPengirim;
    private String alamatPengirim;
    private String namaPenerima;
    private String alamatPenerima;
    private double nomimalAsuransi;

    // Bukan Asuransi
    public Pengiriman(String noTransaksi, String noResi, String namaEkspedisi, double ongkir, String namaPengirim,
                      String alamatPengirim, String namaPenerima, String alamatPenerima, double nomimalAsuransi) {
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkir = ongkir;
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        this.nomimalAsuransi = nomimalAsuransi;
    }

    // Asuransi
    public Pengiriman(String noTransaksi, String noResi, String namaEkspedisi, double ongkir, String namaPengirim,
                      String alamatPengirim, String namaPenerima, String alamatPenerima) {
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkir = ongkir;
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
    }

    public String getNoTransaksi() {
        return this.noTransaksi;
    }

    public String getNoResi() {
        return this.noResi;
    }

    public String getNamaEkspedisi() {
        return this.namaEkspedisi;
    }

    public double getOngkir() {
        return this.ongkir;
    }

    public String getNamaPengirim() {
        return this.namaPengirim;
    }

    public String getAlamatPengirim() {
        return this.alamatPengirim;
    }

    public String getNamaPenerima() {
        return this.namaPenerima;
    }

    public String getAlamatPenerima() {
        return this.alamatPenerima;
    }

    public double getNomimalAsuransi() {
        return this.nomimalAsuransi;
    }

    public void displayDataBukanAsuransi() {
        System.out.println("No Transaksi\t: " + getNoTransaksi() +
                "\nNo Resi\t: " + getNoResi() +
                "\nNama Ekspedisi\t: " + getNamaEkspedisi() +
                "\nOngkos Kirim\t: " + getOngkir() +
                "\nNama Pengirim\t: " + getNamaPengirim() +
                "\nAlamat Pengirim\t: " + getAlamatPengirim() +
                "\nNama Penerima\t: " + getNamaPenerima() +
                "\nAlamat Penerima\t: " + getAlamatPenerima());
        System.out.println();
    }

    public void displayDataAsuransi() {
        System.out.println("No Transaksi\t: " + getNoTransaksi() +
                "\nNo Resi\t: " + getNoResi() +
                "\nNama Ekspedisi\t: " + getNamaEkspedisi() +
                "\nOngkos Kirim\t: " + getOngkir() +
                "\nNama Pengirim\t: " + getNamaPengirim() +
                "\nAlamat Pengirim\t: " + getAlamatPengirim() +
                "\nNama Penerima\t: " + getNamaPenerima() +
                "\nAlamat Penerima\t: " + getAlamatPenerima() +
                "\nNominal Asuransi\t: " + getNomimalAsuransi());
        System.out.println();
    }
}
