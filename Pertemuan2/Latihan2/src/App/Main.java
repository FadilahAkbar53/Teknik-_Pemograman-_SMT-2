package App;

import ClassClass.Barang;
import ClassClass.Transaksi;
import java.util.Scanner;

public class Main {
    static Barang[] daftarBarang = {
            new Barang("Roti", 3000),
            new Barang("Ciki", 2000),
            new Barang("tango", 3000),
            new Barang("Air Mineral", 3000),
            new Barang("Fanta", 5000),
            new Barang("Mizone", 4000), 
            new Barang("Teh Botol", 5000),
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Transaksi transaksi = new Transaksi();
        boolean isSelesai = false;

        while (!isSelesai) {
            System.out.println("\n|-------------------------------------|");
            System.out.println("|    SELAMAT DATANG DI TOKO ARTHUR    |");
            System.out.println("|-------------------------------------|");
            System.out.println("|      Daftar Makanan & Minuman       |");
            System.out.println("|-------------------------------------|");
            System.out.println("| No |   Nama barang  | Harga Satuan  |");
            System.out.println("|-------------------------------------|");

            for (int i = 0; i < daftarBarang.length; i++) {
                System.out.printf("| %-2d | %-12s    |    %-8d  |\n", i + 1, daftarBarang[i].getNama(), daftarBarang[i].getHargaSatuan());
            }
            System.out.println("|-------------------------------------|");

            System.out.print("Silakan masukkan nomor barang yang ingin dibeli : ");
            int nomorBarang = input.nextInt();
            System.out.print("Masukkan jumlah barang yang ingin dibeli : ");
            int jumlah = input.nextInt();

            if (nomorBarang >= 1 && nomorBarang <= daftarBarang.length) {
                Barang barangPilihan = daftarBarang[nomorBarang - 1];
                int totalHarga = barangPilihan.getHargaSatuan() * jumlah;
                transaksi.tambahPesanan(barangPilihan, jumlah, totalHarga);
                System.out.println("\nTotal harga  : " + totalHarga);
            } else {
                System.out.println("Nomor barang tidak valid.");
            }

            System.out.print("\nApakah ada barang lain yang ingin dibeli (y/t) ? : ");
            String lanjutkan = input.next();
            if (lanjutkan.equalsIgnoreCase("t")) {
                isSelesai = true;
            }
        }

        //tampilan untuk pesanan konsumen
        System.out.println("\n|--------------------------------------------------------------------|");
        System.out.println("|                          PESANAN KONSUMEN                          |");
        System.out.println("|--------------------------------------------------------------------|");
        System.out.println("| No |   Nama barang  | Harga Satuan | Banyak Pesanan |  Total Harga |");
        System.out.println("|--------------------------------------------------------------------|");

        for (int i = 0; i < transaksi.getPesanan().size(); i++) {
            Barang barang = transaksi.getPesanan().get(i);
            int banyakPesanan = transaksi.getPesanan().get(i).getBanyakPesanan(); // Mengambil banyak pesanan dari transaksi
            int totalHarga = barang.getHargaSatuan() * banyakPesanan; // Menghitung total harga per item
            System.out.printf("| %-2d | %-12s   |    %-8d  |     %-8d   |   %-8d   |\n", 
            i + 1, barang.getNama(), barang.getHargaSatuan(), banyakPesanan, totalHarga);
        }
        System.out.println("|--------------------------------------------------------------------|");

        int totalPembayaran = transaksi.getTotalPembayaran();
        int diskon = transaksi.hitungDiskon();
        int totalSetelahDiskon = totalPembayaran - diskon;
    
        System.out.println("Total pembayaran : " + totalPembayaran);
        System.out.println("Anda mendapatkan diskon sebesar : " + diskon); // kondisi untuk mendaoatkan diskon
        System.out.println("Total pembayaran setelah diskon : " + totalSetelahDiskon);
        
        // pengkondisian setelah diskon
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

        System.out.println("\n             TERIMA KASIH TELAH BERBELANJA\n\n");

        input.close();
    }
}
