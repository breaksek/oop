import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sekolah sekolah = new Sekolah("SMA Negeri 1");
        StafTu tu = new StafTu("19950101", "Budi");
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== SISTEM INFORMASI AKADEMIK ===");
        System.out.println("Selamat Datang, Staf TU: Budi (NIP: 19950101)");
        System.out.println("---------------------------------------------");

        boolean berjalan = true;
        while (berjalan) {
            System.out.println("\nMENU UTAMA KELOLA DATA SISWA:");
            System.out.println("1. Tambah Data Siswa");
            System.out.println("2. Ubah Keseluruhan Data Siswa (via NIS)");
            System.out.println("3. Hapus Data Siswa (via NIS)");
            System.out.println("4. Tampilkan Semua Data Siswa");
            System.out.println("5. Keluar Aplikasi");
            System.out.print("Pilih menu (1-5): ");
            
            int pilihanMenu = input.nextInt();
            input.nextLine(); 

            switch (pilihanMenu) {
                case 1:
                    System.out.println("\n[1] TAMBAH DATA SISWA");
                    System.out.print("Masukkan NIS    : ");
                    String nis = input.nextLine();
                    System.out.print("Masukkan Nama   : ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Alamat : ");
                    String alamat = input.nextLine();
                    System.out.print("Masukkan Kelas  : ");
                    String kelas = input.nextLine();

                    System.out.println("Kategori Jalur Siswa:");
                    System.out.println(" 1. Siswa Reguler");
                    System.out.println(" 2. Siswa Beasiswa");
                    System.out.print("Pilih kategori (1-2): ");
                    int kategori = input.nextInt();
                    input.nextLine(); 

                    if (kategori == 1) {
                        System.out.print("Masukkan Biaya SPP: ");
                        double spp = input.nextDouble();
                        input.nextLine(); 
                        
                        Siswa reguler = new SiswaReguler(nis, nama, alamat, kelas, spp);
                        tu.tambahSiswa(sekolah, reguler);

                    } else if (kategori == 2) {
                        System.out.print("Masukkan Jumlah Beasiswa: ");
                        double beasiswa = input.nextDouble();
                        input.nextLine(); 
                        
                        Siswa penerimaBeasiswa = new SiswaBeasiswa(nis, nama, alamat, kelas, beasiswa);
                        tu.tambahSiswa(sekolah, penerimaBeasiswa);
                    } else {
                        System.out.println("Kategori tidak valid. Penambahan dibatalkan.");
                    }
                    break;

                case 2:
                    System.out.println("\n[2] UBAH KESELURUHAN DATA SISWA");
                    System.out.print("Masukkan NIS siswa yang datanya ingin diubah: ");
                    String nisTarget = input.nextLine();
                    
                    boolean ada = false;
                    for (Siswa s : sekolah.getDaftarSiswa()) {
                        if (s.getNis().equals(nisTarget)) {
                            ada = true;
                            break;
                        }
                    }
                    
                    if (!ada) {
                        System.out.println("Data siswa dengan NIS " + nisTarget + " tidak ditemukan.");
                        break;
                    }

                    System.out.println("\n--- MASUKKAN DATA BARU ---");
                    System.out.print("Masukkan Nama Baru   : ");
                    String namaBaru = input.nextLine();
                    System.out.print("Masukkan Alamat Baru : ");
                    String alamatBaru = input.nextLine();
                    System.out.print("Masukkan Kelas Baru  : ");
                    String kelasBaru = input.nextLine();

                    System.out.println("Kategori Jalur Siswa Baru:");
                    System.out.println(" 1. Siswa Reguler");
                    System.out.println(" 2. Siswa Beasiswa");
                    System.out.print("Pilih kategori (1-2): ");
                    int kategoriBaru = input.nextInt();
                    input.nextLine(); 

                    if (kategoriBaru == 1) {
                        System.out.print("Masukkan Biaya SPP Baru: ");
                        double sppBaru = input.nextDouble();
                        input.nextLine(); 
                        
                        Siswa dataRegulerBaru = new SiswaReguler(nisTarget, namaBaru, alamatBaru, kelasBaru, sppBaru);
                        tu.ubahSiswa(sekolah, nisTarget, dataRegulerBaru);

                    } else if (kategoriBaru == 2) {
                        System.out.print("Masukkan Jumlah Beasiswa Baru: ");
                        double beasiswaBaru = input.nextDouble();
                        input.nextLine(); 
                        
                        Siswa dataBeasiswaBaru = new SiswaBeasiswa(nisTarget, namaBaru, alamatBaru, kelasBaru, beasiswaBaru);
                        tu.ubahSiswa(sekolah, nisTarget, dataBeasiswaBaru);
                    } else {
                        System.out.println("Kategori tidak valid. Perubahan data dibatalkan.");
                    }
                    break;

                case 3:
                    System.out.println("\n[3] HAPUS DATA SISWA");
                    System.out.print("Masukkan NIS siswa yang ingin dihapus: ");
                    String nisHapus = input.nextLine();
                    tu.hapusSiswa(sekolah, nisHapus);
                    break;

                case 4:
                    System.out.println("\n[4] DATA SELURUH SISWA SAAT INI");
                    tu.tampilSemuaSiswa(sekolah);
                    break;

                case 5:
                    System.out.println("Keluar dari aplikasi akademik. Selamat istirahat!");
                    berjalan = false;
                    break;

                default:
                    System.out.println("Pilihan menu salah. Silakan coba lagi.");
            }
        }
        input.close();
    }
}
