public class SiswaReguler extends Siswa {
    private double biayaSpp;

    public SiswaReguler(String nis, String nama, String alamat, String kelas, double biayaSpp) {
        super(nis, nama, alamat, kelas);
        this.biayaSpp = biayaSpp;
    }

    public double getBiayaSpp() { return biayaSpp; }
    public void setBiayaSpp(double biayaSpp) { this.biayaSpp = biayaSpp; }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Status : Siswa Reguler");
        System.out.println("Biaya SPP: Rp " + biayaSpp);
    }
}
