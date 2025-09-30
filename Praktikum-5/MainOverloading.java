public class MainOverloading {
    public static void main(String[] args) {
        HitungBiaya hb = new HitungBiaya();

        // Contoh perhitungan
        System.out.println("Biaya (jarak int 10 km): Rp " + hb.hitung(10));
        System.out.println("Biaya (jarak double 12.5 km): Rp " + hb.hitung(12.5));
        System.out.println("Biaya (jarak 10 km + tol Rp 15.000): Rp " + hb.hitung(10, 15000));
    }
    
}
