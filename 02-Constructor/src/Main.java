import javax.sound.sampled.SourceDataLine;

class Mahasiswa{

    String Nama;
    String NIM;
    String Jurusan;
    double IPK;
    int Umur;
    

    Mahasiswa (String Inputnama, String InputNIM, String Inputjurusan, double InputIPK, int Inputumur ){
        Nama = Inputnama; 
        NIM = InputNIM;
        Jurusan = Inputjurusan;
        IPK = InputIPK;
        Umur = Inputumur;  
        System.out.println("Nama     : " + Nama);
        System.out.println("NIM      : " + NIM);
        System.out.println("Jurusan  : " + Jurusan);
        System.out.println("IPK      : " + IPK);
        System.out.println("UMUR     : " + Umur);
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
      Mahasiswa mhs1 = new Mahasiswa("LOL", "43434gg44", "kimia", 3.99, 90 );
      Mahasiswa mhs2 = new Mahasiswa("yOL", "47734344", "kimia", 3.99, 90 );
      Mahasiswa mhs3 = new Mahasiswa("kOL", "43434gg44", "kimia", 3.89, 20 );


   

       



    

    }
}
