package audy.bagian1;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<buku> daftarBuku = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String isbnKey;
        boolean keluar = false;

        buku book1 = new buku(
                "001",
                "Implementasi Algoritma",
                "Dahliar Ananda",
                "2020",
                50000,
                10f
        );

        buku book2 = new buku(
                "002",
                "Pemrograman Berbasis Web 1",
                "Indra Azimi",
                "2021",
                40000,
                7.5f
        );

        daftarBuku.add(book1);
        daftarBuku.add(book2);


        do {
            int pilihan;

            System.out.println("1. Tampilkan semua buku");
            System.out.println("2. Cari buku");
            System.out.println("3. Tambah buku");
            System.out.println("4. Ubah buku");
            System.out.println("5. Hapus buku");
            System.out.println("6. Keluar");
            System.out.print("Masukan pilihan anda: ");
            pilihan = Integer.parseInt(input.nextLine());

            switch (pilihan) {
                case 1:
                    for (buku book : daftarBuku) {
                        System.out.print(
                                "\nISBN: " + book.getIsbn() +
                                "\nJudul: " + book.getJudul() +
                                "\nPengarang: " + book.getPengarang() +
                                "\nTahun Terbit: " + book.getTahunTerbit() +
                                "\nHarga: " + book.getHarga() +
                                "\nRating: " + book.getRating()
                      );
                      System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Masukan isbn buku: ");
                    isbnKey = input.nextLine();
                    buku bukuDicari = null;
                    for (buku book : daftarBuku) {
                        if (book.getIsbn().equals(isbnKey)) {
                            bukuDicari = book;
                            break;
                        }
                    }

                    if (bukuDicari != null) {
                        System.out.println("Hasil pencarian: ");
                        System.out.print(
                                "\nISBN: " + bukuDicari.getIsbn() +
                                "\nJudul: " + bukuDicari.getJudul() +
                                "\nPengarang: " + bukuDicari.getPengarang() +
                                "\nTahun Terbit: " + bukuDicari.getTahunTerbit() +
                                "\nHarga: " + bukuDicari.getHarga() +
                                "\nRating: " + bukuDicari.getRating()
                        );
                        System.out.println();
                    } else {
                        System.out.println("Buku tidak ada");
                    }
                    break;
                case 3:
                    System.out.print("Masukan isbn buku: ");
                    String isbn = input.nextLine();
                    System.out.print("Masukan judul buku: ");
                    String judul = input.nextLine();
                    System.out.print("Masukan pengarang buku: ");
                    String pengarang = input.nextLine();
                    System.out.print("Masukan tahun terbit buku: ");
                    String tahunTerbit = input.nextLine();
                    System.out.print("Masukan harga buku: ");
                    int harga = Integer.parseInt(input.nextLine());
                    System.out.print("Masukan rating buku: ");
                    float rating = Float.parseFloat(input.nextLine());
                    daftarBuku.add(new buku(isbn, judul, pengarang, tahunTerbit, harga, rating));
                    break;
                case 4:
                    System.out.print("Masukan isbn buku yang ingin diubah: ");
                    isbnKey = input.nextLine();
                    buku bukuDiedit = null;
                    int editedBookIndex = -1;
                    for (int i = 0; i < daftarBuku.size(); i++) {
                        if (daftarBuku.get(i).getIsbn().equals(isbnKey)) {
                            bukuDiedit = daftarBuku.get(i);
                            editedBookIndex = i;
                            break;
                        }
                    }
                    if (bukuDiedit != null) {
                        System.out.println("Masukan data-data yang akan diedit. Kosongkan jika tidak ingin di edit");
                        System.out.print("Masukan judul buku: ");
                        String tmpJudul = input.nextLine();
                        if (!tmpJudul.isEmpty()) bukuDiedit.setJudul(tmpJudul);
                        System.out.print("Masukan pengarang buku: ");
                        String tmpPengarang = input.nextLine();
                        if (!tmpPengarang.isEmpty()) bukuDiedit.setPengarang(tmpPengarang);
                        System.out.print("Masukan tahun terbit buku: ");
                        String tmpTahunTerbit = input.nextLine();
                        if (!tmpTahunTerbit.isEmpty()) bukuDiedit.setTahunTerbit(tmpTahunTerbit);
                        System.out.print("Masukan harga buku: ");
                        String tmpHarga = input.nextLine();
                        if (!tmpHarga.isEmpty()) bukuDiedit.setHarga(Integer.parseInt(tmpHarga));
                        System.out.print("Masukan rating buku: ");
                        String tmpRating = input.nextLine();
                        if (!tmpRating.isEmpty()) bukuDiedit.setRating(Float.parseFloat(tmpRating));

                        daftarBuku.set(editedBookIndex, bukuDiedit);
                    } else {
                        System.out.println("Buku tidak ada");
                    }
                    break;
                case 5:
                    System.out.print("Masukan isbn buku yang akan dihapus: ");
                    isbnKey = input.nextLine();
                    buku bukuDihapus = null;
                    for (buku book : daftarBuku) {
                        if (book.getIsbn().equals(isbnKey)) {
                            bukuDihapus = book;
                            break;
                        }
                    }

                    if (bukuDihapus != null) {
                        daftarBuku.remove(bukuDihapus);
                    } else {
                        System.out.println("Buku tidak ada");
                    }
                    break;
                case 6:
                    keluar = true;
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
            System.out.println();
        } while (!keluar);

        System.out.println("-------");
    }
}
