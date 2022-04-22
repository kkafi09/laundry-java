import java.util.ArrayList;

public class jenisLaundry {

    ArrayList<String> jenisLaundry = new ArrayList<>();
    ArrayList<Integer> harga = new ArrayList<>();
    ArrayList<Integer> durasi = new ArrayList<>();

    public String getJenisLaundry(int id) {
        return this.jenisLaundry.get(id);
    }

    public void setJenisLaundry(String namaClient) {
        this.jenisLaundry.add(namaClient);
    }

    public int getHarga(int id) {
        return this.harga.get(id);
    }

    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    public int getDurasi(int id) {
        return this.durasi.get(id);
    }

    public void setDurasi(int durasi) {
        this.durasi.add(durasi);
    }

    public void editDurasi(int id, int durasi){
        this.durasi.set(id, durasi);
    }

    public int getJumlahJenisLaundry(){
        return this.jenisLaundry.size();
    }
}
