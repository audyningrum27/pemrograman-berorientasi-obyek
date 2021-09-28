package audy.soal2;

public class Main {
    public static void main(String[] args) {
        Buku bk1 = new Buku("Harry Potter", "J.K. Rowling", 300000);
        Buku bk2 = new Buku("UML", "Ivar Jacobson", 400000);

        // Menampilkan
        System.out.println("Judul: " + bk1.getJudul() + ", Pengarang: " + bk1.getPengarang() + ", Harga: " + bk1.getHarga());
        System.out.println("Judul: " + bk2.getJudul() + ", Pengarang: " + bk2.getPengarang() + ", Harga: " + bk2.getHarga());
    }
}
