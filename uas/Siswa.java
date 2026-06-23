public class Siswa extends Orang {

    private String nis;
    private String kelas;

    public Siswa(String nis, String nama, String alamat, String kelas) {
        super(nama, alamat);
        this.nis = nis;
        this.kelas = kelas;
    }

    public String getNis() {
        return nis;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

/*
    public void setNama(String nama){
        this.nama = nama;
    }
*/

    @Override
    public void tampilInfo() {
        System.out.println(
            "NIS : " + nis +
            ", Nama : " + getNama() +
            ", Kelas : " + kelas +
            ", Alamat : " + getAlamat()
        );
    }
}
