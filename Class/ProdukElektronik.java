package Class;

// Class ProdukElektronik
public class ProdukElektronik extends Produk {
    protected int garansi; // dalam bulan

    // Konstruktor
    public ProdukElektronik(int id, String nama, double harga, int stok, int garansi) {
        super(id, nama, harga, stok);
        this.garansi = garansi;
    }

    // Acessor
    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Garansi: " + garansi + " bulan";
    }
}
