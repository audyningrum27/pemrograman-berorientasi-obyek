package audy.soal2;
import java.util.Scanner;
import java.util.ArrayList;

public class ShowroomJaya {
    public static void main(String[] args) {
        ArrayList<Mobil> arrMobil = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String beli;
        boolean keluar = false;

        Mobil m1 = new Mobil("Avanza", "2018", 150, 5);
        arrMobil.add(m1);
        
        do {
            int pilih;

            System.out.println("1. Lihat daftar mobil");
            System.out.println("2. Tambah mobil");
            System.out.println("3. Beli mobil");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilih = Integer.parseInt(input.nextLine());

            switch (pilih) {
                case 1:
                    for(Mobil car : arrMobil) {
                        car.displayInfo();
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.print("Masukan merk mobil: ");
                    String merk = input.nextLine();
                    System.out.print("Masukan harga mobil: ");
                    double harga = input.nextDouble();
                    System.out.print("Masukan tahun keluaran mobil: ");
                    String tahunKeluaran = input.nextLine();
                    System.out.print("Masukan stok mobil: ");
                    int stok = Integer.parseInt(input.nextLine());
                    arrMobil.add(new Mobil(merk, tahunKeluaran, harga, stok));
                    break;
                    
                case 3:
                    System.out.print("Masukan merk mobil yang dibeli: ");
                    beli = input.nextLine();
                    Mobil mobilDibeli = null;
                    for (Mobil car : arrMobil) {
                        if (car.getMerk().equals(beli)) {
                            mobilDibeli = car;
                            break;
                        }
                    }

                    if (mobilDibeli != null) {
                        arrMobil.remove(mobilDibeli);
                        System.out.println("Mobil telah dibeli");
                    } else {
                        System.out.println("Mobil tidak ada");
                    }

                case 4:
                    keluar = true;
                    System.out.println("\nKeluar");
                    break;

                default:
                    System.out.println("pilihan tidak ada\n");
                    break;
            }
        } while(!keluar);

        System.out.println("-------");
    }
}
