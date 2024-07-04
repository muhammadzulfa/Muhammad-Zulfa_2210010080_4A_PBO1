package Class;

// Class Produk
public class Produk {
    private int id;
    private String nama;
    private double harga;
    private int stok;

    // Konstruktor
    public Produk(int id, String nama, double harga, int stok) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Accessor
    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Mutator
    public void kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            this.stok -= jumlah;
        }
    }
}