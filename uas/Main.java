import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static Sekolah sekolah = new Sekolah("SMK NURIS JEMBER");

    public static void main(String[] args) {
        int pilih;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Tambah Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar\n");

            System.out.print("Pilih : ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    sekolah.tampilSemuaSiswa();
                    break;
                case 2:
                    tambahData();
                    break;
                case 3:
                    ubahData();
                    break;
                case 4:
                    hapusData();
                    break;
                case 5:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }
        } while (pilih != 5);
    }

    static void tambahData() {
        System.out.println("\n--- Tambah Data Siswa ---");
        System.out.print("NIS    : ");
        String nis = input.nextLine();
        System.out.print("Nama   : ");
        String nama = input.nextLine();
        System.out.print("Alamat : ");
        String alamat = input.nextLine();
        System.out.print("Kelas  : ");
        String kelas = input.nextLine();

        Siswa siswaBaru = new SiswaAktif(nis, nama, alamat, kelas);
        sekolah.tambahSiswa(siswaBaru);
        System.out.println("Siswa berhasil ditambahkan!");
    }

    static void ubahData() {
        System.out.println("\n--- Ubah Data Siswa ---");
        System.out.print("Masukkan NIS Siswa yang akan diubah: ");
        String nis = input.nextLine();
        System.out.print("Masukkan Nama Baru: ");
        String namaBaru = input.nextLine();

        sekolah.ubahSiswa(nis, namaBaru);
        System.out.println("Proses pembaruan data selesai.");
    }

    static void hapusData() {
        System.out.println("\n--- Hapus Data Siswa ---");
        System.out.print("Masukkan NIS Siswa yang akan dihapus: ");
        String nis = input.nextLine();

        sekolah.hapusSiswa(nis);
        System.out.println("Proses penghapusan data selesai.");
    }
}
