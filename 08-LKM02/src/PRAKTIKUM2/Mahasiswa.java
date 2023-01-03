package PRAKTIKUM2;

class Mahasiswa{
    public String nama;
    public int angkatan;
    public String asal;

    public Mahasiswa(){
        nama = "jago";
        angkatan = 2020;
        asal = "jember";
    }
    public void ubah(String nm, int ak, String as){
        nama = nm;
        angkatan = ak;
        asal = as;
    }
    public void cetak(){
        System.out.println("Nama     : " + nama);
        System.out.println("Angkatan : " + angkatan);
        System.out.println("Asal     : " + asal);
    }
}



