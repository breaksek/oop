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

        for (Siswa s : daftarSiswa) {
            if (s.getNis().equals(nis)) {

                Siswa baru = new Siswa(
                        s.getNis(),
                        namaBaru,
                        s.getAlamat(),
                        s.getKelas());

                daftarSiswa.set(
                    daftarSiswa.indexOf(s),
                    baru
                );

                break;
            }
        }
    }

    @Override
    public void hapusSiswa(String nis) {
        daftarSiswa.removeIf(
            s -> s.getNis().equals(nis)
        );
    }

    @Override
    public void tampilSemuaSiswa() {

        System.out.println(
            "\nData Siswa " + namaSekolah
        );

        for (Siswa s : daftarSiswa) {
            s.tampilInfo();
        }
    }
}
