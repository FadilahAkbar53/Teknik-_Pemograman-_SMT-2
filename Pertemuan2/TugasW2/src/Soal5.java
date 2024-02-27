import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Menginputkan dua buah string
        System.out.print("\nMasukkan string A : ");
        String str1 = scanner.nextLine();
        System.out.print("Masukkan string B : ");
        String str2 = scanner.nextLine();

        //Menggabungkan string dan menghitung panjangnya
        String hasilGabungan = str1 +" "+ str2;
        int panjangString = hasilGabungan.length() - 1;

        System.out.println("\nGabungan string : " + hasilGabungan);
        System.out.println("Panjang string : " + panjangString + " huruf");

        // Memeriksa apakah huruf pertama pada string A lebih besar dari huruf pertama pada string B
        String pertamaStr1 = str1.substring(0, 1);
        String pertamaStr2 = str2.substring(0, 1);
        String hasilPerbandingan = pertamaStr1.compareToIgnoreCase(pertamaStr2) > 0 ? "yes" : "no";
        System.out.println("karakter pertama pada string A apakah lebih besar dibanding dengan string B : " + hasilPerbandingan);

        //Mengkonversi huruf awalan string kecil menjadi huruf kapital
        String hasilAkhirString = konfersiKarakterPertama(str1) +" "+ konfersiKarakterPertama(str2);
        System.out.println("\nHasil akhir gabungan dari kedua string adalah : " + hasilAkhirString);
        System.out.println("\n");

        scanner.close();
    }

    // Method untuk mengkonversi huruf awalan string kecil menjadi huruf kapital
    static String konfersiKarakterPertama(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);

        
    }
}
