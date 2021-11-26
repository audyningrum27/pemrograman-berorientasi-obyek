package audy;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private Scanner input = new Scanner(System.in);
    ArrayList<Member> member = new ArrayList<>();

    public void inputMember() {
        System.out.println("1. Driver");
        System.out.println("2. Customer");
        System.out.print("Pilihan Anda: ");
        int typeMember = input.nextInt();
        if((typeMember == 1) || (typeMember == 2)){
            System.out.print("Nama: ");
            String nama = input.next();
            System.out.print("NIK: ");
            String nik = input.next();
            System.out.print("No Telp: ");
            String noTelp = input.next();
            System.out.print("Saldo: ");
            double saldo = input.nextDouble();
            if(typeMember == 1) {
                System.out.print("No Plat: ");
                String noPlat = input.next();
                System.out.print("Jenis Kendaraan: ");
                String jenis = input.next();
                member.add(new Driver(nama, nik, noTelp, saldo, noPlat, jenis));
            } else if(typeMember == 2) {
                member.add(new Customer(nama, nik, noTelp, saldo));
            }
        } else {
            System.out.println("Tidak ada tipe member\n");
        }
    }

    public void displayMember() {
        Driver driver1 = new Driver("Audy", "1000", "0822", 120000, "1233", "Mobil");
        Customer customer1 = new Customer("Nurul", "2000", "0813", 50000);
        member.add(driver1);
        member.add(customer1);
        System.out.println("1. Driver");
        System.out.println("2. Customer");
        System.out.print("Pilihan Anda: ");
        int typeMember = input.nextInt();
        if(typeMember == 1) {
            for(Member mbr : member){
                if(mbr instanceof Driver) {
                    mbr.display();
                }
            }
        } else if(typeMember == 2) {
            for(Member mbr : member) {
                if(mbr instanceof Customer) {
                    mbr.display();
                }
            }
        } else {
            System.out.println("Tidak ada tipe member\n");
        }

    }

    public void tampil() {
        int pil;
        do {
            System.out.println("1. Input Member");
            System.out.println("2. Tampilkan Member");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            pil = input.nextInt();
            switch (pil) {
                case 1: inputMember(); break;
                case 2: displayMember(); break;
                case 3: System.out.println("Keluar app"); break;
                default: System.out.println("\nTidak ada pilihan");
            }
        } while (pil != 3);
    }

    public static void main(String[] args) {
        new Main().tampil();
    }
}
