package ClassClass;
import java.util.ArrayList;
import java.util.Scanner;

public class Penjualan {
    Scanner input = new Scanner(System.in);
    private ArrayList<Produk> pesanan;
    private int harga_total;

    public Penjualan() {
        pesanan = new ArrayList<>();
        harga_total = 0;
    }

    public void tambahPesanan(Produk produkPilihan, int banyakPesanan, int hargaTotal) {
        produkPilihan.setBanyakPesanan(banyakPesanan); // Set jumlah pesanan pada barang
        pesanan.add(produkPilihan);
        harga_total += hargaTotal;
    }

    public int getHarga_total() {
        return harga_total;
    }

    public int hitungDiskon() {
        if (harga_total > 50000) {
            return harga_total / 10; // Diskon 10%
        } else {
            return 0;
        }
    }

    public ArrayList<Produk> getPesanan() { // Getter untuk pesanan
        return pesanan;
    }

    // Methode untuk mendapatkan banyak pesanan berdasarkan nama barang
    public int getBanyakPesananByNama(String namaProduk) {
        int jumlah = 0;
        for (Produk produk : pesanan) {
            if (produk.getNama_produk().equals(namaProduk)) {
                jumlah += produk.getBanyakPesanan();
            }
        }
        return jumlah;
    }

    //list dan tampilan daftarProduk
    public void tampilMenuMakanan(){
        Produk[] daftarProduk = {
            new Produk("Batagor", 5000, 20),
            new Produk("Roti Bakar", 12000, 10),
            new Produk("Indomi+Telor", 10000, 15),
            new Produk("Kwetiaw", 12000, 12),
            new Produk("Nasi Goreng", 12000, 10),
            new Produk("Air Mineral", 3000, 5), 
            new Produk("Teh Manis", 4000, 15),
            new Produk("Jus Alpukat", 8000, 5),
            new Produk("Teh Botol", 5000, 10),
            new Produk("Kopi", 3000, 11),
        };

        System.out.println("\n|----------------------------------------------|");
            System.out.println("|     SELAMAT DATANG DI TOKO ARTHUR            |");
            System.out.println("|----------------------------------------------|");
            System.out.println("|          Daftar Produk Makanan               |");
            System.out.println("|----------------------------------------------|");
            System.out.println("| No |  Nama Produk   |  Harga Satuan  |  Stok |");
            System.out.println("|----------------------------------------------|");

            for (int i = 0; i < daftarProduk.length; i++) { //mencetak daftar produk
                System.out.printf("| %-2d | %-12s   |  " + "Rp. " + "  %-6d  |   %-3d |\n", i + 1, daftarProduk[i].getNama_produk(), daftarProduk[i].getHargaSatuan(), daftarProduk[i].getStok());
            }
            System.out.println("|----------------------------------------------|");
    }

    public void tampilPesananKonsumen(Penjualan transaksi){
        // Penjualan transaksi = new Penjualan();
        System.out.println("\n|--------------------------------------------------------------------|");
        System.out.println("|                          PESANAN KONSUMEN                          |");
        System.out.println("|--------------------------------------------------------------------|");
        System.out.println("| No |   Nama barang  | Harga Satuan | Banyak Pesanan |  Harga Total |");
        System.out.println("|--------------------------------------------------------------------|");

        // mencetak produk apa saja yang dipesan oleh konsumen
        for (int i = 0; i < transaksi.getPesanan().size(); i++) { 
            Produk produk = transaksi.getPesanan().get(i);
            int banyakPesanan = transaksi.getPesanan().get(i).getBanyakPesanan(); // Mengambil banyak pesanan dari transaksi
            int totalHarga = produk.getHargaSatuan() * banyakPesanan; // Menghitung total harga per item
            System.out.printf("| %-2d | %-12s   | " + "Rp. " + "  %-6d |     %-8d   | " + "Rp. " + "  %-6d |\n", 
            i + 1, produk.getNama_produk(), produk.getHargaSatuan(), banyakPesanan, totalHarga);
        }
        System.out.println("|--------------------------------------------------------------------|");
    }

    public void pembayaran(int totalSetelahDiskon){
        int uangBayar;
        do {
        System.out.print("Silakan masukkan uang yang dibayarkan : ");
        uangBayar = input.nextInt();
        if (uangBayar > totalSetelahDiskon || uangBayar == totalSetelahDiskon) {
            int kembalian = uangBayar - totalSetelahDiskon;
            System.out.println("\nKembalian: " + kembalian);            
            } else {
                System.out.println("\nUang yang Anda bayarkan kurang dari total keseluruhan.\n");
            } 
        } while (uangBayar < totalSetelahDiskon);
    }


}


    
