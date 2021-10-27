package audy.bagian1;

public class Lingkaran {
    public static double luas(float jariJari) {
        return 3.14f * jariJari * jariJari;
    }

    public static double luas(double diameter) {
        double jariJari = diameter / 2;
        return 3.14 * (jariJari * jariJari);
    }

    public static double keliling(float jariJari) {
        return 2 * 3.14 * jariJari;
    }

    public static double keliling(double diameter) {
        double jariJari = diameter / 2;
        return 2 * 3.14 * jariJari;
    }
}
