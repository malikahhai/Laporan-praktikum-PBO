public class MobilTest {
    
    public static void main(String[] args) {
        Mobil mobil = new Mobil ("Toyota");
        Sedan sedan1 = new Sedan("BMW");
        Truck truck1 = new Truck("Hino Dutro");

        mobil.melaju();
        sedan1.melaju();
        truck1.melaju();
    }
}