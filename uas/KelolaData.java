public interface KelolaData {
    void tambahSiswa(Siswa siswa);
    void ubahSiswa(String nis, String namaBaru);
    void hapusSiswa(String nis);
    void tampilSemuaSiswa();
}
