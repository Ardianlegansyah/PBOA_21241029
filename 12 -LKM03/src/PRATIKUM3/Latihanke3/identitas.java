package PRATIKUM3.Latihanke3;

class identitas {
    private String universitas = "Universitas Pendidikan Mandalika";
    private String jurusan = "Pendidikan Teknologi Informasi";
    private String nama;
    private String nim;

    //konstruktor
    public identitas(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }
    //method
    public void info(){
        System.out.println("Perguruan Tinggi : "+universitas);
        System.out.println("Jurusan : "+jurusan);
        System.out.println("Nama : "+nama);
        System.out.println("Nim : "+nim);
    }
}
class keterangan extends identitas{
    protected String angkatan;
    protected String alamat;

    //konstruktor
    public keterangan(String nama, String nim, String angkatan, String alamat){
        super(nama,nim);
        this.angkatan= angkatan;
        this.alamat = alamat;
    }
    //method
    public void info(){
        super.info();
        System.out.println("Angkatan : "+angkatan);
        System.out.println("Alamat : "+alamat);
    }
}

class ConstruktorSuperClass{
    public static void main(String[] args) {
        keterangan mahasiswa = new keterangan("Al-Fatih","21241022", "Tahun 1453","Instanbul/Konstatinopel");
        mahasiswa.info();
    }
}