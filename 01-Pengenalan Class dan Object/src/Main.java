class Mahasiswa{

    String  nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}

public class Main {
    public static void main(String[] args) throws Exception {
       Mahasiswa mhs = new Mahasiswa();

       mhs.nama = "vnot";
       mhs.NIM = "21241001";
       mhs.jurusan = "PTI";
       mhs.IPK = 4.00;
       mhs.umur = 19;
    
       System.out.println("===================");
       System.out.println("Objek Mahasiswa 1");
       System.out.println("===================");
       System.out.println("Nama     : " + mhs.nama);
       System.out.println("NIM      : " + mhs.NIM);
       System.out.println("Jurusan  : " + mhs.jurusan);
       System.out.println("IPK      : " + mhs.IPK);
       System.out.println("UMUR     : " + mhs.umur);



    

    }
}
