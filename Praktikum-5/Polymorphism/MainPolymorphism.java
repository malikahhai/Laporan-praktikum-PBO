public class MainPolymorphism {
    public static void main(String[] args) {
        Kendaraan k1 = new Mobil("Avanza", 80);
        Kendaraan k2 = new Motor("Vario", 60);

        k1.jalan(); // Mobil Avanza melaju di jalan raya dengan kecepatan 80 km/jam.
        k2.jalan(); // Motor Vario melaju di jalur motor dengan kecepatan 60 km/jam.
    }
}