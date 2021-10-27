package audy.bagian1;

public class Main {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Lingkaran dengan jejari 7:");
        System.out.printf("\tluas : %.2f", Lingkaran.luas(7f));
        System.out.printf("\n\tkeliling : %.2f", Lingkaran.keliling(7f));

        System.out.println("\n");

        System.out.println("Lingkaran dengan jejari 5.5:");
        System.out.printf("\tluas : %.2f", Lingkaran.luas(5.5f));
        System.out.printf("\n\tkeliling : %.2f", Lingkaran.keliling(7f));

        System.out.println("\n");

        System.out.println("Lingkaran dengan jejari 20.4:");
        System.out.printf("\tluas : %.2f", Lingkaran.luas(20.4));
        System.out.printf("\n\tkeliling : %.2f", Lingkaran.keliling(20.4));
    }
}
