package MultipleInheritance.MultilevelInheritance;

public class Mobil extends Kendaraan {
    protected int jumlahPintu;

    public Mobil(String merk, int jumlahPintu) {
        super(merk); // panggil constructor Kendaraan
        this.jumlahPintu = jumlahPintu;
    }

    public void klakson() {
        System.out.println(merk + " membunyikan klakson! Beep Beep!");
    }
}

