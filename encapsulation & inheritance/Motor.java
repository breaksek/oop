public class Motor extends Kendaraan{
	private String jenisMotor;
	
	public Motor(String merk, int tahun, double kecepatan, String jenisMotor){
		super(merk, tahun, kecepatan);
		this.jenisMotor = jenisMotor;
	}
	
	public String getJenisMotor(){
		return jenisMotor;
	}
	
	public void setJenisMotor(String jenisMotor){
		if (jenisMotor != null && !jenisMotor.isEmpty()){
			this.jenisMotor = jenisMotor;
		} else {
			System.out.println("Jenis motor belum ditentukan!");
		}
	}
	
	@Override
	public void tampilkanInfo(){
		System.out.println("=== DATA MOTOR ===");
		super.tampilkanInfo();
		System.out.println("Jenis Motor   : " + getJenisMotor());
	}
}