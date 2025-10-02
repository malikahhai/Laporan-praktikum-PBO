package HierarchicalInheritance;

public class Sekolah {
    protected String namaSekolah;

    public Sekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
    }

    public void belajar() {
        System.out.println("Kegiatan belajar berlangsung di " + namaSekolah);
    }
}
    

