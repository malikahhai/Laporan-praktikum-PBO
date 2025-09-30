class OVO implements Pembayaran {
    private int saldo;

    public OVO(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public void bayar(int jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Pembayaran Rp " + jumlah + " menggunakan OVO berhasil.");
        } else {
            System.out.println("Saldo OVO tidak cukup!");
        }
    }

    @Override
    public void cekSaldo() {
        System.out.println("Saldo OVO: Rp " + saldo);
    }
}
