package audy;

public class Kontrak extends Karyawan {
    private int waktu;

    public Kontrak(String nama, int waktu, double gaDas) {
        super(nama, gaDas);
        this.waktu = waktu;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Waktu Kontrak : " + this.waktu + "bulan");
    }
}
