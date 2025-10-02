package MultipleInheritance.MultilevelInheritance.HybirdInheritance;

public class Programmer extends Pekerja implements Musisi {
    private String bahasa;

    public Programmer(String nama, String pekerjaan, String bahasa) {
        super(nama, pekerjaan); // panggil constructor Pekerja
        this.bahasa = bahasa;
    }

    public void coding() {
        System.out.println(nama + " sedang coding dengan bahasa " + bahasa);
    }

    @Override
    public void mainMusik() {
        System.out.println(nama + " juga pandai bermain musik!");
    }
}
