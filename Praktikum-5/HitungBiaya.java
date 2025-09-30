public class HitungBiaya {
    
     // Property
    int tarifDasar = 5000;
    double tarifKhusus = 4500.5;

    // Overloading method hitung

    // 1. Hitung biaya perjalanan (jarak integer)
    public int hitung(int jarak) {
        return jarak * tarifDasar;
    }

    // 2. Hitung biaya perjalanan (jarak double)
    public double hitung(double jarak) {
        return jarak * tarifKhusus;
    }

    // 3. Hitung biaya perjalanan (jarak integer + tol)
    public int hitung(int jarak, int tol) {
        return (jarak * tarifDasar) + tol;
    }
}


