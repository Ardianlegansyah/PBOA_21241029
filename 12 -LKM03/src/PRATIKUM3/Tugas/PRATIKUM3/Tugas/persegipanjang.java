package PRATIKUM3.Tugas;

public class persegipanjang {
    float panjang;
    float lebar;

    void SetPanjangLebar(float panjang, float lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    void luas(){
        float luas = panjang*lebar;
        System.out.println("Luas lingkaran: " + luas);
    }
    void keliling(){
        float keliling = 2*panjang + 2*lebar;
        System.out.println("Keliling lingkaran: " + keliling);
    }
}
