package PRATIKUM3.Tugas;

public class persegi {
    float sisi;

    void SetSisi(float sisi){
        this.sisi= sisi;
    }
    
    void luas(){
        float luas = sisi*sisi;
        System.out.println("Luas lingkaran: " + luas);
    }
    void keliling(){
        float keliling = 4*sisi;
        System.out.println("Keliling lingkaran: " + keliling);
    }
}
