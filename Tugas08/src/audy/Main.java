package audy;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //BELUM BERES WAKTU DAH SELESAI WKWK, rencana mau ikut kek ppt tapi gak ngerti :(
    // ada yang error
    private Scanner scan = new Scanner(System.in);
    private ArrayList<Karyawan> kyw = new ArrayList<>();
    Departemen dpt1 = new Departemen("Media Informasi HIMADIRA");

    private void inputKywTetap() {
        System.out.print("Masukkan nama karyawan: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Tunjangan Dasar: ");
        double tuDas = scan.nextDouble();
        System.out.print("Masukkan Gaji Dasar: ");
        double gaDas = scan.nextDouble();
        kyw.add(new Tetap(nama, tuDas, gaDas));
    }
    private void inputKywKontrak() {
        System.out.print("Masukkan nama karyawan: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Waktu Kontrak: ");
        int waktu = scan.nextInt();
        System.out.print("Masukkan Gaji Dasar: ");
        double gaDas = scan.nextDouble();
        dpt1.addKaryawan(new Kontrak(nama, waktu, gaDas));
    }

    public void tampil() {

        /**
        Karyawan kyw1 = new Tetap("David",20000, 50000);
        Karyawan kyw2 = new Kontrak("Audy",8, 30000);
        Karyawan kyw3 = new Kontrak("Ilam",8, 30000);

        dpt1.addKaryawan(kyw1);
        dpt1.addKaryawan(kyw2);
        dpt1.addKaryawan(kyw3);
        **/
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
                default: System.out.println("Tidak ada pilihan");
            }
        }while (pil != 6);
    }

    public static void main(String[] args) {
        new Main().tampil();
    }
}
