package Class;

// Class Pesanan
public class Pesanan {
    private int id;
    private Produk produk;
    private int jumlah;
    private double totalHarga;

    // Konstruktor
    public Pesanan(int id, Produk produk, int jumlah) {
        this.id = id;
        this.produk = produk;
        this.jumlah = jumlah;
        this.totalHarga = produk.getHarga() * jumlah;
    }

    // Accessor
    public int getId() {
        return id;
    }

    public Produk getProduk() {
        return produk;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    // Mutator
    public void tambahJumlah(int jumlah) {
        this.jumlah += jumlah;
        this.totalHarga = this.produk.getHarga() * this.jumlah;
    }
}