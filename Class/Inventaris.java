package Class;

import java.util.ArrayList;

import Helper.MyHelper;

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
            System.out.println(produk.displayInfo());
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