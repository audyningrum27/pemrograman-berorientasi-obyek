package audy.bagian2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Segitiga segitiga;
        int pilihan = 0;
        double alas, tinggi = 0;

        System.out.println("Segitiga sama sisi");

        do {
            System.out.println("1. Diketahui alas/sisi segitiga");
            System.out.println("2. Diketahui alas dan tinggi segitiga");
            System.out.println("3. Keluar");
            System.out.print("Masukan pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukan alas/sisi: ");
                    alas = input.nextDouble();
                    segitiga = new Segitiga(alas);
                    System.out.println("Keliling Segitiga: "+ segitiga.getKeliling());
                    System.out.println("Luas Segitiga: "+ segitiga.getLuas());
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Masukan alas: ");
                    alas = input.nextDouble();
                    System.out.print("Masukan tinggi: ");
                    tinggi = input.nextDouble();
                    segitiga = new Segitiga(alas, tinggi);
                    System.out.println("Keliling Segitiga: "+ segitiga.getKeliling());
                    System.out.println("Luas Segitiga: "+ segitiga.getLuas());
                    System.out.println();
                    break;
                case 3:
                    System.out.println("\nKeluar aplikasi");
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    System.out.println();
                    break;
            }
        } while(pilihan != 3);
    }
}
