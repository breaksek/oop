public class SiswaBeasiswa extends Siswa {
    private double jumlahBeasiswa;

    public SiswaBeasiswa(String nis, String nama, String alamat, String kelas, double jumlahBeasiswa) {
        super(nis, nama, alamat, kelas);
        this.jumlahBeasiswa = jumlahBeasiswa;
    }

    public double getJumlahBeasiswa() { return jumlahBeasiswa; }
    public void setJumlahBeasiswa(double jumlahBeasiswa) { this.jumlahBeasiswa = jumlahBeasiswa; }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Status : Siswa Beasiswa");
        System.out.println("Beasiswa: Rp " + jumlahBeasiswa);
    }
}
