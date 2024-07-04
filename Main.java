import java.util.Scanner;

import Class.Inventaris;
import Class.Keranjang;
import Class.Pesanan;
import Class.Produk;

// Class Main
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventaris inventaris = new Inventaris();
        Keranjang keranjang = new Keranjang();

        // Tambahkan beberapa produk ke inventaris
        inventaris.tambahProduk(new Produk(1, "Laptop Ideapad Slim 5 Pro", 9500000, 3));
        inventaris.tambahProduk(new Produk(2, "Keyboard DA Meca 6X Plus ", 500000, 10));
        inventaris.tambahProduk(new Produk(3, "Monitor Lenovo G34w-30 WQHD", 6000000, 2));

        boolean running = true;
        while (running) {
            try {
                System.out.println("╔═══════════════════════════════════╗");
                System.out.println("║               Menu                ║");
                System.out.println("╠═══════════════════════════════════╣");
                System.out.println("║ 1. Tampilkan Daftar Produk        ║");
                System.out.println("║ 2. Tambah Produk ke Keranjang     ║");
                System.out.println("║ 3. Lihat Produk di Keranjang      ║");
                System.out.println("║ 4. Hapus Produk dari Keranjang    ║");
                System.out.println("║ 5. Proses Pembayaran              ║");
                System.out.println("║ 6. Keluar                         ║");
                System.out.println("╚═══════════════════════════════════╝");

                System.out.print("Pilih opsi menu: ");
                int pilihan = scanner.nextInt();

                switch (pilihan) {
                    case 1:
                        // Menampilkan daftar produk
                        inventaris.tampilkanProduk();
                        break;
                    case 2:
                        // Menambahkan produk ke keranjang
                        System.out.print("Masukkan ID Produk: ");
                        int idProduk = scanner.nextInt();

                        // Menemukan record produk dari inventaris berdasarkan ID
                        Produk produk = inventaris.getProdukById(idProduk);

                        System.out.print("Masukkan jumlah: ");

                        int jumlah = scanner.nextInt();
                        if (jumlah <= produk.getStok()) {
                            // Tambahkan pesanan ke keranjang
                            keranjang.tambahPesanan(new Pesanan(idProduk, produk, jumlah));

                            // Kurangi stok pada produk
                            produk.kurangiStok(jumlah);

                            System.out.println("Produk telah ditambahkan ke keranjang.");
                        } else {
                            System.out.println("Stok tidak mencukupi.");
                        }
                        break;
                    case 3:
                        // Menampilkan isi keranjang
                        keranjang.tampilkanKeranjang();
                        break;
                    case 4:
                        // Menghapus pesanan dari keranjang
                        break;
                    case 5:
                        // Memproses pembayaran
                        break;
                    case 6:
                        // Keluar dari program
                        running = false;
                        break;
                    default:
                        System.out.println("Opsi tidak valid.");
                        break;
                }
            } catch (Exception e) {
                // Penanganan kesalahan
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                scanner.next(); // Membersihkan input yang salah
            }
        }

        scanner.close();
    }
}
