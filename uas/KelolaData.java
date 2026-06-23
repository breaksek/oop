public interface KelolaData {
    void tambahSiswa(Sekolah sekolah, Siswa siswa);
    void ubahSiswa(Sekolah sekolah, String nis, Siswa siswaBaru);
    void hapusSiswa(Sekolah sekolah, String nis);
    void tampilSemuaSiswa(Sekolah sekolah);
}
