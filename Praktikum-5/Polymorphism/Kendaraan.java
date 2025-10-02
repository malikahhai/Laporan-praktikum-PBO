class Kendaraan {
    String nama;
    int kecepatan;

    // Constructor
    public Kendaraan(String nama, int kecepatan) {
        this.nama = nama;
        this.kecepatan = kecepatan;
    }

    public void jalan() {
        System.out.println(nama + " berjalan dengan kecepatan " + kecepatan + " km/jam.");
    }
}