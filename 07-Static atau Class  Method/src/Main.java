import java.util.ArrayList;

class Player {
    private static int numberOfPlayar;
    private static ArrayList<String> nameList = new ArrayList<String>();

    private String name;

    Player (String name){
        this.name = name;
        Player.numberOfPlayar++;
        Player.nameList.add(this.name);
    }

    void show(){
        System.out.println("Nama Player" + this.name);
    }
    static void showaNumberOfPlayer(){
        System.out.println("Number Of Player : " + Player.numberOfPlayar);
    }
    static ArrayList<String> getNames(){
        return Player.nameList;
    }
}



public class Main {
    public static void main(String[] args) throws Exception {
    
    }
}