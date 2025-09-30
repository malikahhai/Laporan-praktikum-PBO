
    class MobilOvrd extends KendaraanOvrd {
    public MobilOvrd(String nama, int kecepatan) {
        super(nama, kecepatan);
    }

    @Override
    public int biayaPerjalanan(int jarak) {
        return jarak * 5000; // tarif khusus mobil
    }
    
}
