public class Pegawai {
	private String nama;
	private String divisi;
	private double gajiPokok;
	
	public Pegawai(){}
	
	public Pegawai(String nama, String divisi, double gajiPokok){
		this.nama = nama;
		this.divisi = divisi;
		this.gajiPokok = gajiPokok;
	}
	
	public String getNama(){return nama;}
	public void setNama(String nama){
		this.nama = nama;
	}
	
	public String getDivisi(){return divisi;}
	public void setDivisi(String divisi){
		this.divisi = divisi;
	}
	
	public double getGajiPokok(){return gajiPokok;}
	public void setGajiPokok(double gajiPokok){
		this.gajiPokok = gajiPokok;
	}
	
	public String toString(){
		return "Nama : " + nama + "\nDivisi : " + divisi + "\nGaji Pokok : " + gajiPokok;
	}
}
