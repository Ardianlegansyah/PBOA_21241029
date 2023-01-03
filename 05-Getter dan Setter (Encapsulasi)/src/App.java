import javax.sound.sampled.SourceDataLine;

class Ling{
    private double diameter;

    public Ling(double diameter){
        this.diameter = diameter;
    } 
    // Getter
    public double getJari2(){
        return this.diameter/2;
    }
    // Setter
    public double getHitungLuas(){
        return 3.14*getJari2()*getJari2();
    }
    public double getHitungKeliling(){
        return 2*3.14*getJari2();
    }
    public void display(){
        System.out.println("Diameter\t\t" + this.diameter);
        System.out.println("Jari-Jari\t\t" + getJari2());
        System.out.println("Luas\t\t\t" + getHitungLuas());
        System.out.println("Keliling\t\t" + getHitungKeliling());
    }

}
   
public class App {
    public static void main(String[] args) throws Exception {
        Ling Lingkaran = new Ling(3.5);

        Lingkaran.display();
    }
}