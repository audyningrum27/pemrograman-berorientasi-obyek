package audy;

public class Member {
    protected String nama, nik, noTelp;
    protected double saldo;

    public Member(String nama, String nik, String noTelp, double saldo) {
        this.nama = nama;
        this.nik = nik;
        this.noTelp = noTelp;
        this.saldo = saldo;
    }

    public void display() {
        System.out.println("Nama: " + this.nama +
                "\nNIK: " + this.nik +
                "\nNo Telp: " + this.noTelp +
                "\nSaldo: " + this.saldo);
    }
}
