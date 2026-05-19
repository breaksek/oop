public class PegawaiKontrak extends Pegawai{
	
	private int lamaKontrak;
	private int jamLembur;
	
	public PegawaiKontrak(String nama, String divisi, double gajiPokok, int lamaKontrak){
		super(nama, divisi, gajiPokok);
		this.lamaKontrak = lamaKontrak;
	}
	
	public double getLamaKontrak(){return lamaKontrak;}
	public void setLamaKontrak(int lamaKontrak){
		this.lamaKontrak = lamaKontrak;
	}
	
	public double getBonus(int jamLembur){
		this.jamLembur = jamLembur;
		return jamLembur*15000;
	}
	
	@Override
	public String toString(){
		double bonus = getBonus(this.jamLembur);
		double totalGaji = getGajiPokok() + bonus;
		return "====== DATA PEGAWAI KONTRAK ======" +
		"\nNama : " + getNama() +
		"\nDivisi : " + getDivisi() +
		"\nGaji Pokok : " + getGajiPokok() +
		"\nLama Kontrak : " + getLamaKontrak() +
		"\nTotal Gaji :" + totalGaji ;
	}
}