package Class;

import java.util.ArrayList;

// Class Inventaris
public class Inventaris {
    private ArrayList<Produk> daftarProduk;

    // Konstruktor
    public Inventaris() {
        daftarProduk = new ArrayList<>();
    }

    // Menambahkan produk ke inventaris
    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    // Menampilkan daftar produk
    public void tampilkanProduk() {
        for (Produk produk : daftarProduk) {
            System.out.println("ID: " + produk.getId() +
                    ", Nama: " + produk.getNama() +
                    ", Harga: " + produk.getHarga()
                    + ", Stok: " + produk.getStok());
        }
    }

    // Mendapatkan produk berdasarkan ID
    public Produk getProdukById(int id) {
        for (Produk produk : daftarProduk) {
            if (produk.getId() == id) {
                return produk;
            }
        }
        return null;
    }
}