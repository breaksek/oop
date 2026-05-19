public class Mobil extends Kendaraan{
	private int jumlahPintu;
	
	public Mobil(String merk, int tahun, double kecepatan, int jumlahPintu){
		super(merk, tahun, kecepatan);
		this.jumlahPintu = jumlahPintu;
	}
	
	public int getJumlahPintu(){
		return jumlahPintu;
	}
	
	public void setJumlahPintu(int jumlahPintu){
		if (jumlahPintu != 0){
			this.jumlahPintu = jumlahPintu;
		} else {
			System.out.println("Jumlah pintu belum ditentukan!");
		}
	}
	
	@Override
	public void tampilkanInfo(){
		System.out.println("=== DATA MOBIL ===");
		super.tampilkanInfo();
		System.out.println("Jenis Pintu   : " + getJumlahPintu());
	}
}