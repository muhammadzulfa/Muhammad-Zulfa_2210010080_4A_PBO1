package Class;

// Class ProdukPakaian
public class ProdukPakaian extends Produk {
    protected String ukuran; // dalam bulan

    // Konstruktor
    public ProdukPakaian(int id, String nama, double harga, int stok, String ukuran) {
        super(id, nama, harga, stok);
        this.ukuran = ukuran;
    }

    // Acessor
    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Ukuran: " + ukuran;
    }
}
