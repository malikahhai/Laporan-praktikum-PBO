 // Class Main

public class MainEncapsulation {
       public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Malikah", 19);

        // Mengakses data lewat getter
        System.out.println("Nama: " + mhs.getNama());
        System.out.println("Umur: " + mhs.getUmur());

        // Mengubah data lewat setter
        mhs.setNama("Haibah");
        mhs.setUmur(16); // tidak valid, akan muncul pesan
        mhs.setUmur(20); // valid

        System.out.println("\nData terbaru:");
        System.out.println("Nama: " + mhs.getNama());
        System.out.println("Umur: " + mhs.getUmur());
    }
}

    

