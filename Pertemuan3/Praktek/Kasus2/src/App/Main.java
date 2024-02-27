package App;

import ClassClass.Produk;
import ClassClass.Penjualan;
import java.util.Scanner;

public class Main {
    static Produk[] daftarProduk = {
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
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Penjualan transaksi = new Penjualan();
        boolean isSelesai = false;

        while (!isSelesai) {
            transaksi.tampilMenuMakanan();            
            
            System.out.print("Silakan masukkan nomor produk yang ingin dibeli : ");
            int nomorProduk = input.nextInt();
            System.out.print("Masukkan jumlah produk yang ingin dibeli : ");
            int jumlah = input.nextInt();
            
            // proses pemilihan produk
            if (nomorProduk >= 1 && nomorProduk <= daftarProduk.length) {
                Produk barangPilihan = daftarProduk[nomorProduk - 1];
                int stokTersedia = barangPilihan.getStok();
                if (stokTersedia >= jumlah) {
                int totalHarga = barangPilihan.getHargaSatuan() * jumlah;
                transaksi.tambahPesanan(barangPilihan, jumlah, totalHarga);
                barangPilihan.kurangiStok(jumlah);
                System.out.println("\nTotal harga  : " + totalHarga);    
                }
                
            } else {
                System.out.println("Nomor barang tidak valid.");
            }

            // Konfirmasi untuk memesan item makanan lain
            System.out.print("\nApakah ada barang lain yang ingin dibeli (y/t) ? : "); 
            String lanjutkan = input.next();
            if (lanjutkan.equalsIgnoreCase("t")) {
                isSelesai = true;
            }
        }

        //tampilan untuk pesanan konsumen
        transaksi.tampilPesananKonsumen(transaksi);

        int totalPembayaran = transaksi.getHarga_total();
        int diskon = transaksi.hitungDiskon();
        int totalSetelahDiskon = totalPembayaran - diskon;
    
        System.out.println("Total pembayaran : " + totalPembayaran);
        System.out.println("Anda mendapatkan diskon sebesar : " + diskon); // kondisi untuk mendaoatkan diskon
        System.out.println("Total pembayaran setelah diskon : " + totalSetelahDiskon);
        
        // pengkondisian setelah diskon
        transaksi.pembayaran(totalSetelahDiskon);

        System.out.println("\n\t\t\tTERIMA KASIH TELAH BERBELANJA\n\n");

        input.close();
    }
}