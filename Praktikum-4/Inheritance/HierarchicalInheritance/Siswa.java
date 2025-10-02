package HierarchicalInheritance;

public class Siswa extends Sekolah {
    public Siswa(String namaSekolah) {
        super(namaSekolah);
    }

    public void mengerjakanTugas() {
        System.out.println("Siswa sedang mengerjakan tugas di " + namaSekolah);
    }
}
