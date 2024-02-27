package ClassClass;

public class Barang {
    private String nama;
    private int hargaSatuan;
    private int banyakPesanan; 

    public Barang(String nama, int hargaSatuan) {
        this.nama = nama;
        this.hargaSatuan = hargaSatuan;
        this.banyakPesanan = 0; 
    }

    // Getter dan setter untuk banyakPesanan
    public int getBanyakPesanan() {
        return banyakPesanan;
    }

    public void setBanyakPesanan(int banyakPesanan) {
        this.banyakPesanan = banyakPesanan;
    }

    // Getter untuk nama barang
    public String getNama() {
        return nama;
    }

    // Getter untuk harga satuan barang
    public int getHargaSatuan() {
        return hargaSatuan;
    }
}