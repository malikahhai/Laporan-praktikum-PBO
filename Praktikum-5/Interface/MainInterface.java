public class MainInterface {
    public static void main(String[] args) {
        Pembayaran p1 = new Gopay(50000);
        Pembayaran p2 = new OVO(30000);
        Pembayaran p3 = new Dana(10000);

        p1.cekSaldo();
        p1.bayar(20000);
        p1.cekSaldo();

        p2.cekSaldo();
        p2.bayar(40000);

        p3.cekSaldo();
        p3.bayar(5000);
        p3.cekSaldo();
    }
}