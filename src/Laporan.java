public class Laporan {

    public void laporan(Client client){
        int cl = client.getJumlahClient();
        System.out.println("Tabel Nama client ");
        System.out.println("Nama \t Alamat \t No. Telp \t Saldo");
        for (int i = 0; i < cl; i++) {
            System.out.println(client.getNamaClient(i) + "\t" + client.getAlamat(i) + "\t" + client.getTelepon(i) + "\t" + client.getSaldo(i));
        }
    }

    public void laporan(Petugas petugas){
        int pt = petugas.getJumlahPetugas();
        System.out.println("Tabel Nama Petugas");
        System.out.println("Nama \t Alamat \t No. Telp \t Saldo");
        for (int i = 0; i < pt; i++) {
            System.out.println(petugas.getNamaPetugas(i) + "\t" + petugas.getAlamat(i) + "\t" + petugas.getTelepon(i) + "\t" + petugas.getJabatan(i));
        }
    }

    public void laporan(jenisLaundry laundry){
        int ldy = laundry.getJumlahJenisLaundry();
        System.out.println("Tabel Jenis Laundry");
        System.out.println("Jenis Laundry \t harga \t durasi");
        for (int i = 0; i < ldy; i++) {
            System.out.println(laundry.getJenisLaundry(i) + "\t" + laundry.getHarga(i) + "\t" + laundry.getDurasi(i));
        }
    }

    public void laporan(Transaksi transaksi, jenisLaundry laundry, Client client){
        int trsk = transaksi.getJumlahTransaksi();

        System.out.println("Transaksi yang terjadi");
        System.out.println("Nama \t Jenis laundry \t harga \t durasi \t total");
        for (int i = 0; i < trsk; i++) {
            System.out.println(client.getNamaClient(i) + "\t" + laundry.getJenisLaundry(i) + "\t" + transaksi.getBanyak(i) + "\t" + laundry.getHarga(i) + "\t" + laundry.getDurasi(i) + "\t" + (laundry.getHarga(i) * transaksi.getBanyak(i)));
        }
    }
}
