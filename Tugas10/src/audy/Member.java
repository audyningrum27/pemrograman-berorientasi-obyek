package audy;

public abstract class Member {
    protected String nama, nik, noTelp;
    protected double saldo;

    public Member(String nama, String nik, String noTelp, double saldo) {
        this.nama = nama;
        this.nik = nik;
        this.noTelp = noTelp;
        this.saldo = saldo;
    }

    public abstract double getSaldo();

    public void display() {
        System.out.println("Nama: " + nama +
                "\nNIK: " + nik +
                "\nNo Telp: " + noTelp +
                "\nSaldo: " + saldo);
    }
}
