package PRATIKUM3.Tugas;

public class main {
    public static void main(String[] args){

        //Objek  Bangun Datar
        BangunDatar bangunDatar = new BangunDatar();
        System.out.println("========Defauld========");
        bangunDatar.luas();
        bangunDatar.keliling();

        //Segitiga
        segitiga segitiga = new segitiga();
        System.out.println("========Hitung Segitiga========");
        segitiga.SetAlasdanTinggi(8, 8);
        segitiga.luas();
        segitiga.keliling();

        //Lingkaran
        lingkaran lingkaran = new lingkaran();
        System.out.println("========Hitung Lingkaran========");
        lingkaran.SetJari_jari(8);
        lingkaran.luas();
        lingkaran.keliling();

        //Persegi
        persegi persegi = new persegi();
        System.out.println("========Hitung Persegi========");
        persegi.SetSisi(8);
        persegi.luas();
        persegi.keliling();

        //Persegi Panjang
        persegipanjang persegipanjang = new persegipanjang();
        System.out.println("========Hitung Persegi Panjang========");
        persegipanjang.SetPanjangLebar(20, 17);
        persegipanjang.luas();
        persegipanjang.keliling();
    }
}