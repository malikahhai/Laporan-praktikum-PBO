 class Mobil extends Kendaraan {
    public Mobil(String nama, int kecepatan) {
        super(nama, kecepatan);
    }

    @Override
    public void jalan() {
        System.out.println("Mobil " + nama + " melaju di jalan raya dengan kecepatan " + kecepatan + " km/jam.");
    }
}
    

