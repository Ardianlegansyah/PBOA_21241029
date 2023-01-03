package PRATIKUM3.Tugas;

public class segitiga extends BangunDatar{
    float alas;
    float tinggi;

    void SetAlasdanTinggi(float alas, float tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    void luas(){
        float luas = 2/this.alas*this.tinggi;
        System.out.println("Luas Segitiga: " + luas);
    }
    void keliling(){
        float keliling = 3*this.alas;
        System.out.println("Keliling Segitiga: " + keliling);
    }
}
