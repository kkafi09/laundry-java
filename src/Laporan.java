public class Laporan {

    public void laporan(Client client) {
        int cl = client.getJumlahClient();
        System.out.println("\n=======Tabel Nama client=======");
        System.out.println("No. Nama \tAlamat \t\tNo. Telp \t\tSaldo");
        for (int i = 0; i < cl; i++) {
            System.out.println(i + 1 + "\t" + client.getNamaClient(i) + "\t" + client.getAlamat(i) + "\t" + client.getTelepon(i) + "\t" + client.getSaldo(i));
        }
    }

    public void laporan(Petugas petugas) {
        int pt = petugas.getJumlahPetugas();
        System.out.println("\n=======Tabel Nama Petugas=======");
        System.out.println("No. Nama \t\tAlamat \t\tNo. Telp \t\tJabatan");
        for (int i = 0; i < pt; i++) {
            System.out.println(i + 1 + "\t" + petugas.getNamaPetugas(i) + "\t" + petugas.getAlamat(i) + "\t" + petugas.getTelepon(i) + "\t" + petugas.getJabatan(i));
        }
    }

    public void laporan(jenisLaundry laundry) {
        int ldy = laundry.getJumlahJenisLaundry();
        System.out.println("\n=======Tabel Jenis Laundry=======");
        System.out.println("No. Jenis Laundry \tharga \tdurasi");
        for (int i = 0; i < ldy; i++) {
            System.out.println(i + 1 + "\t" + laundry.getJenisLaundry(i) + "\t\t\t" + laundry.getHarga(i) + "\t" + laundry.getDurasi(i));
        }
    }

    public void laporan(Transaksi transaksi, jenisLaundry laundry, Client client) {
        int trsk = transaksi.getJumlahTransaksi();

        System.out.println("\n=======Transaksi yang terjadi=======");
        System.out.println("No. Nama \tJenis laundry \tBerat \tharga \tdurasi \ttotal");
        for (int i = 0; i < trsk; i++) {
            System.out.println(i + 1 + "\t" + client.getNamaClient(i) + "\t" + laundry.getJenisLaundry(i) + "\t\t\t" + transaksi.getBanyak(i) + "\t\t" + laundry.getHarga(i) + "\t" + laundry.getDurasi(i) + "\t\t" + (laundry.getHarga(i) * transaksi.getBanyak(i)));
        }
    }
}
