class Dana implements Pembayaran {
    private int saldo;

    public Dana(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public void bayar(int jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Pembayaran Rp " + jumlah + " menggunakan Dana berhasil.");
        } else {
            System.out.println("Saldo Dana tidak cukup!");
        }
    }

    @Override
    public void cekSaldo() {
        System.out.println("Saldo Dana: Rp " + saldo);
    }
}