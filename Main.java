
import Class.Inventaris;
import Class.Produk;

// Class Main
public class Main {
    public static void main(String[] args) {
        Inventaris inventaris = new Inventaris();

        // Tambahkan beberapa produk ke inventaris
        inventaris.tambahProduk(new Produk(1, "Laptop Ideapad Slim 5 Pro", 9500000, 3));
        inventaris.tambahProduk(new Produk(2, "Keyboard DA Meca 6X Plus ", 500000, 10));
        inventaris.tambahProduk(new Produk(3, "Monitor Lenovo G34w-30 WQHD", 6000000, 2));

        inventaris.tampilkanProduk();
    }
}
