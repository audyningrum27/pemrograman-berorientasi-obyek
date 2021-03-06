package audy;
import java.util.Scanner;

public class Main {
    private Scanner scan = new Scanner(System.in);
    Departemen dpt1 = new Departemen("Media Informasi HIMADIRA");

    private void inputKywTetap() {
        System.out.print("Masukkan nama karyawan: ");
        String nama = scan.next();
        System.out.print("Masukkan Tunjangan Dasar: ");
        double tuDas = scan.nextDouble();
        System.out.print("Masukkan Gaji Dasar: ");
        double gaDas = scan.nextDouble();
        dpt1.addKaryawan(new Tetap(nama, tuDas, gaDas));
    }

    private void inputKywKontrak() {
        System.out.print("Masukkan nama karyawan: ");
        String nama = scan.next();
        System.out.print("Masukkan Waktu Kontrak: ");
        int waktu = scan.nextInt();
        System.out.print("Masukkan Gaji Dasar: ");
        double gaDas = scan.nextDouble();
        dpt1.addKaryawan(new Kontrak(nama, waktu, gaDas));
    }

    public void tampil() {

        int pil;
        do{
            System.out.println("1. Input Karyawan tetap");
            System.out.println("2. Input Karyawan kontrak");
            System.out.println("3. Tampilkan Seluruh Data Karyawan");
            System.out.println("4. Tampilkan Data Karyawan tetap");
            System.out.println("5. Tampilkan Data Karyawan Kontrak");
            System.out.println("6. Keluar dari app");
            System.out.print("Pilihan Anda: ");
            pil= scan.nextInt();
            switch (pil) {
                case 1: inputKywTetap(); break;
                case 2: inputKywKontrak(); break;
                case 3: dpt1.displayAll(); break;
                case 4: dpt1.displayTetap(); break;
                case 5: dpt1.displayKontrak(); break;
                case 6: System.out.println("Keluar app"); break;
                default: System.out.println("Tidak ada pilihan");
            }
        }while (pil != 6);
    }

    public static void main(String[] args) {
        new Main().tampil();
    }
}
