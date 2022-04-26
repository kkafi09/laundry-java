import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi {

    ArrayList<Integer> idClient = new ArrayList<>();
    ArrayList<Integer> idJenisLaundry = new ArrayList<>();
    ArrayList<Integer> banyak = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int globalTemp = 0;

    public int getJumlahTransaksi(){
        return idClient.size();
    }

    public void inputTransaksi(Client client, jenisLaundry laundry) {
        System.out.println("SELAMAT DATANG DI LAUNDRY");
        System.out.print("Masukkan ID Client : ");
        int idClientTemp = scanner.nextInt();
        System.out.println("Nama Client = " + client.getNamaClient(idClientTemp));
        System.out.print("Masukkan ID Jenis Laundry : ");
        int idJenisTemp = scanner.nextInt();
        System.out.println("Jenis Laundry yang anda pilih = " + laundry.getJenisLaundry(idJenisTemp));
        System.out.print("Masukkan berat laundry : ");
        int idBeratTemp = scanner.nextInt();

        this.idClient.add(idClientTemp);
        this.idJenisLaundry.add(idJenisTemp);
        this.banyak.add(idBeratTemp);
    }

    public int getBanyak(int id){
        return this.banyak.get(id);
    }

    public void prosesTransaksi(Client client, jenisLaundry laundry) {
        System.out.println("\n=======PROSES LAUNDRY=======");
        System.out.println("Nama          : " + client.getNamaClient(idClient.get(0)));
        System.out.println("Alamat        : " + client.getAlamat(idClient.get(0)));
        System.out.println("Telepon       : " + client.getTelepon(idClient.get(0)));
        System.out.println("Saldo         : " + client.getSaldo(idClient.get(0)));
        System.out.println("Jenis Laundry : " + laundry.getJenisLaundry(idJenisLaundry.get(0)));
        System.out.println("Harga         : " + laundry.getHarga(idJenisLaundry.get(0)) * banyak.get(0));
        System.out.println("Durasi        : " + laundry.getDurasi(idJenisLaundry.get(0)));

        globalTemp = client.getSaldo(idClient.get(0)) - (laundry.getHarga(idJenisLaundry.get(0)) * banyak.get(0));

        System.out.println("Saldo akhir   : " + globalTemp);
        System.out.println("=========TERIMAKASIH=========");
        System.out.println("=TELAH MENGGUNAKAN JASA KAMI=");
    }

    public void start(Client client, Petugas petugas, jenisLaundry laundry, Laporan laporan, Transaksi transaksi) {
        laporan.laporan(client);
        laporan.laporan(petugas);
        laporan.laporan(laundry);
        laporan.laporan(transaksi, laundry, client);

        System.out.println();
        inputTransaksi(client, laundry);
        prosesTransaksi(client, laundry);

        laporan.laporan(transaksi, laundry, client);
    }
}
