class Gopay implements Pembayaran {
    private int saldo;

    public Gopay(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public void bayar(int jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Pembayaran Rp " + jumlah + " menggunakan GoPay berhasil.");
        } else {
            System.out.println("Saldo GoPay tidak cukup!");
        }
    }

    @Override
    public void cekSaldo() {
        System.out.println("Saldo GoPay: Rp " + saldo);
    }
}