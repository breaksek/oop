public class Kendaraan{
	private String merk;
	private int tahun;
	private double kecepatan;
	
	public Kendaraan(String merk, int tahun, double kecepatan){
		this.merk = merk;
		this.tahun = tahun;
		this.kecepatan = kecepatan;
	}
	
	public String getMerk(){
		return merk;
	}
	
	public void setMerk(String merk){
		this.merk = merk;
	}
	
	public int getTahun(){
		return tahun;
	}
	
	public void setTahun(int tahun){
		this.tahun = tahun;
	}
	
	public double getKecepatan(){
		return kecepatan;
	}
	
	public void setKecepatan(double kecepatan){
		if (kecepatan >= 0){
			this.kecepatan = kecepatan;
		} else {
			System.out.println("Sorry bro! Kecepatan gak boleh kurang dari 0!");
		}
	}
	
	public void tampilkanInfo(){
		System.out.println("Merk          : " + merk + "\nTahun         : " + tahun + "\nKecepatan     : " + kecepatan);
	}
}