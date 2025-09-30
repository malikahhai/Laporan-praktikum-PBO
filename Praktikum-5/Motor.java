class Motor extends Kendaraan {
    public Motor(String nama, int kecepatan) {
        super(nama, kecepatan);
    }

    @Override
    public void jalan() {
        System.out.println("Motor " + nama + " melaju di jalur motor dengan kecepatan " + kecepatan + " km/jam.");
    }
}