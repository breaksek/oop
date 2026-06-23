import java.util.ArrayList;

public class Sekolah implements KelolaData {

    private String namaSekolah;
    private ArrayList<Siswa> daftarSiswa;

    public Sekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
        daftarSiswa = new ArrayList<>();
    }

    @Override
    public void tambahSiswa(Siswa siswa) {
        daftarSiswa.add(siswa);
    }

    @Override
    public void ubahSiswa(String nis, String namaBaru) {
        boolean ditemukan = false;
        for (Siswa s : daftarSiswa) {
            if (s.getNis().equals(nis)) {
                s.setNama(namaBaru); 
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Siswa dengan NIS " + nis + " tidak ditemukan.");
        }
    }

    @Override
    public void hapusSiswa(String nis) {
        boolean berhasilHapus = daftarSiswa.removeIf(s -> s.getNis().equals(nis));
        if (!berhasilHapus) {
            System.out.println("Siswa dengan NIS " + nis + " tidak ditemukan.");
        }
    }

    @Override
    public void tampilSemuaSiswa() {
        System.out.println("\nData Siswa " + namaSekolah);
        if (daftarSiswa.isEmpty()) {
            System.out.println("Belum ada data siswa.");
            return;
        }
        for (Siswa s : daftarSiswa) {
            s.tampilInfo();
        }
    }
}
