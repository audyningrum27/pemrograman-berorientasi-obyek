package audy;

public class Main {

    public static void main(String[] args) {
        Jurusan j1 = new Jurusan("D3IF", "Diploma 3 Rekayasa Perangkat Lunak Aplikasi");
        Mahasiswa m1 = new Mahasiswa("6701", "Rendy");
        Mahasiswa m2 = new Mahasiswa("6702", "Chaca");
        Mahasiswa m3 = new Mahasiswa("6703", "Agus");

        j1.addMhs(m1);
        j1.addMhs(m2);
        j1.addMhs(m3);

        Jurusan j2 = new Jurusan("D3SI", "Diploma 3 Sistem Informasi");
        Mahasiswa m4 = new Mahasiswa("6301", "Ridwan");
        Mahasiswa m5 = new Mahasiswa("6302", "Siska");
        Mahasiswa m6 = new Mahasiswa("6303", "Zayn");
        Mahasiswa m7 = new Mahasiswa("6304", "Rahmat");

        j2.addMhs(m4);
        j2.addMhs(m5);
        j2.addMhs(m6);
        j2.addMhs(m7);

        j1.displayData();
        System.out.println();
        j2.displayData();
    }
}
