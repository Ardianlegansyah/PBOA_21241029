class Mahasiswa {
    public String nama;
    private double nilai;

    Mahasiswa(String nama, double nilai){
        this.nama = nama;
        this.nilai = nilai;       
    }
    void display(){
        System.out.println("Nama\t\t :" + this.nama);
        System.out.println("Nilai\t\t :" + this.nilai);
    }
}
public class Main{
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Wahyudi", 99.9);

        mhs.display();
    }
}