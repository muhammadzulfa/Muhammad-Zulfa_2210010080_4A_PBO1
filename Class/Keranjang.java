package Class;

import java.util.ArrayList;

import Helper.MyHelper;

// Class Keranjang
public class Keranjang {
    private ArrayList<Pesanan> daftarPesanan;

    // Konstruktor
    public Keranjang() {
        daftarPesanan = new ArrayList<>();
    }

    // Menambahkan pesanan ke keranjang
    public void tambahPesanan(Pesanan pesanan) {
        // Looping semua record yang ada di pesanan
        for (Pesanan p : daftarPesanan) {
            // Apabila sudah ada pesanan di keranjang maka cukup perbarui jumlah saja
            if (p.getProduk().getId() == pesanan.getProduk().getId()) {
                p.tambahJumlah(pesanan.getJumlah());

                return;
            }
        }

        daftarPesanan.add(pesanan);
    }

    // Menampilkan isi keranjang
    public void tampilkanKeranjang() {
        if (daftarPesanan.isEmpty()) {
            System.out.println("Keranjang sedang kosong.");
        } else {
            for (Pesanan pesanan : daftarPesanan) {
                System.out.println("ID: " + pesanan.getId() +
                        ", Nama Produk: " + pesanan.getProduk().getNama() +
                        ", Jumlah: " + pesanan.getJumlah() +
                        ", Total Harga: " + MyHelper.formatIDR(pesanan.getTotalHarga()));
            }
        }
    }

    // Menghapus pesanan dari keranjang
    public Boolean hapusPesanan(int id) {
        /*
         * Method ini akan mengembalikan antara nilai true atau false
         * True = record ditemukan dan berhasil dihapus
         * False = record tidak ditemukan
         */

        boolean found = false;
        for (Pesanan pesanan : daftarPesanan) {
            if (pesanan.getId() == id) {
                found = true;
                daftarPesanan.remove(pesanan);
                return true;
            }
        }

        if (!found) {
            return false;
        }

        return null; // Hanya sebagai fallback, ini seharusnya tidak pernah tercapai
    }

    // Menghapus seluruh pesanan dari keranjang
    public void hapusSeluruhPesanan() {
        daftarPesanan.clear();
    }

    // Menghitung total harga dari seluruh pesanan
    public double hitungTotalHarga() {
        double total = 0;
        for (Pesanan pesanan : daftarPesanan) {
            total += pesanan.getTotalHarga();
        }

        return total;
    }

    // Menghitung total array pesanan
    @SuppressWarnings("unused")
    public int count() {
        int count = 0;
        for (Pesanan pesanan : daftarPesanan) {
            count += 1;
        }

        return count;
    }
}
