package audy.soal1;

public class Main {
    public static void main(String[] args) {
        // objek menggunakan konstruktor 2 parameter
        Barang brg1 = new Barang("BRG-001", "Tas Gucci");
        brg1.setHarga(1200);
        Barang brg2 = new Barang("BRG-002", "Printer Epson L355");
        brg2.setHarga(200);

        // objek menggunakan konstruktor 3 parameter
        Barang brg3 = new Barang("BRG-003", "Koper", 150);
        Barang brg4 = new Barang("BRG-004", "Helm", 20);

        // Menampilkan
        System.out.println("idProduk: " + brg1.getIdProduk() + ", nama: " + brg1.getNama() + ", harga: " + brg1.getHarga());
        System.out.println("idProduk: " + brg2.getIdProduk() + ", nama: " + brg2.getNama() + ", harga: " + brg2.getHarga());
        System.out.println("idProduk: " + brg3.getIdProduk() + ", nama: " + brg3.getNama() + ", harga: " + brg3.getHarga());
        System.out.println("idProduk: " + brg4.getIdProduk() + ", nama: " + brg4.getNama() + ", harga: " + brg4.getHarga());
        System.out.print("\nTotal harga dari BRG-001, BRG-003, dan BRG-004: ");
        System.out.print(brg1.getHarga() + brg3.getHarga() + brg4.getHarga());
    }
}
