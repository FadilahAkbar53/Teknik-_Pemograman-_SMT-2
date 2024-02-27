package Revisi;
import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isSelesai = false;
        
        Restaurant restoran = new Restaurant(); //daftar produk
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

            restoran.pesanMenu(noMenu - 1, jumlah); 

            // Tanya apakah ingin memesan lagi
            System.out.print("\nApakah ada barang lain yang ingin dibeli (y/t) ? : ");
            String lanjutkan = input.next();
            if (!lanjutkan.equalsIgnoreCase("y")) {
                isSelesai = true; 
            }
        } while (!isSelesai); // Melakukan pengulangan selama isSelesai bernilai false

        restoran.tampilPesanan(); // Menampilkan pesanan setelah pemesanan
        
    }
}

