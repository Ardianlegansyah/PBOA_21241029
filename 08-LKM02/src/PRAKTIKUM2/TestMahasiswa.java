package PRAKTIKUM2;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa MHS = new Mahasiswa();
        System.out.println("IDENTITAS AWAL : ");
        MHS.cetak();
        
        MHS.ubah("Rasfold", 2020, "Mainchaster");
        System.out.println("\nIDENTITAS AKHIR : ");
        MHS.cetak();
    }
}