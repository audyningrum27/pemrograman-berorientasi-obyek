package audy;

public class Tampil {
    public static void main(String[] args) {
        Departemen dpt1 = new Departemen("Media Informasi HIMADIRA");
        Departemen dpt2 = new Departemen("Media Informasi BPM");
        Karyawan kyw1 = new Tetap("David",20000, 50000);
        Karyawan kyw2 = new Kontrak("Audy",8, 30000);
        Karyawan kyw3 = new Kontrak("Ilam",8, 30000);
        Karyawan kyw4 = new Tetap("Eka",20000, 50000);
        Karyawan kyw5 = new Kontrak("Fahrio",8, 30000);

        dpt1.addKaryawan(kyw1);
        dpt1.addKaryawan(kyw2);
        dpt1.addKaryawan(kyw3);

        dpt2.addKaryawan(kyw4);
        dpt2.addKaryawan(kyw5);

        System.out.println("1. Data Seluruh Karyawan HIMADIRA");
        dpt1.displayAll();
        System.out.println("-----");
        System.out.println("2. Data Karyawan tetap");
        dpt1.displayTetap();
        System.out.println("-----");
        System.out.println("3. Data Karyawan Kontrak");
        dpt1.displayKontrak();

        System.out.println();
        System.out.println();
        System.out.println("1. Data Seluruh Karyawan BPM");
        dpt2.displayAll();
        System.out.println("-----");
        System.out.println("2. Data Karyawan tetap");
        dpt2.displayTetap();
        System.out.println("-----");
        System.out.println("3. Data Karyawan Kontrak");
        dpt2.displayKontrak();
    }
}
