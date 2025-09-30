import java.util.Scanner;

// Custom Exception
class UmurTidakValidException extends Exception {
    public UmurTidakValidException(String pesan) {
        super(pesan);
    }
}

public class CekUmurMahasiswa {

    // Method yang bisa melempar exception → pakai "throws"
    public static void cekUmur(int umur) throws UmurTidakValidException {
        if (umur < 18) {
            // Lempar exception manual → pakai "throw"
            throw new UmurTidakValidException("Umur kurang dari 18 tahun! Tidak boleh daftar.");
        }
        System.out.println("Umur valid. Pendaftaran berhasil!");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {   // blok try → kode yang berpotensi error
            System.out.print("Masukkan umur mahasiswa: ");
            int umur = input.nextInt();

            cekUmur(umur);   // method ini bisa lempar exception
        } 
        catch (UmurTidakValidException e) {   // blok catch → menangkap exception
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } 
        catch (Exception e) {  // bisa ada multiple catch
            System.out.println("Error lain: " + e.getMessage());
        } 
        finally {   // blok finally → selalu dijalankan
            System.out.println("Program selesai dieksekusi.");
            input.close();
        }
    }
}
