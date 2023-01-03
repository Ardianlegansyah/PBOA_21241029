import javax.sound.sampled.SourceDataLine;

class Display {
    private String name;
    static String type = "layar";

    Display (String name, String type){
        this.name = name;
        
    }

    void setType(String type){
        Display.type = type;

    }

    
    void show(){
        System.out.println("Name Display :" + this.name);
        System.out.println(Display.type);
    }

}


public class App {
    public static void main(String[] args) throws Exception {

    //Instansiasi atau pembuatan Object
    Display tampil1 = new Display("Monitor", null);
    Display tampil2 = new Display("LCD", null);

    //Menampilkan Static atau class attribute
    System.out.println("\nMenampilkan Static Attribute");
    System.out.println(tampil1.type);
    System.out.println(tampil2.type);
    System.out.println(Display.type);


    }
}