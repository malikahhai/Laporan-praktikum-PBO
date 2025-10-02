package HierarchicalInheritance;

public class HierarchicalMain {
    public static void main(String[] args) {
        Guru guru = new Guru("SMA Negeri 1 Gegesik");
        Siswa siswa = new Siswa("SMA Negeri 1 Gegesik");

        guru.belajar();        // dari superclass Sekolah
        guru.mengajar();       // method khusus Guru

        siswa.belajar();       // dari superclass Sekolah
        siswa.mengerjakanTugas(); // method khusus Siswa
    }
}