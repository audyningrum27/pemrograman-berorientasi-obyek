package audy;
import java.util.ArrayList;

public class Jurusan {
    private String kode;
    private String nama;
    private ArrayList<Mahasiswa> mhs;

    public Jurusan(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        this.mhs = new ArrayList<>();
    }

    public void addMhs(Mahasiswa m) {
        this.mhs.add(m);
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public ArrayList<Mahasiswa> getMhs() {
        return mhs;
    }

    public void displayData() {
        int nomor = 1;
        System.out.println(
                "Kode: " + this.kode + "\n" +
                "Nama: " + this.nama + "\n" +
                "Daftar mahasiswa: "
        );

        for (Mahasiswa m : mhs) {
            System.out.println("\t" + nomor + ". " + m.getNim() + " - " + m.getNama());
            nomor++;
        }
    }
}
