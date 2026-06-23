import java.util.ArrayList;

public class Sekolah {
    private String namaSekolah;
    private ArrayList<Siswa> daftarSiswa;

    public Sekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
        this.daftarSiswa = new ArrayList<>();
        inisialisasiDataSiswa();
    }

    private void inisialisasiDataSiswa() {
        this.daftarSiswa.add(new SiswaReguler("101", "Andi Wijaya", "Jl. Mawar No. 12", "XI-A", 500000));
        this.daftarSiswa.add(new SiswaReguler("102", "Budi Santoso", "Jl. Melati No. 5", "XI-A", 500000));
        this.daftarSiswa.add(new SiswaReguler("103", "Citra Lestari", "Jl. Dahlia No. 44", "XII-B", 550000));
        this.daftarSiswa.add(new SiswaBeasiswa("104", "Dewi Sartika", "Jl. Kenanga No. 19", "XI-B", 1500000));
        this.daftarSiswa.add(new SiswaBeasiswa("105", "Eko Prasetyo", "Jl. Cempaka No. 3", "XII-A", 2000000));
    }

    public ArrayList<Siswa> getDaftarSiswa() {
        return daftarSiswa;
    }

    public String getNamaSekolah() {
        return namaSekolah;
    }
}
