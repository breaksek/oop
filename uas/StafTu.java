public class StafTu implements KelolaData {
    private String nip;
    private String namaStaf;

    public StafTu(String nip, String namaStaf) {
        this.nip = nip;
        this.namaStaf = namaStaf;
    }

    @Override
    public void tambahSiswa(Sekolah sekolah, Siswa siswa) {
        sekolah.getDaftarSiswa().add(siswa);
        System.out.println("Staf " + namaStaf + " berhasil menambahkan siswa: " + siswa.getNama());
    }

    @Override
    public void ubahSiswa(Sekolah sekolah, String nis, Siswa siswaBaru) {
        boolean ditemukan = false;
        for (int i = 0; i < sekolah.getDaftarSiswa().size(); i++) {
            Siswa s = sekolah.getDaftarSiswa().get(i);
            if (s.getNis().equals(nis)) {
                sekolah.getDaftarSiswa().set(i, siswaBaru);
                System.out.println("Staf " + namaStaf + " berhasil memperbarui keseluruhan data siswa dengan NIS: " + nis);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Data siswa dengan NIS " + nis + " tidak ditemukan.");
        }
    }

    @Override
    public void hapusSiswa(Sekolah sekolah, String nis) {
        boolean ditemukan = false;
        for (int i = 0; i < sekolah.getDaftarSiswa().size(); i++) {
            if (sekolah.getDaftarSiswa().get(i).getNis().equals(nis)) {
                System.out.println("Staf " + namaStaf + " menghapus siswa: " + sekolah.getDaftarSiswa().get(i).getNama());
                sekolah.getDaftarSiswa().remove(i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) System.out.println("Siswa tidak ditemukan.");
    }

    @Override
    public void tampilSemuaSiswa(Sekolah sekolah) {
        System.out.println("=== DAFTAR SISWA DI " + sekolah.getNamaSekolah().toUpperCase() + " ===");
        if (sekolah.getDaftarSiswa().isEmpty()) {
            System.out.println("Belum ada data siswa.");
        } else {
            for (Siswa s : sekolah.getDaftarSiswa()) {
                s.tampilInfo();
                System.out.println("--------------------");
            }
        }
    }
}
