package audy;

public class Customer extends Member{
    public Customer(String nama, String nik, String noTelp, double saldo) {
        super(nama, nik, noTelp, saldo);
    }

    @Override
    public void display() {
        super.display();
        System.out.println();
    }
}
