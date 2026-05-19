public class Rekening {
	private String namaPemilik;
	private String nomorRekening;
	private double saldo;
	
	public Rekening() {
		namaPemilik = "Muhammad Syarifuddin";
		nomorRekening = "621801028632539";
		saldo = 0;
	}
	
	public String toString() {
		return ("Nama : "+namaPemilik+"\nnomor : "+nomorRekening+"\nsaldo : "+saldo);
	}
	
	public void setor(double jumlah) {
		if (jumlah > 0) {
			saldo+=jumlah;
			System.out.println("[*] Berhasil menambah saldo " + jumlah);
		} else {
			System.out.println("[] Gagal menambah saldo");
		}
	}
	
	public void tarikSaldo(double jumlah) {
		if (jumlah > 0 && jumlah <= saldo ) {
			saldo-=jumlah;
			System.out.println("[*] Berhasil menarik saldo " + jumlah);
		} else {
			System.out.println("[] Gagal menarik karena saldo tidak mencukupi");
		}
	}
}
