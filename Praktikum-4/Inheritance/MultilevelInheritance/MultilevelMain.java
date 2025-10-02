package MultipleInheritance.MultilevelInheritance;

public class MultilevelMain {
    public static void main(String[] args) {
        MobilSport ferrari = new MobilSport("Ferrari", 2, 350);

        ferrari.jalan();    // method dari Kendaraan
        ferrari.klakson();  // method dari Mobil
        ferrari.turbo();    // method dari MobilSport
    }
}

