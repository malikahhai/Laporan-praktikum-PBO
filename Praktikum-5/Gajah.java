class Gajah extends Hewan {
    public Gajah(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Prrrttt!");
    }
}