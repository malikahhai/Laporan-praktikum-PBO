public class MainAbstrak {
    public static void main(String[] args) {
        Hewan h1 = new Singa("Simba", 5);
        Hewan h2 = new Gajah("Dumbo", 10);

        h1.makan();
        h1.bersuara();

        h2.makan();
        h2.bersuara();
    }
}