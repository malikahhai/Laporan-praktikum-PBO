class MotorOvrd extends KendaraanOvrd {
    public MotorOvrd(String nama, int kecepatan) {
        super(nama, kecepatan);
    }

    @Override
    public int biayaPerjalanan(int jarak) {
        return jarak * 3000; // tarif khusus motor
    }
}
