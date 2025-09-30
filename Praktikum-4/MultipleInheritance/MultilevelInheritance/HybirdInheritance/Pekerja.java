package MultipleInheritance.MultilevelInheritance.HybirdInheritance;

public class Pekerja extends Manusia {
    protected String pekerjaan;

    public Pekerja(String nama, String pekerjaan) {
        super(nama); // panggil constructor Manusia
        this.pekerjaan = pekerjaan;
    }

    public void bekerja() {
        System.out.println(nama + " bekerja sebagai " + pekerjaan);
    }
}

