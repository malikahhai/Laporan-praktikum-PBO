package MultipleInheritance.MultilevelInheritance;

public class Kendaraan {
    protected String merk;

    public Kendaraan(String merk) {
        this.merk = merk;
    }

    public void jalan() {
        System.out.println(merk + " sedang berjalan...");
    }
}

