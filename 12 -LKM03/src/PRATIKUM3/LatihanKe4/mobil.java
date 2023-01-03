package PRATIKUM3.LatihanKe4;

public class mobil extends Kendaraan{
    @Override
    public void bergerak() {
        System.out.println("Mobil bergerak! ");
    }
    public static void main(String[] args) {
        mobil car = new mobil();

        car.bergerak();
    }
}
