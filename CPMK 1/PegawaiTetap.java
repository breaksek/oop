public class PegawaiTetap extends Pegawai{
	private double tunjangan;
	public PegawaiTetap(String nama, String divisi, double gajiPokok, double tunjangan){
		super(nama, divisi, gajiPokok);
		this.tunjangan = tunjangan;
	}
	
	public double getTunjangan(){return tunjangan;}
	public void setTunjangan(double tunjangan){
		this.tunjangan = tunjangan;
	}
	
	@Override
	public String toString(){
		return "====== DATA PEGAWAI TETAP ======" +
		"\nNama : " + getNama() +
		"\nDivisi : " + getDivisi() +
		"\nGaji Pokok : " + getGajiPokok() +
		"\nTunjangan : " + getTunjangan() ;
	}
}