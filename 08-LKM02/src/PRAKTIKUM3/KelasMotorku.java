package PRAKTIKUM3;

class MOTOR{
    String merek;
    int tahun;
    String noPolisi;
    String warna;

    public MOTOR(String merek, int tahun, String noPolisi, String warna){
        this.merek = merek;
        this.tahun = tahun;
        this.noPolisi = noPolisi;
        this.warna = warna;
    }
    void showInfoMotor(){
        System.out.println("Merek : " + this.merek);
        System.out.println("Tahun : " + this.tahun);
        System.out.println("No Polisi : " + this.noPolisi);
        System.out.println("Warna : " + this.warna);
    }
}
public class KelasMotorku {
    public static void main(String[] args) {
        MOTOR motorku = new MOTOR("Honda GL Pro", 1997, "G 5879 BF", "Hitam");
        motorku.showInfoMotor();
    }
    
}
