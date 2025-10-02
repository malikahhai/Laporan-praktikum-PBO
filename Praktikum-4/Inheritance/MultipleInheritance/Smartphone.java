package MultipleInheritance;

    public class Smartphone implements MusikPlayer, Kamera {
    String merek;

    public void putarMusik() {
        System.out.println(merek + " sedang memutar musik favorit.");
    }

    public void ambilFoto() {
        System.out.println(merek + " sedang mengambil foto dengan kamera HD.");
    }
}

    

