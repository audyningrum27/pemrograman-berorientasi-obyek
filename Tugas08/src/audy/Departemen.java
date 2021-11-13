package audy;

import java.util.ArrayList;

public class Departemen {
    private String nama;
    private ArrayList<Karyawan> kar;
    //private Karyawan kar[];
    //private int index = -1;

    public Departemen(String nama){
        this.nama = nama;
        this.kar = new ArrayList<>();
        //this.kar = new Karyawan[3];
    }

    public void addKaryawan(Karyawan k) {
        this.kar.add(k);
        //index = index + 1;
        //this.kar[index] = k;
    }

    public void displayAll() {
        for (Karyawan kyw : this.kar){
            kyw.display();
        }
    }

    public void displayTetap() {
        for(Karyawan kyw : this.kar) {
            if(kyw instanceof Tetap) {
                kyw.display();
            }
        }
    }

    public void displayKontrak() {
        for (Karyawan kyw : this.kar) {
            if(kyw instanceof Kontrak) {
                kyw.display();
            }
        }
    }
}
