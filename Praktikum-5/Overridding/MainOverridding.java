public class MainOverridding {
    public static void main(String[] args) {
        KendaraanOvrd k1 = new KendaraanOvrd("Umum", 40);
        KendaraanOvrd k2 = new MobilOvrd("Avanza", 80);
        KendaraanOvrd k3 = new MotorOvrd("Vario", 60);

        int jarak = 10; // km

        System.out.println("Biaya perjalanan " + k1.nama + " : Rp " + k1.biayaPerjalanan(jarak));
        System.out.println("Biaya perjalanan " + k2.nama + " : Rp " + k2.biayaPerjalanan(jarak));
        System.out.println("Biaya perjalanan " + k3.nama + " : Rp " + k3.biayaPerjalanan(jarak));
    }
    
}
