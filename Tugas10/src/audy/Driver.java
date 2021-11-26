package audy;

public class Driver extends Member{
    private String noPlat;
    private String jenis;

    public Driver(String nama, String nik, String noTelp, double saldo, String noPlat, String jenis) {
        super(nama, nik, noTelp, saldo);
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    public void display() {
        super.display();
        System.out.println("No Plat: " + noPlat +
                "\nJenis Kendaraan: " + jenis + "\n");
    }
}
