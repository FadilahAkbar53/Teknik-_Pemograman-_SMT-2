package ClassClass;

public class Produk {
    private String nama_produk;
    private int hargaSatuan;
    private int banyakPesanan; 
    private int stok;

    public Produk(String nama_produk, int hargaSatuan, int stok) {
        this.nama_produk = nama_produk;
        this.hargaSatuan = hargaSatuan;
        this.stok = stok; 
    }

    public void kurangiStok(int jumlah){
        this.stok -= jumlah;
    }
    
    public int getBanyakPesanan() { // Getter untuk banyakPesanan
        return banyakPesanan;
    }

    public void setBanyakPesanan(int banyakPesanan) { // Setter untuk banyakPesanan
        this.banyakPesanan = banyakPesanan;
    }

    public String getNama_produk() { // Getter untuk nama_produk barang
        return nama_produk;
    }

    public int getHargaSatuan() { // Getter untuk harga satuan barang
        return hargaSatuan;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}