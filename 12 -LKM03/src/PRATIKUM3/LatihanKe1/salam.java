package PRATIKUM3.LatihanKe1;

public class salam {

    String slm = "Assalamulaikum...";
    public void info1(){
        System.out.println(slm);
    }
}
class PanggilSalam extends salam{
    String salamku = "Salam Sejaheta untuk Kita Semua";
    public void info2(){
        System.out.println(salamku);
    }


    public static void main(String[] args) {
        PanggilSalam obj = new PanggilSalam();
        obj.info1();
        obj.info2();
    }
}
