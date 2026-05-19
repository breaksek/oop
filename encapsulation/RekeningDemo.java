public class RekeningDemo {
    public static void main(String[] args) {
		
        Rekening akun = new Rekening();
		System.out.println("AKUN REKENING ANDA");
        System.out.println(akun.toString());
		
		System.out.println("\nMenambah saldo sejumlah : 5000");
		akun.setor(0);
		System.out.println("Menambah saldo selesai");
		System.out.println(akun.toString());
		
		System.out.println("\nMenarik saldo sejumlah : 3000");
		akun.tarikSaldo(3000);
		System.out.println("Menarik saldo selesai");
		System.out.println(akun.toString());
	}
	
}