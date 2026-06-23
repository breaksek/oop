public class SiswaAktif extends Siswa {

    public SiswaAktif(String nis, String nama,
                      String alamat, String kelas) {
        super(nis, nama, alamat, kelas);
    }

    @Override
    public void tampilInfo() {
        System.out.println("[SISWA AKTIF]");
        super.tampilInfo();
    }
}
