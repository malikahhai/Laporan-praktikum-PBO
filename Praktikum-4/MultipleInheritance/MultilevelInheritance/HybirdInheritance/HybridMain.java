package MultipleInheritance.MultilevelInheritance.HybirdInheritance;

public class HybridMain {
    public static void main(String[] args) {
        Programmer dev = new Programmer("malikah", "Programmer", "Java");

        dev.makan();       // dari Manusia
        dev.bekerja();     // dari Pekerja
        dev.coding();      // dari Programmer
        dev.mainMusik();   // dari Musisi (interface)
    }
}
