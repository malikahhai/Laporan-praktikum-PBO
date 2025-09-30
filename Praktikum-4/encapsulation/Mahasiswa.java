public class Mahasiswa {
    // variabel dibuat private (data hiding)
    private String nama;
    private int umur;

    // Constructor
    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Getter (mengambil data)
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    // Setter (mengubah data dengan kontrol)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        if (umur >= 17) { // validasi data
            this.umur = umur;
        } else {
            System.out.println("Umur minimal 17 tahun!");
        }
    }
}

    

