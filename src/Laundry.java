public class Laundry {

    public static void main(String[] args) {
        Client client = new Client();
        Petugas petugas = new Petugas();
        Transaksi transaksi = new Transaksi();
        Laporan laporan = new Laporan();
        jenisLaundry laundry = new jenisLaundry();

        transaksi.start(client, petugas, laundry, laporan, transaksi);
    }
}
