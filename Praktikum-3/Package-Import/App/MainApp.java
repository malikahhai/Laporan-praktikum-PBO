package App;

// import kelas dari package Hewan
import Hewan.Kucing;
import Hewan.Anjing;

public class MainApp {
    public static void main(String[] args) {
        Kucing k = new Kucing("Kitty");
        Anjing a = new Anjing("Doggy");

        k.suara();
        a.suara();
    }
}
