public class Main{
	public static void main(String[] args){
		Mobil mobil = new Mobil("Toyota", 2023, 230.0, 3);
		Motor motor = new Motor("Honda", 2024, 170.0, "CBR");
		
		mobil.setJumlahPintu(4);
		motor.setJenisMotor("Sport");
		
		mobil.tampilkanInfo();
		motor.tampilkanInfo();
	}
}
