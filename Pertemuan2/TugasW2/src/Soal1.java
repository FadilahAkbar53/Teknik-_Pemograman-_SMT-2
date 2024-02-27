// mengimpor Scanner ke program
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
    //membuat scanner
       Scanner keyboard = new Scanner(System.in);

    //membuat variable
       System.out.print("anda ingin memasukan sebanyak : ");
        int t = keyboard.nextInt(); // Menerima jumlah angka yang akan diperiksa
    
    //Perulangan sesuai inputan pada variable t
        for (int i = 0; i < t; i++) {
            try {
                long x = keyboard.nextLong(); // Menerima angka

                System.out.println(x + " can be fitted in:");
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) //pengkondisian BYTE
                    System.out.println("* byte");

                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) //pengkondisian SHORT
                    System.out.println("* short");

                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) //pengkondisian INTEGER
                    System.out.println("* int");
                    
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) //pengkondisian LONG
                    System.out.println("* long");

            } catch (Exception e) {
                System.out.println(keyboard.next() + " can't be fitted anywhere.");
            }
        }
        keyboard.close();
    }
}