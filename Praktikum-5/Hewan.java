abstract class Hewan {
    String nama;
    int umur;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // concrete method (sudah ada isi)
    public void makan() {
        System.out.println(nama + " sedang makan...");
        }
        // abstract method (wajib di-override)
    public abstract void bersuara();
}
    
    