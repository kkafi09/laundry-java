public class Laporan {

    public void laporan(Client client){
        int cl = client.getJumlahClient();
        System.out.println("Tabel Nama client ");
        System.out.println("Nama \t Alamat \t No. Telp \t Saldo");
        for (int i = 0; i < cl; i++) {
            System.out.println(client.getNamaClient(i) + "\t" + client.getAlamat(i) + "\t" + client.getTelepon(i) + "\t" + client.getSaldo(i));
        }
    }

    public void laporan(jenisLaundry laundry){
        int ldy = laundry.getJumlahJenisLaundry();
        System.out.println("Tabel Jenis Laundry");
        System.out.println("");
    }

    public void laporan(Transaksi transaksi, jenisLaundry laundry){

    }
}
