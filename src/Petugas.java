import java.util.ArrayList;

public class Petugas {

    ArrayList<String> namaPetugas = new ArrayList<>();
    ArrayList<String> alamat = new ArrayList<>();
    ArrayList<String> telepon = new ArrayList<>();
    ArrayList<Integer> jabatan = new ArrayList<>();

    public Petugas() {
        this.namaPetugas.add("Petugas #1");
        this.alamat.add("Indonesia");
        this.telepon.add("0812345678900");
        this.jabatan.add(0);

    }

    public String getNamaPetugas(int id) {
        return this.namaPetugas.get(id);
    }

    public void setNamaPetugas(String namaPetugas) {
        this.namaPetugas.add(namaPetugas);
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

    public int getJabatan(int id) {
        return this.jabatan.get(id);
    }

    public void setJabatan(int jabatan) {
        this.jabatan.add(jabatan);
    }

    public void editJabatan(int id, int jabatan){
        this.jabatan.set(id, jabatan);
    }

    public int getJumlahPetugas(){
        return this.namaPetugas.size();
    }
}
