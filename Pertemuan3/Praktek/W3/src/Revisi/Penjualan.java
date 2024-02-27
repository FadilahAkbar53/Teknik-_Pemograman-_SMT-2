package Revisi;

public class Penjualan {
    //yang sebelumnya ketiga atiribute di class Restaurant
    private String nama_produk;
    private double harga_makanan; 
    private int quantity;

    //atribute tambahan untuk menyimpan jumlah pesanan yang diinputkan
    private boolean sudahDipesan;
    private int jumlah;

    public Penjualan(String nama, double harga, int stok, int jumlah) {
        this.nama_produk = nama;
        this.harga_makanan = harga;
        this.quantity = stok;
        this.sudahDipesan = false;
        this.jumlah = jumlah; // Menyimpan jumlah pesanan yang diinputkan
    }
    
    // Getter dan setter untuk atribut private 
    public int getJumlahPesanan() {
        return jumlah;
    }

    public String getNama() {
        return nama_produk;
    }

    public double getHarga() {
        return harga_makanan;
    }

    public int getStok() {
        return quantity;
    }

    public void setStok(int stok) {
        this.quantity = stok;
    }

    public boolean isSudahDipesan() {
        return sudahDipesan;
    }

    public void setSudahDipesan(boolean sudahDipesan) {
        this.sudahDipesan = sudahDipesan;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    
}

