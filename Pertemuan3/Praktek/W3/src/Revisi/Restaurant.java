package Revisi;

public class Restaurant {
    // atribute/field berupa nama_makanan, harga_makanan, dan stok
    //dipindahkan ke class Penjualan
    private Penjualan[] menu;  
    private static byte id = 0;

    public Restaurant() {
    /*perubahan #2 = dari yang awalnya instansiasi per field, tapi karena sudah 
    diubah ke record menjadi instansiasi record tersebut*/
        menu = new Penjualan[10];
    }

    void tambahMenuMakanan(String nama, double harga, int stok) {
        menu[id] = new Penjualan(nama, harga, stok, 0);
        nextId();
    }
    
    public boolean isOutOfStock(int id) { 
        return this.menu[id] == null || this.menu[id].getStok() == 0;
    }//return yang awalnya tidak menggunakan getter menjadi menggunakan getter 
    //karena sudah di encapsulasi (private)

    public static void nextId() {
        id++;
    }

    public void tampilMenuMakanan() { //merubah tampilan serta pemangilan menggunakan getter
        System.out.println("\n|----------------------------------------------|");
        System.out.println("|          Daftar Produk Makanan               |");
        System.out.println("|----------------------------------------------|");
        System.out.println("| No |  Nama Produk   |  Harga Satuan  |  Stok |");
        System.out.println("|----------------------------------------------|");

        for (int i = 0; i <= id; i++) {
            if (!isOutOfStock(i)) {
                System.out.printf("| %-2d | %-12s   |  " + "Rp. " + "  %-6.0f  |   %-3d |\n"
                , i + 1, menu[i].getNama(), menu[i].getHarga(), menu[i].getStok());
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
                System.out.printf("| %-2d | %-12s   |   %-5d | Rp. %-6.0f |\n"
                , i + 1, menu[i].getNama(), jumlahDipesan, subtotal);
            }
        }

        System.out.println("|--------------------------------------|");
        System.out.println("Total Harga Keseluruhan: Rp. " + totalHarga);
    }
}
