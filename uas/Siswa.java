public class Siswa {
    private String nis;
    private String nama;
    private String alamat;
    private String kelas;

    public Siswa(String nis, String nama, String alamat, String kelas) {
        this.nis = nis;
        this.nama = nama;
        this.alamat = alamat;
        this.kelas = kelas;
    }

    public String getNis() { return nis; }
    public String getNama() { return nama; }
    public String getAlamat() { return alamat; }
    public String getKelas() { return kelas; }
    public void setNama(String nama) { this.nama = nama; }
    public void setKelas(String kelas) { this.kelas = kelas; }
    public void setAlamat(String alamat) { this.alamat = alamat; }

    public void tampilInfo() {
        System.out.println("NIS    : " + nis);
        System.out.println("Nama   : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Kelas  : " + kelas);
    }
}
