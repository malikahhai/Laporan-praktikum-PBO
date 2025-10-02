package HierarchicalInheritance;

public class Guru extends Sekolah {
    public Guru(String namaSekolah) {
        super(namaSekolah);
    }

    public void mengajar() {
        System.out.println("Guru sedang mengajar di " + namaSekolah);
    }
}

