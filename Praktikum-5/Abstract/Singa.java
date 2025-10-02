class Singa extends Hewan {
    public Singa(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " mengaum: Roaaarrr!");
    }
}