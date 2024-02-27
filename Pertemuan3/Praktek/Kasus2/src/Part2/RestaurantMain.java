package Part2;

import java.util.Scanner;

class Penjualan {
    private String nama_produk;
    private double harga;
    private int quantity;
    private boolean sudahDipesan;
    private int jumlah; // Menambahkan variabel untuk menyimpan jumlah pesanan yang diinputkan

    public Penjualan(String nama, double harga, int stok, int jumlah) {
        this.nama_produk = nama;
        this.harga = harga;
        this.quantity = stok;
        this.sudahDipesan = false;
        this.jumlah = jumlah; // Menyimpan jumlah pesanan yang diinputkan
    }

    // Getter baru untuk mendapatkan jumlah pesanan yang diinputkan
    public int getJumlahPesanan() {
        return jumlah;
    }

    // Getter dan setter untuk atribut private lainnya
    public String getNama() {
        return nama_produk;
    }

    public double getHarga() {
        return harga;
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

    // Setter untuk jumlah pesanan
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}

class Restaurant {
    private Penjualan[] menu;
    private static byte id = 0;

    public Restaurant() {
        menu = new Penjualan[10];
    }

    void tambahMenuMakanan(String nama, double harga, int stok) {
        menu[id] = new Penjualan(nama, harga, stok, 0);
        nextId();
    }

    public boolean isOutOfStock(int id) {
        return this.menu[id] == null || this.menu[id].getStok() == 0;
    }

    public static void nextId() {
        id++;
    }

    public void tampilMenuMakanan() {
        System.out.println("\n|----------------------------------------------|");
        System.out.println("|          Daftar Produk Makanan               |");
        System.out.println("|----------------------------------------------|");
        System.out.println("| No |  Nama Produk   |  Harga Satuan  |  Stok |");
        System.out.println("|----------------------------------------------|");

        for (int i = 0; i <= id; i++) {
            if (!isOutOfStock(i)) {
                System.out.printf("| %-2d | %-12s   |  " + "Rp. " + "  %-6.0f  |   %-3d |\n", i + 1, menu[i].getNama(), menu[i].getHarga(), menu[i].getStok());
            }
        }
        System.out.println("|----------------------------------------------|");
    }

    // Metode untuk melakukan pemesanan
    public void pesanMenu(int idMenu, int quantity) {
        if (idMenu >= 0 && idMenu <= id && menu[idMenu] != null && menu[idMenu].getStok() >= quantity) {
            menu[idMenu].setStok(menu[idMenu].getStok() - quantity);
            menu[idMenu].setSudahDipesan(true); // Menandai produk sebagai sudah dipesan
            menu[idMenu].setJumlah(quantity); // Menyimpan jumlah pesanan yang diinputkan
            System.out.println("Pesanan Anda berhasil! Terima kasih telah memesan " + quantity + " " + menu[idMenu].getNama());
        } else {
            System.out.println("Maaf, pesanan tidak dapat diproses. Coba lagi.");
        }
    }

    // Method untuk menampilkan pesanan dan total harga
    public void tampilPesanan() {
        System.out.println("\n|----------------------------------------------|");
        System.out.println("|                Pesanan Konsumen              |");
        System.out.println("|----------------------------------------------|");
        System.out.println("| No |  Nama Produk   |  Jumlah  | Total Harga | ");
        System.out.println("|----------------------------------------------|");

        double totalHarga = 0;

        for (int i = 0; i <= id; i++) {
            if (menu[i] != null && menu[i].isSudahDipesan()) {
                int jumlahDipesan = menu[i].getJumlahPesanan(); // Mengambil jumlah yang benar-benar dipesan
                double subtotal = menu[i].getHarga() * jumlahDipesan;
                totalHarga += subtotal;
                System.out.printf("| %-2d | %-12s   |   %-5d | Rp. %-6.0f |\n", i + 1, menu[i].getNama(), jumlahDipesan, subtotal);
            }
        }

        System.out.println("|--------------------------------------|");
        System.out.println("Total Harga Keseluruhan: Rp. " + totalHarga);
    }
}


public class RestaurantMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isSelesai = false;
        
        Restaurant restoran = new Restaurant();
        restoran.tambahMenuMakanan("Bala-bala", 1_000, 20);
        restoran.tambahMenuMakanan("Gehu", 1_000, 20);
        restoran.tambahMenuMakanan("Tahu", 1_000, 10);
        restoran.tambahMenuMakanan("Molen", 1_000, 20);
        restoran.tambahMenuMakanan("cireng", 3_000, 1);

        do {
            restoran.tampilMenuMakanan();

            // Pemesanan
            System.out.print("\nSilakan masukkan ID menu yang ingin dipesan : ");
            int noMenu = input.nextInt();
            System.out.print("Masukkan jumlah yang ingin dipesan : ");
            int jumlah = input.nextInt();

            restoran.pesanMenu(noMenu - 1, jumlah); // Memanggil metode pesanMenu dari kelas Restaurant dengan menggunakan indeks array (noMenu - 1)

            // Tanya apakah ingin memesan lagi
            System.out.print("\nApakah ada barang lain yang ingin dibeli (y/t) ? : ");
            String lanjutkan = input.next();
            if (!lanjutkan.equalsIgnoreCase("y")) {
                isSelesai = true; // Mengubah kondisi isSelesai menjadi true agar keluar dari pengulangan
            }
        } while (!isSelesai); // Melakukan pengulangan selama isSelesai bernilai false

        // Menampilkan pesanan setelah pemesanan
        restoran.tampilPesanan();
        
    }
}

