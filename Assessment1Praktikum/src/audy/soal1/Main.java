package audy.soal1;

public class Main {
    public static void main(String[] args) {
        Pengiriman asuransidropship =  new Pengiriman ("1","N0001","JNE",21000,
                "Dropship1","Surabaya","Bejo","Dayeuhkolot", 40000);

        Pengiriman asuransi =  new Pengiriman ("2","N0003","J&T",16000,
                "Eiger","Bandung Kopo","Tini","Dayeuhkolot", 40000);

        Pengiriman normal =  new Pengiriman ("3","N0004","Pos Indonesia",23000,
                "Eiger","Bandung Kopo","Bambang","Dayeuhkolot");

        Pengiriman dropship =  new Pengiriman ("4","N0002","SiCepat",24000,
                "Dropship2","Pontianak","Joko","Dayeuhkolot");


        System.out.println("Asuransi dan Dropship");
        asuransidropship.displayDataAsuransi();
        System.out.println("Asuransi");
        asuransi.displayDataAsuransi();
        System.out.println("Normal");
        normal.displayDataBukanAsuransi();
        System.out.println("Dropship");
        dropship.displayDataBukanAsuransi();
    }
}
