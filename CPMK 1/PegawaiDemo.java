public class PegawaiDemo{
	public static void main(String[] args){
		
		// Objek Pegawai Tetap
		PegawaiTetap hartono = new PegawaiTetap("Hartono", "IT Support", 3000000, 4000000);
		// Objek Pegawai Kontrak
		PegawaiKontrak kartini = new PegawaiKontrak("Kartini", "Tim MBG", 300000, 30);
		// Bonus Pegawai Kontrak Lembur 4 jam
		kartini.getBonus(4);
		
		System.out.println(hartono);
		System.out.println();
		System.out.println(kartini);
	}
}