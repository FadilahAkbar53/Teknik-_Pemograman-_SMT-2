package ClassClass;

import java.util.ArrayList;

public class Transaksi {
    private ArrayList<Barang> pesanan;
    private int totalPembayaran;

    public Transaksi() {
        pesanan = new ArrayList<>();
        totalPembayaran = 0;
    }

    public void tambahPesanan(Barang barangPilihan, int banyakPesanan, int totalHarga) {
        barangPilihan.setBanyakPesanan(banyakPesanan); // Set jumlah pesanan pada barang
        pesanan.add(barangPilihan);
        totalPembayaran += totalHarga;
    }

    public int getTotalPembayaran() {
        return totalPembayaran;
    }

    public int hitungDiskon() {
        if (totalPembayaran > 10000) {
            return totalPembayaran / 10; // Diskon 10%
        } else {
            return 0;
        }
    }

    // Getter untuk pesanan
    public ArrayList<Barang> getPesanan() {
        return pesanan;
    }

    // Metode untuk mendapatkan banyak pesanan berdasarkan nama barang
    public int getBanyakPesananByNama(String namaBarang) {
        int jumlah = 0;
        for (Barang barang : pesanan) {
            if (barang.getNama().equals(namaBarang)) {
                jumlah += barang.getBanyakPesanan();
            }
        }
        return jumlah;
    }
}


    
