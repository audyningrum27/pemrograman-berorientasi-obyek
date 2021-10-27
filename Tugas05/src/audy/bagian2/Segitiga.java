package audy.bagian2;

public class Segitiga {
    private final double alas;
    private final double tinggi;

    public Segitiga(double alas) {
        this.alas = alas;
        this.tinggi = Math.pow(alas, 2) - Math.pow((alas / 2), 2);
    }

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getLuas() {
        return (this.alas * this.tinggi) / 2;
    }

    public double getKeliling() {
        return 3 * this.alas;
    }
}
