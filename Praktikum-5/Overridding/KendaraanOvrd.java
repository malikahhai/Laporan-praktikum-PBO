public class KendaraanOvrd {
    String nama;
    int kecepatan;

    public KendaraanOvrd(String nama, int kecepatan) {
        this.nama = nama;
        this.kecepatan = kecepatan;
    }

    public int biayaPerjalanan(int jarak) {
        return jarak * 4000; // default biaya
    }
}
    

