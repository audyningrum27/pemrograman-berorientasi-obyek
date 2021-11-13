package audy;

public class Karyawan {
    protected String nama;
    protected double gaDas;

    public Karyawan(String nama, double gaDas) {
        this.nama = nama;
        this.gaDas = gaDas;
    }

    public void display() {
        System.out.println("Nama : " + this.nama +
                "\nGaji Dasar : " + this.gaDas);
    }
}
