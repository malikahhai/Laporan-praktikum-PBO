import java.util.ArrayList;
import java.util.HashMap;

public class Gabungan {
    public static void main(String[] args) {
        // Array biasa
        String[] jurusan = {"Teknik Informatika", "Sistem Informasi", };

        // ArrayList (List of Mahasiswa)
        ArrayList<String> mahasiswa = new ArrayList<>();
        mahasiswa.add("Malikah");
        mahasiswa.add("Cania");
        mahasiswa.add("Ghinaa");

        // HashMap (key = nama, value = umur)
        HashMap<String, Integer> umur = new HashMap<>();
        umur.put("Malikah", 20);
        umur.put("Cania", 22);
        umur.put("Ghinaa", 19);

        // Output
        System.out.println("=== Jurusan (Array) ===");
        for (String j : jurusan) {
            System.out.println(j);
        }

        System.out.println("\n=== Mahasiswa (ArrayList) ===");
        for (String m : mahasiswa) {
            System.out.println(m);
        }

        System.out.println("\n=== Data Umur (HashMap) ===");
        umur.forEach((nama, u) -> {
            System.out.println(nama + " berumur " + u + " tahun");
        });
    }
}
