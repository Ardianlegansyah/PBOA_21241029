class Mahasiswa{
    String nama; 
    String  NIM;
    int usia;


    Mahasiswa(String nama, String NIM, int usia){
        this.nama = nama;
        this.NIM = NIM;
        this.usia = usia;

    }
    // method tanpa parameter dan tanpa return
    void show() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.NIM);
        System.out.println("Umur : " + this.usia);
    }

    // method tanpa return denagan parameter
    void ubahNama (String nama){
        this.nama = nama;

    }
    // method dengan return tanpa parameter
    String getNama(){
        return this.nama;
    }

    //method dengan return dan parameter
    String kenalan(String prodi){
        return "Hai nama saya" + this.nama + "NIM saya" + this.NIM + "Dan saya dari prodi" + prodi;
        

    }

}
public class Main{
    public static void main(String[] args) throws Exception {
        Mahasiswa mahasiswa1 = new Mahasiswa("ucup", "20302020", 23);
        mahasiswa1.show();
        mahasiswa1.ubahNama("venom");
        mahasiswa1.show();
        System.out.println(mahasiswa1.getNama());
        String pesan = mahasiswa1.kenalan("pendidikan teknologi informasi");
        System.out.println(pesan);

        
 
          
     }

}
    