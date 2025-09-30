package MultipleInheritance.MultilevelInheritance;

public class MobilSport extends Mobil {
    private int topSpeed;

    public MobilSport(String merk, int jumlahPintu, int topSpeed) {
        super(merk, jumlahPintu); // panggil constructor Mobil
        this.topSpeed = topSpeed;
    }

    public void turbo() {
        System.out.println(merk + " mengaktifkan turbo! Kecepatan: " + topSpeed + " km/h");
    }
}

