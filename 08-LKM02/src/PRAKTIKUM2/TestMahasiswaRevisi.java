package PRAKTIKUM2;

public class TestMahasiswaRevisi {
    public static void main(String[] args) {
        // object 1
        Mahasiswa MHSTI = new Mahasiswa();
        System.out.println("IDENTITAS AWAL : ");
        MHSTI.cetak();
        
        MHSTI.ubah("Awaludin", 2021, "Bandok Daya");
        System.out.println("\nIDENTITAS AKHIR : ");
        MHSTI.cetak();

        // object 2
        Mahasiswa MHSTE = new Mahasiswa();
        System.out.println("IDENTITAS AWAL : ");
        MHSTE.cetak();
        
        MHSTE.ubah("Faruk", 2022, "Bandok Lauk");
        System.out.println("\nIDENTITAS AKHIR : ");
        MHSTE.cetak();
   
    }
}