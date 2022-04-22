import java.util.ArrayList;

public class Client {

    ArrayList<String> namaClient = new ArrayList<>();
    ArrayList<String> alamat = new ArrayList<>();
    ArrayList<String> telepon = new ArrayList<>();
    ArrayList<Integer> saldo = new ArrayList<>();

    public Client() {
        this.namaClient.add("Kafi #1");
        this.alamat.add("Indonesia");
        this.telepon.add("085717927900");
        this.saldo.add(100000);

        this.namaClient.add("Kafi #2");
        this.alamat.add("Amerika  ");
        this.telepon.add("085765357900");
        this.saldo.add(250_000);
    }

    public String getNamaClient(int id) {
        return this.namaClient.get(id);
    }

    public void setNamaClient(String namaClient) {
        this.namaClient.add(namaClient);
    }

    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    public String getTelepon(int id) {
        return this.telepon.get(id);
    }

    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    public int getSaldo(int id) {
        return this.saldo.get(id);
    }

    public void setSaldo(int saldo) {
        this.saldo.add(saldo);
    }

    public void editSaldo(int id, int saldo){
        this.saldo.set(id, saldo);
    }

    public int getJumlahClient(){
        return this.namaClient.size();
    }
}
